//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ETHUSDT_5Min_2MS0_8be1eb77 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_2MS0_8be1eb77", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_8be1eb77(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.04495e+08 )
		if( rsi1 <= 55.274 )
			if( Negative_Money_Flow <= 4.16333e+06 )
				if( Typical_Price <= 2419.02 )
					if( Raw_Money_Flow <= 4.27326e+06 )
						if( Typical_Price <= 1740.54 )
							if( Negative_Money_Flow_Sum <= 8.09266e+07 )
								if( Typical_Price <= 1674.39 )
									ret := 0.015761
								if( Typical_Price > 1674.39 )
									ret := -0.087395
							if( Negative_Money_Flow_Sum > 8.09266e+07 )
								if( Positive_Money_Flow_Sum <= 2.63521e+07 )
									ret := -0.083333
								if( Positive_Money_Flow_Sum > 2.63521e+07 )
									ret := 0.892857 // buy
						if( Typical_Price > 1740.54 )
							if( Positive_Money_Flow_Sum <= 4.87374e+06 )
								if( Typical_Price <= 2180.48 )
									ret := 0.020933
								if( Typical_Price > 2180.48 )
									ret := -0.079216
							if( Positive_Money_Flow_Sum > 4.87374e+06 )
								if( Positive_Money_Flow_Sum <= 2.05512e+07 )
									ret := 0.068193
								if( Positive_Money_Flow_Sum > 2.05512e+07 )
									ret := -0.010060
					if( Raw_Money_Flow > 4.27326e+06 )
						if( Positive_Money_Flow_Sum <= 1.01811e+07 )
							if( Negative_Money_Flow_Sum <= 2.32913e+07 )
								if( Negative_Money_Flow_Sum <= 2.07309e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.07309e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.32913e+07 )
								if( Positive_Money_Flow <= 4.73574e+06 )
									ret := 0.142857
								if( Positive_Money_Flow > 4.73574e+06 )
									ret := 0.777778 // buy
						if( Positive_Money_Flow_Sum > 1.01811e+07 )
							if( rsi1 <= 47.5917 )
								if( Positive_Money_Flow_Sum <= 3.217e+07 )
									ret := -0.090535
								if( Positive_Money_Flow_Sum > 3.217e+07 )
									ret := -0.310345
							if( rsi1 > 47.5917 )
								if( Raw_Money_Flow <= 4.79838e+06 )
									ret := -0.350877
								if( Raw_Money_Flow > 4.79838e+06 )
									ret := 0.172566
				if( Typical_Price > 2419.02 )
					if( Typical_Price <= 3145.24 )
						if( Negative_Money_Flow_Sum <= 6.91156e+06 )
							if( Positive_Money_Flow_Sum <= 1.47607e+07 )
								if( Positive_Money_Flow_Sum <= 8.38977e+06 )
									ret := -0.022053
								if( Positive_Money_Flow_Sum > 8.38977e+06 )
									ret := -0.143564
							if( Positive_Money_Flow_Sum > 1.47607e+07 )
								if( Positive_Money_Flow_Sum <= 1.49337e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.49337e+07 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 6.91156e+06 )
							if( Negative_Money_Flow_Sum <= 3.31168e+07 )
								if( Negative_Money_Flow_Sum <= 1.3185e+07 )
									ret := 0.057569
								if( Negative_Money_Flow_Sum > 1.3185e+07 )
									ret := 0.144595
							if( Negative_Money_Flow_Sum > 3.31168e+07 )
								if( rsi1 <= 30.9401 )
									ret := 0.155160
								if( rsi1 > 30.9401 )
									ret := -0.009413
					if( Typical_Price > 3145.24 )
						if( Positive_Money_Flow_Sum <= 6.2389e+07 )
							if( Money_Flow_Ratio <= 0.270787 )
								if( MFI_Low <= -6.39443 )
									ret := 0.187879
								if( MFI_Low > -6.39443 )
									ret := -0.126246
							if( Money_Flow_Ratio > 0.270787 )
								if( Negative_Money_Flow_Sum <= 8.86487e+07 )
									ret := 0.031708
								if( Negative_Money_Flow_Sum > 8.86487e+07 )
									ret := 0.241379
						if( Positive_Money_Flow_Sum > 6.2389e+07 )
							if( MFI_High <= -25.466 )
								if( d <= 34.8711 )
									ret := 0.622093
								if( d > 34.8711 )
									ret := 0.211823
							if( MFI_High > -25.466 )
								if( Positive_Money_Flow <= 1.34495e+07 )
									ret := 0.133065
								if( Positive_Money_Flow > 1.34495e+07 )
									ret := -0.606061
			if( Negative_Money_Flow > 4.16333e+06 )
				if( rsi1 <= 31.7138 )
					if( smoothK_k <= 7.071 )
						if( rsi1 <= 22.5837 )
							if( Positive_Money_Flow_Sum <= 8.59251e+06 )
								if( Negative_Money_Flow_Sum <= 2.21092e+07 )
									ret := 0.483516
								if( Negative_Money_Flow_Sum > 2.21092e+07 )
									ret := 0.083333
							if( Positive_Money_Flow_Sum > 8.59251e+06 )
								if( Negative_Money_Flow_Sum <= 6.88415e+07 )
									ret := 0.428184
								if( Negative_Money_Flow_Sum > 6.88415e+07 )
									ret := 0.113139
						if( rsi1 > 22.5837 )
							if( MFI_High <= -57.8431 )
								if( Typical_Price <= 3116.35 )
									ret := -0.020619
								if( Typical_Price > 3116.35 )
									ret := -0.387978
							if( MFI_High > -57.8431 )
								if( Typical_Price <= 3860.9 )
									ret := 0.137203
								if( Typical_Price > 3860.9 )
									ret := -0.571429
					if( smoothK_k > 7.071 )
						if( Negative_Money_Flow_Sum <= 9.6795e+07 )
							if( MFI_Low <= -10.4673 )
								if( MFI <= 6.73435 )
									ret := 0.705882 // buy
								if( MFI > 6.73435 )
									ret := -0.250000
							if( MFI_Low > -10.4673 )
								if( MFI <= 36.8714 )
									ret := 0.283681
								if( MFI > 36.8714 )
									ret := 0.557047
						if( Negative_Money_Flow_Sum > 9.6795e+07 )
							if( Negative_Money_Flow <= 1.25769e+07 )
								if( smoothD_d <= 15.2661 )
									ret := 0.190476
								if( smoothD_d > 15.2661 )
									ret := -0.678571
							if( Negative_Money_Flow > 1.25769e+07 )
								if( rsi1 <= 17.5873 )
									ret := -0.600000
								if( rsi1 > 17.5873 )
									ret := 0.538462
				if( rsi1 > 31.7138 )
					if( Money_Flow_Ratio <= 0.57005 )
						if( d <= 22.9473 )
							if( Typical_Price <= 2902.83 )
								if( smoothK_k <= 24.1992 )
									ret := -0.024793
								if( smoothK_k > 24.1992 )
									ret := 0.611111
							if( Typical_Price > 2902.83 )
								if( Negative_Money_Flow_Sum <= 4.81858e+07 )
									ret := -0.032710
								if( Negative_Money_Flow_Sum > 4.81858e+07 )
									ret := -0.479100
						if( d > 22.9473 )
							if( smoothK_k <= 58.9053 )
								if( Negative_Money_Flow_Sum <= 4.70566e+07 )
									ret := 0.125984
								if( Negative_Money_Flow_Sum > 4.70566e+07 )
									ret := -0.118299
							if( smoothK_k > 58.9053 )
								if( d_k <= -22.4894 )
									ret := -0.750000 // sell
								if( d_k > -22.4894 )
									ret := 0.254854
					if( Money_Flow_Ratio > 0.57005 )
						if( Negative_Money_Flow_Sum <= 7.15728e+07 )
							if( Positive_Money_Flow_Sum <= 2.69481e+07 )
								if( Negative_Money_Flow_Sum <= 4.07472e+07 )
									ret := 0.167719
								if( Negative_Money_Flow_Sum > 4.07472e+07 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 2.69481e+07 )
								if( MFI_Low <= 35.2124 )
									ret := 0.004598
								if( MFI_Low > 35.2124 )
									ret := 0.178532
						if( Negative_Money_Flow_Sum > 7.15728e+07 )
							if( Negative_Money_Flow_Sum <= 8.18566e+07 )
								if( Negative_Money_Flow <= 9.75563e+06 )
									ret := 0.231959
								if( Negative_Money_Flow > 9.75563e+06 )
									ret := 0.708571 // buy
							if( Negative_Money_Flow_Sum > 8.18566e+07 )
								if( d <= 76.6046 )
									ret := 0.041009
								if( d > 76.6046 )
									ret := 0.595238
		if( rsi1 > 55.274 )
			if( Negative_Money_Flow_Sum <= 3.56698e+07 )
				if( Positive_Money_Flow <= 4.43732e+07 )
					if( Negative_Money_Flow_Sum <= 4.6353e+06 )
						if( Positive_Money_Flow_Sum <= 7.60917e+07 )
							if( Positive_Money_Flow_Sum <= 6.56786e+07 )
								if( Typical_Price <= 1907.54 )
									ret := 0.030534
								if( Typical_Price > 1907.54 )
									ret := 0.107375
							if( Positive_Money_Flow_Sum > 6.56786e+07 )
								if( Positive_Money_Flow <= 1.03896e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.03896e+07 )
									ret := -0.214286
						if( Positive_Money_Flow_Sum > 7.60917e+07 )
							if( k <= 97.7673 )
								if( d_k <= -1.24156 )
									ret := -0.400000
								if( d_k > -1.24156 )
									ret := 0.823529 // buy
							if( k > 97.7673 )
								if( smoothK_k <= 96.9223 )
									ret := -0.538462
								if( smoothK_k > 96.9223 )
									ret := 0.411765
					if( Negative_Money_Flow_Sum > 4.6353e+06 )
						if( Positive_Money_Flow <= 2.84361e+06 )
							if( Typical_Price <= 2119.72 )
								if( Positive_Money_Flow_Sum <= 4.36623e+07 )
									ret := -0.039186
								if( Positive_Money_Flow_Sum > 4.36623e+07 )
									ret := 0.180180
							if( Typical_Price > 2119.72 )
								if( Positive_Money_Flow_Sum <= 1.12572e+07 )
									ret := -0.046643
								if( Positive_Money_Flow_Sum > 1.12572e+07 )
									ret := 0.053277
						if( Positive_Money_Flow > 2.84361e+06 )
							if( Money_Flow_Ratio <= 14.5174 )
								if( rsi1 <= 73.3942 )
									ret := -0.003917
								if( rsi1 > 73.3942 )
									ret := -0.086957
							if( Money_Flow_Ratio > 14.5174 )
								if( Typical_Price <= 2198.83 )
									ret := -0.875000 // sell
								if( Typical_Price > 2198.83 )
									ret := 0.503597
				if( Positive_Money_Flow > 4.43732e+07 )
					if( MFI_Low <= 66.2193 )
						if( d_k <= -14.888 )
							ret := -1.000000 // sell
						if( d_k > -14.888 )
							ret := 0.000000
					if( MFI_Low > 66.2193 )
						if( Money_Flow_Ratio <= 30.0264 )
							if( k <= 99.66 )
								ret := 1.000000 // buy
							if( k > 99.66 )
								ret := 0.750000 // buy
						if( Money_Flow_Ratio > 30.0264 )
							if( Positive_Money_Flow_Sum <= 2.96098e+08 )
								ret := 0.857143 // buy
							if( Positive_Money_Flow_Sum > 2.96098e+08 )
								ret := -0.750000 // sell
			if( Negative_Money_Flow_Sum > 3.56698e+07 )
				if( Typical_Price <= 2293.95 )
					if( Negative_Money_Flow_Sum <= 4.76428e+07 )
						if( d <= 75.1606 )
							if( rsi1 <= 57.7186 )
								if( d <= 55.1226 )
									ret := 0.076923
								if( d > 55.1226 )
									ret := -0.545455
							if( rsi1 > 57.7186 )
								if( MFI_High <= 2.29976 )
									ret := 0.378947
								if( MFI_High > 2.29976 )
									ret := -0.600000
						if( d > 75.1606 )
							if( Negative_Money_Flow_Sum <= 4.53709e+07 )
								if( rsi1 <= 76.8091 )
									ret := -0.238806
								if( rsi1 > 76.8091 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.53709e+07 )
								if( Raw_Money_Flow <= 3.50027e+06 )
									ret := -0.250000
								if( Raw_Money_Flow > 3.50027e+06 )
									ret := -0.923077 // sell
					if( Negative_Money_Flow_Sum > 4.76428e+07 )
						if( rsi1 <= 69.3972 )
							if( Negative_Money_Flow_Sum <= 7.7737e+07 )
								if( k <= 27.7827 )
									ret := 0.227273
								if( k > 27.7827 )
									ret := 0.747573 // buy
							if( Negative_Money_Flow_Sum > 7.7737e+07 )
								if( Raw_Money_Flow <= 7.95815e+06 )
									ret := -0.875000 // sell
								if( Raw_Money_Flow > 7.95815e+06 )
									ret := 0.800000 // buy
						if( rsi1 > 69.3972 )
							if( Positive_Money_Flow_Sum <= 2.23078e+08 )
								if( Raw_Money_Flow <= 6.5457e+06 )
									ret := 0.285714
								if( Raw_Money_Flow > 6.5457e+06 )
									ret := -0.611111
							if( Positive_Money_Flow_Sum > 2.23078e+08 )
								if( k <= 24.6571 )
									ret := -0.333333
								if( k > 24.6571 )
									ret := 0.875000 // buy
				if( Typical_Price > 2293.95 )
					if( rsi1 <= 85.2 )
						if( Typical_Price <= 3845.43 )
							if( Negative_Money_Flow <= 6.82553e+06 )
								if( Positive_Money_Flow <= 2.31218e+07 )
									ret := -0.134490
								if( Positive_Money_Flow > 2.31218e+07 )
									ret := -0.421053
							if( Negative_Money_Flow > 6.82553e+06 )
								if( rsi1 <= 72.1715 )
									ret := -0.021739
								if( rsi1 > 72.1715 )
									ret := 0.310976
						if( Typical_Price > 3845.43 )
							if( d <= 86.5552 )
								if( MFI <= 58.0862 )
									ret := -0.205882
								if( MFI > 58.0862 )
									ret := -0.597222
							if( d > 86.5552 )
								if( Negative_Money_Flow_Sum <= 3.72385e+07 )
									ret := -0.937500 // sell
								if( Negative_Money_Flow_Sum > 3.72385e+07 )
									ret := 0.190476
					if( rsi1 > 85.2 )
						if( Positive_Money_Flow <= 2.36329e+07 )
							if( MFI <= 74.6773 )
								ret := 0.285714
							if( MFI > 74.6773 )
								if( k <= 84.6074 )
									ret := 0.583333
								if( k > 84.6074 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow > 2.36329e+07 )
							if( smoothK_k <= 60.8835 )
								ret := -1.000000 // sell
							if( smoothK_k > 60.8835 )
								if( d_k <= -0.84869 )
									ret := 0.800000 // buy
								if( d_k > -0.84869 )
									ret := -0.250000
	if( Negative_Money_Flow_Sum > 1.04495e+08 )
		if( MFI <= 30.5731 )
			if( d_k <= 5.51999 )
				if( Typical_Price <= 2234.83 )
					if( Negative_Money_Flow_Sum <= 1.21543e+08 )
						if( rsi1 <= 33.8273 )
							if( MFI <= 9.24332 )
								ret := -0.142857
							if( MFI > 9.24332 )
								if( k <= 67.4866 )
									ret := 0.937500 // buy
								if( k > 67.4866 )
									ret := 0.500000
						if( rsi1 > 33.8273 )
							if( Raw_Money_Flow <= 1.05598e+07 )
								ret := 0.600000
							if( Raw_Money_Flow > 1.05598e+07 )
								if( Typical_Price <= 2144.77 )
									ret := -0.750000 // sell
								if( Typical_Price > 2144.77 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.21543e+08 )
						if( d_k <= -19.0775 )
							ret := -0.750000 // sell
						if( d_k > -19.0775 )
							if( k <= 96.4975 )
								if( Typical_Price <= 1756.84 )
									ret := 0.466667
								if( Typical_Price > 1756.84 )
									ret := 0.945652 // buy
							if( k > 96.4975 )
								ret := 0.400000
				if( Typical_Price > 2234.83 )
					if( rsi1 <= 20.8317 )
						if( k <= 26.8643 )
							if( Negative_Money_Flow_Sum <= 1.28462e+08 )
								if( Negative_Money_Flow_Sum <= 1.22863e+08 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 1.22863e+08 )
									ret := 0.944444 // buy
							if( Negative_Money_Flow_Sum > 1.28462e+08 )
								if( Negative_Money_Flow_Sum <= 2.62727e+08 )
									ret := -0.021480
								if( Negative_Money_Flow_Sum > 2.62727e+08 )
									ret := 0.552632
						if( k > 26.8643 )
							if( d <= 38.2334 )
								if( Positive_Money_Flow_Sum <= 1.92616e+07 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 1.92616e+07 )
									ret := -0.610390
							if( d > 38.2334 )
								if( k <= 61.6026 )
									ret := 0.666667
								if( k > 61.6026 )
									ret := -0.200000
					if( rsi1 > 20.8317 )
						if( Positive_Money_Flow_Sum <= 1.85304e+07 )
							if( Money_Flow_Ratio <= 0.098083 )
								if( Typical_Price <= 3477.88 )
									ret := 1.000000 // buy
								if( Typical_Price > 3477.88 )
									ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.098083 )
								if( k <= 7.11144 )
									ret := 0.272727
								if( k > 7.11144 )
									ret := -0.628571
						if( Positive_Money_Flow_Sum > 1.85304e+07 )
							if( Typical_Price <= 3573.8 )
								if( Negative_Money_Flow_Sum <= 5.42327e+08 )
									ret := 0.389932
								if( Negative_Money_Flow_Sum > 5.42327e+08 )
									ret := -1.000000 // sell
							if( Typical_Price > 3573.8 )
								if( Money_Flow_Ratio <= 0.202948 )
									ret := 0.758621 // buy
								if( Money_Flow_Ratio > 0.202948 )
									ret := 0.062069
			if( d_k > 5.51999 )
				if( Raw_Money_Flow <= 4.35005e+06 )
					if( Typical_Price <= 2353.54 )
						ret := -1.000000 // sell
					if( Typical_Price > 2353.54 )
						ret := -0.500000
				if( Raw_Money_Flow > 4.35005e+06 )
					if( Positive_Money_Flow_Sum <= 3.2422e+07 )
						if( Positive_Money_Flow_Sum <= 3.08816e+07 )
							if( d <= 25.1289 )
								if( k <= 0.64295 )
									ret := 0.750000 // buy
								if( k > 0.64295 )
									ret := 0.083333
							if( d > 25.1289 )
								if( rsi1 <= 31.2269 )
									ret := 0.789474 // buy
								if( rsi1 > 31.2269 )
									ret := -0.125000
						if( Positive_Money_Flow_Sum > 3.08816e+07 )
							if( MFI_High <= -60.8712 )
								ret := 0.000000
							if( MFI_High > -60.8712 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 3.2422e+07 )
						if( Raw_Money_Flow <= 5.31737e+07 )
							if( Typical_Price <= 2650.33 )
								if( smoothD_d <= 19.2424 )
									ret := -0.500000
								if( smoothD_d > 19.2424 )
									ret := 0.680000
							if( Typical_Price > 2650.33 )
								if( Raw_Money_Flow <= 6.79612e+06 )
									ret := -0.285714
								if( Raw_Money_Flow > 6.79612e+06 )
									ret := 0.875740 // buy
						if( Raw_Money_Flow > 5.31737e+07 )
							if( Negative_Money_Flow_Sum <= 2.32276e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.32276e+08 )
								if( MFI <= 14.397 )
									ret := 1.000000 // buy
								if( MFI > 14.397 )
									ret := 0.272727
		if( MFI > 30.5731 )
			if( smoothD_d <= 80.0653 )
				if( MFI_Low <= 28.6832 )
					if( Positive_Money_Flow_Sum <= 2.59095e+08 )
						if( Positive_Money_Flow_Sum <= 1.73795e+08 )
							if( Negative_Money_Flow_Sum <= 1.60155e+08 )
								if( Money_Flow_Ratio <= 0.797069 )
									ret := 0.161137
								if( Money_Flow_Ratio > 0.797069 )
									ret := -0.197368
							if( Negative_Money_Flow_Sum > 1.60155e+08 )
								if( smoothD_d <= 47.7526 )
									ret := -0.503546
								if( smoothD_d > 47.7526 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.73795e+08 )
							if( Raw_Money_Flow <= 4.11511e+07 )
								if( smoothK_k <= 75.1481 )
									ret := 0.850575 // buy
								if( smoothK_k > 75.1481 )
									ret := -0.142857
							if( Raw_Money_Flow > 4.11511e+07 )
								if( Positive_Money_Flow <= 3.02831e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 3.02831e+07 )
									ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 2.59095e+08 )
						if( Positive_Money_Flow_Sum <= 2.5971e+08 )
							ret := -0.500000
						if( Positive_Money_Flow_Sum > 2.5971e+08 )
							ret := -1.000000 // sell
				if( MFI_Low > 28.6832 )
					if( Positive_Money_Flow_Sum <= 3.42456e+08 )
						if( Negative_Money_Flow_Sum <= 1.26736e+08 )
							if( Typical_Price <= 2788.97 )
								if( Negative_Money_Flow_Sum <= 1.2227e+08 )
									ret := -0.119048
								if( Negative_Money_Flow_Sum > 1.2227e+08 )
									ret := -0.730769 // sell
							if( Typical_Price > 2788.97 )
								if( Raw_Money_Flow <= 1.02635e+07 )
									ret := 0.804878 // buy
								if( Raw_Money_Flow > 1.02635e+07 )
									ret := 0.115942
						if( Negative_Money_Flow_Sum > 1.26736e+08 )
							if( Positive_Money_Flow <= 1.89506e+07 )
								if( Positive_Money_Flow_Sum <= 2.2055e+08 )
									ret := 0.604651
								if( Positive_Money_Flow_Sum > 2.2055e+08 )
									ret := 0.938462 // buy
							if( Positive_Money_Flow > 1.89506e+07 )
								if( smoothD_d <= 41.8387 )
									ret := 0.842105 // buy
								if( smoothD_d > 41.8387 )
									ret := -0.236842
					if( Positive_Money_Flow_Sum > 3.42456e+08 )
						if( Typical_Price <= 3498.14 )
							ret := -1.000000 // sell
						if( Typical_Price > 3498.14 )
							if( Positive_Money_Flow_Sum <= 4.57244e+08 )
								if( d_k <= 0.323882 )
									ret := 1.000000 // buy
								if( d_k > 0.323882 )
									ret := -0.571429
							if( Positive_Money_Flow_Sum > 4.57244e+08 )
								if( smoothD_d <= 70.6043 )
									ret := -1.000000 // sell
								if( smoothD_d > 70.6043 )
									ret := 0.285714
			if( smoothD_d > 80.0653 )
				if( Typical_Price <= 2990.31 )
					if( Negative_Money_Flow_Sum <= 1.1243e+08 )
						if( Raw_Money_Flow <= 1.16027e+07 )
							if( smoothK_k <= 90.8862 )
								ret := -1.000000 // sell
							if( smoothK_k > 90.8862 )
								ret := -0.750000 // sell
						if( Raw_Money_Flow > 1.16027e+07 )
							ret := 0.200000
					if( Negative_Money_Flow_Sum > 1.1243e+08 )
						if( Positive_Money_Flow <= 3.04884e+07 )
							if( Positive_Money_Flow_Sum <= 6.73176e+07 )
								if( Positive_Money_Flow_Sum <= 6.36779e+07 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 6.36779e+07 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 6.73176e+07 )
								if( Positive_Money_Flow <= 1.087e+07 )
									ret := 0.631579
								if( Positive_Money_Flow > 1.087e+07 )
									ret := 0.939024 // buy
						if( Positive_Money_Flow > 3.04884e+07 )
							if( Negative_Money_Flow_Sum <= 4.23921e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.23921e+08 )
								ret := -0.500000
				if( Typical_Price > 2990.31 )
					if( d_k <= 1.77684 )
						if( Positive_Money_Flow_Sum <= 9.04331e+07 )
							if( Positive_Money_Flow <= 6.73119e+06 )
								if( MFI_High <= -39.7024 )
									ret := -0.117647
								if( MFI_High > -39.7024 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow > 6.73119e+06 )
								if( Negative_Money_Flow_Sum <= 1.51348e+08 )
									ret := 0.962963 // buy
								if( Negative_Money_Flow_Sum > 1.51348e+08 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 9.04331e+07 )
							if( Raw_Money_Flow <= 1.6849e+07 )
								if( smoothD_d <= 92.0435 )
									ret := -0.519481
								if( smoothD_d > 92.0435 )
									ret := 0.129630
							if( Raw_Money_Flow > 1.6849e+07 )
								if( Negative_Money_Flow_Sum <= 2.35301e+08 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 2.35301e+08 )
									ret := -0.409091
					if( d_k > 1.77684 )
						if( Positive_Money_Flow_Sum <= 1.41984e+08 )
							if( Negative_Money_Flow_Sum <= 1.11545e+08 )
								if( Money_Flow_Ratio <= 0.797701 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.797701 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.11545e+08 )
								if( smoothK_k <= 88.2649 )
									ret := -0.500000
								if( smoothK_k > 88.2649 )
									ret := 0.714286 // buy
						if( Positive_Money_Flow_Sum > 1.41984e+08 )
							if( smoothD_d <= 82.3655 )
								if( Money_Flow_Ratio <= 1.3943 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.3943 )
									ret := -0.250000
							if( smoothD_d > 82.3655 )
								if( smoothD_d <= 93.9515 )
									ret := 1.000000 // buy
								if( smoothD_d > 93.9515 )
									ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ETHUSDT_5Min_8be1eb77(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


