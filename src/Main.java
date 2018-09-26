import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.set("java","coder1");
        jedis.set("c++","coder2");
        jedis.set("python","coder3");
        System.out.println(jedis.mget("java","c++","python"));
    }
}
