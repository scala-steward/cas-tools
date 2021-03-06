/*
 * Copyright 2017 Lightbend, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightbend.rp.reactivecli.http.nativebinding

import scala.scalanative.native
import scala.scalanative.native._

@link("curl")
@extern
object curl {
  type CURL = Ptr[_]
  type curl_slist = CStruct2[CString, Ptr[Byte]]

  // Following enums were generated automatically by gen-curl-bindings
  class CURLINFO(val value: CInt) extends AnyVal
  object CURLINFO {
    val NONE: CURLINFO = new CURLINFO(0)
    val EFFECTIVE_URL: CURLINFO = new CURLINFO(1048577)
    val RESPONSE_CODE: CURLINFO = new CURLINFO(2097154)
    val TOTAL_TIME: CURLINFO = new CURLINFO(3145731)
    val NAMELOOKUP_TIME: CURLINFO = new CURLINFO(3145732)
    val CONNECT_TIME: CURLINFO = new CURLINFO(3145733)
    val PRETRANSFER_TIME: CURLINFO = new CURLINFO(3145734)
    val SIZE_UPLOAD: CURLINFO = new CURLINFO(3145735)
    val SIZE_UPLOAD_T: CURLINFO = new CURLINFO(6291463)
    val SIZE_DOWNLOAD: CURLINFO = new CURLINFO(3145736)
    val SIZE_DOWNLOAD_T: CURLINFO = new CURLINFO(6291464)
    val SPEED_DOWNLOAD: CURLINFO = new CURLINFO(3145737)
    val SPEED_DOWNLOAD_T: CURLINFO = new CURLINFO(6291465)
    val SPEED_UPLOAD: CURLINFO = new CURLINFO(3145738)
    val SPEED_UPLOAD_T: CURLINFO = new CURLINFO(6291466)
    val HEADER_SIZE: CURLINFO = new CURLINFO(2097163)
    val REQUEST_SIZE: CURLINFO = new CURLINFO(2097164)
    val SSL_VERIFYRESULT: CURLINFO = new CURLINFO(2097165)
    val FILETIME: CURLINFO = new CURLINFO(2097166)
    val CONTENT_LENGTH_DOWNLOAD: CURLINFO = new CURLINFO(3145743)
    val CONTENT_LENGTH_DOWNLOAD_T: CURLINFO = new CURLINFO(6291471)
    val CONTENT_LENGTH_UPLOAD: CURLINFO = new CURLINFO(3145744)
    val CONTENT_LENGTH_UPLOAD_T: CURLINFO = new CURLINFO(6291472)
    val STARTTRANSFER_TIME: CURLINFO = new CURLINFO(3145745)
    val CONTENT_TYPE: CURLINFO = new CURLINFO(1048594)
    val REDIRECT_TIME: CURLINFO = new CURLINFO(3145747)
    val REDIRECT_COUNT: CURLINFO = new CURLINFO(2097172)
    val PRIVATE: CURLINFO = new CURLINFO(1048597)
    val HTTP_CONNECTCODE: CURLINFO = new CURLINFO(2097174)
    val HTTPAUTH_AVAIL: CURLINFO = new CURLINFO(2097175)
    val PROXYAUTH_AVAIL: CURLINFO = new CURLINFO(2097176)
    val OS_ERRNO: CURLINFO = new CURLINFO(2097177)
    val NUM_CONNECTS: CURLINFO = new CURLINFO(2097178)
    val SSL_ENGINES: CURLINFO = new CURLINFO(4194331)
    val COOKIELIST: CURLINFO = new CURLINFO(4194332)
    val LASTSOCKET: CURLINFO = new CURLINFO(2097181)
    val FTP_ENTRY_PATH: CURLINFO = new CURLINFO(1048606)
    val REDIRECT_URL: CURLINFO = new CURLINFO(1048607)
    val PRIMARY_IP: CURLINFO = new CURLINFO(1048608)
    val APPCONNECT_TIME: CURLINFO = new CURLINFO(3145761)
    val CERTINFO: CURLINFO = new CURLINFO(4194338)
    val CONDITION_UNMET: CURLINFO = new CURLINFO(2097187)
    val RTSP_SESSION_ID: CURLINFO = new CURLINFO(1048612)
    val RTSP_CLIENT_CSEQ: CURLINFO = new CURLINFO(2097189)
    val RTSP_SERVER_CSEQ: CURLINFO = new CURLINFO(2097190)
    val RTSP_CSEQ_RECV: CURLINFO = new CURLINFO(2097191)
    val PRIMARY_PORT: CURLINFO = new CURLINFO(2097192)
    val LOCAL_IP: CURLINFO = new CURLINFO(1048617)
    val LOCAL_PORT: CURLINFO = new CURLINFO(2097194)
    val TLS_SESSION: CURLINFO = new CURLINFO(4194347)
    val ACTIVESOCKET: CURLINFO = new CURLINFO(5242924)
    val TLS_SSL_PTR: CURLINFO = new CURLINFO(4194349)
    val HTTP_VERSION: CURLINFO = new CURLINFO(2097198)
    val PROXY_SSL_VERIFYRESULT: CURLINFO = new CURLINFO(2097199)
    val PROTOCOL: CURLINFO = new CURLINFO(2097200)
    val SCHEME: CURLINFO = new CURLINFO(1048625)
    val LASTONE: CURLINFO = new CURLINFO(49)
  }

  class CURLoption(val value: CInt) extends AnyVal
  object CURLoption {
    val CURLOPT_WRITEDATA: CURLoption = new CURLoption(10001)
    val CURLOPT_URL: CURLoption = new CURLoption(10002)
    val CURLOPT_PORT: CURLoption = new CURLoption(3)
    val CURLOPT_PROXY: CURLoption = new CURLoption(10004)
    val CURLOPT_USERPWD: CURLoption = new CURLoption(10005)
    val CURLOPT_PROXYUSERPWD: CURLoption = new CURLoption(10006)
    val CURLOPT_RANGE: CURLoption = new CURLoption(10007)
    val CURLOPT_READDATA: CURLoption = new CURLoption(10009)
    val CURLOPT_ERRORBUFFER: CURLoption = new CURLoption(10010)
    val CURLOPT_WRITEFUNCTION: CURLoption = new CURLoption(20011)
    val CURLOPT_READFUNCTION: CURLoption = new CURLoption(20012)
    val CURLOPT_TIMEOUT: CURLoption = new CURLoption(13)
    val CURLOPT_INFILESIZE: CURLoption = new CURLoption(14)
    val CURLOPT_POSTFIELDS: CURLoption = new CURLoption(10015)
    val CURLOPT_REFERER: CURLoption = new CURLoption(10016)
    val CURLOPT_FTPPORT: CURLoption = new CURLoption(10017)
    val CURLOPT_USERAGENT: CURLoption = new CURLoption(10018)
    val CURLOPT_LOW_SPEED_LIMIT: CURLoption = new CURLoption(19)
    val CURLOPT_LOW_SPEED_TIME: CURLoption = new CURLoption(20)
    val CURLOPT_RESUME_FROM: CURLoption = new CURLoption(21)
    val CURLOPT_COOKIE: CURLoption = new CURLoption(10022)
    val CURLOPT_HTTPHEADER: CURLoption = new CURLoption(10023)
    val CURLOPT_HTTPPOST: CURLoption = new CURLoption(10024)
    val CURLOPT_SSLCERT: CURLoption = new CURLoption(10025)
    val CURLOPT_KEYPASSWD: CURLoption = new CURLoption(10026)
    val CURLOPT_CRLF: CURLoption = new CURLoption(27)
    val CURLOPT_QUOTE: CURLoption = new CURLoption(10028)
    val CURLOPT_HEADERDATA: CURLoption = new CURLoption(10029)
    val CURLOPT_COOKIEFILE: CURLoption = new CURLoption(10031)
    val CURLOPT_SSLVERSION: CURLoption = new CURLoption(32)
    val CURLOPT_TIMECONDITION: CURLoption = new CURLoption(33)
    val CURLOPT_TIMEVALUE: CURLoption = new CURLoption(34)
    val CURLOPT_CUSTOMREQUEST: CURLoption = new CURLoption(10036)
    val CURLOPT_STDERR: CURLoption = new CURLoption(10037)
    val CURLOPT_POSTQUOTE: CURLoption = new CURLoption(10039)
    val CURLOPT_OBSOLETE40: CURLoption = new CURLoption(10040)
    val CURLOPT_VERBOSE: CURLoption = new CURLoption(41)
    val CURLOPT_HEADER: CURLoption = new CURLoption(42)
    val CURLOPT_NOPROGRESS: CURLoption = new CURLoption(43)
    val CURLOPT_NOBODY: CURLoption = new CURLoption(44)
    val CURLOPT_FAILONERROR: CURLoption = new CURLoption(45)
    val CURLOPT_UPLOAD: CURLoption = new CURLoption(46)
    val CURLOPT_POST: CURLoption = new CURLoption(47)
    val CURLOPT_DIRLISTONLY: CURLoption = new CURLoption(48)
    val CURLOPT_APPEND: CURLoption = new CURLoption(50)
    val CURLOPT_NETRC: CURLoption = new CURLoption(51)
    val CURLOPT_FOLLOWLOCATION: CURLoption = new CURLoption(52)
    val CURLOPT_TRANSFERTEXT: CURLoption = new CURLoption(53)
    val CURLOPT_PUT: CURLoption = new CURLoption(54)
    val CURLOPT_PROGRESSFUNCTION: CURLoption = new CURLoption(20056)
    val CURLOPT_PROGRESSDATA: CURLoption = new CURLoption(10057)
    val CURLOPT_AUTOREFERER: CURLoption = new CURLoption(58)
    val CURLOPT_PROXYPORT: CURLoption = new CURLoption(59)
    val CURLOPT_POSTFIELDSIZE: CURLoption = new CURLoption(60)
    val CURLOPT_HTTPPROXYTUNNEL: CURLoption = new CURLoption(61)
    val CURLOPT_INTERFACE: CURLoption = new CURLoption(10062)
    val CURLOPT_KRBLEVEL: CURLoption = new CURLoption(10063)
    val CURLOPT_SSL_VERIFYPEER: CURLoption = new CURLoption(64)
    val CURLOPT_CAINFO: CURLoption = new CURLoption(10065)
    val CURLOPT_MAXREDIRS: CURLoption = new CURLoption(68)
    val CURLOPT_FILETIME: CURLoption = new CURLoption(69)
    val CURLOPT_TELNETOPTIONS: CURLoption = new CURLoption(10070)
    val CURLOPT_MAXCONNECTS: CURLoption = new CURLoption(71)
    val CURLOPT_OBSOLETE72: CURLoption = new CURLoption(72)
    val CURLOPT_FRESH_CONNECT: CURLoption = new CURLoption(74)
    val CURLOPT_FORBID_REUSE: CURLoption = new CURLoption(75)
    val CURLOPT_RANDOM_FILE: CURLoption = new CURLoption(10076)
    val CURLOPT_EGDSOCKET: CURLoption = new CURLoption(10077)
    val CURLOPT_CONNECTTIMEOUT: CURLoption = new CURLoption(78)
    val CURLOPT_HEADERFUNCTION: CURLoption = new CURLoption(20079)
    val CURLOPT_HTTPGET: CURLoption = new CURLoption(80)
    val CURLOPT_SSL_VERIFYHOST: CURLoption = new CURLoption(81)
    val CURLOPT_COOKIEJAR: CURLoption = new CURLoption(10082)
    val CURLOPT_SSL_CIPHER_LIST: CURLoption = new CURLoption(10083)
    val CURLOPT_HTTP_VERSION: CURLoption = new CURLoption(84)
    val CURLOPT_FTP_USE_EPSV: CURLoption = new CURLoption(85)
    val CURLOPT_SSLCERTTYPE: CURLoption = new CURLoption(10086)
    val CURLOPT_SSLKEY: CURLoption = new CURLoption(10087)
    val CURLOPT_SSLKEYTYPE: CURLoption = new CURLoption(10088)
    val CURLOPT_SSLENGINE: CURLoption = new CURLoption(10089)
    val CURLOPT_SSLENGINE_DEFAULT: CURLoption = new CURLoption(90)
    val CURLOPT_DNS_USE_GLOBAL_CACHE: CURLoption = new CURLoption(91)
    val CURLOPT_DNS_CACHE_TIMEOUT: CURLoption = new CURLoption(92)
    val CURLOPT_PREQUOTE: CURLoption = new CURLoption(10093)
    val CURLOPT_DEBUGFUNCTION: CURLoption = new CURLoption(20094)
    val CURLOPT_DEBUGDATA: CURLoption = new CURLoption(10095)
    val CURLOPT_COOKIESESSION: CURLoption = new CURLoption(96)
    val CURLOPT_CAPATH: CURLoption = new CURLoption(10097)
    val CURLOPT_BUFFERSIZE: CURLoption = new CURLoption(98)
    val CURLOPT_NOSIGNAL: CURLoption = new CURLoption(99)
    val CURLOPT_SHARE: CURLoption = new CURLoption(10100)
    val CURLOPT_PROXYTYPE: CURLoption = new CURLoption(101)
    val CURLOPT_ACCEPT_ENCODING: CURLoption = new CURLoption(10102)
    val CURLOPT_PRIVATE: CURLoption = new CURLoption(10103)
    val CURLOPT_HTTP200ALIASES: CURLoption = new CURLoption(10104)
    val CURLOPT_UNRESTRICTED_AUTH: CURLoption = new CURLoption(105)
    val CURLOPT_FTP_USE_EPRT: CURLoption = new CURLoption(106)
    val CURLOPT_HTTPAUTH: CURLoption = new CURLoption(107)
    val CURLOPT_SSL_CTX_FUNCTION: CURLoption = new CURLoption(20108)
    val CURLOPT_SSL_CTX_DATA: CURLoption = new CURLoption(10109)
    val CURLOPT_FTP_CREATE_MISSING_DIRS: CURLoption = new CURLoption(110)
    val CURLOPT_PROXYAUTH: CURLoption = new CURLoption(111)
    val CURLOPT_FTP_RESPONSE_TIMEOUT: CURLoption = new CURLoption(112)
    val CURLOPT_IPRESOLVE: CURLoption = new CURLoption(113)
    val CURLOPT_MAXFILESIZE: CURLoption = new CURLoption(114)
    val CURLOPT_INFILESIZE_LARGE: CURLoption = new CURLoption(30115)
    val CURLOPT_RESUME_FROM_LARGE: CURLoption = new CURLoption(30116)
    val CURLOPT_MAXFILESIZE_LARGE: CURLoption = new CURLoption(30117)
    val CURLOPT_NETRC_FILE: CURLoption = new CURLoption(10118)
    val CURLOPT_USE_SSL: CURLoption = new CURLoption(119)
    val CURLOPT_POSTFIELDSIZE_LARGE: CURLoption = new CURLoption(30120)
    val CURLOPT_TCP_NODELAY: CURLoption = new CURLoption(121)
    val CURLOPT_FTPSSLAUTH: CURLoption = new CURLoption(129)
    val CURLOPT_IOCTLFUNCTION: CURLoption = new CURLoption(20130)
    val CURLOPT_IOCTLDATA: CURLoption = new CURLoption(10131)
    val CURLOPT_FTP_ACCOUNT: CURLoption = new CURLoption(10134)
    val CURLOPT_COOKIELIST: CURLoption = new CURLoption(10135)
    val CURLOPT_IGNORE_CONTENT_LENGTH: CURLoption = new CURLoption(136)
    val CURLOPT_FTP_SKIP_PASV_IP: CURLoption = new CURLoption(137)
    val CURLOPT_FTP_FILEMETHOD: CURLoption = new CURLoption(138)
    val CURLOPT_LOCALPORT: CURLoption = new CURLoption(139)
    val CURLOPT_LOCALPORTRANGE: CURLoption = new CURLoption(140)
    val CURLOPT_CONNECT_ONLY: CURLoption = new CURLoption(141)
    val CURLOPT_CONV_FROM_NETWORK_FUNCTION: CURLoption = new CURLoption(20142)
    val CURLOPT_CONV_TO_NETWORK_FUNCTION: CURLoption = new CURLoption(20143)
    val CURLOPT_CONV_FROM_UTF8_FUNCTION: CURLoption = new CURLoption(20144)
    val CURLOPT_MAX_SEND_SPEED_LARGE: CURLoption = new CURLoption(30145)
    val CURLOPT_MAX_RECV_SPEED_LARGE: CURLoption = new CURLoption(30146)
    val CURLOPT_FTP_ALTERNATIVE_TO_USER: CURLoption = new CURLoption(10147)
    val CURLOPT_SOCKOPTFUNCTION: CURLoption = new CURLoption(20148)
    val CURLOPT_SOCKOPTDATA: CURLoption = new CURLoption(10149)
    val CURLOPT_SSL_SESSIONID_CACHE: CURLoption = new CURLoption(150)
    val CURLOPT_SSH_AUTH_TYPES: CURLoption = new CURLoption(151)
    val CURLOPT_SSH_PUBLIC_KEYFILE: CURLoption = new CURLoption(10152)
    val CURLOPT_SSH_PRIVATE_KEYFILE: CURLoption = new CURLoption(10153)
    val CURLOPT_FTP_SSL_CCC: CURLoption = new CURLoption(154)
    val CURLOPT_TIMEOUT_MS: CURLoption = new CURLoption(155)
    val CURLOPT_CONNECTTIMEOUT_MS: CURLoption = new CURLoption(156)
    val CURLOPT_HTTP_TRANSFER_DECODING: CURLoption = new CURLoption(157)
    val CURLOPT_HTTP_CONTENT_DECODING: CURLoption = new CURLoption(158)
    val CURLOPT_NEW_FILE_PERMS: CURLoption = new CURLoption(159)
    val CURLOPT_NEW_DIRECTORY_PERMS: CURLoption = new CURLoption(160)
    val CURLOPT_POSTREDIR: CURLoption = new CURLoption(161)
    val CURLOPT_SSH_HOST_PUBLIC_KEY_MD5: CURLoption = new CURLoption(10162)
    val CURLOPT_OPENSOCKETFUNCTION: CURLoption = new CURLoption(20163)
    val CURLOPT_OPENSOCKETDATA: CURLoption = new CURLoption(10164)
    val CURLOPT_COPYPOSTFIELDS: CURLoption = new CURLoption(10165)
    val CURLOPT_PROXY_TRANSFER_MODE: CURLoption = new CURLoption(166)
    val CURLOPT_SEEKFUNCTION: CURLoption = new CURLoption(20167)
    val CURLOPT_SEEKDATA: CURLoption = new CURLoption(10168)
    val CURLOPT_CRLFILE: CURLoption = new CURLoption(10169)
    val CURLOPT_ISSUERCERT: CURLoption = new CURLoption(10170)
    val CURLOPT_ADDRESS_SCOPE: CURLoption = new CURLoption(171)
    val CURLOPT_CERTINFO: CURLoption = new CURLoption(172)
    val CURLOPT_USERNAME: CURLoption = new CURLoption(10173)
    val CURLOPT_PASSWORD: CURLoption = new CURLoption(10174)
    val CURLOPT_PROXYUSERNAME: CURLoption = new CURLoption(10175)
    val CURLOPT_PROXYPASSWORD: CURLoption = new CURLoption(10176)
    val CURLOPT_NOPROXY: CURLoption = new CURLoption(10177)
    val CURLOPT_TFTP_BLKSIZE: CURLoption = new CURLoption(178)
    val CURLOPT_SOCKS5_GSSAPI_SERVICE: CURLoption = new CURLoption(10179)
    val CURLOPT_SOCKS5_GSSAPI_NEC: CURLoption = new CURLoption(180)
    val CURLOPT_PROTOCOLS: CURLoption = new CURLoption(181)
    val CURLOPT_REDIR_PROTOCOLS: CURLoption = new CURLoption(182)
    val CURLOPT_SSH_KNOWNHOSTS: CURLoption = new CURLoption(10183)
    val CURLOPT_SSH_KEYFUNCTION: CURLoption = new CURLoption(20184)
    val CURLOPT_SSH_KEYDATA: CURLoption = new CURLoption(10185)
    val CURLOPT_MAIL_FROM: CURLoption = new CURLoption(10186)
    val CURLOPT_MAIL_RCPT: CURLoption = new CURLoption(10187)
    val CURLOPT_FTP_USE_PRET: CURLoption = new CURLoption(188)
    val CURLOPT_RTSP_REQUEST: CURLoption = new CURLoption(189)
    val CURLOPT_RTSP_SESSION_ID: CURLoption = new CURLoption(10190)
    val CURLOPT_RTSP_STREAM_URI: CURLoption = new CURLoption(10191)
    val CURLOPT_RTSP_TRANSPORT: CURLoption = new CURLoption(10192)
    val CURLOPT_RTSP_CLIENT_CSEQ: CURLoption = new CURLoption(193)
    val CURLOPT_RTSP_SERVER_CSEQ: CURLoption = new CURLoption(194)
    val CURLOPT_INTERLEAVEDATA: CURLoption = new CURLoption(10195)
    val CURLOPT_INTERLEAVEFUNCTION: CURLoption = new CURLoption(20196)
    val CURLOPT_WILDCARDMATCH: CURLoption = new CURLoption(197)
    val CURLOPT_CHUNK_BGN_FUNCTION: CURLoption = new CURLoption(20198)
    val CURLOPT_CHUNK_END_FUNCTION: CURLoption = new CURLoption(20199)
    val CURLOPT_FNMATCH_FUNCTION: CURLoption = new CURLoption(20200)
    val CURLOPT_CHUNK_DATA: CURLoption = new CURLoption(10201)
    val CURLOPT_FNMATCH_DATA: CURLoption = new CURLoption(10202)
    val CURLOPT_RESOLVE: CURLoption = new CURLoption(10203)
    val CURLOPT_TLSAUTH_USERNAME: CURLoption = new CURLoption(10204)
    val CURLOPT_TLSAUTH_PASSWORD: CURLoption = new CURLoption(10205)
    val CURLOPT_TLSAUTH_TYPE: CURLoption = new CURLoption(10206)
    val CURLOPT_TRANSFER_ENCODING: CURLoption = new CURLoption(207)
    val CURLOPT_CLOSESOCKETFUNCTION: CURLoption = new CURLoption(20208)
    val CURLOPT_CLOSESOCKETDATA: CURLoption = new CURLoption(10209)
    val CURLOPT_GSSAPI_DELEGATION: CURLoption = new CURLoption(210)
    val CURLOPT_DNS_SERVERS: CURLoption = new CURLoption(10211)
    val CURLOPT_ACCEPTTIMEOUT_MS: CURLoption = new CURLoption(212)
    val CURLOPT_TCP_KEEPALIVE: CURLoption = new CURLoption(213)
    val CURLOPT_TCP_KEEPIDLE: CURLoption = new CURLoption(214)
    val CURLOPT_TCP_KEEPINTVL: CURLoption = new CURLoption(215)
    val CURLOPT_SSL_OPTIONS: CURLoption = new CURLoption(216)
    val CURLOPT_MAIL_AUTH: CURLoption = new CURLoption(10217)
    val CURLOPT_SASL_IR: CURLoption = new CURLoption(218)
    val CURLOPT_XFERINFOFUNCTION: CURLoption = new CURLoption(20219)
    val CURLOPT_XOAUTH2_BEARER: CURLoption = new CURLoption(10220)
    val CURLOPT_DNS_INTERFACE: CURLoption = new CURLoption(10221)
    val CURLOPT_DNS_LOCAL_IP4: CURLoption = new CURLoption(10222)
    val CURLOPT_DNS_LOCAL_IP6: CURLoption = new CURLoption(10223)
    val CURLOPT_LOGIN_OPTIONS: CURLoption = new CURLoption(10224)
    val CURLOPT_SSL_ENABLE_NPN: CURLoption = new CURLoption(225)
    val CURLOPT_SSL_ENABLE_ALPN: CURLoption = new CURLoption(226)
    val CURLOPT_EXPECT_100_TIMEOUT_MS: CURLoption = new CURLoption(227)
    val CURLOPT_PROXYHEADER: CURLoption = new CURLoption(10228)
    val CURLOPT_HEADEROPT: CURLoption = new CURLoption(229)
    val CURLOPT_PINNEDPUBLICKEY: CURLoption = new CURLoption(10230)
    val CURLOPT_UNIX_SOCKET_PATH: CURLoption = new CURLoption(10231)
    val CURLOPT_SSL_VERIFYSTATUS: CURLoption = new CURLoption(232)
    val CURLOPT_SSL_FALSESTART: CURLoption = new CURLoption(233)
    val CURLOPT_PATH_AS_IS: CURLoption = new CURLoption(234)
    val CURLOPT_PROXY_SERVICE_NAME: CURLoption = new CURLoption(10235)
    val CURLOPT_SERVICE_NAME: CURLoption = new CURLoption(10236)
    val CURLOPT_PIPEWAIT: CURLoption = new CURLoption(237)
    val CURLOPT_DEFAULT_PROTOCOL: CURLoption = new CURLoption(10238)
    val CURLOPT_STREAM_WEIGHT: CURLoption = new CURLoption(239)
    val CURLOPT_STREAM_DEPENDS: CURLoption = new CURLoption(10240)
    val CURLOPT_STREAM_DEPENDS_E: CURLoption = new CURLoption(10241)
    val CURLOPT_TFTP_NO_OPTIONS: CURLoption = new CURLoption(242)
    val CURLOPT_CONNECT_TO: CURLoption = new CURLoption(10243)
    val CURLOPT_TCP_FASTOPEN: CURLoption = new CURLoption(244)
    val CURLOPT_KEEP_SENDING_ON_ERROR: CURLoption = new CURLoption(245)
    val CURLOPT_PROXY_CAINFO: CURLoption = new CURLoption(10246)
    val CURLOPT_PROXY_CAPATH: CURLoption = new CURLoption(10247)
    val CURLOPT_PROXY_SSL_VERIFYPEER: CURLoption = new CURLoption(248)
    val CURLOPT_PROXY_SSL_VERIFYHOST: CURLoption = new CURLoption(249)
    val CURLOPT_PROXY_SSLVERSION: CURLoption = new CURLoption(250)
    val CURLOPT_PROXY_TLSAUTH_USERNAME: CURLoption = new CURLoption(10251)
    val CURLOPT_PROXY_TLSAUTH_PASSWORD: CURLoption = new CURLoption(10252)
    val CURLOPT_PROXY_TLSAUTH_TYPE: CURLoption = new CURLoption(10253)
    val CURLOPT_PROXY_SSLCERT: CURLoption = new CURLoption(10254)
    val CURLOPT_PROXY_SSLCERTTYPE: CURLoption = new CURLoption(10255)
    val CURLOPT_PROXY_SSLKEY: CURLoption = new CURLoption(10256)
    val CURLOPT_PROXY_SSLKEYTYPE: CURLoption = new CURLoption(10257)
    val CURLOPT_PROXY_KEYPASSWD: CURLoption = new CURLoption(10258)
    val CURLOPT_PROXY_SSL_CIPHER_LIST: CURLoption = new CURLoption(10259)
    val CURLOPT_PROXY_CRLFILE: CURLoption = new CURLoption(10260)
    val CURLOPT_PROXY_SSL_OPTIONS: CURLoption = new CURLoption(261)
    val CURLOPT_PRE_PROXY: CURLoption = new CURLoption(10262)
    val CURLOPT_PROXY_PINNEDPUBLICKEY: CURLoption = new CURLoption(10263)
    val CURLOPT_ABSTRACT_UNIX_SOCKET: CURLoption = new CURLoption(10264)
    val CURLOPT_SUPPRESS_CONNECT_HEADERS: CURLoption = new CURLoption(265)
    val CURLOPT_REQUEST_TARGET: CURLoption = new CURLoption(10266)
    val CURLOPT_SOCKS5_AUTH: CURLoption = new CURLoption(267)
    val CURLOPT_SSH_COMPRESSION: CURLoption = new CURLoption(268)
    val CURLOPT_MIMEPOST: CURLoption = new CURLoption(10269)
    val CURLOPT_LASTENTRY: CURLoption = new CURLoption(10270)
  }

  class CURLcode(val value: CInt) extends AnyVal
  object CURLcode {
    val CURLE_OK: CURLcode = new CURLcode(0)
    val CURLE_UNSUPPORTED_PROTOCOL: CURLcode = new CURLcode(1)
    val CURLE_FAILED_INIT: CURLcode = new CURLcode(2)
    val CURLE_URL_MALFORMAT: CURLcode = new CURLcode(3)
    val CURLE_NOT_BUILT_IN: CURLcode = new CURLcode(4)
    val CURLE_COULDNT_RESOLVE_PROXY: CURLcode = new CURLcode(5)
    val CURLE_COULDNT_RESOLVE_HOST: CURLcode = new CURLcode(6)
    val CURLE_COULDNT_CONNECT: CURLcode = new CURLcode(7)
    val CURLE_WEIRD_SERVER_REPLY: CURLcode = new CURLcode(8)
    val CURLE_REMOTE_ACCESS_DENIED: CURLcode = new CURLcode(9)
    val CURLE_FTP_ACCEPT_FAILED: CURLcode = new CURLcode(10)
    val CURLE_FTP_WEIRD_PASS_REPLY: CURLcode = new CURLcode(11)
    val CURLE_FTP_ACCEPT_TIMEOUT: CURLcode = new CURLcode(12)
    val CURLE_FTP_WEIRD_PASV_REPLY: CURLcode = new CURLcode(13)
    val CURLE_FTP_WEIRD_227_FORMAT: CURLcode = new CURLcode(14)
    val CURLE_FTP_CANT_GET_HOST: CURLcode = new CURLcode(15)
    val CURLE_HTTP2: CURLcode = new CURLcode(16)
    val CURLE_FTP_COULDNT_SET_TYPE: CURLcode = new CURLcode(17)
    val CURLE_PARTIAL_FILE: CURLcode = new CURLcode(18)
    val CURLE_FTP_COULDNT_RETR_FILE: CURLcode = new CURLcode(19)
    val CURLE_OBSOLETE20: CURLcode = new CURLcode(20)
    val CURLE_QUOTE_ERROR: CURLcode = new CURLcode(21)
    val CURLE_HTTP_RETURNED_ERROR: CURLcode = new CURLcode(22)
    val CURLE_WRITE_ERROR: CURLcode = new CURLcode(23)
    val CURLE_OBSOLETE24: CURLcode = new CURLcode(24)
    val CURLE_UPLOAD_FAILED: CURLcode = new CURLcode(25)
    val CURLE_READ_ERROR: CURLcode = new CURLcode(26)
    val CURLE_OUT_OF_MEMORY: CURLcode = new CURLcode(27)
    val CURLE_OPERATION_TIMEDOUT: CURLcode = new CURLcode(28)
    val CURLE_OBSOLETE29: CURLcode = new CURLcode(29)
    val CURLE_FTP_PORT_FAILED: CURLcode = new CURLcode(30)
    val CURLE_FTP_COULDNT_USE_REST: CURLcode = new CURLcode(31)
    val CURLE_OBSOLETE32: CURLcode = new CURLcode(32)
    val CURLE_RANGE_ERROR: CURLcode = new CURLcode(33)
    val CURLE_HTTP_POST_ERROR: CURLcode = new CURLcode(34)
    val CURLE_SSL_CONNECT_ERROR: CURLcode = new CURLcode(35)
    val CURLE_BAD_DOWNLOAD_RESUME: CURLcode = new CURLcode(36)
    val CURLE_FILE_COULDNT_READ_FILE: CURLcode = new CURLcode(37)
    val CURLE_LDAP_CANNOT_BIND: CURLcode = new CURLcode(38)
    val CURLE_LDAP_SEARCH_FAILED: CURLcode = new CURLcode(39)
    val CURLE_OBSOLETE40: CURLcode = new CURLcode(40)
    val CURLE_FUNCTION_NOT_FOUND: CURLcode = new CURLcode(41)
    val CURLE_ABORTED_BY_CALLBACK: CURLcode = new CURLcode(42)
    val CURLE_BAD_FUNCTION_ARGUMENT: CURLcode = new CURLcode(43)
    val CURLE_OBSOLETE44: CURLcode = new CURLcode(44)
    val CURLE_INTERFACE_FAILED: CURLcode = new CURLcode(45)
    val CURLE_OBSOLETE46: CURLcode = new CURLcode(46)
    val CURLE_TOO_MANY_REDIRECTS: CURLcode = new CURLcode(47)
    val CURLE_UNKNOWN_OPTION: CURLcode = new CURLcode(48)
    val CURLE_TELNET_OPTION_SYNTAX: CURLcode = new CURLcode(49)
    val CURLE_OBSOLETE50: CURLcode = new CURLcode(50)
    val CURLE_PEER_FAILED_VERIFICATION: CURLcode = new CURLcode(51)
    val CURLE_GOT_NOTHING: CURLcode = new CURLcode(52)
    val CURLE_SSL_ENGINE_NOTFOUND: CURLcode = new CURLcode(53)
    val CURLE_SSL_ENGINE_SETFAILED: CURLcode = new CURLcode(54)
    val CURLE_SEND_ERROR: CURLcode = new CURLcode(55)
    val CURLE_RECV_ERROR: CURLcode = new CURLcode(56)
    val CURLE_OBSOLETE57: CURLcode = new CURLcode(57)
    val CURLE_SSL_CERTPROBLEM: CURLcode = new CURLcode(58)
    val CURLE_SSL_CIPHER: CURLcode = new CURLcode(59)
    val CURLE_SSL_CACERT: CURLcode = new CURLcode(60)
    val CURLE_BAD_CONTENT_ENCODING: CURLcode = new CURLcode(61)
    val CURLE_LDAP_INVALID_URL: CURLcode = new CURLcode(62)
    val CURLE_FILESIZE_EXCEEDED: CURLcode = new CURLcode(63)
    val CURLE_USE_SSL_FAILED: CURLcode = new CURLcode(64)
    val CURLE_SEND_FAIL_REWIND: CURLcode = new CURLcode(65)
    val CURLE_SSL_ENGINE_INITFAILED: CURLcode = new CURLcode(66)
    val CURLE_LOGIN_DENIED: CURLcode = new CURLcode(67)
    val CURLE_TFTP_NOTFOUND: CURLcode = new CURLcode(68)
    val CURLE_TFTP_PERM: CURLcode = new CURLcode(69)
    val CURLE_REMOTE_DISK_FULL: CURLcode = new CURLcode(70)
    val CURLE_TFTP_ILLEGAL: CURLcode = new CURLcode(71)
    val CURLE_TFTP_UNKNOWNID: CURLcode = new CURLcode(72)
    val CURLE_REMOTE_FILE_EXISTS: CURLcode = new CURLcode(73)
    val CURLE_TFTP_NOSUCHUSER: CURLcode = new CURLcode(74)
    val CURLE_CONV_FAILED: CURLcode = new CURLcode(75)
    val CURLE_CONV_REQD: CURLcode = new CURLcode(76)
    val CURLE_SSL_CACERT_BADFILE: CURLcode = new CURLcode(77)
    val CURLE_REMOTE_FILE_NOT_FOUND: CURLcode = new CURLcode(78)
    val CURLE_SSH: CURLcode = new CURLcode(79)
    val CURLE_SSL_SHUTDOWN_FAILED: CURLcode = new CURLcode(80)
    val CURLE_AGAIN: CURLcode = new CURLcode(81)
    val CURLE_SSL_CRL_BADFILE: CURLcode = new CURLcode(82)
    val CURLE_SSL_ISSUER_ERROR: CURLcode = new CURLcode(83)
    val CURLE_FTP_PRET_FAILED: CURLcode = new CURLcode(84)
    val CURLE_RTSP_CSEQ_ERROR: CURLcode = new CURLcode(85)
    val CURLE_RTSP_SESSION_ERROR: CURLcode = new CURLcode(86)
    val CURLE_FTP_BAD_FILE_LIST: CURLcode = new CURLcode(87)
    val CURLE_CHUNK_FAILED: CURLcode = new CURLcode(88)
    val CURLE_NO_CONNECTION_AVAILABLE: CURLcode = new CURLcode(89)
    val CURLE_SSL_PINNEDPUBKEYNOTMATCH: CURLcode = new CURLcode(90)
    val CURLE_SSL_INVALIDCERTSTATUS: CURLcode = new CURLcode(91)
    val CURLE_HTTP2_STREAM: CURLcode = new CURLcode(92)
    val CURL_LAST: CURLcode = new CURLcode(93)
  }
  // End of enums

  object CURLGlobals {
    val CURL_GLOBAL_DEFAULT: CInt = ((1 << 0) | (1 << 1))
  }

  @name("curl_global_init")
  def global_init(flags: CInt): CURLcode = extern

  @name("curl_global_cleanup")
  def global_cleanup(): Unit = extern

  @name("curl_easy_init")
  def easy_init(): CURL = extern

  @name("curl_easy_cleanup")
  def easy_cleanup(curl: CURL): Unit = extern

  @name("curl_easy_setopt")
  def easy_setopt(curl: CURL, option: CURLoption, args: CVararg*): CURLcode = extern

  @name("curl_easy_getinfo")
  def easy_getinfo(curl: CURL, info: CURLINFO, args: CVararg*): CURLcode = extern

  @name("curl_easy_perform")
  def easy_perform(curl: CURL): CURLcode = extern

  @name("curl_easy_strerror")
  def easy_strerror(code: CURLcode): CString = extern
}