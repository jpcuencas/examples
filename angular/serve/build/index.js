"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
class Server {
    constructor() {
        // inicializar
        this.app = express_1.default();
        this.config();
        this.routes();
    }
    /**
     * para configurar el servidor
     */
    config() {
        this.app.set('port', process.env.PORT || 3000);
    }
    /**
     * para administrar las rutas del servidor
     */
    routes() {
    }
    /**
     * para inicializar el servidor
     */
    start() {
        this.app.listen(this.app.get('port'), () => {
            console.log(`server on port ${this.app.get('port')}`);
        });
    }
}
const server = new Server();
server.start();
//# sourceMappingURL=index.js.map