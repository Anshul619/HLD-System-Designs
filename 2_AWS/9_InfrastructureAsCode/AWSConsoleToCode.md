# AWS Console to code
- Convert AWS console actions to reusable code with [AWS Console-to-Code](https://aws.amazon.com/blogs/aws/convert-aws-console-actions-to-reusable-code-with-aws-console-to-code-now-generally-available/)

# Steps

![](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2024/10/06/c2c-1-1.png)

![](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2024/10/06/c2c-2-1.png)

![](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2024/10/06/c2c-3-1.png)

## Output CLI output

````
aws ec2 run-instances \
  --image-id "ami-066784287e358dad1" \
  --instance-type "t2.micro" \
  --network-interfaces '{"AssociatePublicIpAddress":true,"DeviceIndex":0,"Groups":["sg-1z1c11zzz1c11zzz1"]}' \
  --credit-specification '{"CpuCredits":"standard"}' \
  --tag-specifications '{"ResourceType":"instance","Tags":[{"Key":"Name","Value":"c2c-demo"}]}' \
  --metadata-options '{"HttpEndpoint":"enabled","HttpPutResponseHopLimit":2,"HttpTokens":"required"}' \
  --private-dns-name-options '{"HostnameType":"ip-name","EnableResourceNameDnsARecord":true,"EnableResourceNameDnsAAAARecord":false}' \
  --count "1"
````