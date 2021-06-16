@echo off


java -jar target/ddd-sample-batch-1.0-SNAPSHOT-spring-boot.jar classpath:/orderexport-job.xml orderExportJob orders.file=C:\WS_DDD\ddd-sample\ddd-sample-batch\orders.csv date(date)=2017/12/20