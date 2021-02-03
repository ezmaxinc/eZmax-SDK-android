# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
[**ezsignsignatureEditObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Modify an existing Ezsignsignature
[**ezsignsignatureGetObjectGetChildrenV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectGetChildrenV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren | Retrieve an existing Ezsignsignature&#39;s children IDs
[**ezsignsignatureGetObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature



## ezsignsignatureCreateObjectV1

> EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request = Arrays.asList(new EzsignsignatureCreateObjectV1Request()); // List<EzsignsignatureCreateObjectV1Request> | 
try {
    EzsignsignatureCreateObjectV1Response result = apiInstance.ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureCreateObjectV1Request** | [**List&lt;EzsignsignatureCreateObjectV1Request&gt;**](EzsignsignatureCreateObjectV1Request.md)|  |

### Return type

[**EzsignsignatureCreateObjectV1Response**](EzsignsignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignatureDeleteObjectV1

> EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | The unique ID of the Ezsignsignature
try {
    EzsignsignatureDeleteObjectV1Response result = apiInstance.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**| The unique ID of the Ezsignsignature | [default to null]

### Return type

[**EzsignsignatureDeleteObjectV1Response**](EzsignsignatureDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignatureEditObjectV1

> EzsignsignatureEditObjectV1Response ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request)

Modify an existing Ezsignsignature

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | The unique ID of the Ezsignsignature
EzsignsignatureEditObjectV1Request ezsignsignatureEditObjectV1Request = new EzsignsignatureEditObjectV1Request(); // EzsignsignatureEditObjectV1Request | 
try {
    EzsignsignatureEditObjectV1Response result = apiInstance.ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**| The unique ID of the Ezsignsignature | [default to null]
 **ezsignsignatureEditObjectV1Request** | [**EzsignsignatureEditObjectV1Request**](EzsignsignatureEditObjectV1Request.md)|  |

### Return type

[**EzsignsignatureEditObjectV1Response**](EzsignsignatureEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignatureGetObjectGetChildrenV1

> ezsignsignatureGetObjectGetChildrenV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature&#39;s children IDs

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | The unique ID of the Ezsignsignature
try {
    apiInstance.ezsignsignatureGetObjectGetChildrenV1(pkiEzsignsignatureID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectGetChildrenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**| The unique ID of the Ezsignsignature | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignatureGetObjectV1

> EzsignsignatureGetObjectV1Response ezsignsignatureGetObjectV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | The unique ID of the Ezsignsignature
try {
    EzsignsignatureGetObjectV1Response result = apiInstance.ezsignsignatureGetObjectV1(pkiEzsignsignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**| The unique ID of the Ezsignsignature | [default to null]

### Return type

[**EzsignsignatureGetObjectV1Response**](EzsignsignatureGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
