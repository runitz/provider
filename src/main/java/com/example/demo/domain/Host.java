package com.example.demo.domain;

public class Host {
 String ip;
 int port;
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public Host(String ip, int port) {
	super();
	this.ip = ip;
	this.port = port;
}
public Host() {
	super();
}
}
