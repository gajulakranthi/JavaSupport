package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Eligibility{

	public boolean gPinInq;
    public boolean gPinView;
    public boolean gPinSelfSelect;
    public boolean gPinReminder;
    public boolean gPinUnlockInitiate;
    public boolean gPinPips;
    public boolean gPinPipsReset;
    public boolean gPinChange;
    public boolean gPinReset;
    public boolean gPinUnlock;
    public boolean gPinValidate;
    public boolean getGlobalPin;
    public boolean lockPin;
	public boolean isgPinInq() {
		return gPinInq;
	}
	public void setgPinInq(boolean gPinInq) {
		this.gPinInq = gPinInq;
	}
	public boolean isgPinView() {
		return gPinView;
	}
	public void setgPinView(boolean gPinView) {
		this.gPinView = gPinView;
	}
	public boolean isgPinSelfSelect() {
		return gPinSelfSelect;
	}
	public void setgPinSelfSelect(boolean gPinSelfSelect) {
		this.gPinSelfSelect = gPinSelfSelect;
	}
	public boolean isgPinReminder() {
		return gPinReminder;
	}
	public void setgPinReminder(boolean gPinReminder) {
		this.gPinReminder = gPinReminder;
	}
	public boolean isgPinUnlockInitiate() {
		return gPinUnlockInitiate;
	}
	public void setgPinUnlockInitiate(boolean gPinUnlockInitiate) {
		this.gPinUnlockInitiate = gPinUnlockInitiate;
	}
	public boolean isgPinPips() {
		return gPinPips;
	}
	public void setgPinPips(boolean gPinPips) {
		this.gPinPips = gPinPips;
	}
	public boolean isgPinPipsReset() {
		return gPinPipsReset;
	}
	public void setgPinPipsReset(boolean gPinPipsReset) {
		this.gPinPipsReset = gPinPipsReset;
	}
	public boolean isgPinChange() {
		return gPinChange;
	}
	public void setgPinChange(boolean gPinChange) {
		this.gPinChange = gPinChange;
	}
	public boolean isgPinReset() {
		return gPinReset;
	}
	public void setgPinReset(boolean gPinReset) {
		this.gPinReset = gPinReset;
	}
	public boolean isgPinUnlock() {
		return gPinUnlock;
	}
	public void setgPinUnlock(boolean gPinUnlock) {
		this.gPinUnlock = gPinUnlock;
	}
	public boolean isgPinValidate() {
		return gPinValidate;
	}
	public void setgPinValidate(boolean gPinValidate) {
		this.gPinValidate = gPinValidate;
	}
	public boolean isGetGlobalPin() {
		return getGlobalPin;
	}
	public void setGetGlobalPin(boolean getGlobalPin) {
		this.getGlobalPin = getGlobalPin;
	}
	public boolean isLockPin() {
		return lockPin;
	}
	public void setLockPin(boolean lockPin) {
		this.lockPin = lockPin;
	}
    @Override
	public String toString() {
		return "Eligibility [gPinInq=" + gPinInq + ", gPinView=" + gPinView + ", gPinSelfSelect=" + gPinSelfSelect
				+ ", gPinReminder=" + gPinReminder + ", gPinUnlockInitiate=" + gPinUnlockInitiate + ", gPinPips="
				+ gPinPips + ", gPinPipsReset=" + gPinPipsReset + ", gPinChange=" + gPinChange + ", gPinReset="
				+ gPinReset + ", gPinUnlock=" + gPinUnlock + ", gPinValidate=" + gPinValidate + ", getGlobalPin="
				+ getGlobalPin + ", lockPin=" + lockPin + "]";
	}
}