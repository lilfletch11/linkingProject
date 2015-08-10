/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
//import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.HTablePool;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;


/**
 *
 * @author sshrestha
 */
public class HelloWorld {
    public static HTablePool tablePool;
    private Collection group1;
    private Collection group2;
    /**
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
     
        System.out.println("Begin");
        
        //Properties prop = new Properties();
      //  InputStream input = null;
        try {
            Configuration config = HBaseConfiguration.create();
            config.clear();
            
            
           // input = new FileInputStream("C:\\training\\server.properties");            
           // prop.load(input);
            
            String zookeeperQuorum = "192.168.2.208";
            String zookeeperPropertyClientPort = "5181";
            String master = "192.168.2.208";
            String masterPort = "60000";
            String tableName = "member";
            
            
            config.setInt("timeout", 12000);
            config.set("hbase.master", "*" + master + ":60000*");  
            config.set("hbase.zookeeper.quorum",zookeeperQuorum);
            config.set("hbase.zookeeper.property.clientPort",zookeeperPropertyClientPort);
            
            HBaseAdmin.checkHBaseAvailable(config);
            HTable table = new HTable(config, tableName);

            System.out.println("HBase is running!");
            
                     
             
        //    config.set("hbase.master.port", masterPort);          
            
            //Creating HBaseAdmin object
//HBaseAdmin admin = new HBaseAdmin(config);

//Getting all the list of tables using HBaseAdmin object
//HTableDescriptor[] tableDescriptor = admin.listTables();
            
   //         tablePool = new HTablePool(config, 600); 
            
//            HTable table = new HTable(config, args[0]);
             


            
//            Scan scan = new Scan();
//System.out.println("Scanning Table");
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("Identifier"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("givenName"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("familyName"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("address2"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("address1"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("city"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("postalCode"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("state"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("dateOfBirth"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("phone"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("ssn"));
//            scan.addColumn(Bytes.toBytes("versioning"), Bytes.toBytes("blockingid"));
//            
//            ResultScanner scanner = table.getScanner(scan);
//
//System.out.println("Looping  Table");
//            int count =0;
//            for (Result r : scanner) { 
//            	String rowkey = new String(r.getRow());
//                for(KeyValue keyValue : r.list()) 
//                {
//                    System.out.println("Qualifier : " + keyValue.getKeyString() + " : Value : " + Bytes.toString(keyValue.getValue()));
//                }
//                
//            	count++;
//                System.out.println("Found row : " + r);
//            }
//            System.out.println("Total Number of Records from table member are: "+count);
//            table.close();
//            scanner.close();
//        } catch (Exception e) {
//
//        System.out.println("Error reading Records from HBase!");
//        e.printStackTrace();
//        System.exit(1);
    }
        
        System.out.println("Complete");
        
}
}