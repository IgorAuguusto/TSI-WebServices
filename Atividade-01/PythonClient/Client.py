import socket

class Client():

    def __init__(self, host, serverPort):
        self.host = host
        self.serverPort = serverPort
        self.tcpSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    def toConnect(self):
        self.tcpSocket.connect((self.host, self.serverPort))
        return True  
    
    def toReceive(self):
        request = self.tcpSocket.recv(1024)
        if request:
            return request.decode("utf-8", errors="ignore")
        raise socket.error("error receiving from server")

if __name__ == "__main__":
    serverHost = "localhost"  
    serverPort = 16345  
    client = Client(serverHost, serverPort)
    
    connected = client.toConnect()
    if connected:
        print("Conexão estabelecida com sucesso!")
    else:
        print("Não foi possível estabelecer a conexão.")
        exit()
    
    try:
        while True:
            receiveData = client.toReceive()
            print(receiveData)
    except KeyboardInterrupt:
        print("Encerrando o cliente.")
    client.tcpSocket.close()
