# GetItem using Primary Key

````go
	out, err := o.client.GetItem(ctx, &dynamodb.GetItemInput{
		Key:       primaryKey,
		TableName: aws.String(tableName),
	})
````

# PutItem

````go
_, err = o.client.PutItem(ctx, &dynamodb.PutItemInput{
		TableName: aws.String(tableName),
		Item:      in,
	})
````

# Query using Secondary Index

````go
params := &dynamodb.QueryInput{
		TableName:              aws.String(tableName),
		IndexName:              aws.String("index_name"),
		KeyConditionExpression: aws.String("#primary_key = :key AND sort_key BETWEEN :from AND :to"),
		ExpressionAttributeValues: map[string]types.AttributeValue{
			":key": &types.AttributeValueMemberS{Value: key},
			":from":       &types.AttributeValueMemberS{Value: from},
			":to":      &types.AttributeValueMemberS{Value: to},
		},
		ExpressionAttributeNames: map[string]string{
			"#name": "name",
		},
		Limit:            aws.Int32(limit),
		ScanIndexForward: aws.Bool(false), // sort in descending order
	}

	resp, err := o.client.Query(context.Background(), params)
	if err != nil {
		return nil, err
	}
````

# Scans (not recommended)
- [Scans](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html) spans all partitions for the given query, hence its not recommended.

# Update

````go
expr, err := expression.NewBuilder().WithUpdate(update).Build()
	if err != nil {
		return fmt.Errorf("could not create expression update status dynamo: %v", err)
	}
	_, err = o.client.UpdateItem(ctx, &dynamodb.UpdateItemInput{
		TableName:                 aws.String(tableName),
		Key:                       primaryKey,
		ExpressionAttributeNames:  expr.Names(),
		ExpressionAttributeValues: expr.Values(),
		UpdateExpression:          expr.Update(),
		ReturnValues:              types.ReturnValueNone,
	})
````