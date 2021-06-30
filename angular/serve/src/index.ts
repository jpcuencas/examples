import express,  {Application} from 'express';


class Server {
    public app: Application;

    constructor() {
        // inicializar
        this.app = express();
        this.config();
        this.routes();
    }
    /**
     * para configurar el servidor
     */
    config():void {
        this.app.set('port', process.env.PORT || 3000);
    }

    /**
     * para administrar las rutas del servidor
     */
    routes():void{

    }

    /**
     * para inicializar el servidor
     */
    start():void{
        this.app.listen(this.app.get('port'), () =>{
            console.log(`server on port ${this.app.get('port')}`);
        })
    }
}

const server = new Server();

server.start();