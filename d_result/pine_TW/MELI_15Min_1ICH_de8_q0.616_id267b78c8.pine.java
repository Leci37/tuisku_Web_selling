//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MELI_15Min_1ICH_267b78c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1ICH_267b78c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_267b78c8(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tenkan_sen <= 1198.12 )
		if( basis_minus <= 4.6731 )
			if( chinkou_span <= 1150.42 )
				if( senkou_span_b_displaced <= 1134.98 )
					if( chinkou_span <= 1020.49 )
						if( senkou_span_a <= 1011.63 )
							if( senkou_span_b <= 154.724 )
								if( kinjun_sen <= 152.269 )
									ret := 0.029412
								if( kinjun_sen > 152.269 )
									ret := 0.750000 // buy
							if( senkou_span_b > 154.724 )
								if( chinkou_span <= 156.204 )
									ret := -0.468085
								if( chinkou_span > 156.204 )
									ret := 0.044157
						if( senkou_span_a > 1011.63 )
							if( kinjun_sen <= 1022.34 )
								if( tenkan_sen <= 1015.08 )
									ret := -0.454545
								if( tenkan_sen > 1015.08 )
									ret := -0.901235 // sell
							if( kinjun_sen > 1022.34 )
								if( tenkan_sen <= 1029.11 )
									ret := -0.136095
								if( tenkan_sen > 1029.11 )
									ret := -0.508418
					if( chinkou_span > 1020.49 )
						if( tenkan_sen <= 1027.31 )
							if( basis_minus <= -32.991 )
								if( kinjun_sen <= 1039.51 )
									ret := -0.666667
								if( kinjun_sen > 1039.51 )
									ret := 0.764706 // buy
							if( basis_minus > -32.991 )
								if( senkou_span_a_displaced <= 1003.02 )
									ret := 0.288136
								if( senkou_span_a_displaced > 1003.02 )
									ret := 0.686792
						if( tenkan_sen > 1027.31 )
							if( senkou_span_b_displaced <= 1134.33 )
								if( chinkou_span <= 1069.98 )
									ret := -0.143198
								if( chinkou_span > 1069.98 )
									ret := 0.212894
							if( senkou_span_b_displaced > 1134.33 )
								if( tenkan_sen <= 1116.08 )
									ret := 0.942857 // buy
								if( tenkan_sen > 1116.08 )
									ret := -0.333333
				if( senkou_span_b_displaced > 1134.98 )
					if( chinkou_span <= 1093.23 )
						if( senkou_span_a <= 1062.6 )
							if( basis_minus <= -48.4704 )
								ret := 0.250000
							if( basis_minus > -48.4704 )
								ret := 1.000000 // buy
						if( senkou_span_a > 1062.6 )
							if( kinjun_sen <= 1114.65 )
								if( tenkan_sen <= 1071.68 )
									ret := -0.454545
								if( tenkan_sen > 1071.68 )
									ret := -0.887218 // sell
							if( kinjun_sen > 1114.65 )
								if( senkou_span_a <= 1114.93 )
									ret := 0.107143
								if( senkou_span_a > 1114.93 )
									ret := -0.688119
					if( chinkou_span > 1093.23 )
						if( tenkan_sen <= 1125.42 )
							if( basis_max <= 8.75151 )
								if( senkou_span_a <= 1117.22 )
									ret := 0.294872
								if( senkou_span_a > 1117.22 )
									ret := -0.204301
							if( basis_max > 8.75151 )
								if( chinkou_span <= 1122.9 )
									ret := 0.482759
								if( chinkou_span > 1122.9 )
									ret := 1.000000 // buy
						if( tenkan_sen > 1125.42 )
							if( kinjun_sen <= 1198.63 )
								if( kinjun_sen <= 1138.29 )
									ret := 0.072727
								if( kinjun_sen > 1138.29 )
									ret := -0.581470
							if( kinjun_sen > 1198.63 )
								if( basis_minus <= -13.5244 )
									ret := -0.560000
								if( basis_minus > -13.5244 )
									ret := 0.804348 // buy
			if( chinkou_span > 1150.42 )
				if( senkou_span_b <= 1195.8 )
					if( kinjun_sen <= 1137.67 )
						if( basis_minus <= -6.90061 )
							if( chinkou_span <= 1179.47 )
								if( basis_max <= -0.050161 )
									ret := 1.000000 // buy
								if( basis_max > -0.050161 )
									ret := 0.894737 // buy
							if( chinkou_span > 1179.47 )
								ret := 0.600000
						if( basis_minus > -6.90061 )
							if( tenkan_sen <= 1092.2 )
								if( senkou_span_a_displaced <= 1080.99 )
									ret := -0.250000
								if( senkou_span_a_displaced > 1080.99 )
									ret := 0.142857
							if( tenkan_sen > 1092.2 )
								if( basis_minus <= -6.27057 )
									ret := 0.200000
								if( basis_minus > -6.27057 )
									ret := 0.768519 // buy
					if( kinjun_sen > 1137.67 )
						if( senkou_span_a_displaced <= 1163.68 )
							if( senkou_span_a_displaced <= 1160.14 )
								if( kinjun_sen <= 1160.45 )
									ret := 0.485149
								if( kinjun_sen > 1160.45 )
									ret := -0.368421
							if( senkou_span_a_displaced > 1160.14 )
								if( basis_minus <= -3.49599 )
									ret := 0.000000
								if( basis_minus > -3.49599 )
									ret := -0.611111
						if( senkou_span_a_displaced > 1163.68 )
							if( chinkou_span <= 1176.6 )
								if( senkou_span_b <= 1190.97 )
									ret := 0.467626
								if( senkou_span_b > 1190.97 )
									ret := -0.351852
							if( chinkou_span > 1176.6 )
								if( tenkan_sen <= 1156.38 )
									ret := 0.878378 // buy
								if( tenkan_sen > 1156.38 )
									ret := 0.546012
				if( senkou_span_b > 1195.8 )
					if( senkou_span_b <= 1208.46 )
						if( kinjun_sen <= 1185.88 )
							if( senkou_span_a_displaced <= 1192.47 )
								if( basis_max <= -0.686607 )
									ret := -0.833333 // sell
								if( basis_max > -0.686607 )
									ret := 0.200000
							if( senkou_span_a_displaced > 1192.47 )
								if( senkou_span_a <= 1169.59 )
									ret := 0.790698 // buy
								if( senkou_span_a > 1169.59 )
									ret := 0.307692
						if( kinjun_sen > 1185.88 )
							if( senkou_span_b <= 1197.23 )
								if( tenkan_sen <= 1177.72 )
									ret := 0.444444
								if( tenkan_sen > 1177.72 )
									ret := -0.200000
							if( senkou_span_b > 1197.23 )
								if( senkou_span_b_displaced <= 1194.1 )
									ret := 0.134615
								if( senkou_span_b_displaced > 1194.1 )
									ret := -0.485294
					if( senkou_span_b > 1208.46 )
						if( basis_max <= 3.45798 )
							ret := -0.500000
						if( basis_max > 3.45798 )
							if( tenkan_sen <= 1175.64 )
								ret := -0.250000
							if( tenkan_sen > 1175.64 )
								if( basis_max <= 4.8275 )
									ret := 0.500000
								if( basis_max > 4.8275 )
									ret := 0.977778 // buy
		if( basis_minus > 4.6731 )
			if( chinkou_span <= 1165.02 )
				if( senkou_span_a <= 1040.51 )
					if( senkou_span_b <= 1006.98 )
						if( chinkou_span <= 1032.62 )
							if( senkou_span_a <= 1010.5 )
								if( basis_minus <= 37.1617 )
									ret := 0.123765
								if( basis_minus > 37.1617 )
									ret := -0.565217
							if( senkou_span_a > 1010.5 )
								if( basis_minus <= 25.0477 )
									ret := -0.684615
								if( basis_minus > 25.0477 )
									ret := 0.368421
						if( chinkou_span > 1032.62 )
							if( senkou_span_b_displaced <= 911.914 )
								if( kinjun_sen <= 963.095 )
									ret := 0.725490 // buy
								if( kinjun_sen > 963.095 )
									ret := -0.312500
							if( senkou_span_b_displaced > 911.914 )
								if( basis_max <= -4.21369 )
									ret := 0.867347 // buy
								if( basis_max > -4.21369 )
									ret := 0.500000
					if( senkou_span_b > 1006.98 )
						if( chinkou_span <= 1006.81 )
							ret := -1.000000 // sell
						if( chinkou_span > 1006.81 )
							if( senkou_span_b <= 1008.34 )
								ret := 1.000000 // buy
							if( senkou_span_b > 1008.34 )
								if( senkou_span_b <= 1016.89 )
									ret := 0.726027 // buy
								if( senkou_span_b > 1016.89 )
									ret := 0.521739
				if( senkou_span_a > 1040.51 )
					if( chinkou_span <= 1085.04 )
						if( kinjun_sen <= 1060.53 )
							if( senkou_span_a <= 1053.23 )
								if( chinkou_span <= 1037.85 )
									ret := -0.820000 // sell
								if( chinkou_span > 1037.85 )
									ret := 0.037975
							if( senkou_span_a > 1053.23 )
								if( chinkou_span <= 1024.33 )
									ret := -0.366667
								if( chinkou_span > 1024.33 )
									ret := 0.680556
						if( kinjun_sen > 1060.53 )
							if( chinkou_span <= 1033.97 )
								if( kinjun_sen <= 1061.11 )
									ret := -0.714286 // sell
								if( kinjun_sen > 1061.11 )
									ret := -1.000000 // sell
							if( chinkou_span > 1033.97 )
								if( tenkan_sen <= 1085.25 )
									ret := -0.254386
								if( tenkan_sen > 1085.25 )
									ret := -0.695906
					if( chinkou_span > 1085.04 )
						if( tenkan_sen <= 1122.3 )
							if( basis_max <= -16.0581 )
								if( senkou_span_b_displaced <= 979.531 )
									ret := 0.111111
								if( senkou_span_b_displaced > 979.531 )
									ret := -0.666667
							if( basis_max > -16.0581 )
								if( kinjun_sen <= 1120.07 )
									ret := 0.385922
								if( kinjun_sen > 1120.07 )
									ret := 0.871795 // buy
						if( tenkan_sen > 1122.3 )
							if( senkou_span_a_displaced <= 1137 )
								if( basis_minus <= 8.90033 )
									ret := 0.255319
								if( basis_minus > 8.90033 )
									ret := -0.211009
							if( senkou_span_a_displaced > 1137 )
								if( basis_max <= 3.68904 )
									ret := -0.655172
								if( basis_max > 3.68904 )
									ret := 0.555556
			if( chinkou_span > 1165.02 )
				if( basis_minus <= 64.5689 )
					if( chinkou_span <= 1215.3 )
						if( senkou_span_b_displaced <= 1098.04 )
							if( tenkan_sen <= 1184.02 )
								if( tenkan_sen <= 1102.87 )
									ret := 0.238095
								if( tenkan_sen > 1102.87 )
									ret := 0.687831
							if( tenkan_sen > 1184.02 )
								if( senkou_span_b_displaced <= 1084.85 )
									ret := -0.785714 // sell
								if( senkou_span_b_displaced > 1084.85 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 1098.04 )
							if( basis_minus <= 22.2182 )
								if( basis_max <= -6.56937 )
									ret := -0.054545
								if( basis_max > -6.56937 )
									ret := 0.402490
							if( basis_minus > 22.2182 )
								if( senkou_span_b_displaced <= 1124.94 )
									ret := 0.317460
								if( senkou_span_b_displaced > 1124.94 )
									ret := -0.615385
					if( chinkou_span > 1215.3 )
						if( senkou_span_a_displaced <= 1158.25 )
							if( basis_minus <= 39.8463 )
								if( senkou_span_b_displaced <= 1128.16 )
									ret := 0.181818
								if( senkou_span_b_displaced > 1128.16 )
									ret := -0.058824
							if( basis_minus > 39.8463 )
								ret := 0.714286 // buy
						if( senkou_span_a_displaced > 1158.25 )
							if( basis_max <= -8.9625 )
								if( chinkou_span <= 1224.21 )
									ret := 0.000000
								if( chinkou_span > 1224.21 )
									ret := 0.500000
							if( basis_max > -8.9625 )
								if( senkou_span_b <= 1179.22 )
									ret := 0.884615 // buy
								if( senkou_span_b > 1179.22 )
									ret := 0.000000
				if( basis_minus > 64.5689 )
					if( senkou_span_a <= 1179.76 )
						ret := -1.000000 // sell
					if( senkou_span_a > 1179.76 )
						ret := -0.750000 // sell
	if( tenkan_sen > 1198.12 )
		if( senkou_span_b_displaced <= 1192.38 )
			if( senkou_span_a_displaced <= 1164.29 )
				if( senkou_span_b_displaced <= 1155.62 )
					if( tenkan_sen <= 1200.08 )
						ret := 0.000000
					if( tenkan_sen > 1200.08 )
						if( basis_max <= -11.9381 )
							ret := 0.000000
						if( basis_max > -11.9381 )
							if( senkou_span_a <= 1203.52 )
								if( tenkan_sen <= 1201.12 )
									ret := 0.750000 // buy
								if( tenkan_sen > 1201.12 )
									ret := 1.000000 // buy
							if( senkou_span_a > 1203.52 )
								ret := 0.666667
				if( senkou_span_b_displaced > 1155.62 )
					if( chinkou_span <= 1213.62 )
						ret := 0.000000
					if( chinkou_span > 1213.62 )
						if( senkou_span_b <= 1172.11 )
							if( basis_max <= -14.1345 )
								ret := 0.000000
							if( basis_max > -14.1345 )
								ret := -0.250000
						if( senkou_span_b > 1172.11 )
							if( kinjun_sen <= 1188.77 )
								ret := -1.000000 // sell
							if( kinjun_sen > 1188.77 )
								ret := -0.750000 // sell
			if( senkou_span_a_displaced > 1164.29 )
				if( chinkou_span <= 1225.47 )
					if( kinjun_sen <= 1209.95 )
						if( senkou_span_a_displaced <= 1184.1 )
							if( senkou_span_a <= 1205.54 )
								if( senkou_span_b <= 1184.21 )
									ret := -0.333333
								if( senkou_span_b > 1184.21 )
									ret := -0.707965 // sell
							if( senkou_span_a > 1205.54 )
								if( kinjun_sen <= 1203.17 )
									ret := 0.193548
								if( kinjun_sen > 1203.17 )
									ret := -0.431373
						if( senkou_span_a_displaced > 1184.1 )
							if( senkou_span_b <= 1198.46 )
								if( senkou_span_b_displaced <= 1186.39 )
									ret := -0.523810
								if( senkou_span_b_displaced > 1186.39 )
									ret := 0.250000
							if( senkou_span_b > 1198.46 )
								if( chinkou_span <= 1159.39 )
									ret := 0.947368 // buy
								if( chinkou_span > 1159.39 )
									ret := 0.263158
					if( kinjun_sen > 1209.95 )
						if( chinkou_span <= 1203.53 )
							if( senkou_span_a_displaced <= 1194.02 )
								if( senkou_span_a_displaced <= 1170.86 )
									ret := -0.600000
								if( senkou_span_a_displaced > 1170.86 )
									ret := -0.966292 // sell
							if( senkou_span_a_displaced > 1194.02 )
								if( basis_minus <= 14.2425 )
									ret := 0.000000
								if( basis_minus > 14.2425 )
									ret := -0.857143 // sell
						if( chinkou_span > 1203.53 )
							if( tenkan_sen <= 1227.34 )
								if( senkou_span_a_displaced <= 1197.9 )
									ret := 0.161290
								if( senkou_span_a_displaced > 1197.9 )
									ret := -0.526316
							if( tenkan_sen > 1227.34 )
								if( basis_max <= -4.80443 )
									ret := -0.428571
								if( basis_max > -4.80443 )
									ret := -0.965517 // sell
				if( chinkou_span > 1225.47 )
					if( basis_minus <= 20.9888 )
						if( basis_minus <= 8.72091 )
							if( senkou_span_a_displaced <= 1197.68 )
								ret := -0.857143 // sell
							if( senkou_span_a_displaced > 1197.68 )
								ret := -0.250000
						if( basis_minus > 8.72091 )
							if( kinjun_sen <= 1218.98 )
								if( senkou_span_b_displaced <= 1189.13 )
									ret := 0.720000 // buy
								if( senkou_span_b_displaced > 1189.13 )
									ret := 0.222222
							if( kinjun_sen > 1218.98 )
								if( senkou_span_a_displaced <= 1211.18 )
									ret := -0.100000
								if( senkou_span_a_displaced > 1211.18 )
									ret := 0.500000
					if( basis_minus > 20.9888 )
						if( tenkan_sen <= 1219.65 )
							ret := 0.000000
						if( tenkan_sen > 1219.65 )
							if( kinjun_sen <= 1205.3 )
								ret := -1.000000 // sell
							if( kinjun_sen > 1205.3 )
								if( senkou_span_b <= 1195.98 )
									ret := 0.000000
								if( senkou_span_b > 1195.98 )
									ret := -0.800000 // sell
		if( senkou_span_b_displaced > 1192.38 )
			if( chinkou_span <= 1197.61 )
				if( senkou_span_a <= 1211.66 )
					if( chinkou_span <= 1153.97 )
						if( basis_minus <= -11.18 )
							if( tenkan_sen <= 1201.24 )
								ret := -1.000000 // sell
							if( tenkan_sen > 1201.24 )
								ret := -0.400000
						if( basis_minus > -11.18 )
							ret := -1.000000 // sell
					if( chinkou_span > 1153.97 )
						if( senkou_span_a <= 1204.32 )
							if( basis_minus <= 4.25905 )
								if( senkou_span_a_displaced <= 1217.62 )
									ret := -0.666667
								if( senkou_span_a_displaced > 1217.62 )
									ret := -0.181818
							if( basis_minus > 4.25905 )
								if( basis_minus <= 7.32375 )
									ret := 0.250000
								if( basis_minus > 7.32375 )
									ret := 0.000000
						if( senkou_span_a > 1204.32 )
							if( tenkan_sen <= 1204.98 )
								if( senkou_span_b_displaced <= 1222.05 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 1222.05 )
									ret := 0.000000
							if( tenkan_sen > 1204.98 )
								if( senkou_span_a <= 1209.71 )
									ret := 0.348837
								if( senkou_span_a > 1209.71 )
									ret := -0.192308
				if( senkou_span_a > 1211.66 )
					if( basis_max <= 1.17371 )
						if( senkou_span_a_displaced <= 1206.51 )
							if( kinjun_sen <= 1214.12 )
								ret := -0.666667
							if( kinjun_sen > 1214.12 )
								if( chinkou_span <= 1193.51 )
									ret := 0.000000
								if( chinkou_span > 1193.51 )
									ret := -0.250000
						if( senkou_span_a_displaced > 1206.51 )
							if( senkou_span_a_displaced <= 1223.84 )
								if( senkou_span_b_displaced <= 1206.45 )
									ret := -0.250000
								if( senkou_span_b_displaced > 1206.45 )
									ret := -0.960000 // sell
							if( senkou_span_a_displaced > 1223.84 )
								if( senkou_span_b_displaced <= 1220.59 )
									ret := 0.000000
								if( senkou_span_b_displaced > 1220.59 )
									ret := -0.878788 // sell
					if( basis_max > 1.17371 )
						if( chinkou_span <= 1135.29 )
							ret := -1.000000 // sell
						if( chinkou_span > 1135.29 )
							if( senkou_span_a <= 1228.69 )
								if( kinjun_sen <= 1226.74 )
									ret := -0.339623
								if( kinjun_sen > 1226.74 )
									ret := -0.957447 // sell
							if( senkou_span_a > 1228.69 )
								if( tenkan_sen <= 1245.98 )
									ret := -0.023256
								if( tenkan_sen > 1245.98 )
									ret := -0.696970
			if( chinkou_span > 1197.61 )
				if( chinkou_span <= 1256.05 )
					if( tenkan_sen <= 1228.89 )
						if( senkou_span_b_displaced <= 1263.32 )
							if( tenkan_sen <= 1208.15 )
								if( basis_max <= -0.105298 )
									ret := 0.050847
								if( basis_max > -0.105298 )
									ret := 0.444915
							if( tenkan_sen > 1208.15 )
								if( senkou_span_b <= 1254.17 )
									ret := -0.012759
								if( senkou_span_b > 1254.17 )
									ret := -0.789474 // sell
						if( senkou_span_b_displaced > 1263.32 )
							if( basis_minus <= -25.7736 )
								if( kinjun_sen <= 1218.88 )
									ret := 0.833333 // buy
								if( kinjun_sen > 1218.88 )
									ret := 1.000000 // buy
							if( basis_minus > -25.7736 )
								if( chinkou_span <= 1204.51 )
									ret := -0.181818
								if( chinkou_span > 1204.51 )
									ret := 0.482759
					if( tenkan_sen > 1228.89 )
						if( senkou_span_a <= 1285.3 )
							if( chinkou_span <= 1212.24 )
								if( tenkan_sen <= 1262.92 )
									ret := -0.639098
								if( tenkan_sen > 1262.92 )
									ret := 0.428571
							if( chinkou_span > 1212.24 )
								if( senkou_span_a <= 1231.11 )
									ret := -0.553398
								if( senkou_span_a > 1231.11 )
									ret := -0.177022
						if( senkou_span_a > 1285.3 )
							if( kinjun_sen <= 1325.88 )
								if( senkou_span_a_displaced <= 1351.12 )
									ret := -0.728972 // sell
								if( senkou_span_a_displaced > 1351.12 )
									ret := 0.250000
							if( kinjun_sen > 1325.88 )
								if( senkou_span_a_displaced <= 1461.69 )
									ret := -0.985075 // sell
								if( senkou_span_a_displaced > 1461.69 )
									ret := -0.750000 // sell
				if( chinkou_span > 1256.05 )
					if( senkou_span_b <= 1252.54 )
						if( basis_minus <= 59.0225 )
							if( senkou_span_b_displaced <= 1195.5 )
								if( basis_minus <= 16.256 )
									ret := 1.000000 // buy
								if( basis_minus > 16.256 )
									ret := 0.700000 // buy
							if( senkou_span_b_displaced > 1195.5 )
								if( chinkou_span <= 1299.99 )
									ret := 0.332542
								if( chinkou_span > 1299.99 )
									ret := 0.582278
						if( basis_minus > 59.0225 )
							ret := -1.000000 // sell
					if( senkou_span_b > 1252.54 )
						if( senkou_span_a <= 1262.07 )
							if( senkou_span_a_displaced <= 1267.2 )
								if( kinjun_sen <= 1254.88 )
									ret := 0.301887
								if( kinjun_sen > 1254.88 )
									ret := -0.214286
							if( senkou_span_a_displaced > 1267.2 )
								if( chinkou_span <= 1280.78 )
									ret := 0.312500
								if( chinkou_span > 1280.78 )
									ret := 0.852273 // buy
						if( senkou_span_a > 1262.07 )
							if( chinkou_span <= 1294.92 )
								if( tenkan_sen <= 1302.82 )
									ret := -0.115489
								if( tenkan_sen > 1302.82 )
									ret := -0.579365
							if( chinkou_span > 1294.92 )
								if( tenkan_sen <= 1342 )
									ret := 0.248371
								if( tenkan_sen > 1342 )
									ret := 0.040775
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_MELI_15Min_267b78c8(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


