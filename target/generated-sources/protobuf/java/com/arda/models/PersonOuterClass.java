// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.arda.models;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\032\024common/address.proto\032\020co" +
      "mmon/car.proto\032\014dealer.proto\032\036google/pro" +
      "tobuf/wrappers.proto\"\225\001\n\006Person\022\014\n\004name\030" +
      "\001 \001(\t\022(\n\003age\030\002 \001(\0132\033.google.protobuf.Int" +
      "32Value\022 \n\007address\030\003 \001(\0132\017.common.Addres" +
      "s\022\030\n\003car\030\004 \003(\0132\013.common.Car\022\027\n\006dealer\030\005 " +
      "\001(\0132\007.DealerB\023\n\017com.arda.modelsP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.arda.models.AddressOuterClass.getDescriptor(),
          com.arda.models.CarOuterClass.getDescriptor(),
          com.arda.models.DealerOuterClass.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Address", "Car", "Dealer", });
    com.arda.models.AddressOuterClass.getDescriptor();
    com.arda.models.CarOuterClass.getDescriptor();
    com.arda.models.DealerOuterClass.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
