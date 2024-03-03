package co.edu.uniquindio.poo;

public class Connection {

    private static Connection instance;
   
    private String username;
    private String passWord;
    private String host;
    private String codificacion;
    private short tiempoEspera;
    private boolean sslCertificado;
    private short port;
    private String baseDeDatos;

    private Connection() {}

    public static synchronized Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        } 
        
        else {
            throw new IllegalArgumentException("Ya existe una instancia de conexión");
        }
        return instance;
    }

    public Connection(String username, String passWord, String host, String codificacion, short tiempoEspera,
            boolean sslCertificado, short port, String baseDeDatos) {

        
        assert username != null : "Username es obligatorio";
        assert passWord != null : "PassWord es obligatorio";
        assert host     != null : "Host es obligatorio";
        this.username = username;
        this.passWord = passWord;
        this.host = host;
        this.codificacion = codificacion;
        this.tiempoEspera = tiempoEspera;
        this.sslCertificado = sslCertificado;
        this.port = port;
        this.baseDeDatos = baseDeDatos;
    }

        public String getUsername() {
            return username;
        }

        public String getPassWord() {
            return passWord;
        }

        public String getHost() {
            return host;
        }


        public String getCodificacion() {
            return codificacion;
        }

        public int getTiempoEspera() {
            return tiempoEspera;
        }


        public boolean isSslCertificado() {
            return sslCertificado;
        }


        public int getPort() {
            return port;
        }

        public String getBaseDeDatos() {
            return baseDeDatos;
        }

        public static ConnectionBuilder builder(){
            return new ConnectionBuilder();

        }

    public static class ConnectionBuilder{
        private String username;
        private String passWord;
        private String host;
        private String codificacion;
        private short tiempoEspera;
        private boolean sslCertificado;
        private short port;
        private String baseDeDatos;

        private ConnectionBuilder(){}

        public ConnectionBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ConnectionBuilder passWord(String password) {
            this.passWord = password;
            return this;
        }

        public ConnectionBuilder host(String host) {
            this.host = host;
            return this;
        }

        public ConnectionBuilder codificacion(String codificacion) {
            this.codificacion = codificacion;
            return this;
        }

        public ConnectionBuilder tiempoEspera(short tiempoEspera) {
            this.tiempoEspera = tiempoEspera;
            return this;
        }

        public ConnectionBuilder sslCertificado(boolean sslCertificado) {
            this.sslCertificado = sslCertificado;
            return this;
        }

        public ConnectionBuilder port(short port) {
            this.port = port;
            return this;
        }

        public ConnectionBuilder baseDeDatos(String baseDeDatos) {
            this.baseDeDatos = baseDeDatos;
            return this;
        }

        public Connection build (){

            assert username != null : "Username es obligatorio";
            assert passWord != null : "PassWord es obligatorio";
            assert host     != null : "Host es obligatorio";

            return new Connection(username, passWord, host, codificacion, tiempoEspera, sslCertificado, port, baseDeDatos);
        }
    } 
}
