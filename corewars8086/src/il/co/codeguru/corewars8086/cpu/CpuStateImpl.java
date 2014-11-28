package il.co.codeguru.corewars8086.cpu;

import il.co.codeguru.corewars8086.utils.Unsigned;

/**
 * Wrapper class for CPU state (registers & flags). 
 * 
 * @author DL
 */
public class CpuStateImpl implements CpuState {

    /** Accessors for the 16bit registers */
    @Override
    public short getAX() {
        return m_ax;
    }
    @Override
    public short getBX() {
        return m_bx;
    }
    @Override
    public short getCX() {
        return m_cx;
    }
    @Override
    public short getDX() {
        return m_dx;
    }
    @Override
    public short getDS() {
        return m_ds;
    }
    @Override
    public short getES() {
        return m_es;
    }
    @Override
    public short getSI() {
        return m_si;
    }
    @Override
    public short getDI() {
        return m_di;
    }
    @Override
    public short getSS() {
        return m_ss;
    }
    @Override
    public short getBP() {
        return m_bp;
    }
    @Override
    public short getSP() {
        return m_sp;
    }
    @Override
    public short getCS() {
        return m_cs;
    }
    @Override
    public short getIP() {
        return m_ip;
    }
    @Override
    public short getFlags() {
        return m_flags;
    }	

    @Override
    public void setAX(short value) {
        m_ax = value;
    }
    @Override
    public void setBX(short value) {
        m_bx = value;
    }
    @Override
    public void setCX(short value) {
        m_cx = value;
    }
    @Override
    public void setDX(short value) {
        m_dx = value;
    }
    @Override
    public void setDS(short value) {
        m_ds = value;
    }
    @Override
    public void setES(short value) {
        m_es = value;
    }
    @Override
    public void setSI(short value) {
        m_si = value;
    }
    @Override
    public void setDI(short value) {
        m_di = value;
    }
    @Override
    public void setSS(short value) {
        m_ss = value;
    }
    @Override
    public void setBP(short value) {
        m_bp = value;
    }
    @Override
    public void setSP(short value) {
        m_sp = value;
    }
    @Override
    public void setCS(short value) {
        m_cs = value;
    }
    @Override
    public void setIP(short value) {
        m_ip = value;
    }
    @Override
    public void setFlags(short value) {
        m_flags = value;
    }

    /** Accessors for the 8bit registers */
    @Override
    public byte getAL() {
        return (byte)m_ax;
    }	
    @Override
    public byte getBL() {
        return (byte)m_bx;
    }	
    @Override
    public byte getCL() {
        return (byte)m_cx;
    }	
    @Override
    public byte getDL() {
        return (byte)m_dx;
    }	
    @Override
    public byte getAH() {
        return (byte)(m_ax >> 8);
    }	
    @Override
    public byte getBH() {
        return (byte)(m_bx >> 8);
    }	
    @Override
    public byte getCH() {
        return (byte)(m_cx >> 8);
    }	
    @Override
    public byte getDH() {
        return (byte)(m_dx >> 8);
    }	

    @Override
    public void setAL(byte value) {
        m_ax &= 0xFF00;
        m_ax |= Unsigned.unsignedByte(value);
    }
    @Override
    public void setBL(byte value) {
        m_bx &= 0xFF00;
        m_bx |= Unsigned.unsignedByte(value);
    }
    @Override
    public void setCL(byte value) {
        m_cx &= 0xFF00;
        m_cx |= Unsigned.unsignedByte(value);
    }
    @Override
    public void setDL(byte value) {
        m_dx &= 0xFF00;
        m_dx |= Unsigned.unsignedByte(value);
    }
    @Override
    public void setAH(byte value) {
        m_ax &= 0x00FF;
        m_ax |= (Unsigned.unsignedByte(value) << 8);
    }
    @Override
    public void setBH(byte value) {
        m_bx &= 0x00FF;
        m_bx |= (Unsigned.unsignedByte(value) << 8);
    }
    @Override
    public void setCH(byte value) {
        m_cx &= 0x00FF;
        m_cx |= (Unsigned.unsignedByte(value) << 8);
    }
    @Override
    public void setDH(byte value) {
        m_dx &= 0x00FF;
        m_dx |= (Unsigned.unsignedByte(value) << 8);
    }

    /** Accessors for the virtual Energy register. */
    @Override
    public short getEnergy() {
        return m_energy;
    }
    @Override
    public void setEnergy(short value) {
        m_energy = value;
    }

