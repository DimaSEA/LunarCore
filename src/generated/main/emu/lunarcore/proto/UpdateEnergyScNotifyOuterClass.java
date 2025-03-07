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

public final class UpdateEnergyScNotifyOuterClass {
  /**
   * Protobuf type {@code UpdateEnergyScNotify}
   */
  public static final class UpdateEnergyScNotify extends ProtoMessage<UpdateEnergyScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     */
    private final RotatorEnergyInfoOuterClass.RotatorEnergyInfo energyInfo = RotatorEnergyInfoOuterClass.RotatorEnergyInfo.newInstance();

    private UpdateEnergyScNotify() {
    }

    /**
     * @return a new empty instance of {@code UpdateEnergyScNotify}
     */
    public static UpdateEnergyScNotify newInstance() {
      return new UpdateEnergyScNotify();
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     * @return whether the energyInfo field is set
     */
    public boolean hasEnergyInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     * @return this
     */
    public UpdateEnergyScNotify clearEnergyInfo() {
      bitField0_ &= ~0x00000001;
      energyInfo.clear();
      return this;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEnergyInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getEnergyInfo() {
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getMutableEnergyInfo() {
      bitField0_ |= 0x00000001;
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 11;</code>
     * @param value the energyInfo to set
     * @return this
     */
    public UpdateEnergyScNotify setEnergyInfo(
        final RotatorEnergyInfoOuterClass.RotatorEnergyInfo value) {
      bitField0_ |= 0x00000001;
      energyInfo.copyFrom(value);
      return this;
    }

    @Override
    public UpdateEnergyScNotify copyFrom(final UpdateEnergyScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        energyInfo.copyFrom(other.energyInfo);
      }
      return this;
    }

    @Override
    public UpdateEnergyScNotify mergeFrom(final UpdateEnergyScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEnergyInfo()) {
        getMutableEnergyInfo().mergeFrom(other.energyInfo);
      }
      return this;
    }

    @Override
    public UpdateEnergyScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      energyInfo.clear();
      return this;
    }

    @Override
    public UpdateEnergyScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      energyInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UpdateEnergyScNotify)) {
        return false;
      }
      UpdateEnergyScNotify other = (UpdateEnergyScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasEnergyInfo() || energyInfo.equals(other.energyInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(energyInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(energyInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UpdateEnergyScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 90: {
            // energyInfo
            input.readMessage(energyInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.energyInfo, energyInfo);
      }
      output.endObject();
    }

    @Override
    public UpdateEnergyScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1464698710:
          case -1818804219: {
            if (input.isAtField(FieldNames.energyInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(energyInfo);
                bitField0_ |= 0x00000001;
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
    public UpdateEnergyScNotify clone() {
      return new UpdateEnergyScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UpdateEnergyScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UpdateEnergyScNotify(), data).checkInitialized();
    }

    public static UpdateEnergyScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateEnergyScNotify(), input).checkInitialized();
    }

    public static UpdateEnergyScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateEnergyScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating UpdateEnergyScNotify messages
     */
    public static MessageFactory<UpdateEnergyScNotify> getFactory() {
      return UpdateEnergyScNotifyFactory.INSTANCE;
    }

    private enum UpdateEnergyScNotifyFactory implements MessageFactory<UpdateEnergyScNotify> {
      INSTANCE;

      @Override
      public UpdateEnergyScNotify create() {
        return UpdateEnergyScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName energyInfo = FieldName.forField("energyInfo", "energy_info");
    }
  }
}
