package iteso.cloud_verano.aws;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;

public class DynamoClient {

	private final String serviceEndpoint = "";
	private final String tableName = "";
	
	private AmazonDynamoDB client = AmazonDynamoDBClientBuilder
			.standard()										   
			.withEndpointConfiguration
			(new AwsClientBuilder.EndpointConfiguration(serviceEndpoint, Regions.US_EAST_2.name()))
			.build();
	DynamoDB dynamoDB = new DynamoDB(client);
	
	void putData(){
		this.dynamoDB.getTable(tableName).putItem(new Item());
	}
}