    /** Accessors for the virtual bomb count registers. */
    @Override
    public byte getBomb1Count() {
        return m_bomb1count;
    }
    @Override
    public void setBomb1Count(byte value) {
        m_bomb1count = value;
    }
    @Override
    public byte getBomb2Count() {
        return m_bomb2count;
    }
    @Override
    public void setBomb2Count(byte value) {
        m_bomb2count = value;
    }

    /**
     * 'get' accessor methods for the various fields of the flags register.
     * @return whether or not the requested flags field is set.
     */
    @Override
    public boolean getCarryFlag() {
        return ((m_flags & FLAGS_MASK_CARRY) == FLAGS_MASK_CARRY);
    }
    @Override
    public boolean getParityFlag() {
        return ((m_flags & FLAGS_MASK_PARITY) == FLAGS_MASK_PARITY);
    }
    @Override
    public boolean getAuxFlag() {
        return ((m_flags & FLAGS_MASK_AUX) == FLAGS_MASK_AUX);
    }
    @Override
    public boolean getZeroFlag() {
        return ((m_flags & FLAGS_MASK_ZERO) == FLAGS_MASK_ZERO);
    }
    @Override
    public boolean getSignFlag() {
        return ((m_flags & FLAGS_MASK_SIGN) == FLAGS_MASK_SIGN);
    }
    @Override
    public boolean getTrapFlag() {
        return ((m_flags & FLAGS_MASK_TRAP) == FLAGS_MASK_TRAP);
    }
    @Override
    public boolean getInterruptFlag() {
        return ((m_flags & FLAGS_MASK_INTERRUPT) == FLAGS_MASK_INTERRUPT);
    }
    @Override
    public boolean getDirectionFlag() {
        return ((m_flags & FLAGS_MASK_DIRECTION) == FLAGS_MASK_DIRECTION);
    }
    @Override
    public boolean getOverflowFlag() {
        return ((m_flags & FLAGS_MASK_OVERFLOW) == FLAGS_MASK_OVERFLOW);
    }

    /**
     * 'set' accessor methods for the various fields of the flags register.
     * @param newValue whether or not the requested flags field should be set.
     */
    @Override
    public void setCarryFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_CARRY;
        } else {
            m_flags &= (~FLAGS_MASK_CARRY);
        }
    }
    @Override
    public void setParityFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_PARITY;
        } else {
            m_flags &= (~FLAGS_MASK_PARITY);
        }
    }
    @Override
    public void setAuxFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_AUX;
        } else {
            m_flags &= (~FLAGS_MASK_AUX);
        }
    }
    @Override
    public void setZeroFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_ZERO;
        } else {
            m_flags &= (~FLAGS_MASK_ZERO);
        }
    }
    @Override
    public void setSignFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_SIGN;
        } else {
            m_flags &= (~FLAGS_MASK_SIGN);
        }
    }
    @Override
    public void setTrapFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_TRAP;
        } else {
            m_flags &= (~FLAGS_MASK_TRAP);
        }
    }
    @Override
    public void setInterruptFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_INTERRUPT;
        } else {
            m_flags &= (~FLAGS_MASK_INTERRUPT);
        }
    }
    @Override
    public void setDirectionFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_DIRECTION;
        } else {
            m_flags &= (~FLAGS_MASK_DIRECTION);
        }
    }
    @Override
    public void setOverflowFlag(boolean newValue) {
        if (newValue) {
            m_flags |= FLAGS_MASK_OVERFLOW;
        } else {
            m_flags &= (~FLAGS_MASK_OVERFLOW);
        }
    }

    /** CPU registers */
    private short m_ax;
    private short m_bx;
    private short m_cx;
    private short m_dx;

    private short m_ds;
    private short m_es;
    private short m_si;
    private short m_di;

    private short m_ss;
    private short m_bp;
    private short m_sp;

    private short m_cs;
    private short m_ip;
    private short m_flags;

    /** The virtual Energy register (used to calculate the warrior's speed). */
    private short m_energy;

    /** The virtual bomb count registers (used for INT 0x86, INT 0x87 opcodes). */
    private byte m_bomb1count;
    private byte m_bomb2count;


    /**
     * Masks for the various 'flags' fields.
     */
    private static final short FLAGS_MASK_CARRY = 0x0001;
    private static final short FLAGS_MASK_PARITY = 0x0004;
    private static final short FLAGS_MASK_AUX = 0x0010;
    private static final short FLAGS_MASK_ZERO = 0x0040;
    private static final short FLAGS_MASK_SIGN = 0x0080;
    private static final short FLAGS_MASK_TRAP = 0x0100;
    private static final short FLAGS_MASK_INTERRUPT = 0x0200;
    private static final short FLAGS_MASK_DIRECTION = 0x0400;
    private static final short FLAGS_MASK_OVERFLOW = 0x0800;	
}