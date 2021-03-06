# ObjectEzsignfoldersignerassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldersignerassociationCreateObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationDeleteObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetChildrenV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetChildrenV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren | Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
[**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
[**ezsignfoldersignerassociationGetObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation



## ezsignfoldersignerassociationCreateObjectV1

> EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request = Arrays.asList(new EzsignfoldersignerassociationCreateObjectV1Request()); // List<EzsignfoldersignerassociationCreateObjectV1Request> | 
try {
    EzsignfoldersignerassociationCreateObjectV1Response result = apiInstance.ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV1Request** | [**List&lt;EzsignfoldersignerassociationCreateObjectV1Request&gt;**](EzsignfoldersignerassociationCreateObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV1Response**](EzsignfoldersignerassociationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationDeleteObjectV1

> EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)

Delete an existing Ezsignfoldersignerassociation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | The unique ID of the Ezsignfoldersignerassociation
try {
    EzsignfoldersignerassociationDeleteObjectV1Response result = apiInstance.ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation | [default to null]

### Return type

[**EzsignfoldersignerassociationDeleteObjectV1Response**](EzsignfoldersignerassociationDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationGetChildrenV1

> ezsignfoldersignerassociationGetChildrenV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | The unique ID of the Ezsignfoldersignerassociation
try {
    apiInstance.ezsignfoldersignerassociationGetChildrenV1(pkiEzsignfoldersignerassociationID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetChildrenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationGetInPersonLoginUrlV1

> EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)

Retrieve a Login Url to allow In-Person signing

This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | The unique ID of the Ezsignfoldersignerassociation
try {
    EzsignfoldersignerassociationGetInPersonLoginUrlV1Response result = apiInstance.ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetInPersonLoginUrlV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation | [default to null]

### Return type

[**EzsignfoldersignerassociationGetInPersonLoginUrlV1Response**](EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationGetObjectV1

> EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | The unique ID of the Ezsignfoldersignerassociation
try {
    EzsignfoldersignerassociationGetObjectV1Response result = apiInstance.ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation | [default to null]

### Return type

[**EzsignfoldersignerassociationGetObjectV1Response**](EzsignfoldersignerassociationGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

