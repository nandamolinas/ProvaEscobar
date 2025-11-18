public class SistemaValidacao {
    public static void main(String[] args) throws Exception {
        NFe documento = new NFe();

        Validador schema = new ValidadorSchemaXML();
        Validador cert = new ValidadorCertificado();
        Validador fiscal = new ValidadorRegrasFiscais();
        Validador banco = new ValidadorBanco();
        Validador sefaz = new ValidadorSefaz();

        
        schema.setProximo(cert);
        cert.setProximo(fiscal);  
        fiscal.setProximo(banco); 
        banco.setProximo(sefaz);  

        boolean resultado = schema.validar(documento);

        if (!resultado) {
            System.out.println("Falha na validação, realizando rollback...");
            banco.rollback(documento);
        } else {
            System.out.println("Documento validado com sucesso!");
        }
    }
}
