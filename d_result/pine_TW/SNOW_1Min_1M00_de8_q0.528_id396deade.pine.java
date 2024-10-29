//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: SNOW_1Min_1M00_396deade Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1M00_396deade", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_396deade(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI_High <= -42.0744 )
		if( Positive_Money_Flow_Sum <= 263911 )
			if( Negative_Money_Flow_Sum <= 729881 )
				if( Money_Flow_Ratio <= 0.349002 )
					if( MFI_Low <= -2.89141 )
						if( Negative_Money_Flow_Sum <= 703537 )
							if( MFI_High <= -67.9181 )
								if( Typical_Price <= 122.65 )
									ret := 0.666667
								if( Typical_Price > 122.65 )
									ret := 0.250000
							if( MFI_High > -67.9181 )
								if( Negative_Money_Flow <= 44735.2 )
									ret := -0.526316
								if( Negative_Money_Flow > 44735.2 )
									ret := 0.157895
						if( Negative_Money_Flow_Sum > 703537 )
							ret := -1.000000 // sell
					if( MFI_Low > -2.89141 )
						if( Positive_Money_Flow_Sum <= 124229 )
							if( Positive_Money_Flow <= 12162.4 )
								if( Money_Flow_Ratio <= 0.286981 )
									ret := 0.785714 // buy
								if( Money_Flow_Ratio > 0.286981 )
									ret := 0.954545 // buy
							if( Positive_Money_Flow > 12162.4 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 124229 )
							if( Typical_Price <= 147.213 )
								if( Typical_Price <= 139.2 )
									ret := 0.459834
								if( Typical_Price > 139.2 )
									ret := 0.814815 // buy
							if( Typical_Price > 147.213 )
								if( Positive_Money_Flow_Sum <= 207576 )
									ret := -0.416667
								if( Positive_Money_Flow_Sum > 207576 )
									ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.349002 )
					if( Negative_Money_Flow_Sum <= 233798 )
						if( Negative_Money_Flow_Sum <= 176341 )
							ret := 0.083333
						if( Negative_Money_Flow_Sum > 176341 )
							if( Negative_Money_Flow <= 20300.2 )
								if( Typical_Price <= 135.32 )
									ret := 1.000000 // buy
								if( Typical_Price > 135.32 )
									ret := 0.909091 // buy
							if( Negative_Money_Flow > 20300.2 )
								if( Raw_Money_Flow <= 54397.3 )
									ret := 0.636364
								if( Raw_Money_Flow > 54397.3 )
									ret := 0.923077 // buy
					if( Negative_Money_Flow_Sum > 233798 )
						if( Money_Flow_Ratio <= 0.604369 )
							if( Negative_Money_Flow_Sum <= 629058 )
								if( MFI_Low <= 9.60195 )
									ret := -0.076642
								if( MFI_Low > 9.60195 )
									ret := 0.220447
							if( Negative_Money_Flow_Sum > 629058 )
								if( Raw_Money_Flow <= 26796.6 )
									ret := -0.461538
								if( Raw_Money_Flow > 26796.6 )
									ret := 0.811321 // buy
						if( Money_Flow_Ratio > 0.604369 )
							ret := -0.692308
			if( Negative_Money_Flow_Sum > 729881 )
				if( Negative_Money_Flow_Sum <= 886197 )
					if( Positive_Money_Flow_Sum <= 159570 )
						if( Raw_Money_Flow <= 288205 )
							if( MFI <= 14.746 )
								if( Positive_Money_Flow_Sum <= 113559 )
									ret := -0.483871
								if( Positive_Money_Flow_Sum > 113559 )
									ret := -0.269231
							if( MFI > 14.746 )
								ret := -0.833333 // sell
						if( Raw_Money_Flow > 288205 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 159570 )
						if( Raw_Money_Flow <= 79996.1 )
							if( Positive_Money_Flow <= 8141.39 )
								if( Negative_Money_Flow_Sum <= 775033 )
									ret := -0.375000
								if( Negative_Money_Flow_Sum > 775033 )
									ret := 0.576271
							if( Positive_Money_Flow > 8141.39 )
								if( MFI_Low <= 1.63514 )
									ret := 0.210526
								if( MFI_Low > 1.63514 )
									ret := -0.693878
						if( Raw_Money_Flow > 79996.1 )
							if( MFI_Low <= 3.81688 )
								if( Raw_Money_Flow <= 87357.5 )
									ret := -0.789474 // sell
								if( Raw_Money_Flow > 87357.5 )
									ret := -0.355263
							if( MFI_Low > 3.81688 )
								ret := 0.400000
				if( Negative_Money_Flow_Sum > 886197 )
					if( MFI_High <= -79.42 )
						if( Positive_Money_Flow_Sum <= 77625.1 )
							ret := 0.470588
						if( Positive_Money_Flow_Sum > 77625.1 )
							if( Typical_Price <= 127.137 )
								if( Typical_Price <= 114.82 )
									ret := -0.750000 // sell
								if( Typical_Price > 114.82 )
									ret := -0.977273 // sell
							if( Typical_Price > 127.137 )
								ret := -0.285714
					if( MFI_High > -79.42 )
						if( Negative_Money_Flow_Sum <= 931779 )
							if( Typical_Price <= 116.075 )
								ret := -0.500000
							if( Typical_Price > 116.075 )
								if( Raw_Money_Flow <= 42716.5 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 42716.5 )
									ret := 0.607143
						if( Negative_Money_Flow_Sum > 931779 )
							if( Negative_Money_Flow <= 178.652 )
								if( MFI <= 3.4923 )
									ret := 0.500000
								if( MFI > 3.4923 )
									ret := -0.251256
							if( Negative_Money_Flow > 178.652 )
								if( MFI_Low <= -3.73711 )
									ret := 0.131148
								if( MFI_Low > -3.73711 )
									ret := 0.674699
		if( Positive_Money_Flow_Sum > 263911 )
			if( Typical_Price <= 130.46 )
				if( Positive_Money_Flow_Sum <= 3.8874e+06 )
					if( Positive_Money_Flow_Sum <= 2.93589e+06 )
						if( MFI_Low <= -17.8446 )
							if( Negative_Money_Flow_Sum <= 7.87067e+07 )
								if( Negative_Money_Flow_Sum <= 3.57374e+07 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 3.57374e+07 )
									ret := 0.650000
							if( Negative_Money_Flow_Sum > 7.87067e+07 )
								if( Negative_Money_Flow <= 17484.5 )
									ret := -0.368421
								if( Negative_Money_Flow > 17484.5 )
									ret := -0.771429 // sell
						if( MFI_Low > -17.8446 )
							if( Negative_Money_Flow_Sum <= 2.18454e+06 )
								if( Negative_Money_Flow <= 8691.02 )
									ret := -0.150281
								if( Negative_Money_Flow > 8691.02 )
									ret := 0.044622
							if( Negative_Money_Flow_Sum > 2.18454e+06 )
								if( Raw_Money_Flow <= 416680 )
									ret := 0.211748
								if( Raw_Money_Flow > 416680 )
									ret := 0.010597
					if( Positive_Money_Flow_Sum > 2.93589e+06 )
						if( MFI_High <= -48.9482 )
							if( MFI_High <= -59.21 )
								if( Positive_Money_Flow_Sum <= 3.49368e+06 )
									ret := -0.295620
								if( Positive_Money_Flow_Sum > 3.49368e+06 )
									ret := 0.267857
							if( MFI_High > -59.21 )
								if( Negative_Money_Flow_Sum <= 1.08486e+07 )
									ret := -0.038095
								if( Negative_Money_Flow_Sum > 1.08486e+07 )
									ret := 0.288732
						if( MFI_High > -48.9482 )
							if( Typical_Price <= 111.812 )
								if( Positive_Money_Flow <= 109655 )
									ret := 0.250000
								if( Positive_Money_Flow > 109655 )
									ret := -0.519231
							if( Typical_Price > 111.812 )
								if( Negative_Money_Flow_Sum <= 6.81573e+06 )
									ret := -0.189274
								if( Negative_Money_Flow_Sum > 6.81573e+06 )
									ret := -0.585366
				if( Positive_Money_Flow_Sum > 3.8874e+06 )
					if( Positive_Money_Flow <= 933655 )
						if( Money_Flow_Ratio <= 0.581133 )
							if( Positive_Money_Flow <= 686508 )
								if( Typical_Price <= 130.376 )
									ret := 0.175648
								if( Typical_Price > 130.376 )
									ret := 0.681818
							if( Positive_Money_Flow > 686508 )
								if( Money_Flow_Ratio <= 0.509234 )
									ret := 0.162921
								if( Money_Flow_Ratio > 0.509234 )
									ret := 0.778846 // buy
						if( Money_Flow_Ratio > 0.581133 )
							if( Raw_Money_Flow <= 2.20119e+06 )
								if( Negative_Money_Flow <= 1.39683e+06 )
									ret := -0.012048
								if( Negative_Money_Flow > 1.39683e+06 )
									ret := 0.393939
							if( Raw_Money_Flow > 2.20119e+06 )
								if( Negative_Money_Flow_Sum <= 2.13888e+07 )
									ret := 0.127660
								if( Negative_Money_Flow_Sum > 2.13888e+07 )
									ret := -0.773585 // sell
					if( Positive_Money_Flow > 933655 )
						if( Negative_Money_Flow_Sum <= 1.19103e+08 )
							if( Typical_Price <= 130.124 )
								if( Money_Flow_Ratio <= 0.13616 )
									ret := 0.857143 // buy
								if( Money_Flow_Ratio > 0.13616 )
									ret := -0.102685
							if( Typical_Price > 130.124 )
								if( MFI <= 28.6211 )
									ret := 0.785714 // buy
								if( MFI > 28.6211 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.19103e+08 )
							if( MFI_High <= -45.3722 )
								if( Money_Flow_Ratio <= 0.257247 )
									ret := -0.103448
								if( Money_Flow_Ratio > 0.257247 )
									ret := 0.890909 // buy
							if( MFI_High > -45.3722 )
								ret := -0.571429
			if( Typical_Price > 130.46 )
				if( Negative_Money_Flow_Sum <= 4.38457e+08 )
					if( Negative_Money_Flow <= 1894.67 )
						if( Negative_Money_Flow_Sum <= 2.69169e+07 )
							if( MFI_Low <= -2.31032 )
								if( Negative_Money_Flow_Sum <= 3.6785e+06 )
									ret := -0.560000
								if( Negative_Money_Flow_Sum > 3.6785e+06 )
									ret := -0.140496
							if( MFI_Low > -2.31032 )
								if( Positive_Money_Flow <= 15978.8 )
									ret := 0.358333
								if( Positive_Money_Flow > 15978.8 )
									ret := -0.013761
						if( Negative_Money_Flow_Sum > 2.69169e+07 )
							if( MFI_High <= -55.3509 )
								if( Raw_Money_Flow <= 2.43879e+06 )
									ret := -0.229773
								if( Raw_Money_Flow > 2.43879e+06 )
									ret := 0.210084
							if( MFI_High > -55.3509 )
								if( Positive_Money_Flow_Sum <= 4.62339e+07 )
									ret := -0.441667
								if( Positive_Money_Flow_Sum > 4.62339e+07 )
									ret := 0.296296
					if( Negative_Money_Flow > 1894.67 )
						if( Positive_Money_Flow_Sum <= 8.74607e+06 )
							if( Positive_Money_Flow_Sum <= 425138 )
								if( MFI_High <= -46.6004 )
									ret := 0.308585
								if( MFI_High > -46.6004 )
									ret := -0.471698
							if( Positive_Money_Flow_Sum > 425138 )
								if( Negative_Money_Flow_Sum <= 1.00482e+06 )
									ret := -0.645161
								if( Negative_Money_Flow_Sum > 1.00482e+06 )
									ret := -0.058835
						if( Positive_Money_Flow_Sum > 8.74607e+06 )
							if( Typical_Price <= 132.526 )
								if( MFI_High <= -57.6524 )
									ret := -0.484375
								if( MFI_High > -57.6524 )
									ret := 0.200000
							if( Typical_Price > 132.526 )
								if( MFI_High <= -68.5545 )
									ret := -0.451613
								if( MFI_High > -68.5545 )
									ret := 0.249624
				if( Negative_Money_Flow_Sum > 4.38457e+08 )
					ret := 1.000000 // buy
	if( MFI_High > -42.0744 )
		if( Positive_Money_Flow_Sum <= 9.96122e+06 )
			if( Typical_Price <= 170.193 )
				if( MFI_High <= 10.4551 )
					if( Positive_Money_Flow_Sum <= 458583 )
						if( Positive_Money_Flow_Sum <= 165832 )
							if( Negative_Money_Flow_Sum <= 124438 )
								if( Negative_Money_Flow_Sum <= 108329 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 108329 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 124438 )
								if( MFI_High <= -39.6544 )
									ret := 0.195122
								if( MFI_High > -39.6544 )
									ret := -0.616883
						if( Positive_Money_Flow_Sum > 165832 )
							if( Positive_Money_Flow <= 5223.29 )
								if( Positive_Money_Flow_Sum <= 306003 )
									ret := 0.093098
								if( Positive_Money_Flow_Sum > 306003 )
									ret := 0.367925
							if( Positive_Money_Flow > 5223.29 )
								if( Raw_Money_Flow <= 21741.3 )
									ret := -0.329975
								if( Raw_Money_Flow > 21741.3 )
									ret := 0.021698
					if( Positive_Money_Flow_Sum > 458583 )
						if( Positive_Money_Flow_Sum <= 707312 )
							if( Raw_Money_Flow <= 22037.6 )
								if( MFI_High <= -29.9413 )
									ret := -0.260000
								if( MFI_High > -29.9413 )
									ret := -0.579545
							if( Raw_Money_Flow > 22037.6 )
								if( Negative_Money_Flow_Sum <= 835708 )
									ret := -0.082443
								if( Negative_Money_Flow_Sum > 835708 )
									ret := -0.529032
						if( Positive_Money_Flow_Sum > 707312 )
							if( Typical_Price <= 111.675 )
								if( Money_Flow_Ratio <= 0.890546 )
									ret := -0.082397
								if( Money_Flow_Ratio > 0.890546 )
									ret := 0.147239
							if( Typical_Price > 111.675 )
								if( Raw_Money_Flow <= 598954 )
									ret := -0.004553
								if( Raw_Money_Flow > 598954 )
									ret := -0.086340
				if( MFI_High > 10.4551 )
					if( Positive_Money_Flow_Sum <= 6.36296e+06 )
						if( Raw_Money_Flow <= 24247.5 )
							if( Positive_Money_Flow_Sum <= 1.65049e+06 )
								ret := 0.705882 // buy
							if( Positive_Money_Flow_Sum > 1.65049e+06 )
								if( Positive_Money_Flow_Sum <= 4.65014e+06 )
									ret := -0.064516
								if( Positive_Money_Flow_Sum > 4.65014e+06 )
									ret := 0.529412
						if( Raw_Money_Flow > 24247.5 )
							if( MFI_Low <= 74.2747 )
								if( Positive_Money_Flow_Sum <= 5.74851e+06 )
									ret := -0.269608
								if( Positive_Money_Flow_Sum > 5.74851e+06 )
									ret := -0.909091 // sell
							if( MFI_Low > 74.2747 )
								if( Typical_Price <= 127.666 )
									ret := -0.818182 // sell
								if( Typical_Price > 127.666 )
									ret := -0.466667
					if( Positive_Money_Flow_Sum > 6.36296e+06 )
						if( Positive_Money_Flow <= 747515 )
							if( Negative_Money_Flow <= 2871.49 )
								if( Typical_Price <= 129.978 )
									ret := 0.125000
								if( Typical_Price > 129.978 )
									ret := -0.818182 // sell
							if( Negative_Money_Flow > 2871.49 )
								if( Typical_Price <= 137.993 )
									ret := -0.833333 // sell
								if( Typical_Price > 137.993 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 747515 )
							if( Raw_Money_Flow <= 1.09149e+06 )
								if( Typical_Price <= 112.326 )
									ret := 0.818182 // buy
								if( Typical_Price > 112.326 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.09149e+06 )
								if( Negative_Money_Flow_Sum <= 655022 )
									ret := 0.757576 // buy
								if( Negative_Money_Flow_Sum > 655022 )
									ret := -0.435897
			if( Typical_Price > 170.193 )
				if( MFI <= 56.3024 )
					if( Positive_Money_Flow_Sum <= 2.34853e+06 )
						ret := -0.363636
					if( Positive_Money_Flow_Sum > 2.34853e+06 )
						if( Negative_Money_Flow <= 41510.4 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 41510.4 )
							ret := -0.875000 // sell
				if( MFI > 56.3024 )
					if( MFI_Low <= 46.6819 )
						if( MFI_Low <= 39.9178 )
							ret := -0.227273
						if( MFI_Low > 39.9178 )
							ret := 0.090909
					if( MFI_Low > 46.6819 )
						if( Money_Flow_Ratio <= 2.81119 )
							ret := -0.900000 // sell
						if( Money_Flow_Ratio > 2.81119 )
							ret := -0.125000
		if( Positive_Money_Flow_Sum > 9.96122e+06 )
			if( Money_Flow_Ratio <= 0.891829 )
				if( Positive_Money_Flow_Sum <= 7.88436e+07 )
					if( Positive_Money_Flow <= 401584 )
						if( MFI <= 43.6349 )
							if( Positive_Money_Flow_Sum <= 3.82689e+07 )
								if( Raw_Money_Flow <= 3.94389e+06 )
									ret := 0.108802
								if( Raw_Money_Flow > 3.94389e+06 )
									ret := -0.191011
							if( Positive_Money_Flow_Sum > 3.82689e+07 )
								if( Negative_Money_Flow_Sum <= 8.22962e+07 )
									ret := 0.836735 // buy
								if( Negative_Money_Flow_Sum > 8.22962e+07 )
									ret := -0.222222
						if( MFI > 43.6349 )
							if( Negative_Money_Flow <= 5.54045e+06 )
								if( MFI_Low <= 26.5649 )
									ret := 0.338188
								if( MFI_Low > 26.5649 )
									ret := 0.533981
							if( Negative_Money_Flow > 5.54045e+06 )
								if( Positive_Money_Flow_Sum <= 5.92538e+07 )
									ret := -0.202381
								if( Positive_Money_Flow_Sum > 5.92538e+07 )
									ret := 0.866667 // buy
					if( Positive_Money_Flow > 401584 )
						if( Typical_Price <= 134.132 )
							if( Positive_Money_Flow <= 9.1726e+06 )
								if( Negative_Money_Flow_Sum <= 3.68436e+07 )
									ret := 0.157062
								if( Negative_Money_Flow_Sum > 3.68436e+07 )
									ret := -0.425150
							if( Positive_Money_Flow > 9.1726e+06 )
								if( Positive_Money_Flow <= 1.64359e+07 )
									ret := 0.886364 // buy
								if( Positive_Money_Flow > 1.64359e+07 )
									ret := -0.250000
						if( Typical_Price > 134.132 )
							if( Money_Flow_Ratio <= 0.875954 )
								if( Money_Flow_Ratio <= 0.866743 )
									ret := -0.168731
								if( Money_Flow_Ratio > 0.866743 )
									ret := 0.483871
							if( Money_Flow_Ratio > 0.875954 )
								if( MFI_Low <= 26.8168 )
									ret := -0.866667 // sell
								if( MFI_Low > 26.8168 )
									ret := -0.631579
				if( Positive_Money_Flow_Sum > 7.88436e+07 )
					if( Negative_Money_Flow_Sum <= 1.8619e+08 )
						if( Typical_Price <= 127.062 )
							if( MFI <= 39.5243 )
								ret := -1.000000 // sell
							if( MFI > 39.5243 )
								if( Raw_Money_Flow <= 1.6067e+07 )
									ret := -0.380952
								if( Raw_Money_Flow > 1.6067e+07 )
									ret := -0.923077 // sell
						if( Typical_Price > 127.062 )
							ret := 0.181818
					if( Negative_Money_Flow_Sum > 1.8619e+08 )
						ret := -1.000000 // sell
			if( Money_Flow_Ratio > 0.891829 )
				if( Raw_Money_Flow <= 3.47089e+07 )
					if( Money_Flow_Ratio <= 1.22043 )
						if( Positive_Money_Flow_Sum <= 1.10642e+07 )
							if( Positive_Money_Flow <= 1.12742e+06 )
								if( Money_Flow_Ratio <= 0.969154 )
									ret := -0.428571
								if( Money_Flow_Ratio > 0.969154 )
									ret := -0.084906
							if( Positive_Money_Flow > 1.12742e+06 )
								if( MFI_Low <= 30.9271 )
									ret := -0.194030
								if( MFI_Low > 30.9271 )
									ret := -0.595506
						if( Positive_Money_Flow_Sum > 1.10642e+07 )
							if( Negative_Money_Flow_Sum <= 3.40986e+07 )
								if( Money_Flow_Ratio <= 1.10403 )
									ret := 0.025338
								if( Money_Flow_Ratio > 1.10403 )
									ret := -0.092241
							if( Negative_Money_Flow_Sum > 3.40986e+07 )
								if( MFI_High <= -27.6431 )
									ret := -0.372937
								if( MFI_High > -27.6431 )
									ret := -0.013889
					if( Money_Flow_Ratio > 1.22043 )
						if( Raw_Money_Flow <= 328461 )
							if( Positive_Money_Flow <= 1895.89 )
								if( Negative_Money_Flow_Sum <= 2.94805e+06 )
									ret := 0.303571
								if( Negative_Money_Flow_Sum > 2.94805e+06 )
									ret := -0.014124
							if( Positive_Money_Flow > 1895.89 )
								if( Negative_Money_Flow <= 26326.8 )
									ret := -0.212425
								if( Negative_Money_Flow > 26326.8 )
									ret := -0.662338
						if( Raw_Money_Flow > 328461 )
							if( Positive_Money_Flow_Sum <= 2.2788e+08 )
								if( Positive_Money_Flow_Sum <= 8.5561e+07 )
									ret := 0.032456
								if( Positive_Money_Flow_Sum > 8.5561e+07 )
									ret := -0.184725
							if( Positive_Money_Flow_Sum > 2.2788e+08 )
								if( Negative_Money_Flow <= 3.70133e+06 )
									ret := 0.379630
								if( Negative_Money_Flow > 3.70133e+06 )
									ret := 0.928571 // buy
				if( Raw_Money_Flow > 3.47089e+07 )
					if( MFI <= 97.3426 )
						if( Money_Flow_Ratio <= 6.01254 )
							if( MFI_High <= 0.572949 )
								if( MFI_High <= -5.16137 )
									ret := -0.304348
								if( MFI_High > -5.16137 )
									ret := -0.894737 // sell
							if( MFI_High > 0.572949 )
								if( Positive_Money_Flow_Sum <= 1.55149e+08 )
									ret := 0.300000
								if( Positive_Money_Flow_Sum > 1.55149e+08 )
									ret := -0.062500
						if( Money_Flow_Ratio > 6.01254 )
							if( Money_Flow_Ratio <= 25.4644 )
								if( MFI_Low <= 72.503 )
									ret := -0.714286 // sell
								if( MFI_Low > 72.503 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 25.4644 )
								ret := -0.333333
					if( MFI > 97.3426 )
						ret := 0.230769
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_396deade(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


