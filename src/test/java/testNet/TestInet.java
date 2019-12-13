package testNet;

import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.*;

public class TestInet {
    @Test
    public void testInetAddress(){
        try{
            InetAddress inetADDress = InetAddress.getLocalHost();
            System.out.println(inetADDress.getHostAddress());
            System.out.println(inetADDress.getHostName());

            InetAddress inetAddress2 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress2.getHostName());
            System.out.println(inetAddress2.getHostAddress());
            System.out.println(inetAddress2);
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testUrl(){
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        URL url = null;
        try {
            url = new URL("http://zdyw.luoex.com:20188/index");
            inputStream = url.openStream();
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                bufferedReader.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testURLConnection(){
        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL("http://zdyw.luoex.com:20188/index");
            URLConnection urlConnection = url.openConnection();
            System.out.println(urlConnection.getContentLengthLong());
            System.out.println(urlConnection.getContentLength());
            System.out.println(urlConnection.getContent());
            System.out.println(urlConnection.getConnectTimeout());
            System.out.println(urlConnection.getContentEncoding());
            inputStream = urlConnection.getInputStream();
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (MalformedURLException e ){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                reader.close();
                bufferedReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testURLDecoderEncoder(){
        String str = "张三";

        try{
            String encoder = URLEncoder.encode(str,"UTF-8");
            System.out.println(encoder);
            String decoder = URLDecoder.decode(encoder,"UTF-8");
            System.out.println(decoder);
        } catch (UnsupportedEncodingException e ){
            e.printStackTrace();
        }

    }

    @Test
    public void testServerSocket(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("我是服务端,正在等待接收信息!");
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String mess = dataInputStream.readUTF();
            System.out.println("我是服务端,我已接收到客户端信息:"+mess);
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("我是服务端,我收到了你的信息");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                socket.close();
                inputStream.close();
                dataInputStream.close();
                outputStream.close();
                dataOutputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testSocket(){
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            socket = new Socket("127.0.0.1",8080);
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("你好服务端,我是客户端");
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String line = dataInputStream.readUTF();
            System.out.println("我是客户端,我接收到了服务端的信息:"+line);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                inputStream.close();
                dataInputStream.close();
                outputStream.close();
                dataOutputStream.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }
    }
}
