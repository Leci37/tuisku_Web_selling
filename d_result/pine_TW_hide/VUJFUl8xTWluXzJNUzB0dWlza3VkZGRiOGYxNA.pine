//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: UBER_1Min_2MS0_dddb8f14 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2MS0_dddb8f14", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_dddb8f14(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 54.9703 )
		if( Negative_Money_Flow_Sum <= 3.2652e+06 )
			if( rsi1 <= 47.8479 )
				if( Positive_Money_Flow_Sum <= 537973 )
					if( Negative_Money_Flow <= 452.294 )
						if( Raw_Money_Flow <= 41499.7 )
							if( Negative_Money_Flow_Sum <= 596464 )
								if( MFI <= 63.6196 )
									ret := 0.239583
								if( MFI > 63.6196 )
									ret := -0.094118
							if( Negative_Money_Flow_Sum > 596464 )
								if( Negative_Money_Flow_Sum <= 1.64983e+06 )
									ret := -0.192893
								if( Negative_Money_Flow_Sum > 1.64983e+06 )
									ret := 0.441860
						if( Raw_Money_Flow > 41499.7 )
							if( Positive_Money_Flow_Sum <= 223671 )
								if( MFI <= 18.8343 )
									ret := 0.148936
								if( MFI > 18.8343 )
									ret := 0.711538 // buy
							if( Positive_Money_Flow_Sum > 223671 )
								if( MFI_Low <= 37.4645 )
									ret := 0.334495
								if( MFI_Low > 37.4645 )
									ret := -0.055556
					if( Negative_Money_Flow > 452.294 )
						if( Raw_Money_Flow <= 22678.7 )
							if( smoothK_k <= 66.2616 )
								if( Raw_Money_Flow <= 7183.08 )
									ret := 0.189655
								if( Raw_Money_Flow > 7183.08 )
									ret := 0.655606
							if( smoothK_k > 66.2616 )
								if( rsi1 <= 46.2305 )
									ret := 0.440000
								if( rsi1 > 46.2305 )
									ret := -0.818182 // sell
						if( Raw_Money_Flow > 22678.7 )
							if( rsi1 <= 36.3579 )
								if( MFI_High <= -57.1966 )
									ret := 0.641509
								if( MFI_High > -57.1966 )
									ret := 0.384615
							if( rsi1 > 36.3579 )
								if( Positive_Money_Flow_Sum <= 356893 )
									ret := 0.171591
								if( Positive_Money_Flow_Sum > 356893 )
									ret := 0.414474
				if( Positive_Money_Flow_Sum > 537973 )
					if( Typical_Price <= 62.3003 )
						if( smoothK_k <= 46.4018 )
							if( Positive_Money_Flow_Sum <= 2.75603e+06 )
								if( d_k <= -2.61969 )
									ret := -0.214286
								if( d_k > -2.61969 )
									ret := -0.855072 // sell
							if( Positive_Money_Flow_Sum > 2.75603e+06 )
								if( Negative_Money_Flow <= 4876.87 )
									ret := 0.000000
								if( Negative_Money_Flow > 4876.87 )
									ret := 0.800000 // buy
						if( smoothK_k > 46.4018 )
							if( Positive_Money_Flow_Sum <= 982503 )
								if( MFI <= 66.3444 )
									ret := 0.850000 // buy
								if( MFI > 66.3444 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 982503 )
								if( Negative_Money_Flow_Sum <= 2.16652e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 2.16652e+06 )
									ret := 0.750000 // buy
					if( Typical_Price > 62.3003 )
						if( Typical_Price <= 70.7114 )
							if( Positive_Money_Flow <= 25258.4 )
								if( Raw_Money_Flow <= 74292.7 )
									ret := 0.487239
								if( Raw_Money_Flow > 74292.7 )
									ret := 0.276451
							if( Positive_Money_Flow > 25258.4 )
								if( Positive_Money_Flow <= 70110.7 )
									ret := -0.077586
								if( Positive_Money_Flow > 70110.7 )
									ret := 0.328767
						if( Typical_Price > 70.7114 )
							if( Typical_Price <= 74.6076 )
								if( Negative_Money_Flow_Sum <= 1.09672e+06 )
									ret := -0.198502
								if( Negative_Money_Flow_Sum > 1.09672e+06 )
									ret := 0.169492
							if( Typical_Price > 74.6076 )
								if( Positive_Money_Flow_Sum <= 589727 )
									ret := -0.636364
								if( Positive_Money_Flow_Sum > 589727 )
									ret := 0.455128
			if( rsi1 > 47.8479 )
				if( Positive_Money_Flow <= 310.057 )
					if( smoothK_k <= 6.04132 )
						if( rsi1 <= 53.1414 )
							if( Negative_Money_Flow_Sum <= 64000.1 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 64000.1 )
								if( Negative_Money_Flow_Sum <= 269846 )
									ret := 0.153846
								if( Negative_Money_Flow_Sum > 269846 )
									ret := -0.346154
						if( rsi1 > 53.1414 )
							if( d <= 8.43647 )
								ret := 0.250000
							if( d > 8.43647 )
								ret := 1.000000 // buy
					if( smoothK_k > 6.04132 )
						if( Negative_Money_Flow <= 3308.34 )
							if( Negative_Money_Flow_Sum <= 333778 )
								if( Negative_Money_Flow_Sum <= 151034 )
									ret := -0.092593
								if( Negative_Money_Flow_Sum > 151034 )
									ret := 0.254717
							if( Negative_Money_Flow_Sum > 333778 )
								if( Raw_Money_Flow <= 10014.4 )
									ret := 0.642857
								if( Raw_Money_Flow > 10014.4 )
									ret := -0.211864
						if( Negative_Money_Flow > 3308.34 )
							if( MFI_High <= -31.2814 )
								if( Negative_Money_Flow_Sum <= 1.36479e+06 )
									ret := 0.091549
								if( Negative_Money_Flow_Sum > 1.36479e+06 )
									ret := 0.425000
							if( MFI_High > -31.2814 )
								if( k <= 31.0319 )
									ret := 0.098592
								if( k > 31.0319 )
									ret := 0.378082
				if( Positive_Money_Flow > 310.057 )
					if( d_k <= -0.991417 )
						if( Negative_Money_Flow_Sum <= 162691 )
							if( d_k <= -2.75283 )
								if( Negative_Money_Flow_Sum <= 107093 )
									ret := -0.215686
								if( Negative_Money_Flow_Sum > 107093 )
									ret := 0.250000
							if( d_k > -2.75283 )
								if( Money_Flow_Ratio <= 1.68891 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.68891 )
									ret := 0.523810
						if( Negative_Money_Flow_Sum > 162691 )
							if( Typical_Price <= 77.154 )
								if( Typical_Price <= 59.9053 )
									ret := -0.718750 // sell
								if( Typical_Price > 59.9053 )
									ret := -0.221398
							if( Typical_Price > 77.154 )
								if( MFI_High <= -30.2586 )
									ret := -0.200000
								if( MFI_High > -30.2586 )
									ret := 0.529412
					if( d_k > -0.991417 )
						if( MFI_High <= -29.7754 )
							if( Negative_Money_Flow_Sum <= 606172 )
								if( k <= 45.6714 )
									ret := 0.390909
								if( k > 45.6714 )
									ret := -0.188034
							if( Negative_Money_Flow_Sum > 606172 )
								if( Raw_Money_Flow <= 126293 )
									ret := -0.433566
								if( Raw_Money_Flow > 126293 )
									ret := 0.280000
						if( MFI_High > -29.7754 )
							if( d <= 14.9271 )
								if( Money_Flow_Ratio <= 1.11144 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 1.11144 )
									ret := -0.518519
							if( d > 14.9271 )
								if( Typical_Price <= 67.7192 )
									ret := 0.072464
								if( Typical_Price > 67.7192 )
									ret := 0.334101
		if( Negative_Money_Flow_Sum > 3.2652e+06 )
			if( Positive_Money_Flow_Sum <= 5.10303e+07 )
				if( Money_Flow_Ratio <= 0.871286 )
					if( k <= 86.3709 )
						if( Negative_Money_Flow_Sum <= 2.21458e+07 )
							if( Positive_Money_Flow_Sum <= 1.73608e+07 )
								if( Negative_Money_Flow_Sum <= 1.83394e+07 )
									ret := 0.059738
								if( Negative_Money_Flow_Sum > 1.83394e+07 )
									ret := -0.048578
							if( Positive_Money_Flow_Sum > 1.73608e+07 )
								if( rsi1 <= 31.6359 )
									ret := -0.200000
								if( rsi1 > 31.6359 )
									ret := 0.681818
						if( Negative_Money_Flow_Sum > 2.21458e+07 )
							if( rsi1 <= 36.868 )
								if( Negative_Money_Flow_Sum <= 9.47254e+07 )
									ret := 0.133748
								if( Negative_Money_Flow_Sum > 9.47254e+07 )
									ret := 0.405694
							if( rsi1 > 36.868 )
								if( MFI_Low <= 18.704 )
									ret := -0.010381
								if( MFI_Low > 18.704 )
									ret := 0.162931
					if( k > 86.3709 )
						if( Positive_Money_Flow_Sum <= 1.61848e+07 )
							if( Positive_Money_Flow_Sum <= 1.51367e+07 )
								if( Raw_Money_Flow <= 3.19186e+06 )
									ret := -0.050633
								if( Raw_Money_Flow > 3.19186e+06 )
									ret := -0.409091
							if( Positive_Money_Flow_Sum > 1.51367e+07 )
								if( Negative_Money_Flow_Sum <= 2.08081e+07 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow_Sum > 2.08081e+07 )
									ret := 0.181818
						if( Positive_Money_Flow_Sum > 1.61848e+07 )
							if( Typical_Price <= 68.6504 )
								if( Negative_Money_Flow_Sum <= 3.12491e+07 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 3.12491e+07 )
									ret := 0.243902
							if( Typical_Price > 68.6504 )
								if( Positive_Money_Flow_Sum <= 2.61529e+07 )
									ret := -0.609375
								if( Positive_Money_Flow_Sum > 2.61529e+07 )
									ret := -0.134615
				if( Money_Flow_Ratio > 0.871286 )
					if( rsi1 <= 47.4709 )
						if( Negative_Money_Flow_Sum <= 3.32415e+07 )
							if( Typical_Price <= 61.1183 )
								if( Negative_Money_Flow_Sum <= 2.90334e+07 )
									ret := 0.230769
								if( Negative_Money_Flow_Sum > 2.90334e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 61.1183 )
								if( Negative_Money_Flow <= 7.82108e+06 )
									ret := -0.070072
								if( Negative_Money_Flow > 7.82108e+06 )
									ret := 0.882353 // buy
						if( Negative_Money_Flow_Sum > 3.32415e+07 )
							if( d_k <= -4.54891 )
								if( Raw_Money_Flow <= 3.10349e+06 )
									ret := 0.888889 // buy
								if( Raw_Money_Flow > 3.10349e+06 )
									ret := 0.088235
							if( d_k > -4.54891 )
								if( d <= 26.9642 )
									ret := -0.100000
								if( d > 26.9642 )
									ret := -0.710526 // sell
					if( rsi1 > 47.4709 )
						if( Negative_Money_Flow <= 2.28004e+06 )
							if( Raw_Money_Flow <= 924927 )
								if( smoothD_d <= 77.3208 )
									ret := -0.072134
								if( smoothD_d > 77.3208 )
									ret := 0.135246
							if( Raw_Money_Flow > 924927 )
								if( Positive_Money_Flow <= 5.6431e+06 )
									ret := 0.106696
								if( Positive_Money_Flow > 5.6431e+06 )
									ret := -0.197452
						if( Negative_Money_Flow > 2.28004e+06 )
							if( MFI_Low <= 27.9787 )
								if( smoothK_k <= 62.2662 )
									ret := -0.028571
								if( smoothK_k > 62.2662 )
									ret := -0.548387
							if( MFI_Low > 27.9787 )
								if( Typical_Price <= 63.9135 )
									ret := 0.273973
								if( Typical_Price > 63.9135 )
									ret := -0.092867
			if( Positive_Money_Flow_Sum > 5.10303e+07 )
				if( Positive_Money_Flow_Sum <= 2.19524e+08 )
					if( Negative_Money_Flow_Sum <= 3.65754e+07 )
						if( rsi1 <= 29.5067 )
							if( MFI_High <= 7.9752 )
								ret := 0.571429
							if( MFI_High > 7.9752 )
								if( Typical_Price <= 68.0022 )
									ret := -0.500000
								if( Typical_Price > 68.0022 )
									ret := -1.000000 // sell
						if( rsi1 > 29.5067 )
							if( d <= 92.033 )
								if( d_k <= 19.9141 )
									ret := 0.511057
								if( d_k > 19.9141 )
									ret := -0.153846
							if( d > 92.033 )
								if( Positive_Money_Flow_Sum <= 1.31672e+08 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 1.31672e+08 )
									ret := -0.625000
					if( Negative_Money_Flow_Sum > 3.65754e+07 )
						if( smoothK_k <= 68.2806 )
							if( Negative_Money_Flow_Sum <= 1.69592e+08 )
								if( MFI <= 39.0423 )
									ret := -0.176000
								if( MFI > 39.0423 )
									ret := 0.242938
							if( Negative_Money_Flow_Sum > 1.69592e+08 )
								if( d_k <= -9.09962 )
									ret := -0.333333
								if( d_k > -9.09962 )
									ret := 0.684932
						if( smoothK_k > 68.2806 )
							if( Positive_Money_Flow_Sum <= 7.09321e+07 )
								if( Raw_Money_Flow <= 9.04468e+06 )
									ret := -0.146341
								if( Raw_Money_Flow > 9.04468e+06 )
									ret := 0.590909
							if( Positive_Money_Flow_Sum > 7.09321e+07 )
								if( Positive_Money_Flow_Sum <= 9.81969e+07 )
									ret := -0.756098 // sell
								if( Positive_Money_Flow_Sum > 9.81969e+07 )
									ret := -0.028571
				if( Positive_Money_Flow_Sum > 2.19524e+08 )
					if( d <= 39.5362 )
						if( Negative_Money_Flow <= 22524.7 )
							if( rsi1 <= 35.3476 )
								ret := -1.000000 // sell
							if( rsi1 > 35.3476 )
								if( rsi1 <= 51.4435 )
									ret := 0.222222
								if( rsi1 > 51.4435 )
									ret := -0.500000
						if( Negative_Money_Flow > 22524.7 )
							if( d_k <= -3.38793 )
								ret := -0.333333
							if( d_k > -3.38793 )
								if( k <= 2.6773 )
									ret := -0.777778 // sell
								if( k > 2.6773 )
									ret := -1.000000 // sell
					if( d > 39.5362 )
						if( MFI_High <= 14.339 )
							if( Negative_Money_Flow <= 173321 )
								if( Positive_Money_Flow <= 3.61843e+07 )
									ret := -0.088235
								if( Positive_Money_Flow > 3.61843e+07 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow > 173321 )
								if( Positive_Money_Flow <= 20191.5 )
									ret := 0.230769
								if( Positive_Money_Flow > 20191.5 )
									ret := 1.000000 // buy
						if( MFI_High > 14.339 )
							ret := -0.750000 // sell
	if( rsi1 > 54.9703 )
		if( MFI_High <= -49.6342 )
			if( Positive_Money_Flow_Sum <= 1.21552e+07 )
				if( d <= 73.9432 )
					if( Raw_Money_Flow <= 843826 )
						if( d_k <= 14.8513 )
							if( Negative_Money_Flow_Sum <= 198750 )
								if( Money_Flow_Ratio <= 0.256336 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.256336 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 198750 )
								if( Positive_Money_Flow_Sum <= 208621 )
									ret := -0.173077
								if( Positive_Money_Flow_Sum > 208621 )
									ret := -0.469298
						if( d_k > 14.8513 )
							if( Raw_Money_Flow <= 69130.9 )
								if( Positive_Money_Flow_Sum <= 264844 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 264844 )
									ret := 0.000000
							if( Raw_Money_Flow > 69130.9 )
								if( d <= 52.2212 )
									ret := 1.000000 // buy
								if( d > 52.2212 )
									ret := 0.250000
					if( Raw_Money_Flow > 843826 )
						if( Negative_Money_Flow_Sum <= 1.53621e+07 )
							if( Raw_Money_Flow <= 2.02753e+06 )
								ret := -0.166667
							if( Raw_Money_Flow > 2.02753e+06 )
								if( rsi1 <= 58.5409 )
									ret := 1.000000 // buy
								if( rsi1 > 58.5409 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 1.53621e+07 )
							if( Raw_Money_Flow <= 920161 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 920161 )
								if( Positive_Money_Flow_Sum <= 6.53675e+06 )
									ret := -0.923077 // sell
								if( Positive_Money_Flow_Sum > 6.53675e+06 )
									ret := 0.052632
				if( d > 73.9432 )
					if( Negative_Money_Flow_Sum <= 8.41735e+06 )
						if( Typical_Price <= 69.485 )
							if( Negative_Money_Flow <= 54805.4 )
								if( MFI <= 27.9292 )
									ret := -0.142857
								if( MFI > 27.9292 )
									ret := 0.384615
							if( Negative_Money_Flow > 54805.4 )
								if( Money_Flow_Ratio <= 0.257644 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.257644 )
									ret := -0.900000 // sell
						if( Typical_Price > 69.485 )
							if( Raw_Money_Flow <= 30913.6 )
								if( Negative_Money_Flow_Sum <= 758359 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 758359 )
									ret := 0.125000
							if( Raw_Money_Flow > 30913.6 )
								if( MFI_Low <= 4.56425 )
									ret := 0.370370
								if( MFI_Low > 4.56425 )
									ret := 0.888889 // buy
					if( Negative_Money_Flow_Sum > 8.41735e+06 )
						if( rsi1 <= 63.6426 )
							if( Raw_Money_Flow <= 1.47271e+06 )
								if( MFI <= 0.258536 )
									ret := 0.500000
								if( MFI > 0.258536 )
									ret := -0.212121
							if( Raw_Money_Flow > 1.47271e+06 )
								if( Positive_Money_Flow_Sum <= 7.34128e+06 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow_Sum > 7.34128e+06 )
									ret := 0.000000
						if( rsi1 > 63.6426 )
							if( Negative_Money_Flow_Sum <= 2.1145e+07 )
								if( k <= 85.032 )
									ret := -1.000000 // sell
								if( k > 85.032 )
									ret := -0.625000
							if( Negative_Money_Flow_Sum > 2.1145e+07 )
								if( Positive_Money_Flow_Sum <= 1.84622e+06 )
									ret := -0.083333
								if( Positive_Money_Flow_Sum > 1.84622e+06 )
									ret := -0.500000
			if( Positive_Money_Flow_Sum > 1.21552e+07 )
				if( Positive_Money_Flow_Sum <= 7.47547e+07 )
					if( d <= 77.0216 )
						if( smoothD_d <= 71.6054 )
							if( Positive_Money_Flow_Sum <= 5.17389e+07 )
								if( Positive_Money_Flow_Sum <= 2.68703e+07 )
									ret := -0.818182 // sell
								if( Positive_Money_Flow_Sum > 2.68703e+07 )
									ret := 0.068966
							if( Positive_Money_Flow_Sum > 5.17389e+07 )
								ret := -1.000000 // sell
						if( smoothD_d > 71.6054 )
							ret := 0.428571
					if( d > 77.0216 )
						if( Negative_Money_Flow_Sum <= 6.32684e+07 )
							ret := -0.285714
						if( Negative_Money_Flow_Sum > 6.32684e+07 )
							if( Raw_Money_Flow <= 238259 )
								if( rsi1 <= 56.04 )
									ret := -1.000000 // sell
								if( rsi1 > 56.04 )
									ret := -0.166667
							if( Raw_Money_Flow > 238259 )
								if( MFI <= 11.8789 )
									ret := -0.750000 // sell
								if( MFI > 11.8789 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 7.47547e+07 )
					if( Raw_Money_Flow <= 757444 )
						if( rsi1 <= 81.3662 )
							ret := 1.000000 // buy
						if( rsi1 > 81.3662 )
							ret := 0.600000
					if( Raw_Money_Flow > 757444 )
						if( Positive_Money_Flow <= 3.51682e+06 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 3.51682e+06 )
							ret := -0.500000
		if( MFI_High > -49.6342 )
			if( Money_Flow_Ratio <= 9.5724 )
				if( Raw_Money_Flow <= 73532.6 )
					if( Negative_Money_Flow <= 2.94716 )
						if( Typical_Price <= 74.4321 )
							if( Positive_Money_Flow_Sum <= 530158 )
								if( Positive_Money_Flow <= 641.986 )
									ret := 0.019231
								if( Positive_Money_Flow > 641.986 )
									ret := -0.203883
							if( Positive_Money_Flow_Sum > 530158 )
								if( Positive_Money_Flow_Sum <= 587739 )
									ret := -0.602410
								if( Positive_Money_Flow_Sum > 587739 )
									ret := -0.270035
						if( Typical_Price > 74.4321 )
							if( Positive_Money_Flow_Sum <= 691955 )
								if( rsi1 <= 62.4894 )
									ret := -0.462500
								if( rsi1 > 62.4894 )
									ret := 0.070588
							if( Positive_Money_Flow_Sum > 691955 )
								if( smoothD_d <= 73.1854 )
									ret := 0.432099
								if( smoothD_d > 73.1854 )
									ret := -0.193548
					if( Negative_Money_Flow > 2.94716 )
						if( d_k <= -6.2601 )
							if( Positive_Money_Flow_Sum <= 245502 )
								if( MFI <= 64.0273 )
									ret := 0.452381
								if( MFI > 64.0273 )
									ret := -0.545455
							if( Positive_Money_Flow_Sum > 245502 )
								if( smoothD_d <= 59.695 )
									ret := -0.135593
								if( smoothD_d > 59.695 )
									ret := -0.580952
						if( d_k > -6.2601 )
							if( Negative_Money_Flow_Sum <= 70615.4 )
								if( Negative_Money_Flow_Sum <= 60011.4 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 60011.4 )
									ret := 0.909091 // buy
							if( Negative_Money_Flow_Sum > 70615.4 )
								if( Positive_Money_Flow <= 992.767 )
									ret := 0.149510
								if( Positive_Money_Flow > 992.767 )
									ret := -0.093220
				if( Raw_Money_Flow > 73532.6 )
					if( Negative_Money_Flow <= 4.02604e+06 )
						if( rsi1 <= 64.1362 )
							if( Negative_Money_Flow_Sum <= 1.31189e+06 )
								if( MFI_Low <= 41.0698 )
									ret := 0.064246
								if( MFI_Low > 41.0698 )
									ret := 0.301887
							if( Negative_Money_Flow_Sum > 1.31189e+06 )
								if( k <= 43.2052 )
									ret := -0.034105
								if( k > 43.2052 )
									ret := 0.055971
						if( rsi1 > 64.1362 )
							if( Raw_Money_Flow <= 6.29836e+06 )
								if( Positive_Money_Flow_Sum <= 3.97064e+07 )
									ret := -0.009285
								if( Positive_Money_Flow_Sum > 3.97064e+07 )
									ret := -0.154609
							if( Raw_Money_Flow > 6.29836e+06 )
								if( Positive_Money_Flow <= 2.31241e+07 )
									ret := 0.216389
								if( Positive_Money_Flow > 2.31241e+07 )
									ret := -0.392857
					if( Negative_Money_Flow > 4.02604e+06 )
						if( Money_Flow_Ratio <= 1.01912 )
							if( k <= 79.6431 )
								if( MFI <= 44.4701 )
									ret := 0.440000
								if( MFI > 44.4701 )
									ret := -0.197368
							if( k > 79.6431 )
								if( Positive_Money_Flow_Sum <= 4.7459e+07 )
									ret := -0.261905
								if( Positive_Money_Flow_Sum > 4.7459e+07 )
									ret := -0.863636 // sell
						if( Money_Flow_Ratio > 1.01912 )
							if( MFI_High <= -18.6536 )
								if( k <= 63.9852 )
									ret := 0.588235
								if( k > 63.9852 )
									ret := 0.261905
							if( MFI_High > -18.6536 )
								if( MFI_High <= -12.408 )
									ret := -0.110701
								if( MFI_High > -12.408 )
									ret := 0.224891
			if( Money_Flow_Ratio > 9.5724 )
				if( d <= 44.9724 )
					if( Money_Flow_Ratio <= 105.453 )
						if( Positive_Money_Flow <= 2.44313e+07 )
							if( Negative_Money_Flow_Sum <= 1.73699e+06 )
								if( d_k <= 0.119502 )
									ret := -0.784314 // sell
								if( d_k > 0.119502 )
									ret := -0.222222
							if( Negative_Money_Flow_Sum > 1.73699e+06 )
								if( Positive_Money_Flow_Sum <= 9.62725e+07 )
									ret := 0.095238
								if( Positive_Money_Flow_Sum > 9.62725e+07 )
									ret := -0.576923
						if( Positive_Money_Flow > 2.44313e+07 )
							if( rsi1 <= 70.6232 )
								ret := 0.000000
							if( rsi1 > 70.6232 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 105.453 )
						if( Positive_Money_Flow_Sum <= 1.01563e+08 )
							if( MFI_Low <= 79.4587 )
								ret := 1.000000 // buy
							if( MFI_Low > 79.4587 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 1.01563e+08 )
							ret := -0.250000
				if( d > 44.9724 )
					if( Positive_Money_Flow <= 71760.7 )
						if( Typical_Price <= 75.7898 )
							if( Raw_Money_Flow <= 17167.8 )
								if( Positive_Money_Flow <= 664.326 )
									ret := 0.000000
								if( Positive_Money_Flow > 664.326 )
									ret := -0.571429
							if( Raw_Money_Flow > 17167.8 )
								if( Money_Flow_Ratio <= 16.7283 )
									ret := -0.070423
								if( Money_Flow_Ratio > 16.7283 )
									ret := 0.275641
						if( Typical_Price > 75.7898 )
							if( Money_Flow_Ratio <= 11.9465 )
								ret := 0.000000
							if( Money_Flow_Ratio > 11.9465 )
								if( Positive_Money_Flow_Sum <= 3.81761e+06 )
									ret := 0.916667 // buy
								if( Positive_Money_Flow_Sum > 3.81761e+06 )
									ret := 0.000000
					if( Positive_Money_Flow > 71760.7 )
						if( Typical_Price <= 63.1077 )
							if( Negative_Money_Flow_Sum <= 382378 )
								if( d_k <= -3.23938 )
									ret := -0.250000
								if( d_k > -3.23938 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 382378 )
								ret := -1.000000 // sell
						if( Typical_Price > 63.1077 )
							if( Raw_Money_Flow <= 6.91529e+06 )
								if( d <= 87.2799 )
									ret := 0.060071
								if( d > 87.2799 )
									ret := -0.298113
							if( Raw_Money_Flow > 6.91529e+06 )
								if( rsi1 <= 80.3132 )
									ret := -0.682692
								if( rsi1 > 80.3132 )
									ret := 0.048387
	
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_UBER_1Min_dddb8f14(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


