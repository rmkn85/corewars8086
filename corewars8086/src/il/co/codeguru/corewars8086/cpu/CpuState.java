package il.co.codeguru.corewars8086.cpu;

/**
 * @author romi
 * @since 2014-11-28
 */
public interface CpuState {
    short getAX();

    short getBX();

    short getCX();

    short getDX();

    short getDS();

    short getES();

    short getSI();

    short getDI();

    short getSS();

    short getBP();

    short getSP();

    short getCS();

    short getIP();

    short getFlags();

    void setAX(short value);

    void setBX(short value);

    void setCX(short value);

    void setDX(short value);

    void setDS(short value);

    void setES(short value);

    void setSI(short value);

    void setDI(short value);

    void setSS(short value);

    void setBP(short value);

    void setSP(short value);

    void setCS(short value);

    void setIP(short value);

    void setFlags(short value);

    byte getAL();

    byte getBL();

    byte getCL();

    byte getDL();

    byte getAH();

    byte getBH();

    byte getCH();

    byte getDH();

    void setAL(byte value);

    void setBL(byte value);

    void setCL(byte value);

    void setDL(byte value);

    void setAH(byte value);

    void setBH(byte value);

    void setCH(byte value);

    void setDH(byte value);

    short getEnergy();

    void setEnergy(short value);

    byte getBomb1Count();

    void setBomb1Count(byte value);

    byte getBomb2Count();

    void setBomb2Count(byte value);

    boolean getCarryFlag();

    boolean getParityFlag();

    boolean getAuxFlag();

    boolean getZeroFlag();

    boolean getSignFlag();

    boolean getTrapFlag();

    boolean getInterruptFlag();

    boolean getDirectionFlag();

    boolean getOverflowFlag();

    void setCarryFlag(boolean newValue);

    void setParityFlag(boolean newValue);

    void setAuxFlag(boolean newValue);

    void setZeroFlag(boolean newValue);

    void setSignFlag(boolean newValue);

    void setTrapFlag(boolean newValue);

    void setInterruptFlag(boolean newValue);

    void setDirectionFlag(boolean newValue);

    void setOverflowFlag(boolean newValue);
}
