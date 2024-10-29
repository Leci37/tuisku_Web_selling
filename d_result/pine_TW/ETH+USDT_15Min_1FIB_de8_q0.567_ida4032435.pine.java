//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: ETHUSDT_15Min_1FIB_a4032435 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1FIB_a4032435", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_a4032435(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_5 <= 1642.61 )
		if( upper_6 <= 1499.02 )
			if( upper_6 <= 1170.6 )
				if( lower_1 <= 1052.77 )
					if( basis_minus <= 92.4696 )
						if( upper_6 <= 1129.8 )
							if( lower_1 <= 1037.81 )
								if( upper_6 <= 1115.31 )
									ret := 0.913043 // buy
								if( upper_6 > 1115.31 )
									ret := 0.416667
							if( lower_1 > 1037.81 )
								if( basis_max <= -30.1346 )
									ret := -0.140271
								if( basis_max > -30.1346 )
									ret := 0.472727
						if( upper_6 > 1129.8 )
							if( upper_1 <= 1083.61 )
								if( lower_1 <= 1039.55 )
									ret := 0.200000
								if( lower_1 > 1039.55 )
									ret := -0.771084 // sell
							if( upper_1 > 1083.61 )
								if( lower_6 <= 985.163 )
									ret := -0.857143 // sell
								if( lower_6 > 985.163 )
									ret := 0.115385
					if( basis_minus > 92.4696 )
						if( basis_minus <= 165.534 )
							if( upper_6 <= 1167.55 )
								if( lower_1 <= 960.793 )
									ret := 1.000000 // buy
								if( lower_1 > 960.793 )
									ret := 0.647727
							if( upper_6 > 1167.55 )
								if( lower_3 <= 1016.03 )
									ret := -1.000000 // sell
								if( lower_3 > 1016.03 )
									ret := 0.700000 // buy
						if( basis_minus > 165.534 )
							ret := -0.571429
				if( lower_1 > 1052.77 )
					if( upper_5 <= 1153.99 )
						if( lower_6 <= 1017.75 )
							if( upper_2 <= 1116.85 )
								if( lower_2 <= 1043.04 )
									ret := 0.500000
								if( lower_2 > 1043.04 )
									ret := 0.938272 // buy
							if( upper_2 > 1116.85 )
								ret := 0.250000
						if( lower_6 > 1017.75 )
							if( lower_6 <= 1023.54 )
								if( upper_3 <= 1084.55 )
									ret := 0.333333
								if( upper_3 > 1084.55 )
									ret := -0.785714 // sell
							if( lower_6 > 1023.54 )
								if( basis_max <= -30.4557 )
									ret := 0.527559
								if( basis_max > -30.4557 )
									ret := 1.000000 // buy
					if( upper_5 > 1153.99 )
						if( lower_4 <= 1084.7 )
							if( upper_2 <= 1136.58 )
								ret := -1.000000 // sell
							if( upper_2 > 1136.58 )
								ret := -0.250000
						if( lower_4 > 1084.7 )
							ret := 0.000000
			if( upper_6 > 1170.6 )
				if( upper_5 <= 1449.74 )
					if( lower_5 <= 867.632 )
						if( lower_6 <= 824.855 )
							ret := 1.000000 // buy
						if( lower_6 > 824.855 )
							ret := 0.750000 // buy
					if( lower_5 > 867.632 )
						if( lower_6 <= 832.203 )
							if( lower_2 <= 949.899 )
								if( lower_6 <= 827.698 )
									ret := -0.461538
								if( lower_6 > 827.698 )
									ret := -0.980392 // sell
							if( lower_2 > 949.899 )
								if( upper_3 <= 1133.23 )
									ret := 0.583333
								if( upper_3 > 1133.23 )
									ret := -0.454545
						if( lower_6 > 832.203 )
							if( upper_6 <= 1441.11 )
								if( basis_minus <= 200.721 )
									ret := 0.038695
								if( basis_minus > 200.721 )
									ret := -0.804348 // sell
							if( upper_6 > 1441.11 )
								if( basis_minus <= 116.355 )
									ret := 0.604478
								if( basis_minus > 116.355 )
									ret := 0.101449
				if( upper_5 > 1449.74 )
					if( upper_2 <= 1423.16 )
						if( upper_3 <= 1417.5 )
							if( basis <= 1351.41 )
								ret := -0.800000 // sell
							if( basis > 1351.41 )
								ret := 1.000000 // buy
						if( upper_3 > 1417.5 )
							if( upper_5 <= 1462.41 )
								if( lower_6 <= 1277.25 )
									ret := -0.727273 // sell
								if( lower_6 > 1277.25 )
									ret := -1.000000 // sell
							if( upper_5 > 1462.41 )
								ret := -1.000000 // sell
					if( upper_2 > 1423.16 )
						if( basis_minus <= 44.2314 )
							if( basis_minus <= 42.077 )
								ret := -0.500000
							if( basis_minus > 42.077 )
								if( upper_1 <= 1453.31 )
									ret := -1.000000 // sell
								if( upper_1 > 1453.31 )
									ret := -0.750000 // sell
						if( basis_minus > 44.2314 )
							if( upper_5 <= 1462.6 )
								if( basis <= 1394.27 )
									ret := 0.695652
								if( basis > 1394.27 )
									ret := 0.000000
							if( upper_5 > 1462.6 )
								if( basis_minus <= 44.6284 )
									ret := 0.461538
								if( basis_minus > 44.6284 )
									ret := -0.246032
		if( upper_6 > 1499.02 )
			if( basis <= 1488.09 )
				if( lower_5 <= 1332.66 )
					if( basis_max <= -170.661 )
						if( upper_6 <= 1634.38 )
							if( basis <= 1265.7 )
								if( upper_5 <= 1456.71 )
									ret := 1.000000 // buy
								if( upper_5 > 1456.71 )
									ret := -0.666667
							if( basis > 1265.7 )
								if( upper_6 <= 1578.02 )
									ret := 0.355769
								if( upper_6 > 1578.02 )
									ret := 0.864078 // buy
						if( upper_6 > 1634.38 )
							if( lower_6 <= 899.365 )
								if( lower_4 <= 1051.47 )
									ret := 0.967213 // buy
								if( lower_4 > 1051.47 )
									ret := 0.166667
							if( lower_6 > 899.365 )
								if( basis <= 1285.57 )
									ret := -0.823529 // sell
								if( basis > 1285.57 )
									ret := 0.104208
					if( basis_max > -170.661 )
						if( lower_2 <= 1388.78 )
							if( upper_1 <= 1392.4 )
								if( lower_5 <= 1233.82 )
									ret := 0.900000 // buy
								if( lower_5 > 1233.82 )
									ret := 0.000000
							if( upper_1 > 1392.4 )
								if( lower_1 <= 1361.7 )
									ret := -0.602941
								if( lower_1 > 1361.7 )
									ret := -0.213333
						if( lower_2 > 1388.78 )
							if( lower_5 <= 1327.83 )
								ret := 0.285714
							if( lower_5 > 1327.83 )
								if( lower_4 <= 1353.88 )
									ret := 1.000000 // buy
								if( lower_4 > 1353.88 )
									ret := 0.500000
				if( lower_5 > 1332.66 )
					if( upper_1 <= 1474.4 )
						if( lower_1 <= 1437.03 )
							if( lower_6 <= 1321.43 )
								if( lower_6 <= 1316.08 )
									ret := 0.190476
								if( lower_6 > 1316.08 )
									ret := -0.666667
							if( lower_6 > 1321.43 )
								if( lower_1 <= 1416.39 )
									ret := 0.776119 // buy
								if( lower_1 > 1416.39 )
									ret := 0.307692
						if( lower_1 > 1437.03 )
							if( lower_1 <= 1439.11 )
								if( lower_6 <= 1382.36 )
									ret := 0.000000
								if( lower_6 > 1382.36 )
									ret := -0.807692 // sell
							if( lower_1 > 1439.11 )
								ret := 1.000000 // buy
					if( upper_1 > 1474.4 )
						if( basis <= 1472.08 )
							if( lower_2 <= 1391.55 )
								ret := 0.142857
							if( lower_2 > 1391.55 )
								if( basis <= 1466.51 )
									ret := 0.843137 // buy
								if( basis > 1466.51 )
									ret := 1.000000 // buy
						if( basis > 1472.08 )
							if( upper_1 <= 1509.59 )
								if( upper_5 <= 1528.01 )
									ret := 0.622222
								if( upper_5 > 1528.01 )
									ret := -0.313725
							if( upper_1 > 1509.59 )
								if( upper_4 <= 1589.71 )
									ret := 0.815217 // buy
								if( upper_4 > 1589.71 )
									ret := 0.300000
			if( basis > 1488.09 )
				if( basis <= 1501.18 )
					if( lower_1 <= 1448.39 )
						if( basis_minus <= 185.548 )
							if( basis_minus <= 184.49 )
								if( basis_minus <= 183.539 )
									ret := 0.750000 // buy
								if( basis_minus > 183.539 )
									ret := 1.000000 // buy
							if( basis_minus > 184.49 )
								ret := 0.200000
						if( basis_minus > 185.548 )
							ret := -1.000000 // sell
					if( lower_1 > 1448.39 )
						if( upper_3 <= 1526.91 )
							ret := -1.000000 // sell
						if( upper_3 > 1526.91 )
							if( basis_minus <= 138.026 )
								if( lower_1 <= 1480.62 )
									ret := 0.200000
								if( lower_1 > 1480.62 )
									ret := -0.454545
							if( basis_minus > 138.026 )
								if( upper_2 <= 1566.43 )
									ret := -0.711111 // sell
								if( upper_2 > 1566.43 )
									ret := -0.071429
				if( basis > 1501.18 )
					if( upper_6 <= 1656.49 )
						if( upper_4 <= 1607.71 )
							if( basis_minus <= 38.1819 )
								if( lower_5 <= 1540.88 )
									ret := -0.149466
								if( lower_5 > 1540.88 )
									ret := 0.114713
							if( basis_minus > 38.1819 )
								if( basis <= 1570.08 )
									ret := 0.227045
								if( basis > 1570.08 )
									ret := 0.541850
						if( upper_4 > 1607.71 )
							if( basis_minus <= 110.387 )
								if( basis_minus <= 96.8838 )
									ret := 0.030745
								if( basis_minus > 96.8838 )
									ret := -0.600000
							if( basis_minus > 110.387 )
								if( lower_5 <= 1459.13 )
									ret := 0.750000 // buy
								if( lower_5 > 1459.13 )
									ret := 0.964286 // buy
					if( upper_6 > 1656.49 )
						if( basis_minus <= 150.969 )
							if( lower_5 <= 1489.54 )
								if( lower_4 <= 1416.52 )
									ret := -1.000000 // sell
								if( lower_4 > 1416.52 )
									ret := 0.802575 // buy
							if( lower_5 > 1489.54 )
								if( lower_3 <= 1515.13 )
									ret := -1.000000 // sell
								if( lower_3 > 1515.13 )
									ret := 0.387283
						if( basis_minus > 150.969 )
							if( upper_5 <= 1631.41 )
								if( basis_minus <= 152.683 )
									ret := -0.816667 // sell
								if( basis_minus > 152.683 )
									ret := 0.240000
							if( upper_5 > 1631.41 )
								if( upper_2 <= 1574.31 )
									ret := 0.542857
								if( upper_2 > 1574.31 )
									ret := -0.750000 // sell
	if( upper_5 > 1642.61 )
		if( upper_2 <= 1638.51 )
			if( upper_3 <= 1644.72 )
				if( basis_minus <= 226.079 )
					if( upper_2 <= 1574.6 )
						if( lower_5 <= 1304.1 )
							ret := -0.500000
						if( lower_5 > 1304.1 )
							if( basis_max <= -222.79 )
								if( basis_max <= -222.968 )
									ret := 0.760000 // buy
								if( basis_max > -222.968 )
									ret := -1.000000 // sell
							if( basis_max > -222.79 )
								if( lower_2 <= 1397.03 )
									ret := 1.000000 // buy
								if( lower_2 > 1397.03 )
									ret := 0.777778 // buy
					if( upper_2 > 1574.6 )
						if( upper_6 <= 1744.87 )
							if( upper_4 <= 1634.12 )
								if( upper_4 <= 1632.87 )
									ret := -0.094708
								if( upper_4 > 1632.87 )
									ret := -0.513514
							if( upper_4 > 1634.12 )
								if( lower_1 <= 1523.08 )
									ret := -0.342857
								if( lower_1 > 1523.08 )
									ret := 0.009892
						if( upper_6 > 1744.87 )
							if( basis_max <= -211.764 )
								if( lower_6 <= 1321.28 )
									ret := 1.000000 // buy
								if( lower_6 > 1321.28 )
									ret := -0.428571
							if( basis_max > -211.764 )
								if( lower_6 <= 1329.8 )
									ret := 0.958333 // buy
								if( lower_6 > 1329.8 )
									ret := 0.666667
				if( basis_minus > 226.079 )
					if( basis_minus <= 243.072 )
						if( lower_6 <= 1266 )
							if( lower_5 <= 1302.79 )
								if( lower_1 <= 1419.49 )
									ret := -0.722222 // sell
								if( lower_1 > 1419.49 )
									ret := -1.000000 // sell
							if( lower_5 > 1302.79 )
								if( upper_4 <= 1626.15 )
									ret := 1.000000 // buy
								if( upper_4 > 1626.15 )
									ret := -0.130435
						if( lower_6 > 1266 )
							ret := -1.000000 // sell
					if( basis_minus > 243.072 )
						if( upper_5 <= 1679.79 )
							if( upper_5 <= 1668.27 )
								if( upper_5 <= 1653.08 )
									ret := 0.565217
								if( upper_5 > 1653.08 )
									ret := -0.602740
							if( upper_5 > 1668.27 )
								if( upper_4 <= 1620.39 )
									ret := -0.115385
								if( upper_4 > 1620.39 )
									ret := 0.494382
						if( upper_5 > 1679.79 )
							if( lower_4 <= 1333.03 )
								if( upper_6 <= 1779.5 )
									ret := -0.921569 // sell
								if( upper_6 > 1779.5 )
									ret := -0.250000
							if( lower_4 > 1333.03 )
								if( basis_minus <= 253.027 )
									ret := 0.000000
								if( basis_minus > 253.027 )
									ret := 0.888889 // buy
			if( upper_3 > 1644.72 )
				if( upper_2 <= 1638.28 )
					if( upper_2 <= 1635.76 )
						if( basis_minus <= 187.057 )
							if( upper_1 <= 1617.62 )
								if( basis_max <= -145.209 )
									ret := 0.578125
								if( basis_max > -145.209 )
									ret := 0.146341
							if( upper_1 > 1617.62 )
								if( lower_5 <= 1535.67 )
									ret := -0.633333
								if( lower_5 > 1535.67 )
									ret := 0.500000
						if( basis_minus > 187.057 )
							if( lower_4 <= 1334.18 )
								if( lower_6 <= 1219.51 )
									ret := -0.600000
								if( lower_6 > 1219.51 )
									ret := 0.750000 // buy
							if( lower_4 > 1334.18 )
								if( upper_4 <= 1705.09 )
									ret := -0.645161
								if( upper_4 > 1705.09 )
									ret := 0.500000
					if( upper_2 > 1635.76 )
						if( upper_2 <= 1636.08 )
							if( lower_6 <= 1531.18 )
								if( upper_4 <= 1654.07 )
									ret := -0.125000
								if( upper_4 > 1654.07 )
									ret := -0.818182 // sell
							if( lower_6 > 1531.18 )
								ret := -1.000000 // sell
						if( upper_2 > 1636.08 )
							if( basis_max <= -93.7349 )
								if( lower_6 <= 1456.56 )
									ret := -0.571429
								if( lower_6 > 1456.56 )
									ret := 0.196078
							if( basis_max > -93.7349 )
								if( upper_5 <= 1666.11 )
									ret := -0.233333
								if( upper_5 > 1666.11 )
									ret := -0.729167 // sell
				if( upper_2 > 1638.28 )
					if( basis_max <= -93.8225 )
						ret := 0.000000
					if( basis_max > -93.8225 )
						if( basis_minus <= 93.7786 )
							if( lower_6 <= 1534.81 )
								ret := 0.000000
							if( lower_6 > 1534.81 )
								ret := 0.833333 // buy
						if( basis_minus > 93.7786 )
							ret := 1.000000 // buy
		if( upper_2 > 1638.51 )
			if( basis <= 1603.45 )
				if( lower_1 <= 1520.52 )
					if( lower_5 <= 1329.38 )
						if( basis_minus <= 319.887 )
							if( upper_4 <= 1732.84 )
								ret := 1.000000 // buy
							if( upper_4 > 1732.84 )
								ret := -0.200000
						if( basis_minus > 319.887 )
							ret := 1.000000 // buy
					if( lower_5 > 1329.38 )
						if( lower_6 <= 1283.91 )
							if( upper_6 <= 1915.5 )
								if( basis <= 1585.99 )
									ret := -0.750000 // sell
								if( basis > 1585.99 )
									ret := -1.000000 // sell
							if( upper_6 > 1915.5 )
								ret := -0.400000
						if( lower_6 > 1283.91 )
							if( upper_6 <= 1806.61 )
								if( lower_2 <= 1475.95 )
									ret := -0.795455 // sell
								if( lower_2 > 1475.95 )
									ret := 0.500000
							if( upper_6 > 1806.61 )
								if( lower_2 <= 1465.69 )
									ret := 1.000000 // buy
								if( lower_2 > 1465.69 )
									ret := 0.070588
				if( lower_1 > 1520.52 )
					if( upper_4 <= 1689.58 )
						if( upper_6 <= 1733.21 )
							if( basis_minus <= 142.38 )
								if( lower_3 <= 1555.68 )
									ret := 0.355932
								if( lower_3 > 1555.68 )
									ret := 0.923077 // buy
							if( basis_minus > 142.38 )
								if( upper_3 <= 1658.46 )
									ret := 1.000000 // buy
								if( upper_3 > 1658.46 )
									ret := 0.761905 // buy
						if( upper_6 > 1733.21 )
							if( upper_4 <= 1681.68 )
								if( upper_6 <= 1734.11 )
									ret := -0.375000
								if( upper_6 > 1734.11 )
									ret := -0.761905 // sell
							if( upper_4 > 1681.68 )
								if( lower_4 <= 1507.5 )
									ret := 0.451613
								if( lower_4 > 1507.5 )
									ret := -0.628571
					if( upper_4 > 1689.58 )
						if( basis_max <= -173.658 )
							if( basis_minus <= 174.292 )
								if( basis_minus <= 173.753 )
									ret := 0.000000
								if( basis_minus > 173.753 )
									ret := -1.000000 // sell
							if( basis_minus > 174.292 )
								if( lower_6 <= 1422.68 )
									ret := 0.515528
								if( lower_6 > 1422.68 )
									ret := -0.473684
						if( basis_max > -173.658 )
							if( upper_5 <= 1724.42 )
								if( upper_4 <= 1691.74 )
									ret := 0.739130 // buy
								if( upper_4 > 1691.74 )
									ret := 0.062500
							if( upper_5 > 1724.42 )
								if( upper_2 <= 1661.02 )
									ret := 0.959459 // buy
								if( upper_2 > 1661.02 )
									ret := 0.775510 // buy
			if( basis > 1603.45 )
				if( lower_5 <= 1523 )
					if( lower_6 <= 1491.84 )
						if( upper_1 <= 1682.6 )
							if( upper_1 <= 1671.39 )
								if( basis_minus <= 248.068 )
									ret := -0.070896
								if( basis_minus > 248.068 )
									ret := -0.764706 // sell
							if( upper_1 > 1671.39 )
								if( upper_5 <= 1791.32 )
									ret := 0.810345 // buy
								if( upper_5 > 1791.32 )
									ret := 0.067568
						if( upper_1 > 1682.6 )
							if( basis <= 1650.8 )
								if( lower_3 <= 1527.78 )
									ret := -0.200000
								if( lower_3 > 1527.78 )
									ret := -0.761006 // sell
							if( basis > 1650.8 )
								if( lower_2 <= 1593.7 )
									ret := 0.250000
								if( lower_2 > 1593.7 )
									ret := -0.616279
					if( lower_6 > 1491.84 )
						if( lower_2 <= 1567.02 )
							if( basis_minus <= 111.621 )
								ret := -0.500000
							if( basis_minus > 111.621 )
								ret := -1.000000 // sell
						if( lower_2 > 1567.02 )
							if( lower_5 <= 1522.01 )
								ret := 0.000000
							if( lower_5 > 1522.01 )
								if( upper_4 <= 1686.82 )
									ret := -0.833333 // sell
								if( upper_4 > 1686.82 )
									ret := -0.500000
				if( lower_5 > 1523 )
					if( basis_max <= -32.5731 )
						if( lower_5 <= 3868.08 )
							if( upper_5 <= 1658.05 )
								if( upper_6 <= 1667.33 )
									ret := 0.439024
								if( upper_6 > 1667.33 )
									ret := 1.000000 // buy
							if( upper_5 > 1658.05 )
								if( basis_minus <= 365.003 )
									ret := 0.046129
								if( basis_minus > 365.003 )
									ret := 0.166347
						if( lower_5 > 3868.08 )
							if( basis_max <= -121.246 )
								if( basis <= 4002.31 )
									ret := 0.250000
								if( basis > 4002.31 )
									ret := 0.730769 // buy
							if( basis_max > -121.246 )
								if( upper_3 <= 4040.24 )
									ret := -0.708333 // sell
								if( upper_3 > 4040.24 )
									ret := -0.329787
					if( basis_max > -32.5731 )
						if( lower_2 <= 1891.75 )
							if( basis_minus <= 32.2474 )
								if( lower_5 <= 1883.24 )
									ret := 0.009451
								if( lower_5 > 1883.24 )
									ret := -0.833333 // sell
							if( basis_minus > 32.2474 )
								if( upper_5 <= 1820.51 )
									ret := -0.666667
								if( upper_5 > 1820.51 )
									ret := -0.118644
						if( lower_2 > 1891.75 )
							if( lower_4 <= 1906.06 )
								if( lower_3 <= 1889.54 )
									ret := -0.137931
								if( lower_3 > 1889.54 )
									ret := -0.528662
							if( lower_4 > 1906.06 )
								if( upper_6 <= 1945.62 )
									ret := 0.720930 // buy
								if( upper_6 > 1945.62 )
									ret := -0.119888
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_ETHUSDT_15Min_a4032435(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


