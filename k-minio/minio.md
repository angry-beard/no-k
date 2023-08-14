docker 安装

```dockerfile
docker run -p 9000:9000 --name minio\
  -e "MINIO_ACCESS_KEY=admin" \
  -e "MINIO_SECRET_KEY=Tomcat@8090" \
  -v /Users/epoch/minio/data:/data \
  -v /Users/epoch/minio/config:/root/.minio \
  -d minio/minio:RELEASE.2021-06-17T00-10-46Z server /data
```