package NoSwearing;

import java.util.ArrayList;

public class config {

	// General settings
	
	private  ArrayList<String> offenders = new ArrayList<String>();
	private boolean globalNotify;
	private boolean playerNotify;
	private String messageOnKick;
	private String messageOnBan;
		
	// Sign related settings
	
	private boolean listenToSignPlace;
	private int sign_warnings;
	private int sign_kickOnWarning;
	private boolean sign_banOnLastWarning;
		
	// Nickname related settings
	
	private boolean listenToNickChange;
	private int nick_warnings;
	private int nick_kickOnWarning;
	
	public ArrayList<String> getOffenders() {
		return offenders;
	}
	public void setOffenders(ArrayList<String> offenders) {
		this.offenders = offenders;
	}
	public boolean isGlobalNotify() {
		return globalNotify;
	}
	public void setGlobalNotify(boolean globalNotify) {
		this.globalNotify = globalNotify;
	}
	public boolean isPlayerNotify() {
		return playerNotify;
	}
	public void setPlayerNotify(boolean playerNotify) {
		this.playerNotify = playerNotify;
	}
	public String getMessageOnKick() {
		return messageOnKick;
	}
	public void setMessageOnKick(String messageOnKick) {
		this.messageOnKick = messageOnKick;
	}
	public String getMessageOnBan() {
		return messageOnBan;
	}
	public void setMessageOnBan(String messageOnBan) {
		this.messageOnBan = messageOnBan;
	}
	public boolean isListenToSignPlace() {
		return listenToSignPlace;
	}
	public void setListenToSignPlace(boolean listenToSignPlace) {
		this.listenToSignPlace = listenToSignPlace;
	}
	public int getSign_warnings() {
		return sign_warnings;
	}
	public void setSign_warnings(int sign_warnings) {
		this.sign_warnings = sign_warnings;
	}
	public int getSign_kickOnWarning() {
		return sign_kickOnWarning;
	}
	public void setSign_kickOnWarning(int sign_kickOnWarning) {
		this.sign_kickOnWarning = sign_kickOnWarning;
	}
	public boolean isSign_banOnLastWarning() {
		return sign_banOnLastWarning;
	}
	public void setSign_banOnLastWarning(boolean sign_banOnLastWarning) {
		this.sign_banOnLastWarning = sign_banOnLastWarning;
	}
	public boolean isListenToNickChange() {
		return listenToNickChange;
	}
	public void setListenToNickChange(boolean listenToNickChange) {
		this.listenToNickChange = listenToNickChange;
	}
	public int getNick_warnings() {
		return nick_warnings;
	}
	public void setNick_warnings(int nick_warnings) {
		this.nick_warnings = nick_warnings;
	}
	public int getNick_kickOnWarning() {
		return nick_kickOnWarning;
	}
	public void setNick_kickOnWarning(int nick_kickOnWarning) {
		this.nick_kickOnWarning = nick_kickOnWarning;
	}
	public boolean isNick_banOnLastWarning() {
		return nick_banOnLastWarning;
	}
	public void setNick_banOnLastWarning(boolean nick_banOnLastWarning) {
		this.nick_banOnLastWarning = nick_banOnLastWarning;
	}
	private boolean nick_banOnLastWarning;
	
	
}
