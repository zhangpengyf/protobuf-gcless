// Generated by the protocol buffer gcless compiler.  DO NOT EDIT!
package com.x.protobuf;

import java.io.IOException;
public final class Bug5Interface {
private Bug5Interface() {}
public interface A {
boolean hasEntry();
java.util.List<String> getEntry();
void setEntry(java.util.List<String> entry);
String getEntry(int index);
int getEntryCount();
void setEntry(int index, String value);
void addEntry(String value);
void addAllEntry(java.lang.Iterable<? extends String> values);
void clearEntry();
boolean hasEntry2();
java.util.List<Integer> getEntry2();
void setEntry2(java.util.List<Integer> entry2);
Integer getEntry2(int index);
int getEntry2Count();
void setEntry2(int index, Integer value);
void addEntry2(Integer value);
void addAllEntry2(java.lang.Iterable<? extends Integer> values);
void clearEntry2();
}
public static class ASerializer {
public static byte[] serialize(com.x.protobuf.Bug5Interface.A message) {
try {
int totalSize = 0;
byte[] entryBuffer = null;
if (message.hasEntry()) {
java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
for( int i=0;i<message.getEntry().size();i++) {
ProtobufOutputStream.writeString(32904, message.getEntry().get(i), baos);
}
entryBuffer = baos.toByteArray();
totalSize += entryBuffer.length;
}
if (message.hasEntry2()) {
for(int i=0;i<message.getEntry2().size();i++) {
totalSize += ProtobufOutputStream.computeInt32Size(32902, message.getEntry2().get(i));
}
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasEntry()) {
position = ProtobufOutputStream.writeRawBytes(entryBuffer, result, position);
}
if (message.hasEntry2()) {
position = ProtobufOutputStream.writeRepeatedInt32(32902, message.getEntry2(), result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.x.protobuf.Bug5Interface.A message, java.io.OutputStream os) {
try {
if (message.hasEntry()) {
for( int i=0;i<message.getEntry().size();i++) {
ProtobufOutputStream.writeString(32904, message.getEntry().get(i), os);
}
}
if (message.hasEntry2()) {
for( int i=0;i<message.getEntry2().size();i++) {
ProtobufOutputStream.writeInt32(32902, message.getEntry2().get(i), os);
}
}
} catch (IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(factory, data, cursor);
}
public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(factory, data, cursor);
}
public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug5Interface.A message = (com.x.protobuf.Bug5Interface.A)factory.create("com.x.protobuf.Bug5Interface.A");
if( message == null ) { 
throw new IOException("Factory create invalid message for type: com.x.protobuf.Bug5Interface.A");
}
while(true) {
if (ProtobufInputStream.isAtEnd(data, cursor)) {
return message;
}
int varint = ProtobufInputStream.readRawVarint32(data, cursor);
int tag = ProtobufInputStream.getTagFieldNumber(varint);
switch(tag) {
case 0: 
return message;
 default: 
 ProtobufInputStream.skipUnknown(varint, data, cursor);
 break;
case 32904: 
if( message.getEntry() == null || message.getEntry().isEmpty()) {
message.setEntry(new java.util.ArrayList<String>());
}
message.getEntry().add(ProtobufInputStream.readString(data,cursor));
break;
case 32902: 
if( message.getEntry2() == null || message.getEntry2().isEmpty()) {
message.setEntry2(new java.util.ArrayList<Integer>());
}
message.getEntry2().add(ProtobufInputStream.readInt32(data,cursor));
break;
}
}
}
/** Beware! All subsequent messages in stream will be consumed until end of stream (default protobuf behaivour).
  **/public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(factory, is, cursor);
}
public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(factory, is, cursor);
}
public static com.x.protobuf.Bug5Interface.A parseFrom(MessageFactory factory, java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug5Interface.A message = (com.x.protobuf.Bug5Interface.A)factory.create("com.x.protobuf.Bug5Interface.A");
if( message == null ) { 
throw new IOException("Factory create invalid message for type: com.x.protobuf.Bug5Interface.A");
}
while(true) {
if( cursor.getCurrentPosition() == cursor.getProcessUpToPosition() ) {
return message;
}
int varint = ProtobufInputStream.readRawVarint32(is, cursor);
int tag = ProtobufInputStream.getTagFieldNumber(varint);
if (ProtobufInputStream.isAtEnd(cursor)) {
return message;
}
switch(tag) {
case 0: 
return message;
 default: 
 ProtobufInputStream.skipUnknown(varint, is, cursor);
 break;case 32904: 
if( message.getEntry() == null || message.getEntry().isEmpty()) {
message.setEntry(new java.util.ArrayList<String>());
}
message.getEntry().add(ProtobufInputStream.readString(is,cursor));
break;
case 32902: 
if( message.getEntry2() == null || message.getEntry2().isEmpty()) {
message.setEntry2(new java.util.ArrayList<Integer>());
}
message.getEntry2().add(ProtobufInputStream.readInt32(is,cursor));
break;
}
}
}
}
}

