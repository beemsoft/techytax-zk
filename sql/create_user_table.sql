CREATE TABLE `user` (
  `id` bigint(20) NOT NULL auto_increment,
  `username` varchar(50) NOT NULL,
  `role` VARCHAR(20) NOT NULL,  
  `password` varchar(50) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `latestOnlineTime` datetime NULL default '2006-07-01 00:00:00',
  `blocked` tinyint(1) default '0',  
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `user` VALUES (0,'guest','guest','guest','Guest',null);
