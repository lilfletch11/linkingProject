///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.valencehealth.vmm;
// 
////duke
//import no.priv.garshol.duke.*; 
//import no.priv.garshol.duke.matchers.PrintMatchListener;
//
////java
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties; 
//import java.sql.Connection;
//
////hadoop
//import org.apache.hadoop.hbase.*; 
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.KeyValue; 
//import org.apache.hadoop.fs.*;
//import org.apache.hadoop.hbase.client.HTable;
//import org.apache.hadoop.hbase.client.HTablePool;
//import org.apache.hadoop.hbase.client.Result;
//import org.apache.hadoop.hbase.client.ResultScanner;
//import org.apache.hadoop.hbase.client.Scan;
//import org.apache.hadoop.hbase.util.Bytes;
//import org.apache.hadoop.hbase.HTableDescriptor;
//import org.apache.hadoop.hbase.client.HBaseAdmin;
//
//
///**
// *
// * @author Artisans
// */
//public class vMemberMatch {
//
//    final static String FILENAME = "C:\\duke\\test\\matching_configuration.txt";
//    private static long startTime;
//    private static long lastEndTime;
//    
//
//  public static void main(String[] argv) throws Exception {
//	startTime = System.currentTimeMillis();
//	lastEndTime = startTime;
//	
//	// Declare variables
////            String zookeeperQuorum = "192.168.2.208";
////            String zookeeperPropertyClientPort = "5181";
////            String master = "192.168.2.208";
////            String masterPort = "60000";
//	
//	// Read in matching configuration text - scan by line
//	// Eventually we want to move the config into a transparent location like UI interface or sql
//		//String fileName = "X:\\dev\\Duke\\brandon\\matching_configuration.txt";
//               
//        System.out.println("FileName: "+ FILENAME); 
//        try (Scanner scanner = new Scanner(Paths.get(FILENAME))) {
//            int inputCount=0; 
//            while(scanner.hasNext()){
//                
//                //read in line by line
//                String FileTest = ""+scanner.next()+"";
//                inputCount++;
//                
//                String filePath = FileTest;            
//                String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
//                System.out.println(newLine+"Matching config number "+ inputCount + " - " + filePath+newLine);
//                
//                // create in Hbase Object
//                //          org.apache.hadoop.conf.Configuration Hbaseconfig = HBaseConfiguration.create();
//                
////            String zookeeperQuorum = "192.168.2.208";
////            String zookeeperPropertyClientPort = "5181";
////            String master = "192.168.2.208";
////            String masterPort = "60000";
////            String fileName = "C:\\duke\\test\\matching_configuration.txt";
//                
//                //connect to Hbase object
////            Hbaseconfig.set("hbase.zookeeper.quorum",zookeeperQuorum);
////            Hbaseconfig.set("hbase.zookeeper.property.clientPort",zookeeperPropertyClientPort);
////            Hbaseconfig.set("hbase.master", master);
////            Hbaseconfig.set("hbase.master.port", masterPort);
////            Hbaseconfig.addResource(new org.apache.hadoop.fs.Path("xmlConfig", "hbase_Config.xml"));
////            HTable hTable = new HTable(Hbaseconfig, "member");
//                
//                
//                //XML configuration process
//                //https://phoenix.apache.org/installation.html
//                Configuration config = ConfigLoader.load(filePath);
//                Processor proc = new Processor(config);
//                //parameter: showmatches,showmaybe,progress,linkage, properties, pretty
//                //first parameter showMatches impacts performance
//                //proc.addMatchListener(new PrintMatchListener(false,false, false, false,config.getProperties(),false));
//                proc.addMatchListener(new PrintMatchListener(true,true, true, false,config.getProperties(),false));
//                
//                //settings
//                proc.setPerformanceProfiling(true);
//                //    proc.setThreads(5);
//                
//                
//                //proc.link
//                proc.link(config.getDataSources(1), config.getDataSources(2), 120000);
//                
////Test this method to save from re-indexing Target Database every execution
////proc.linkRecords(1, config.getDataSources(2) , true, 1);
//                
//                //Log Timestamp
//                long start = System.currentTimeMillis();
//                System.out.println(newLine+"Processing time for this rule: " + (System.currentTimeMillis() - lastEndTime)/1000.0 + " seconds");
//                System.out.println("Total processing time so far: " + (System.currentTimeMillis() - startTime)/1000.0 + " seconds");
//                lastEndTime = System.currentTimeMillis();
//                
//                proc.close(); 			
//            }
//        }
//  } 
//    
//}
//
