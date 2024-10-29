//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: AAVEUSDT_15Min_1M00_e8865337 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_1M00_e8865337", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_e8865337(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 2790.66 )
		if( Raw_Money_Flow <= 79188 )
			if( Typical_Price <= 80.4511 )
				if( Positive_Money_Flow <= 31865.3 )
					if( Money_Flow_Ratio <= 15.7968 )
						if( Typical_Price <= 63.6967 )
							if( Negative_Money_Flow_Sum <= 233663 )
								if( MFI <= 14.892 )
									ret := 0.600000
								if( MFI > 14.892 )
									ret := 0.066691
							if( Negative_Money_Flow_Sum > 233663 )
								if( Raw_Money_Flow <= 31400.5 )
									ret := -0.062069
								if( Raw_Money_Flow > 31400.5 )
									ret := 0.189394
						if( Typical_Price > 63.6967 )
							if( Money_Flow_Ratio <= 4.79979 )
								if( Negative_Money_Flow_Sum <= 920034 )
									ret := -0.067246
								if( Negative_Money_Flow_Sum > 920034 )
									ret := 0.242268
							if( Money_Flow_Ratio > 4.79979 )
								if( MFI_High <= 11.219 )
									ret := 0.274854
								if( MFI_High > 11.219 )
									ret := -0.166667
					if( Money_Flow_Ratio > 15.7968 )
						if( Typical_Price <= 53.7333 )
							ret := -1.000000 // sell
						if( Typical_Price > 53.7333 )
							if( Typical_Price <= 61.6333 )
								ret := 0.000000
							if( Typical_Price > 61.6333 )
								ret := -0.333333
				if( Positive_Money_Flow > 31865.3 )
					if( Raw_Money_Flow <= 76240.9 )
						if( Positive_Money_Flow_Sum <= 124162 )
							if( MFI_Low <= 16.9828 )
								if( MFI_High <= -57.1585 )
									ret := -0.066667
								if( MFI_High > -57.1585 )
									ret := -0.536082
							if( MFI_Low > 16.9828 )
								if( Money_Flow_Ratio <= 0.634725 )
									ret := 0.272727
								if( Money_Flow_Ratio > 0.634725 )
									ret := -0.102564
						if( Positive_Money_Flow_Sum > 124162 )
							if( Negative_Money_Flow_Sum <= 322529 )
								if( Positive_Money_Flow_Sum <= 596788 )
									ret := 0.065267
								if( Positive_Money_Flow_Sum > 596788 )
									ret := -0.179431
							if( Negative_Money_Flow_Sum > 322529 )
								if( MFI_Low <= 61.6632 )
									ret := 0.117021
								if( MFI_Low > 61.6632 )
									ret := -0.280000
					if( Raw_Money_Flow > 76240.9 )
						if( Typical_Price <= 66.0167 )
							if( Raw_Money_Flow <= 78463.9 )
								if( MFI_Low <= 19.555 )
									ret := -0.190476
								if( MFI_Low > 19.555 )
									ret := 0.473684
							if( Raw_Money_Flow > 78463.9 )
								if( MFI <= 51.9288 )
									ret := -0.066667
								if( MFI > 51.9288 )
									ret := -0.600000
						if( Typical_Price > 66.0167 )
							if( Money_Flow_Ratio <= 0.547751 )
								if( Raw_Money_Flow <= 77190.3 )
									ret := 0.500000
								if( Raw_Money_Flow > 77190.3 )
									ret := -0.529412
							if( Money_Flow_Ratio > 0.547751 )
								if( Negative_Money_Flow_Sum <= 301086 )
									ret := 0.363636
								if( Negative_Money_Flow_Sum > 301086 )
									ret := 0.742857 // buy
			if( Typical_Price > 80.4511 )
				if( Money_Flow_Ratio <= 1.08523 )
					if( Money_Flow_Ratio <= 1.01669 )
						if( Typical_Price <= 112.252 )
							if( Positive_Money_Flow_Sum <= 1.35714e+06 )
								if( Positive_Money_Flow_Sum <= 1.29352e+06 )
									ret := -0.071524
								if( Positive_Money_Flow_Sum > 1.29352e+06 )
									ret := -0.625000
							if( Positive_Money_Flow_Sum > 1.35714e+06 )
								if( Positive_Money_Flow_Sum <= 1.58989e+06 )
									ret := 0.655738
								if( Positive_Money_Flow_Sum > 1.58989e+06 )
									ret := -0.190476
						if( Typical_Price > 112.252 )
							if( Positive_Money_Flow_Sum <= 1.41759e+06 )
								if( Money_Flow_Ratio <= 0.402675 )
									ret := -0.068966
								if( Money_Flow_Ratio > 0.402675 )
									ret := 0.187302
							if( Positive_Money_Flow_Sum > 1.41759e+06 )
								ret := -0.500000
					if( Money_Flow_Ratio > 1.01669 )
						if( Positive_Money_Flow <= 60755.8 )
							if( MFI <= 51.6166 )
								if( Positive_Money_Flow <= 11280.2 )
									ret := 0.050000
								if( Positive_Money_Flow > 11280.2 )
									ret := -0.466667
							if( MFI > 51.6166 )
								if( Positive_Money_Flow <= 53036.8 )
									ret := -0.625000
								if( Positive_Money_Flow > 53036.8 )
									ret := -0.937500 // sell
						if( Positive_Money_Flow > 60755.8 )
							if( Positive_Money_Flow_Sum <= 1.18982e+06 )
								if( Positive_Money_Flow_Sum <= 958717 )
									ret := -0.120000
								if( Positive_Money_Flow_Sum > 958717 )
									ret := -0.941176 // sell
							if( Positive_Money_Flow_Sum > 1.18982e+06 )
								ret := 0.416667
				if( Money_Flow_Ratio > 1.08523 )
					if( Negative_Money_Flow_Sum <= 374922 )
						if( Raw_Money_Flow <= 37124 )
							if( Negative_Money_Flow_Sum <= 243423 )
								if( Positive_Money_Flow_Sum <= 420032 )
									ret := -0.175055
								if( Positive_Money_Flow_Sum > 420032 )
									ret := 0.153846
							if( Negative_Money_Flow_Sum > 243423 )
								if( Positive_Money_Flow <= 8386.25 )
									ret := -0.680000
								if( Positive_Money_Flow > 8386.25 )
									ret := 0.148585
						if( Raw_Money_Flow > 37124 )
							if( Positive_Money_Flow <= 71375.2 )
								if( MFI_Low <= 39.2758 )
									ret := -0.424870
								if( MFI_Low > 39.2758 )
									ret := -0.165808
							if( Positive_Money_Flow > 71375.2 )
								if( MFI_High <= -5.81863 )
									ret := 0.240964
								if( MFI_High > -5.81863 )
									ret := -0.098592
					if( Negative_Money_Flow_Sum > 374922 )
						if( Positive_Money_Flow_Sum <= 658961 )
							if( Raw_Money_Flow <= 48001.9 )
								if( Positive_Money_Flow_Sum <= 609187 )
									ret := 0.242188
								if( Positive_Money_Flow_Sum > 609187 )
									ret := 0.782051 // buy
							if( Raw_Money_Flow > 48001.9 )
								if( MFI_Low <= 35.8497 )
									ret := -0.277778
								if( MFI_Low > 35.8497 )
									ret := 0.426087
						if( Positive_Money_Flow_Sum > 658961 )
							if( MFI <= 79.3533 )
								if( MFI <= 59.9178 )
									ret := 0.142484
								if( MFI > 59.9178 )
									ret := 0.001614
							if( MFI > 79.3533 )
								if( Positive_Money_Flow_Sum <= 1.7086e+06 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 1.7086e+06 )
									ret := 0.100000
		if( Raw_Money_Flow > 79188 )
			if( Negative_Money_Flow_Sum <= 562688 )
				if( Raw_Money_Flow <= 83439.2 )
					if( MFI_High <= 4.5961 )
						if( Typical_Price <= 76.4728 )
							if( MFI <= 80.5811 )
								if( MFI_Low <= 55.5941 )
									ret := -0.010526
								if( MFI_Low > 55.5941 )
									ret := 0.307692
							if( MFI > 80.5811 )
								ret := -0.375000
						if( Typical_Price > 76.4728 )
							if( MFI_High <= -4.269 )
								if( Negative_Money_Flow_Sum <= 525079 )
									ret := -0.206349
								if( Negative_Money_Flow_Sum > 525079 )
									ret := 0.583333
							if( MFI_High > -4.269 )
								if( Raw_Money_Flow <= 82092.7 )
									ret := -0.441176
								if( Raw_Money_Flow > 82092.7 )
									ret := -0.789474 // sell
					if( MFI_High > 4.5961 )
						if( Money_Flow_Ratio <= 9.87878 )
							if( Typical_Price <= 77.6084 )
								ret := 0.500000
							if( Typical_Price > 77.6084 )
								ret := -0.210526
						if( Money_Flow_Ratio > 9.87878 )
							ret := 0.400000
				if( Raw_Money_Flow > 83439.2 )
					if( MFI <= 74.7949 )
						if( Negative_Money_Flow_Sum <= 367340 )
							if( MFI_Low <= 40.1066 )
								if( Positive_Money_Flow <= 102799 )
									ret := 0.046154
								if( Positive_Money_Flow > 102799 )
									ret := 0.565217
							if( MFI_Low > 40.1066 )
								if( MFI_High <= -6.24304 )
									ret := 0.066116
								if( MFI_High > -6.24304 )
									ret := 0.393617
						if( Negative_Money_Flow_Sum > 367340 )
							if( Money_Flow_Ratio <= 1.24838 )
								if( Negative_Money_Flow_Sum <= 435159 )
									ret := -0.451456
								if( Negative_Money_Flow_Sum > 435159 )
									ret := 0.046154
							if( Money_Flow_Ratio > 1.24838 )
								if( Positive_Money_Flow <= 390600 )
									ret := 0.038436
								if( Positive_Money_Flow > 390600 )
									ret := 0.406250
					if( MFI > 74.7949 )
						if( Negative_Money_Flow_Sum <= 120206 )
							if( MFI <= 94.5277 )
								if( Raw_Money_Flow <= 285904 )
									ret := 0.127596
								if( Raw_Money_Flow > 285904 )
									ret := 0.606061
							if( MFI > 94.5277 )
								if( Money_Flow_Ratio <= 23.3069 )
									ret := -0.694444
								if( Money_Flow_Ratio > 23.3069 )
									ret := -0.021277
						if( Negative_Money_Flow_Sum > 120206 )
							if( Positive_Money_Flow_Sum <= 7.0974e+06 )
								if( MFI_Low <= 72.2157 )
									ret := -0.035516
								if( MFI_Low > 72.2157 )
									ret := -0.383721
							if( Positive_Money_Flow_Sum > 7.0974e+06 )
								if( MFI_Low <= 77.7148 )
									ret := 0.761364 // buy
								if( MFI_Low > 77.7148 )
									ret := -0.440000
			if( Negative_Money_Flow_Sum > 562688 )
				if( MFI_Low <= 28.309 )
					if( Negative_Money_Flow_Sum <= 585799 )
						if( Typical_Price <= 95.7233 )
							if( Raw_Money_Flow <= 123941 )
								if( Money_Flow_Ratio <= 0.536211 )
									ret := -0.444444
								if( Money_Flow_Ratio > 0.536211 )
									ret := -0.913793 // sell
							if( Raw_Money_Flow > 123941 )
								ret := -0.250000
						if( Typical_Price > 95.7233 )
							ret := 0.181818
					if( Negative_Money_Flow_Sum > 585799 )
						if( Positive_Money_Flow <= 667188 )
							if( Raw_Money_Flow <= 451098 )
								if( MFI_High <= -31.9809 )
									ret := -0.025461
								if( MFI_High > -31.9809 )
									ret := 0.203822
							if( Raw_Money_Flow > 451098 )
								if( Negative_Money_Flow_Sum <= 3.69372e+06 )
									ret := 0.382514
								if( Negative_Money_Flow_Sum > 3.69372e+06 )
									ret := -0.022541
						if( Positive_Money_Flow > 667188 )
							if( MFI_Low <= 0.916614 )
								if( Negative_Money_Flow_Sum <= 1.55642e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.55642e+07 )
									ret := -0.636364
							if( MFI_Low > 0.916614 )
								if( Money_Flow_Ratio <= 0.333185 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.333185 )
									ret := -0.179443
				if( MFI_Low > 28.309 )
					if( MFI_High <= 6.40519 )
						if( Negative_Money_Flow_Sum <= 6.61655e+06 )
							if( Negative_Money_Flow_Sum <= 1.05591e+06 )
								if( Negative_Money_Flow_Sum <= 1.01957e+06 )
									ret := -0.157309
								if( Negative_Money_Flow_Sum > 1.01957e+06 )
									ret := -0.376623
							if( Negative_Money_Flow_Sum > 1.05591e+06 )
								if( MFI_High <= -25.0354 )
									ret := -0.044632
								if( MFI_High > -25.0354 )
									ret := -0.134026
						if( Negative_Money_Flow_Sum > 6.61655e+06 )
							if( Money_Flow_Ratio <= 1.07883 )
								if( Money_Flow_Ratio <= 1.04424 )
									ret := -0.259259
								if( Money_Flow_Ratio > 1.04424 )
									ret := 0.727273 // buy
							if( Money_Flow_Ratio > 1.07883 )
								if( MFI <= 56.268 )
									ret := -0.823529 // sell
								if( MFI > 56.268 )
									ret := -0.377778
					if( MFI_High > 6.40519 )
						if( Positive_Money_Flow_Sum <= 2.1821e+07 )
							if( Typical_Price <= 121.324 )
								if( Positive_Money_Flow <= 5.63609e+06 )
									ret := -0.098765
								if( Positive_Money_Flow > 5.63609e+06 )
									ret := 0.888889 // buy
							if( Typical_Price > 121.324 )
								if( MFI_Low <= 72.8341 )
									ret := 0.671756
								if( MFI_Low > 72.8341 )
									ret := -0.611111
						if( Positive_Money_Flow_Sum > 2.1821e+07 )
							if( MFI_High <= 15.1452 )
								if( Negative_Money_Flow_Sum <= 2.19072e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.19072e+06 )
									ret := 0.900000 // buy
							if( MFI_High > 15.1452 )
								ret := 0.333333
	if( Negative_Money_Flow > 2790.66 )
		if( MFI_High <= -42.4114 )
			if( Positive_Money_Flow_Sum <= 758786 )
				if( Typical_Price <= 100.529 )
					if( Positive_Money_Flow <= 8167.46 )
						if( Negative_Money_Flow_Sum <= 505744 )
							if( Negative_Money_Flow <= 192925 )
								if( Typical_Price <= 78.6355 )
									ret := 0.013643
								if( Typical_Price > 78.6355 )
									ret := -0.218117
							if( Negative_Money_Flow > 192925 )
								if( Negative_Money_Flow <= 208326 )
									ret := -0.958333 // sell
								if( Negative_Money_Flow > 208326 )
									ret := -0.145833
						if( Negative_Money_Flow_Sum > 505744 )
							if( MFI <= 25.339 )
								if( Positive_Money_Flow_Sum <= 179437 )
									ret := 0.169846
								if( Positive_Money_Flow_Sum > 179437 )
									ret := 0.001208
							if( MFI > 25.339 )
								if( Positive_Money_Flow <= 3896.18 )
									ret := 0.140869
								if( Positive_Money_Flow > 3896.18 )
									ret := -0.636364
					if( Positive_Money_Flow > 8167.46 )
						if( Positive_Money_Flow_Sum <= 177515 )
							if( Positive_Money_Flow <= 15876 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 15876 )
								if( Negative_Money_Flow_Sum <= 1.22237e+06 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 1.22237e+06 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 177515 )
							if( Typical_Price <= 77.1111 )
								if( Raw_Money_Flow <= 33037 )
									ret := 0.437500
								if( Raw_Money_Flow > 33037 )
									ret := 1.000000 // buy
							if( Typical_Price > 77.1111 )
								if( Negative_Money_Flow_Sum <= 2.85327e+06 )
									ret := -0.070866
								if( Negative_Money_Flow_Sum > 2.85327e+06 )
									ret := 0.612903
				if( Typical_Price > 100.529 )
					if( Money_Flow_Ratio <= 0.131995 )
						if( Negative_Money_Flow_Sum <= 5.16032e+06 )
							if( Negative_Money_Flow_Sum <= 3.39072e+06 )
								if( Money_Flow_Ratio <= 0.080977 )
									ret := 0.757576 // buy
								if( Money_Flow_Ratio > 0.080977 )
									ret := -0.148148
							if( Negative_Money_Flow_Sum > 3.39072e+06 )
								if( MFI_High <= -68.8993 )
									ret := 0.830508 // buy
								if( MFI_High > -68.8993 )
									ret := 0.363636
						if( Negative_Money_Flow_Sum > 5.16032e+06 )
							if( Positive_Money_Flow_Sum <= 612938 )
								if( MFI_Low <= -12.5701 )
									ret := -0.280000
								if( MFI_Low > -12.5701 )
									ret := 0.483871
							if( Positive_Money_Flow_Sum > 612938 )
								if( Negative_Money_Flow <= 785379 )
									ret := -0.375000
								if( Negative_Money_Flow > 785379 )
									ret := -0.760000 // sell
					if( Money_Flow_Ratio > 0.131995 )
						if( MFI <= 13.594 )
							if( Typical_Price <= 129.357 )
								if( Raw_Money_Flow <= 156902 )
									ret := -0.120000
								if( Raw_Money_Flow > 156902 )
									ret := -0.741379 // sell
							if( Typical_Price > 129.357 )
								if( Negative_Money_Flow_Sum <= 4.37745e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 4.37745e+06 )
									ret := -0.692308
						if( MFI > 13.594 )
							if( Negative_Money_Flow <= 41493.5 )
								if( Negative_Money_Flow <= 35971.8 )
									ret := 0.114504
								if( Negative_Money_Flow > 35971.8 )
									ret := 0.612903
							if( Negative_Money_Flow > 41493.5 )
								if( Raw_Money_Flow <= 345495 )
									ret := -0.127563
								if( Raw_Money_Flow > 345495 )
									ret := 0.147321
			if( Positive_Money_Flow_Sum > 758786 )
				if( Negative_Money_Flow_Sum <= 4.57753e+06 )
					if( Raw_Money_Flow <= 92649.6 )
						if( Negative_Money_Flow_Sum <= 1.75821e+06 )
							if( Negative_Money_Flow <= 65184.3 )
								if( Positive_Money_Flow_Sum <= 931753 )
									ret := -0.285714
								if( Positive_Money_Flow_Sum > 931753 )
									ret := 0.666667
							if( Negative_Money_Flow > 65184.3 )
								if( MFI_High <= -43.7463 )
									ret := 0.625000
								if( MFI_High > -43.7463 )
									ret := -0.400000
						if( Negative_Money_Flow_Sum > 1.75821e+06 )
							if( Positive_Money_Flow_Sum <= 958925 )
								if( Negative_Money_Flow <= 90762.2 )
									ret := -0.542254
								if( Negative_Money_Flow > 90762.2 )
									ret := 0.285714
							if( Positive_Money_Flow_Sum > 958925 )
								if( MFI <= 30.4437 )
									ret := 0.301075
								if( MFI > 30.4437 )
									ret := -0.245161
					if( Raw_Money_Flow > 92649.6 )
						if( Negative_Money_Flow <= 755058 )
							if( MFI_High <= -51.6767 )
								if( MFI_Low <= -3.75197 )
									ret := -0.538462
								if( MFI_Low > -3.75197 )
									ret := 0.408859
							if( MFI_High > -51.6767 )
								if( Typical_Price <= 99.7038 )
									ret := 0.307415
								if( Typical_Price > 99.7038 )
									ret := 0.112511
						if( Negative_Money_Flow > 755058 )
							if( Typical_Price <= 127.415 )
								if( Positive_Money_Flow_Sum <= 1.55267e+06 )
									ret := 0.211382
								if( Positive_Money_Flow_Sum > 1.55267e+06 )
									ret := -0.372093
							if( Typical_Price > 127.415 )
								if( Raw_Money_Flow <= 1.11107e+06 )
									ret := -0.700000 // sell
								if( Raw_Money_Flow > 1.11107e+06 )
									ret := -0.085714
				if( Negative_Money_Flow_Sum > 4.57753e+06 )
					if( Money_Flow_Ratio <= 0.133233 )
						if( Negative_Money_Flow_Sum <= 9.58243e+06 )
							if( Negative_Money_Flow <= 168718 )
								ret := 0.588235
							if( Negative_Money_Flow > 168718 )
								if( Typical_Price <= 103.358 )
									ret := -0.280000
								if( Typical_Price > 103.358 )
									ret := -0.789474 // sell
						if( Negative_Money_Flow_Sum > 9.58243e+06 )
							if( Typical_Price <= 108.592 )
								if( MFI_Low <= -12.0078 )
									ret := -0.555556
								if( MFI_Low > -12.0078 )
									ret := -1.000000 // sell
							if( Typical_Price > 108.592 )
								if( Raw_Money_Flow <= 620824 )
									ret := -0.538462
								if( Raw_Money_Flow > 620824 )
									ret := 0.000000
					if( Money_Flow_Ratio > 0.133233 )
						if( MFI <= 31.7856 )
							if( Negative_Money_Flow_Sum <= 1.25793e+07 )
								if( Positive_Money_Flow_Sum <= 1.68235e+06 )
									ret := 0.032864
								if( Positive_Money_Flow_Sum > 1.68235e+06 )
									ret := 0.242424
							if( Negative_Money_Flow_Sum > 1.25793e+07 )
								if( Typical_Price <= 103.233 )
									ret := 0.324324
								if( Typical_Price > 103.233 )
									ret := -0.611940
						if( MFI > 31.7856 )
							if( Negative_Money_Flow_Sum <= 1.16974e+07 )
								if( MFI_High <= -44.6186 )
									ret := -0.485149
								if( MFI_High > -44.6186 )
									ret := 0.041958
							if( Negative_Money_Flow_Sum > 1.16974e+07 )
								ret := 1.000000 // buy
		if( MFI_High > -42.4114 )
			if( Positive_Money_Flow_Sum <= 8.07706e+06 )
				if( Negative_Money_Flow_Sum <= 2.41804e+06 )
					if( Typical_Price <= 117.368 )
						if( MFI_Low <= 62.8706 )
							if( Positive_Money_Flow_Sum <= 416534 )
								if( MFI_Low <= 23.964 )
									ret := -0.073435
								if( MFI_Low > 23.964 )
									ret := 0.014387
							if( Positive_Money_Flow_Sum > 416534 )
								if( Negative_Money_Flow_Sum <= 1.00065e+06 )
									ret := 0.052901
								if( Negative_Money_Flow_Sum > 1.00065e+06 )
									ret := 0.127851
						if( MFI_Low > 62.8706 )
							if( Negative_Money_Flow_Sum <= 342915 )
								if( MFI_High <= 7.45 )
									ret := -0.150895
								if( MFI_High > 7.45 )
									ret := 0.141361
							if( Negative_Money_Flow_Sum > 342915 )
								if( Negative_Money_Flow_Sum <= 586209 )
									ret := -0.404412
								if( Negative_Money_Flow_Sum > 586209 )
									ret := 0.087302
					if( Typical_Price > 117.368 )
						if( Raw_Money_Flow <= 411755 )
							if( MFI_High <= 14.9414 )
								if( MFI_Low <= 66.0363 )
									ret := -0.044061
								if( MFI_Low > 66.0363 )
									ret := 0.666667
							if( MFI_High > 14.9414 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 411755 )
							if( MFI <= 60.9536 )
								if( Negative_Money_Flow_Sum <= 1.97878e+06 )
									ret := -0.722628 // sell
								if( Negative_Money_Flow_Sum > 1.97878e+06 )
									ret := -0.151899
							if( MFI > 60.9536 )
								if( Typical_Price <= 132.799 )
									ret := -0.253731
								if( Typical_Price > 132.799 )
									ret := 0.385965
				if( Negative_Money_Flow_Sum > 2.41804e+06 )
					if( Positive_Money_Flow_Sum <= 3.29143e+06 )
						if( Raw_Money_Flow <= 185985 )
							if( MFI <= 43.2636 )
								if( MFI_Low <= 18.9899 )
									ret := -0.295455
								if( MFI_Low > 18.9899 )
									ret := -0.662420
							if( MFI > 43.2636 )
								if( MFI_Low <= 33.0267 )
									ret := -0.170213
								if( MFI_Low > 33.0267 )
									ret := -0.862069 // sell
						if( Raw_Money_Flow > 185985 )
							if( MFI_High <= -40.7919 )
								if( Raw_Money_Flow <= 705346 )
									ret := 0.370558
								if( Raw_Money_Flow > 705346 )
									ret := -0.685714
							if( MFI_High > -40.7919 )
								if( MFI_High <= -30.6703 )
									ret := -0.112371
								if( MFI_High > -30.6703 )
									ret := -0.373541
					if( Positive_Money_Flow_Sum > 3.29143e+06 )
						if( Money_Flow_Ratio <= 1.03937 )
							if( Positive_Money_Flow_Sum <= 5.58167e+06 )
								if( Typical_Price <= 108.634 )
									ret := 0.283019
								if( Typical_Price > 108.634 )
									ret := -0.098361
							if( Positive_Money_Flow_Sum > 5.58167e+06 )
								if( MFI <= 49.0386 )
									ret := 0.686869
								if( MFI > 49.0386 )
									ret := 0.342857
						if( Money_Flow_Ratio > 1.03937 )
							if( Positive_Money_Flow_Sum <= 3.69287e+06 )
								if( Negative_Money_Flow_Sum <= 2.60843e+06 )
									ret := 0.659091
								if( Negative_Money_Flow_Sum > 2.60843e+06 )
									ret := 0.124138
							if( Positive_Money_Flow_Sum > 3.69287e+06 )
								if( MFI_High <= -26.7135 )
									ret := -0.415584
								if( MFI_High > -26.7135 )
									ret := -0.045566
			if( Positive_Money_Flow_Sum > 8.07706e+06 )
				if( Positive_Money_Flow <= 173632 )
					if( Money_Flow_Ratio <= 1.09161 )
						if( Positive_Money_Flow_Sum <= 1.08555e+07 )
							if( Negative_Money_Flow <= 691504 )
								ret := 0.812500 // buy
							if( Negative_Money_Flow > 691504 )
								ret := 0.157895
						if( Positive_Money_Flow_Sum > 1.08555e+07 )
							if( Negative_Money_Flow_Sum <= 1.04916e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.04916e+07 )
								ret := 0.800000 // buy
					if( Money_Flow_Ratio > 1.09161 )
						if( MFI <= 86.4256 )
							if( Negative_Money_Flow_Sum <= 9.66922e+06 )
								if( Typical_Price <= 94.7231 )
									ret := -0.100386
								if( Typical_Price > 94.7231 )
									ret := -0.408740
							if( Negative_Money_Flow_Sum > 9.66922e+06 )
								if( MFI_Low <= 38.9229 )
									ret := 0.529412
								if( MFI_Low > 38.9229 )
									ret := 0.928571 // buy
						if( MFI > 86.4256 )
							if( Negative_Money_Flow_Sum <= 1.14558e+06 )
								if( MFI_Low <= 74.0115 )
									ret := -0.892857 // sell
								if( MFI_Low > 74.0115 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.14558e+06 )
								if( Money_Flow_Ratio <= 10.3688 )
									ret := 0.687500
								if( Money_Flow_Ratio > 10.3688 )
									ret := -0.250000
				if( Positive_Money_Flow > 173632 )
					if( Positive_Money_Flow_Sum <= 2.36632e+07 )
						if( Money_Flow_Ratio <= 5.94784 )
							if( MFI_High <= -7.63705 )
								if( Positive_Money_Flow_Sum <= 1.47843e+07 )
									ret := 0.695652
								if( Positive_Money_Flow_Sum > 1.47843e+07 )
									ret := 0.000000
							if( MFI_High > -7.63705 )
								if( MFI <= 74.7905 )
									ret := -1.000000 // sell
								if( MFI > 74.7905 )
									ret := 0.200000
						if( Money_Flow_Ratio > 5.94784 )
							if( Negative_Money_Flow <= 170133 )
								ret := 0.473684
							if( Negative_Money_Flow > 170133 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.36632e+07 )
						ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_AAVEUSDT_15Min_e8865337(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


