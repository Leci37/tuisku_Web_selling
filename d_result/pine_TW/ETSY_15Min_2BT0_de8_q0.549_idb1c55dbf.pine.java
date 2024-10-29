//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ETSY_15Min_2BT0_b1c55dbf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_2BT0_b1c55dbf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_b1c55dbf(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= 0.253435 )
		if( bbm <= 0.139989 )
			if( bbp <= -0.775475 )
				if( tema <= 107.375 )
					if( ema1 <= 100.702 )
						if( ema13 <= -0.354734 )
							if( ema12 <= -0.307223 )
								if( ema3 <= 101.079 )
									ret := 0.271987
								if( ema3 > 101.079 )
									ret := -0.555556
							if( ema12 > -0.307223 )
								if( ema2 <= 19.9026 )
									ret := 1.000000 // buy
								if( ema2 > 19.9026 )
									ret := -0.038961
						if( ema13 > -0.354734 )
							if( ema1 <= 55.35 )
								if( ema13 <= -0.037017 )
									ret := 0.472868
								if( ema13 > -0.037017 )
									ret := 0.975610 // buy
							if( ema1 > 55.35 )
								if( ema3 <= 60.3588 )
									ret := -0.219512
								if( ema3 > 60.3588 )
									ret := 0.393617
					if( ema1 > 100.702 )
						if( ema2 <= 106.21 )
							if( ema1 <= 103.992 )
								if( ema3 <= 101.863 )
									ret := 0.000000
								if( ema3 > 101.863 )
									ret := 0.726415 // buy
							if( ema1 > 103.992 )
								if( ema12 <= -0.303231 )
									ret := -0.375000
								if( ema12 > -0.303231 )
									ret := 0.333333
						if( ema2 > 106.21 )
							if( bbp <= -3.97754 )
								ret := 0.500000
							if( bbp > -3.97754 )
								if( ema12 <= -0.20493 )
									ret := 1.000000 // buy
								if( ema12 > -0.20493 )
									ret := 0.750000 // buy
				if( tema > 107.375 )
					if( bearPower <= -1.84526 )
						if( ema2 <= 116.921 )
							if( bbp <= -4.24229 )
								if( bbp <= -5.24013 )
									ret := -0.750000 // sell
								if( bbp > -5.24013 )
									ret := -1.000000 // sell
							if( bbp > -4.24229 )
								ret := -0.333333
						if( ema2 > 116.921 )
							if( ema2 <= 161.749 )
								if( bullPower <= -2.43112 )
									ret := 1.000000 // buy
								if( bullPower > -2.43112 )
									ret := 0.523810
							if( ema2 > 161.749 )
								if( ema13 <= -4.58992 )
									ret := 1.000000 // buy
								if( ema13 > -4.58992 )
									ret := 0.266055
					if( bearPower > -1.84526 )
						if( ema12 <= -0.301355 )
							if( bbm <= 0.000904 )
								if( tema <= 260.351 )
									ret := -0.081784
								if( tema > 260.351 )
									ret := 0.454545
							if( bbm > 0.000904 )
								if( tema <= 122.092 )
									ret := -0.205882
								if( tema > 122.092 )
									ret := 0.216102
						if( ema12 > -0.301355 )
							if( bbm <= 0.10877 )
								if( tema <= 196.503 )
									ret := 0.158974
								if( tema > 196.503 )
									ret := 0.396552
							if( bbm > 0.10877 )
								if( bbp <= -1.32413 )
									ret := -1.000000 // sell
								if( bbp > -1.32413 )
									ret := -0.200000
			if( bbp > -0.775475 )
				if( ema3 <= 152.022 )
					if( tema <= 9.58029 )
						if( bullPower <= -0.011428 )
							if( ema13 <= -0.115112 )
								if( ema13 <= -0.491219 )
									ret := 0.600000
								if( ema13 > -0.491219 )
									ret := 1.000000 // buy
							if( ema13 > -0.115112 )
								ret := 0.000000
						if( bullPower > -0.011428 )
							if( tema <= 9.56669 )
								ret := 1.000000 // buy
							if( tema > 9.56669 )
								ret := 0.833333 // buy
					if( tema > 9.58029 )
						if( tema <= 55.1258 )
							if( tema <= 52.6343 )
								if( ema3 <= 53.1521 )
									ret := 0.104554
								if( ema3 > 53.1521 )
									ret := -0.937500 // sell
							if( tema > 52.6343 )
								if( ema12 <= -0.15161 )
									ret := -0.243590
								if( ema12 > -0.15161 )
									ret := 0.374031
						if( tema > 55.1258 )
							if( ema1 <= 57.6314 )
								if( ema13 <= 0.216349 )
									ret := -0.335505
								if( ema13 > 0.216349 )
									ret := 0.562500
							if( ema1 > 57.6314 )
								if( ema1 <= 145.971 )
									ret := 0.051474
								if( ema1 > 145.971 )
									ret := -0.606061
				if( ema3 > 152.022 )
					if( ema12 <= -0.208566 )
						if( ema3 <= 165.022 )
							if( tema <= 159.476 )
								ret := 0.000000
							if( tema > 159.476 )
								ret := 1.000000 // buy
						if( ema3 > 165.022 )
							if( ema1 <= 168.991 )
								if( bbm <= 0.015306 )
									ret := -0.300000
								if( bbm > 0.015306 )
									ret := -1.000000 // sell
							if( ema1 > 168.991 )
								if( ema13 <= -1.2169 )
									ret := -0.666667
								if( ema13 > -1.2169 )
									ret := 0.159091
					if( ema12 > -0.208566 )
						if( ema2 <= 199.287 )
							if( tema <= 170.44 )
								if( ema3 <= 159.529 )
									ret := 0.840000 // buy
								if( ema3 > 159.529 )
									ret := 0.169014
							if( tema > 170.44 )
								if( bearPower <= 0.094185 )
									ret := 0.725000 // buy
								if( bearPower > 0.094185 )
									ret := 0.000000
						if( ema2 > 199.287 )
							if( ema3 <= 207.581 )
								if( ema1 <= 205.238 )
									ret := 0.045455
								if( ema1 > 205.238 )
									ret := -0.562500
							if( ema3 > 207.581 )
								if( ema3 <= 208.135 )
									ret := 1.000000 // buy
								if( ema3 > 208.135 )
									ret := 0.326923
		if( bbm > 0.139989 )
			if( ema3 <= 112.049 )
				if( ema3 <= 98.1597 )
					if( tema <= 96.5843 )
						if( bullPower <= -1.67634 )
							if( ema13 <= -2.4144 )
								if( tema <= 67.5498 )
									ret := 0.736842 // buy
								if( tema > 67.5498 )
									ret := -0.470588
							if( ema13 > -2.4144 )
								if( ema12 <= -0.917241 )
									ret := 0.724638 // buy
								if( ema12 > -0.917241 )
									ret := 0.066667
						if( bullPower > -1.67634 )
							if( ema1 <= 96.4373 )
								if( ema2 <= 96.4499 )
									ret := 0.058620
								if( ema2 > 96.4499 )
									ret := -0.393617
							if( ema1 > 96.4373 )
								if( ema3 <= 96.8829 )
									ret := -0.333333
								if( ema3 > 96.8829 )
									ret := 0.579832
					if( tema > 96.5843 )
						if( bullPower <= -0.339543 )
							if( bearPower <= -1.1154 )
								ret := 0.000000
							if( bearPower > -1.1154 )
								ret := 0.500000
						if( bullPower > -0.339543 )
							if( ema2 <= 97.5919 )
								if( ema2 <= 97.5001 )
									ret := -0.466667
								if( ema2 > 97.5001 )
									ret := 0.363636
							if( ema2 > 97.5919 )
								if( ema3 <= 97.7084 )
									ret := -0.285714
								if( ema3 > 97.7084 )
									ret := -0.870968 // sell
				if( ema3 > 98.1597 )
					if( tema <= 110.884 )
						if( bbm <= 0.670286 )
							if( ema13 <= -1.23157 )
								if( ema3 <= 109.147 )
									ret := 0.208333
								if( ema3 > 109.147 )
									ret := 0.780488 // buy
							if( ema13 > -1.23157 )
								if( ema13 <= -0.511903 )
									ret := -0.118863
								if( ema13 > -0.511903 )
									ret := 0.157601
						if( bbm > 0.670286 )
							if( ema3 <= 100.078 )
								if( bbp <= -0.620286 )
									ret := 0.736364 // buy
								if( bbp > -0.620286 )
									ret := 0.263158
							if( ema3 > 100.078 )
								if( ema13 <= -0.58087 )
									ret := 0.136552
								if( ema13 > -0.58087 )
									ret := 0.325648
					if( tema > 110.884 )
						if( ema3 <= 111.562 )
							if( bearPower <= -0.89164 )
								if( bbm <= 1.37218 )
									ret := 0.500000
								if( bbm > 1.37218 )
									ret := 1.000000 // buy
							if( bearPower > -0.89164 )
								if( tema <= 111.242 )
									ret := 0.526316
								if( tema > 111.242 )
									ret := -0.214286
						if( ema3 > 111.562 )
							if( bullPower <= 0.300276 )
								if( bbm <= 0.205418 )
									ret := 0.750000 // buy
								if( bbm > 0.205418 )
									ret := 0.966667 // buy
							if( bullPower > 0.300276 )
								if( ema1 <= 112.567 )
									ret := 0.428571
								if( ema1 > 112.567 )
									ret := 0.875000 // buy
			if( ema3 > 112.049 )
				if( bbp <= -0.001176 )
					if( ema3 <= 115.549 )
						if( ema2 <= 114.078 )
							if( bbm <= 0.411984 )
								if( bearPower <= -1.24591 )
									ret := -0.727273 // sell
								if( bearPower > -1.24591 )
									ret := 0.692308
							if( bbm > 0.411984 )
								if( bbm <= 1.35413 )
									ret := -0.363248
								if( bbm > 1.35413 )
									ret := 0.102804
						if( ema2 > 114.078 )
							if( ema12 <= -0.176539 )
								if( tema <= 113.115 )
									ret := -0.763158 // sell
								if( tema > 113.115 )
									ret := -0.200000
							if( ema12 > -0.176539 )
								if( bbm <= 1.39995 )
									ret := -0.900000 // sell
								if( bbm > 1.39995 )
									ret := 0.400000
					if( ema3 > 115.549 )
						if( ema13 <= -3.57952 )
							if( ema1 <= 203.129 )
								if( ema2 <= 162.17 )
									ret := 0.081340
								if( ema2 > 162.17 )
									ret := 0.492248
							if( ema1 > 203.129 )
								if( ema1 <= 205.22 )
									ret := -0.666667
								if( ema1 > 205.22 )
									ret := -0.013072
						if( ema13 > -3.57952 )
							if( bbm <= 1.72912 )
								if( ema13 <= -0.260365 )
									ret := -0.013609
								if( ema13 > -0.260365 )
									ret := 0.106695
							if( bbm > 1.72912 )
								if( ema2 <= 164.946 )
									ret := -0.011161
								if( ema2 > 164.946 )
									ret := -0.161664
				if( bbp > -0.001176 )
					if( tema <= 161.035 )
						if( ema3 <= 156.773 )
							if( bearPower <= -1.16749 )
								if( bbm <= 3.8497 )
									ret := 0.944444 // buy
								if( bbm > 3.8497 )
									ret := -0.500000
							if( bearPower > -1.16749 )
								if( bearPower <= -1.07227 )
									ret := -1.000000 // sell
								if( bearPower > -1.07227 )
									ret := 0.271605
						if( ema3 > 156.773 )
							if( bbp <= 0.047788 )
								ret := 0.750000 // buy
							if( bbp > 0.047788 )
								ret := 1.000000 // buy
					if( tema > 161.035 )
						if( bbp <= 0.237368 )
							if( bbm <= 0.910075 )
								if( bbp <= 0.00639 )
									ret := 0.900000 // buy
								if( bbp > 0.00639 )
									ret := 0.020000
							if( bbm > 0.910075 )
								if( bbm <= 2.05251 )
									ret := -0.277311
								if( bbm > 2.05251 )
									ret := 0.200000
						if( bbp > 0.237368 )
							if( ema12 <= -0.017799 )
								if( bearPower <= -0.436912 )
									ret := 1.000000 // buy
								if( bearPower > -0.436912 )
									ret := 0.666667
							if( ema12 > -0.017799 )
								if( ema1 <= 229.972 )
									ret := 0.000000
								if( ema1 > 229.972 )
									ret := 0.800000 // buy
	if( bbp > 0.253435 )
		if( ema3 <= 106.85 )
			if( tema <= 101.244 )
				if( ema13 <= 0.189183 )
					if( bbm <= 0.163941 )
						if( bearPower <= 0.410255 )
							if( ema3 <= 60.4767 )
								if( bbp <= 0.488772 )
									ret := -0.153293
								if( bbp > 0.488772 )
									ret := -0.435780
							if( ema3 > 60.4767 )
								if( ema3 <= 63.8659 )
									ret := 0.500000
								if( ema3 > 63.8659 )
									ret := -0.085878
						if( bearPower > 0.410255 )
							if( ema12 <= 0.161706 )
								if( ema13 <= -0.27034 )
									ret := 0.250000
								if( ema13 > -0.27034 )
									ret := -0.618812
							if( ema12 > 0.161706 )
								if( ema1 <= 83.0246 )
									ret := 0.529412
								if( ema1 > 83.0246 )
									ret := -0.111111
					if( bbm > 0.163941 )
						if( ema2 <= 93.5705 )
							if( ema3 <= 81.911 )
								if( ema3 <= 77.4767 )
									ret := -0.018418
								if( ema3 > 77.4767 )
									ret := 0.331169
							if( ema3 > 81.911 )
								if( bearPower <= 0.165816 )
									ret := -0.227723
								if( bearPower > 0.165816 )
									ret := -0.619718
						if( ema2 > 93.5705 )
							if( ema2 <= 95.2891 )
								if( ema2 <= 94.742 )
									ret := 0.739130 // buy
								if( ema2 > 94.742 )
									ret := 1.000000 // buy
							if( ema2 > 95.2891 )
								if( ema3 <= 96.331 )
									ret := -0.622642
								if( ema3 > 96.331 )
									ret := 0.170543
				if( ema13 > 0.189183 )
					if( ema1 <= 14.6721 )
						if( tema <= 11.3598 )
							if( ema13 <= 0.306752 )
								if( bbm <= 0.144267 )
									ret := 1.000000 // buy
								if( bbm > 0.144267 )
									ret := 0.750000 // buy
							if( ema13 > 0.306752 )
								ret := 0.000000
						if( tema > 11.3598 )
							if( bbm <= 0.183151 )
								if( ema13 <= 0.34969 )
									ret := -0.085106
								if( ema13 > 0.34969 )
									ret := 0.500000
							if( bbm > 0.183151 )
								if( bbm <= 0.259383 )
									ret := 0.913043 // buy
								if( bbm > 0.259383 )
									ret := 0.500000
					if( ema1 > 14.6721 )
						if( ema1 <= 86.8096 )
							if( tema <= 85.9732 )
								if( bbm <= 0.15498 )
									ret := -0.058824
								if( bbm > 0.15498 )
									ret := 0.033564
							if( tema > 85.9732 )
								if( bullPower <= 1.84098 )
									ret := -0.482759
								if( bullPower > 1.84098 )
									ret := 0.000000
						if( ema1 > 86.8096 )
							if( tema <= 94.8439 )
								if( ema2 <= 92.5517 )
									ret := 0.187605
								if( ema2 > 92.5517 )
									ret := 0.623457
							if( tema > 94.8439 )
								if( bullPower <= 0.569139 )
									ret := 0.264706
								if( bullPower > 0.569139 )
									ret := -0.094920
			if( tema > 101.244 )
				if( ema3 <= 101.103 )
					if( ema1 <= 100.303 )
						if( bbp <= 4.37943 )
							if( bullPower <= 2.10155 )
								ret := -0.400000
							if( bullPower > 2.10155 )
								if( ema1 <= 99.925 )
									ret := 1.000000 // buy
								if( ema1 > 99.925 )
									ret := 0.625000
						if( bbp > 4.37943 )
							if( ema12 <= 1.76775 )
								ret := -0.750000 // sell
							if( ema12 > 1.76775 )
								ret := 0.000000
					if( ema1 > 100.303 )
						if( tema <= 106.834 )
							if( bbp <= 1.00364 )
								if( ema3 <= 100.667 )
									ret := 0.294118
								if( ema3 > 100.667 )
									ret := -0.538462
							if( bbp > 1.00364 )
								if( ema12 <= 0.218879 )
									ret := 0.000000
								if( ema12 > 0.218879 )
									ret := -0.782407 // sell
						if( tema > 106.834 )
							ret := 0.428571
				if( ema3 > 101.103 )
					if( ema12 <= 0.125645 )
						if( ema1 <= 104.263 )
							if( bbm <= 0.165 )
								if( bullPower <= 0.183145 )
									ret := -0.750000 // sell
								if( bullPower > 0.183145 )
									ret := -0.181818
							if( bbm > 0.165 )
								if( ema2 <= 104.025 )
									ret := 0.417323
								if( ema2 > 104.025 )
									ret := 0.937500 // buy
						if( ema1 > 104.263 )
							if( ema1 <= 106.455 )
								if( ema3 <= 104.56 )
									ret := 0.250000
								if( ema3 > 104.56 )
									ret := -0.558442
							if( ema1 > 106.455 )
								ret := 0.666667
					if( ema12 > 0.125645 )
						if( tema <= 108.2 )
							if( bearPower <= -0.007626 )
								if( bbm <= 2.15658 )
									ret := 0.124088
								if( bbm > 2.15658 )
									ret := -0.500000
							if( bearPower > -0.007626 )
								if( bbm <= 1.4375 )
									ret := -0.243028
								if( bbm > 1.4375 )
									ret := -0.733333 // sell
						if( tema > 108.2 )
							if( ema13 <= 0.910281 )
								ret := -0.750000 // sell
							if( ema13 > 0.910281 )
								if( ema12 <= 0.724111 )
									ret := 1.000000 // buy
								if( ema12 > 0.724111 )
									ret := 0.242424
		if( ema3 > 106.85 )
			if( tema <= 219.411 )
				if( ema2 <= 201.784 )
					if( ema3 <= 129.124 )
						if( ema12 <= 1.17893 )
							if( bullPower <= 1.62103 )
								if( bbm <= 0.671725 )
									ret := 0.055434
								if( bbm > 0.671725 )
									ret := 0.227658
							if( bullPower > 1.62103 )
								if( ema1 <= 127.729 )
									ret := -0.155722
								if( ema1 > 127.729 )
									ret := 0.379310
						if( ema12 > 1.17893 )
							if( ema1 <= 117.81 )
								if( tema <= 114.791 )
									ret := 0.705882 // buy
								if( tema > 114.791 )
									ret := -0.384615
							if( ema1 > 117.81 )
								if( ema13 <= 2.7422 )
									ret := 0.301887
								if( ema13 > 2.7422 )
									ret := 0.777070 // buy
					if( ema3 > 129.124 )
						if( ema1 <= 131.631 )
							if( ema13 <= -0.149954 )
								if( ema2 <= 129.317 )
									ret := 0.000000
								if( ema2 > 129.317 )
									ret := -0.808824 // sell
							if( ema13 > -0.149954 )
								if( ema1 <= 130.009 )
									ret := 0.379310
								if( ema1 > 130.009 )
									ret := -0.308017
						if( ema1 > 131.631 )
							if( bearPower <= 3.04516 )
								if( bullPower <= 3.84224 )
									ret := -0.007019
								if( bullPower > 3.84224 )
									ret := 0.264706
							if( bearPower > 3.04516 )
								if( ema2 <= 158.485 )
									ret := -0.824561 // sell
								if( ema2 > 158.485 )
									ret := -0.140625
				if( ema2 > 201.784 )
					if( bbm <= 4.00147 )
						if( ema13 <= 0.780584 )
							if( ema13 <= -0.644291 )
								if( bearPower <= -0.804993 )
									ret := 0.777778 // buy
								if( bearPower > -0.804993 )
									ret := -0.257576
							if( ema13 > -0.644291 )
								if( bbp <= 3.3595 )
									ret := 0.300485
								if( bbp > 3.3595 )
									ret := 0.808511 // buy
						if( ema13 > 0.780584 )
							if( bbp <= 0.659601 )
								if( tema <= 207.89 )
									ret := -0.760000 // sell
								if( tema > 207.89 )
									ret := 0.086957
							if( bbp > 0.659601 )
								if( ema3 <= 206.206 )
									ret := 0.255814
								if( ema3 > 206.206 )
									ret := 0.018868
					if( bbm > 4.00147 )
						if( tema <= 218.027 )
							if( ema3 <= 204.975 )
								ret := -0.250000
							if( ema3 > 204.975 )
								if( bullPower <= 6.86034 )
									ret := 0.901961 // buy
								if( bullPower > 6.86034 )
									ret := 0.636364
						if( tema > 218.027 )
							ret := -0.500000
			if( tema > 219.411 )
				if( ema3 <= 219.9 )
					if( ema12 <= 2.74992 )
						if( bearPower <= -0.450493 )
							if( tema <= 220.612 )
								if( ema13 <= 1.44419 )
									ret := -1.000000 // sell
								if( ema13 > 1.44419 )
									ret := -0.500000
							if( tema > 220.612 )
								ret := -1.000000 // sell
						if( bearPower > -0.450493 )
							if( ema1 <= 219.536 )
								if( ema13 <= 1.25861 )
									ret := 0.452381
								if( ema13 > 1.25861 )
									ret := -0.111111
							if( ema1 > 219.536 )
								if( bbp <= 10.1537 )
									ret := -0.317972
								if( bbp > 10.1537 )
									ret := 1.000000 // buy
					if( ema12 > 2.74992 )
						if( ema3 <= 218.331 )
							if( ema12 <= 4.65995 )
								if( ema12 <= 3.14169 )
									ret := -0.809524 // sell
								if( ema12 > 3.14169 )
									ret := -1.000000 // sell
							if( ema12 > 4.65995 )
								ret := -0.250000
						if( ema3 > 218.331 )
							ret := -0.333333
				if( ema3 > 219.9 )
					if( bbm <= 3.40592 )
						if( ema2 <= 220.28 )
							if( ema1 <= 219.927 )
								ret := -0.200000
							if( ema1 > 219.927 )
								if( bullPower <= 0.591171 )
									ret := 0.000000
								if( bullPower > 0.591171 )
									ret := 0.854167 // buy
						if( ema2 > 220.28 )
							if( ema12 <= 3.05754 )
								if( tema <= 274.711 )
									ret := -0.084004
								if( tema > 274.711 )
									ret := -0.412371
							if( ema12 > 3.05754 )
								if( ema1 <= 243.113 )
									ret := -0.125000
								if( ema1 > 243.113 )
									ret := 0.500000
					if( bbm > 3.40592 )
						if( ema1 <= 295.196 )
							if( tema <= 232.634 )
								if( bullPower <= 8.72371 )
									ret := 0.234043
								if( bullPower > 8.72371 )
									ret := -1.000000 // sell
							if( tema > 232.634 )
								if( ema2 <= 240.924 )
									ret := 0.807018 // buy
								if( ema2 > 240.924 )
									ret := 0.385714
						if( ema1 > 295.196 )
							if( bullPower <= 2.87231 )
								ret := -1.000000 // sell
							if( bullPower > 2.87231 )
								ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ETSY_15Min_b1c55dbf(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


