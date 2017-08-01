package iteso.cloud_verano.aws;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class S3Client {
	
	private AmazonS3 s3;
	
	public S3Client(String accessKey, String secretKey, Regions region){
		BasicAWSCredentials cred = new BasicAWSCredentials(accessKey, secretKey);
		
		this.s3 = AmazonS3ClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(cred))
				.withRegion(region)
				.build();
	}

}
