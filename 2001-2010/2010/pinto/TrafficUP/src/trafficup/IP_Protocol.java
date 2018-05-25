/*
 * To change this template)", choose Tools | Templates
 * and open the template in the editor.
 */

package trafficup;

/**
 *
 * @author Ricardo
 */
public class IP_Protocol {
    
    private static String[] protocol_list = new String[]{
    "HOPOPT (0)",
    "ICMP (1)",
    "IGMP (2)",
    "GGP (3)",
    "IPv4 (4)",
    "ST (5)",
    "TCP (6)",
    "CBT (7)",
    "EGP (8)",
    "IGP (9)",
    "BBN-RCC-MON (10)",
    "NVP-II (11)",
    "PUP (12)",
    "ARGUS (13)",
    "EMCON (14)",
    "XNET (15)",
    "CHAOS (16)",
    "UDP (17)",
    "MUX (18)",
    "DCN-MEAS (18)",
    "HMP (20)",
    "PRM (21)",
    "XNS-IDP (22)",
    "TRUNK-1 (23)",
    "TRUNK-2 (24)",
    "LEAF-1 (25)",
    "LEAF-2 (26)",
    "RDP (27)",
    "IRTP (28)",
    "ISO-TP4 (29)",
    "NETBLT (30)",
    "MFE-NSP (31)",
    "MERIT-INP (32)",
    "DCCP (33)",
    "3PC (34)",
    "IDPR (35)",
    "XTP (36)",
    "DDP (37)",
    "IDPR-CMTP (38)",
    "TP++ (39)",
    "IL (40)",
    "IPv6 (41)",
    "SDRP (42)",
    "IPv6-Route (43)",
    "IPv6-Frag (44)",
    "IDRP (45)",
    "RSVP (46)",
    "GRE (47)",
    "DSR (48)",
    "BNA (49)",
    "ESP (50)",
    "AH (51)",
    "I-NLSP (52)",
    "SWIPE (53)",
    "NARP (54)",
    "MOBILE (55)",
    "TLSP (56)",
    "SKIP (57)",
    "IPv6-ICMP (58)",
    "IPv6-NoNxt (59)",
    "IPv6-Opts (60)",
    "UNKNOWN (61)",
    "CFTP (62)",
    "UNKNOWN (63)",
    "SAT-EXPAK (64)",
    "KRYPTOLAN (65)",
    "RVD (66)",
    "IPPC (67)",
    "UNKNOWN (68)",
    "SAT-MON (69)",
    "VISA (70)",
    "IPCV (71)",
    "CPNX (72)",
    "CPHB (73)",
    "WSN (74)",
    "PVP (75)",
    "BR-SAT-MON (76)",
    "SUN-ND (77)",
    "WB-MON (78)",
    "WB-EXPAK (79)",
    "ISO-IP (80)",
    "VMTP (81)",
    "SECURE-VMTP (82)",
    "VINES (83)",
    "TTP (84)",
    "NSFNET-IGP (85)",
    "DGP (86)",
    "TCF (87)",
    "EIGRP (88)",
    "OSPFIGP (89)",
    "Sprite-RPC (90)",
    "LARP (91)",
    "MTP (92)",
    "AX.25 (93)",
    "IPIP (94)",
    "MICP (95)",
    "SCC-SP (96)",
    "ETHERIP (97)",
    "ENCAP (98)",
    "UNKNOWN (99)",
    "GMTP (100)",
    "IFMP (101)",
    "PNNI (102)",
    "PIM (103)",
    "ARIS (104)",
    "SCPS (105)",
    "QNX (106)",
    "A/N (107)",
    "IPComp (108)",
    "SNP (109)",
    "Compaq-Peer (110)",
    "IPX-in-IP (111)",
    "VRRP (112)",
    "PGM (113)",
    "UNKNOWN (114)",
    "L2TP (115)",
    "DDX (116)",
    "IATP (117)",
    "STP (118)",
    "SRP (119)",
    "UTI (120)",
    "SMP (121)",
    "SM (122)",
    "PTP (123)",
    "ISIS over IPv4 (124)",
    "FIRE (125)",
    "CRTP (126)",
    "CRUDP (127)",
    "SSCOPMCE (128)",
    "IPLT (129)",
    "SPS (130)",
    "PIPE (131)",
    "SCTP (132)",
    "FC (133)",
    "RSVP-E2E-IGNORE (134)",
    "Mobility Header (135)",
    "UDPLite (136)",
    "MPLS-in-IP (137)",
    "manet (138)",
    "HIP (139)",
    "Shim6 (140)",
    "WESP (141)",
    "ROHC (142)",

    //143 to 252 are UNASSIGNED
    "UNASSINGED (143)",
    "UNASSINGED (144)",
    "UNASSINGED (145)",
    "UNASSINGED (146)",
    "UNASSINGED (147)",
    "UNASSINGED (148)",
    "UNASSINGED (149)",
    "UNASSINGED (150)",
    "UNASSINGED (151)",
    "UNASSINGED (152)",
    "UNASSINGED (153)",
    "UNASSINGED (154)",
    "UNASSINGED (155)",
    "UNASSINGED (156)",
    "UNASSINGED (157)",
    "UNASSINGED (158)",
    "UNASSINGED (159)",
    "UNASSINGED (160)",
    "UNASSINGED (161)",
    "UNASSINGED (162)",
    "UNASSINGED (163)",
    "UNASSINGED (164)",
    "UNASSINGED (165)",
    "UNASSINGED (166)",
    "UNASSINGED (167)",
    "UNASSINGED (168)",
    "UNASSINGED (169)",
    "UNASSINGED (170)",
    "UNASSINGED (171)",
    "UNASSINGED (172)",
    "UNASSINGED (173)",
    "UNASSINGED (174)",
    "UNASSINGED (175)",
    "UNASSINGED (176)",
    "UNASSINGED (177)",
    "UNASSINGED (178)",
    "UNASSINGED (179)",
    "UNASSINGED (180)",
    "UNASSINGED (181)",
    "UNASSINGED (182)",
    "UNASSINGED (183)",
    "UNASSINGED (184)",
    "UNASSINGED (185)",
    "UNASSINGED (186)",
    "UNASSINGED (187)",
    "UNASSINGED (188)",
    "UNASSINGED (189)",
    "UNASSINGED (190)",
    "UNASSINGED (191)",
    "UNASSINGED (192)",
    "UNASSINGED (193)",
    "UNASSINGED (194)",
    "UNASSINGED (195)",
    "UNASSINGED (196)",
    "UNASSINGED (197)",
    "UNASSINGED (198)",
    "UNASSINGED (199)",
    "UNASSINGED (200)",
    "UNASSINGED (201)",
    "UNASSINGED (202)",
    "UNASSINGED (203)",
    "UNASSINGED (204)",
    "UNASSINGED (205)",
    "UNASSINGED (206)",
    "UNASSINGED (207)",
    "UNASSINGED (208)",
    "UNASSINGED (209)",
    "UNASSINGED (210)",
    "UNASSINGED (211)",
    "UNASSINGED (212)",
    "UNASSINGED (213)",
    "UNASSINGED (214)",
    "UNASSINGED (215)",
    "UNASSINGED (216)",
    "UNASSINGED (217)",
    "UNASSINGED (218)",
    "UNASSINGED (219)",
    "UNASSINGED (220)",
    "UNASSINGED (221)",
    "UNASSINGED (222)",
    "UNASSINGED (223)",
    "UNASSINGED (224)",
    "UNASSINGED (225)",
    "UNASSINGED (226)",
    "UNASSINGED (227)",
    "UNASSINGED (228)",
    "UNASSINGED (229)",
    "UNASSINGED (230)",
    "UNASSINGED (231)",
    "UNASSINGED (232)",
    "UNASSINGED (233)",
    "UNASSINGED (234)",
    "UNASSINGED (235)",
    "UNASSINGED (236)",
    "UNASSINGED (237)",
    "UNASSINGED (238)",
    "UNASSINGED (239)",
    "UNASSINGED (240)",
    "UNASSINGED (241)",
    "UNASSINGED (242)",
    "UNASSINGED (243)",
    "UNASSINGED (244)",
    "UNASSINGED (245)",
    "UNASSINGED (246)",
    "UNASSINGED (247)",
    "UNASSINGED (248)",
    "UNASSINGED (249)",
    "UNASSINGED (250)",
    "UNASSINGED (251)",
    "UNASSINGED (252)",
    "UNASSINGED (253)",
    "UNASSINGED (254)",
    "Reserved (255)"};

    private IP_Protocol(){}

    public static String getIP_ProtocolName( int prot ){
        if( prot < 0 || prot > 255 ) return "INVALID";
        return protocol_list[prot];
    }

}