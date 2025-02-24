// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SceneEntityMoveScNotifyOuterClass {
  /**
   * Protobuf type {@code SceneEntityMoveScNotify}
   */
  public static final class SceneEntityMoveScNotify extends ProtoMessage<SceneEntityMoveScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 client_pos_version = 8;</code>
     */
    private int clientPosVersion;

    /**
     * <code>optional uint32 entry_id = 13;</code>
     */
    private int entryId;

    /**
     * <code>optional uint32 entity_id = 15;</code>
     */
    private int entityId;

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    private SceneEntityMoveScNotify() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityMoveScNotify}
     */
    public static SceneEntityMoveScNotify newInstance() {
      return new SceneEntityMoveScNotify();
    }

    /**
     * <code>optional uint32 client_pos_version = 8;</code>
     * @return whether the clientPosVersion field is set
     */
    public boolean hasClientPosVersion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 client_pos_version = 8;</code>
     * @return this
     */
    public SceneEntityMoveScNotify clearClientPosVersion() {
      bitField0_ &= ~0x00000001;
      clientPosVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 8;</code>
     * @return the clientPosVersion
     */
    public int getClientPosVersion() {
      return clientPosVersion;
    }

    /**
     * <code>optional uint32 client_pos_version = 8;</code>
     * @param value the clientPosVersion to set
     * @return this
     */
    public SceneEntityMoveScNotify setClientPosVersion(final int value) {
      bitField0_ |= 0x00000001;
      clientPosVersion = value;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 13;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 13;</code>
     * @return this
     */
    public SceneEntityMoveScNotify clearEntryId() {
      bitField0_ &= ~0x00000002;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 13;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 13;</code>
     * @param value the entryId to set
     * @return this
     */
    public SceneEntityMoveScNotify setEntryId(final int value) {
      bitField0_ |= 0x00000002;
      entryId = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return this
     */
    public SceneEntityMoveScNotify clearEntityId() {
      bitField0_ &= ~0x00000004;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @param value the entityId to set
     * @return this
     */
    public SceneEntityMoveScNotify setEntityId(final int value) {
      bitField0_ |= 0x00000004;
      entityId = value;
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @return this
     */
    public SceneEntityMoveScNotify clearMotion() {
      bitField0_ &= ~0x00000008;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000008;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @param value the motion to set
     * @return this
     */
    public SceneEntityMoveScNotify setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000008;
      motion.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityMoveScNotify copyFrom(final SceneEntityMoveScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        clientPosVersion = other.clientPosVersion;
        entryId = other.entryId;
        entityId = other.entityId;
        motion.copyFrom(other.motion);
      }
      return this;
    }

    @Override
    public SceneEntityMoveScNotify mergeFrom(final SceneEntityMoveScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasClientPosVersion()) {
        setClientPosVersion(other.clientPosVersion);
      }
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      return this;
    }

    @Override
    public SceneEntityMoveScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clientPosVersion = 0;
      entryId = 0;
      entityId = 0;
      motion.clear();
      return this;
    }

    @Override
    public SceneEntityMoveScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityMoveScNotify)) {
        return false;
      }
      SceneEntityMoveScNotify other = (SceneEntityMoveScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasClientPosVersion() || clientPosVersion == other.clientPosVersion)
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasMotion() || motion.equals(other.motion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(motion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityMoveScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // clientPosVersion
            clientPosVersion = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.clientPosVersion, clientPosVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      output.endObject();
    }

    @Override
    public SceneEntityMoveScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787644431:
          case 1278860153: {
            if (input.isAtField(FieldNames.clientPosVersion)) {
              if (!input.trySkipNullValue()) {
                clientPosVersion = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SceneEntityMoveScNotify clone() {
      return new SceneEntityMoveScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityMoveScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityMoveScNotify(), data).checkInitialized();
    }

    public static SceneEntityMoveScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityMoveScNotify(), input).checkInitialized();
    }

    public static SceneEntityMoveScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityMoveScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityMoveScNotify messages
     */
    public static MessageFactory<SceneEntityMoveScNotify> getFactory() {
      return SceneEntityMoveScNotifyFactory.INSTANCE;
    }

    private enum SceneEntityMoveScNotifyFactory implements MessageFactory<SceneEntityMoveScNotify> {
      INSTANCE;

      @Override
      public SceneEntityMoveScNotify create() {
        return SceneEntityMoveScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName clientPosVersion = FieldName.forField("clientPosVersion", "client_pos_version");

      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName motion = FieldName.forField("motion");
    }
  }
}
