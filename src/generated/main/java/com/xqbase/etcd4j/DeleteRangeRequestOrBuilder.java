// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

public interface DeleteRangeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcd4j.DeleteRangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes key = 1;</code>
   *
   * <pre>
   * if the range_end is not given, the request deletes the key.
   * </pre>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>optional bytes range_end = 2;</code>
   *
   * <pre>
   * if the range_end is given, it deletes the keys in range [key, range_end).
   * </pre>
   */
  com.google.protobuf.ByteString getRangeEnd();
}