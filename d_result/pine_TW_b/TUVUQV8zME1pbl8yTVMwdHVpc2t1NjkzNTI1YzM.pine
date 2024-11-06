//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: META_30Min_2MS0_693525c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2MS0_693525c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_693525c3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 8.5002e+07 )
		if( smoothD_d <= 41.4585 )
			if( Negative_Money_Flow <= 2.77355e+07 )
				if( Positive_Money_Flow_Sum <= 3.74931e+06 )
					if( Typical_Price <= 180.582 )
						if( rsi1 <= 28.0542 )
							if( Typical_Price <= 175.512 )
								if( Raw_Money_Flow <= 8.9786e+06 )
									ret := 0.720000 // buy
								if( Raw_Money_Flow > 8.9786e+06 )
									ret := 0.200000
							if( Typical_Price > 175.512 )
								if( d <= 10.1944 )
									ret := -0.750000 // sell
								if( d > 10.1944 )
									ret := -0.500000
						if( rsi1 > 28.0542 )
							if( rsi1 <= 33.1951 )
								if( rsi1 <= 31.3946 )
									ret := -0.269231
								if( rsi1 > 31.3946 )
									ret := -0.900000 // sell
							if( rsi1 > 33.1951 )
								if( rsi1 <= 42.9213 )
									ret := 0.338710
								if( rsi1 > 42.9213 )
									ret := -0.089744
					if( Typical_Price > 180.582 )
						if( Positive_Money_Flow_Sum <= 3.29638e+06 )
							if( d_k <= -10.3831 )
								if( Negative_Money_Flow_Sum <= 1.22185e+07 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.22185e+07 )
									ret := -0.250000
							if( d_k > -10.3831 )
								if( Typical_Price <= 321.592 )
									ret := 0.726190 // buy
								if( Typical_Price > 321.592 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 3.29638e+06 )
							if( Typical_Price <= 212.01 )
								if( Raw_Money_Flow <= 2.07648e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.07648e+06 )
									ret := 0.285714
							if( Typical_Price > 212.01 )
								if( k <= 5.91568 )
									ret := 0.600000
								if( k > 5.91568 )
									ret := -0.727273 // sell
				if( Positive_Money_Flow_Sum > 3.74931e+06 )
					if( Positive_Money_Flow_Sum <= 6.90715e+06 )
						if( Raw_Money_Flow <= 1.5059e+07 )
							if( Raw_Money_Flow <= 3.9363e+06 )
								if( Negative_Money_Flow_Sum <= 2.40329e+06 )
									ret := 0.481481
								if( Negative_Money_Flow_Sum > 2.40329e+06 )
									ret := -0.196203
							if( Raw_Money_Flow > 3.9363e+06 )
								if( d_k <= -2.97991 )
									ret := 0.060000
								if( d_k > -2.97991 )
									ret := -0.611765
						if( Raw_Money_Flow > 1.5059e+07 )
							if( Positive_Money_Flow_Sum <= 5.70034e+06 )
								if( Positive_Money_Flow_Sum <= 4.60592e+06 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 4.60592e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.70034e+06 )
								ret := -0.142857
					if( Positive_Money_Flow_Sum > 6.90715e+06 )
						if( Negative_Money_Flow_Sum <= 1.01212e+07 )
							if( rsi1 <= 56.5852 )
								if( Negative_Money_Flow_Sum <= 5.59297e+06 )
									ret := 0.057692
								if( Negative_Money_Flow_Sum > 5.59297e+06 )
									ret := 0.295389
							if( rsi1 > 56.5852 )
								if( Raw_Money_Flow <= 3.51309e+08 )
									ret := -0.115721
								if( Raw_Money_Flow > 3.51309e+08 )
									ret := 0.360465
						if( Negative_Money_Flow_Sum > 1.01212e+07 )
							if( rsi1 <= 45.5462 )
								if( MFI_Low <= -5.7574 )
									ret := -0.600000
								if( MFI_Low > -5.7574 )
									ret := 0.058658
							if( rsi1 > 45.5462 )
								if( Positive_Money_Flow <= 5.19254e+07 )
									ret := -0.162134
								if( Positive_Money_Flow > 5.19254e+07 )
									ret := 0.075404
			if( Negative_Money_Flow > 2.77355e+07 )
				if( k <= 48.1593 )
					if( Negative_Money_Flow_Sum <= 7.1648e+07 )
						if( d_k <= 11.1042 )
							if( MFI_Low <= 33.9728 )
								if( Negative_Money_Flow_Sum <= 4.71385e+07 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 4.71385e+07 )
									ret := 0.896104 // buy
							if( MFI_Low > 33.9728 )
								ret := -0.250000
						if( d_k > 11.1042 )
							ret := -0.500000
					if( Negative_Money_Flow_Sum > 7.1648e+07 )
						if( Raw_Money_Flow <= 4.15502e+07 )
							if( smoothD_d <= 29.0162 )
								if( Typical_Price <= 191.666 )
									ret := -0.111111
								if( Typical_Price > 191.666 )
									ret := -0.900000 // sell
							if( smoothD_d > 29.0162 )
								ret := 0.166667
						if( Raw_Money_Flow > 4.15502e+07 )
							if( smoothD_d <= 27.4654 )
								if( d <= 7.74445 )
									ret := 0.750000 // buy
								if( d > 7.74445 )
									ret := 1.000000 // buy
							if( smoothD_d > 27.4654 )
								ret := 0.571429
				if( k > 48.1593 )
					ret := -1.000000 // sell
		if( smoothD_d > 41.4585 )
			if( rsi1 <= 47.825 )
				if( smoothD_d <= 77.6201 )
					if( Positive_Money_Flow_Sum <= 3.55748e+06 )
						if( Negative_Money_Flow_Sum <= 6.94239e+06 )
							if( Money_Flow_Ratio <= 0.907975 )
								if( Positive_Money_Flow_Sum <= 2.19328e+06 )
									ret := 0.833333 // buy
								if( Positive_Money_Flow_Sum > 2.19328e+06 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.907975 )
								ret := 0.250000
						if( Negative_Money_Flow_Sum > 6.94239e+06 )
							if( d_k <= 7.55312 )
								if( Money_Flow_Ratio <= 0.328746 )
									ret := 0.038462
								if( Money_Flow_Ratio > 0.328746 )
									ret := -1.000000 // sell
							if( d_k > 7.55312 )
								if( Positive_Money_Flow_Sum <= 2.23634e+06 )
									ret := 0.315789
								if( Positive_Money_Flow_Sum > 2.23634e+06 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.55748e+06 )
						if( Typical_Price <= 111.949 )
							if( Positive_Money_Flow_Sum <= 4.42535e+08 )
								if( k <= 56.1518 )
									ret := -0.500000
								if( k > 56.1518 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.42535e+08 )
								ret := 0.428571
						if( Typical_Price > 111.949 )
							if( Typical_Price <= 334.432 )
								if( Positive_Money_Flow_Sum <= 4.92514e+06 )
									ret := -0.031250
								if( Positive_Money_Flow_Sum > 4.92514e+06 )
									ret := 0.330898
							if( Typical_Price > 334.432 )
								if( Positive_Money_Flow_Sum <= 6.71971e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 6.71971e+06 )
									ret := -0.195876
				if( smoothD_d > 77.6201 )
					if( Money_Flow_Ratio <= 0.337186 )
						if( Money_Flow_Ratio <= 0.17016 )
							ret := 0.285714
						if( Money_Flow_Ratio > 0.17016 )
							if( Negative_Money_Flow_Sum <= 1.66012e+07 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.66012e+07 )
								if( Typical_Price <= 323.708 )
									ret := 1.000000 // buy
								if( Typical_Price > 323.708 )
									ret := 0.750000 // buy
					if( Money_Flow_Ratio > 0.337186 )
						if( d_k <= 10.3439 )
							if( Positive_Money_Flow_Sum <= 7.96275e+06 )
								if( Raw_Money_Flow <= 2.9166e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 2.9166e+06 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 7.96275e+06 )
								if( Typical_Price <= 157.287 )
									ret := 0.822222 // buy
								if( Typical_Price > 157.287 )
									ret := 0.467290
						if( d_k > 10.3439 )
							if( Positive_Money_Flow_Sum <= 2.49285e+07 )
								if( Negative_Money_Flow_Sum <= 3.65835e+07 )
									ret := -0.375000
								if( Negative_Money_Flow_Sum > 3.65835e+07 )
									ret := -0.833333 // sell
							if( Positive_Money_Flow_Sum > 2.49285e+07 )
								if( Negative_Money_Flow_Sum <= 1.88802e+07 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 1.88802e+07 )
									ret := 0.785714 // buy
			if( rsi1 > 47.825 )
				if( Negative_Money_Flow_Sum <= 6.24402e+06 )
					if( Typical_Price <= 168.665 )
						if( rsi1 <= 73.3435 )
							if( rsi1 <= 58.6219 )
								if( Typical_Price <= 141.793 )
									ret := 0.297030
								if( Typical_Price > 141.793 )
									ret := -0.149254
							if( rsi1 > 58.6219 )
								if( Positive_Money_Flow <= 2.92549e+08 )
									ret := -0.305495
								if( Positive_Money_Flow > 2.92549e+08 )
									ret := 0.354839
						if( rsi1 > 73.3435 )
							if( d <= 75.7383 )
								if( Typical_Price <= 153.055 )
									ret := 0.236842
								if( Typical_Price > 153.055 )
									ret := 0.857143 // buy
							if( d > 75.7383 )
								if( Negative_Money_Flow_Sum <= 5.25733e+06 )
									ret := -0.050761
								if( Negative_Money_Flow_Sum > 5.25733e+06 )
									ret := 0.342105
					if( Typical_Price > 168.665 )
						if( d <= 88.6189 )
							if( Typical_Price <= 202.217 )
								if( Positive_Money_Flow_Sum <= 4.68133e+06 )
									ret := -0.263158
								if( Positive_Money_Flow_Sum > 4.68133e+06 )
									ret := 0.376168
							if( Typical_Price > 202.217 )
								if( Raw_Money_Flow <= 2.05615e+08 )
									ret := -0.030612
								if( Raw_Money_Flow > 2.05615e+08 )
									ret := 0.565217
						if( d > 88.6189 )
							if( Positive_Money_Flow <= 9.83609e+08 )
								if( rsi1 <= 66.3282 )
									ret := -0.397590
								if( rsi1 > 66.3282 )
									ret := -0.017857
							if( Positive_Money_Flow > 9.83609e+08 )
								if( Typical_Price <= 276.106 )
									ret := 1.000000 // buy
								if( Typical_Price > 276.106 )
									ret := 0.750000 // buy
				if( Negative_Money_Flow_Sum > 6.24402e+06 )
					if( Negative_Money_Flow_Sum <= 1.29766e+07 )
						if( Raw_Money_Flow <= 6.72214e+06 )
							if( rsi1 <= 54.0644 )
								if( Money_Flow_Ratio <= 0.404826 )
									ret := -0.379310
								if( Money_Flow_Ratio > 0.404826 )
									ret := 0.317992
							if( rsi1 > 54.0644 )
								if( Negative_Money_Flow_Sum <= 1.13651e+07 )
									ret := -0.014823
								if( Negative_Money_Flow_Sum > 1.13651e+07 )
									ret := 0.302817
						if( Raw_Money_Flow > 6.72214e+06 )
							if( Typical_Price <= 221.881 )
								if( Typical_Price <= 168.471 )
									ret := 0.409669
								if( Typical_Price > 168.471 )
									ret := 0.156863
							if( Typical_Price > 221.881 )
								if( Positive_Money_Flow_Sum <= 3.10774e+09 )
									ret := 0.527410
								if( Positive_Money_Flow_Sum > 3.10774e+09 )
									ret := -0.437500
					if( Negative_Money_Flow_Sum > 1.29766e+07 )
						if( Raw_Money_Flow <= 1.56305e+09 )
							if( Negative_Money_Flow_Sum <= 7.14798e+07 )
								if( d_k <= 3.83752 )
									ret := 0.064058
								if( d_k > 3.83752 )
									ret := 0.206695
							if( Negative_Money_Flow_Sum > 7.14798e+07 )
								if( rsi1 <= 86.0553 )
									ret := 0.422642
								if( rsi1 > 86.0553 )
									ret := -0.666667
						if( Raw_Money_Flow > 1.56305e+09 )
							if( Money_Flow_Ratio <= 162.92 )
								if( rsi1 <= 79.2975 )
									ret := -0.896552 // sell
								if( rsi1 > 79.2975 )
									ret := -0.371429
							if( Money_Flow_Ratio > 162.92 )
								ret := 0.600000
	if( Negative_Money_Flow_Sum > 8.5002e+07 )
		if( d_k <= -1.76477 )
			if( Negative_Money_Flow_Sum <= 4.91749e+09 )
				if( Positive_Money_Flow_Sum <= 2.05821e+07 )
					if( Typical_Price <= 324.44 )
						if( Negative_Money_Flow_Sum <= 1.31068e+09 )
							if( Negative_Money_Flow_Sum <= 5.5115e+08 )
								if( d_k <= -7.25786 )
									ret := 0.369369
								if( d_k > -7.25786 )
									ret := 0.006329
							if( Negative_Money_Flow_Sum > 5.5115e+08 )
								if( smoothD_d <= 54.6261 )
									ret := 0.102564
								if( smoothD_d > 54.6261 )
									ret := -0.276423
						if( Negative_Money_Flow_Sum > 1.31068e+09 )
							if( Positive_Money_Flow <= 168453 )
								if( Negative_Money_Flow_Sum <= 2.53598e+09 )
									ret := -0.012500
								if( Negative_Money_Flow_Sum > 2.53598e+09 )
									ret := 0.451613
							if( Positive_Money_Flow > 168453 )
								if( rsi1 <= 57.2399 )
									ret := 0.655462
								if( rsi1 > 57.2399 )
									ret := -0.400000
					if( Typical_Price > 324.44 )
						if( Positive_Money_Flow <= 3.32278e+06 )
							if( Negative_Money_Flow_Sum <= 4.86526e+08 )
								if( smoothK_k <= 61.9134 )
									ret := 0.714286 // buy
								if( smoothK_k > 61.9134 )
									ret := -0.142857
							if( Negative_Money_Flow_Sum > 4.86526e+08 )
								if( Negative_Money_Flow <= 294894 )
									ret := 0.089286
								if( Negative_Money_Flow > 294894 )
									ret := -0.322581
						if( Positive_Money_Flow > 3.32278e+06 )
							if( Negative_Money_Flow <= 9424.7 )
								if( Typical_Price <= 352.707 )
									ret := -0.833333 // sell
								if( Typical_Price > 352.707 )
									ret := 0.000000
							if( Negative_Money_Flow > 9424.7 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 2.05821e+07 )
					if( rsi1 <= 48.529 )
						if( Money_Flow_Ratio <= 1.29647 )
							if( Negative_Money_Flow_Sum <= 3.7707e+08 )
								if( Negative_Money_Flow <= 4.77133e+07 )
									ret := -0.011628
								if( Negative_Money_Flow > 4.77133e+07 )
									ret := -0.794872 // sell
							if( Negative_Money_Flow_Sum > 3.7707e+08 )
								if( Negative_Money_Flow <= 1.67415e+08 )
									ret := 0.037855
								if( Negative_Money_Flow > 1.67415e+08 )
									ret := -0.079216
						if( Money_Flow_Ratio > 1.29647 )
							if( Positive_Money_Flow_Sum <= 2.99096e+09 )
								if( Positive_Money_Flow_Sum <= 3.10332e+08 )
									ret := 0.793103 // buy
								if( Positive_Money_Flow_Sum > 3.10332e+08 )
									ret := 0.161765
							if( Positive_Money_Flow_Sum > 2.99096e+09 )
								if( Positive_Money_Flow_Sum <= 4.46962e+09 )
									ret := -0.471429
								if( Positive_Money_Flow_Sum > 4.46962e+09 )
									ret := 0.120000
					if( rsi1 > 48.529 )
						if( Negative_Money_Flow_Sum <= 4.12978e+09 )
							if( MFI <= 59.5538 )
								if( Money_Flow_Ratio <= 1.33111 )
									ret := -0.047386
								if( Money_Flow_Ratio > 1.33111 )
									ret := -0.254753
							if( MFI > 59.5538 )
								if( MFI_Low <= 68.0077 )
									ret := 0.017061
								if( MFI_Low > 68.0077 )
									ret := -0.130719
						if( Negative_Money_Flow_Sum > 4.12978e+09 )
							if( MFI_Low <= 23.5677 )
								if( rsi1 <= 49.5715 )
									ret := -0.750000 // sell
								if( rsi1 > 49.5715 )
									ret := 0.500000
							if( MFI_Low > 23.5677 )
								if( Positive_Money_Flow <= 6.12741e+07 )
									ret := 0.421053
								if( Positive_Money_Flow > 6.12741e+07 )
									ret := 0.825000 // buy
			if( Negative_Money_Flow_Sum > 4.91749e+09 )
				if( Negative_Money_Flow_Sum <= 5.58799e+09 )
					if( Raw_Money_Flow <= 2.00006e+09 )
						if( smoothK_k <= 48.7747 )
							if( Raw_Money_Flow <= 4.60986e+06 )
								if( Money_Flow_Ratio <= 0.12365 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.12365 )
									ret := -0.500000
							if( Raw_Money_Flow > 4.60986e+06 )
								if( Raw_Money_Flow <= 8.34898e+08 )
									ret := -0.713115 // sell
								if( Raw_Money_Flow > 8.34898e+08 )
									ret := -0.125000
						if( smoothK_k > 48.7747 )
							if( Positive_Money_Flow <= 1.67662e+08 )
								if( Positive_Money_Flow <= 8.26736e+06 )
									ret := -0.210526
								if( Positive_Money_Flow > 8.26736e+06 )
									ret := 0.700000 // buy
							if( Positive_Money_Flow > 1.67662e+08 )
								if( Money_Flow_Ratio <= 0.681746 )
									ret := -0.916667 // sell
								if( Money_Flow_Ratio > 0.681746 )
									ret := -0.250000
					if( Raw_Money_Flow > 2.00006e+09 )
						ret := 0.714286 // buy
				if( Negative_Money_Flow_Sum > 5.58799e+09 )
					if( d <= 30.255 )
						if( smoothK_k <= 3.09585 )
							if( rsi1 <= 31.8018 )
								if( Typical_Price <= 229.975 )
									ret := -1.000000 // sell
								if( Typical_Price > 229.975 )
									ret := 0.375000
							if( rsi1 > 31.8018 )
								ret := -1.000000 // sell
						if( smoothK_k > 3.09585 )
							if( Negative_Money_Flow_Sum <= 6.50648e+09 )
								if( Positive_Money_Flow_Sum <= 5.28662e+09 )
									ret := -0.345455
								if( Positive_Money_Flow_Sum > 5.28662e+09 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 6.50648e+09 )
								if( Positive_Money_Flow <= 2.03492e+08 )
									ret := 0.061947
								if( Positive_Money_Flow > 2.03492e+08 )
									ret := 0.471698
					if( d > 30.255 )
						if( MFI <= 46.8267 )
							if( Positive_Money_Flow_Sum <= 4.52998e+09 )
								if( MFI <= 36.7623 )
									ret := -0.392857
								if( MFI > 36.7623 )
									ret := 0.636364
							if( Positive_Money_Flow_Sum > 4.52998e+09 )
								if( Typical_Price <= 167.108 )
									ret := 0.200000
								if( Typical_Price > 167.108 )
									ret := -0.822785 // sell
						if( MFI > 46.8267 )
							if( Negative_Money_Flow_Sum <= 7.30194e+09 )
								if( Money_Flow_Ratio <= 1.51741 )
									ret := 0.880000 // buy
								if( Money_Flow_Ratio > 1.51741 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 7.30194e+09 )
								if( Negative_Money_Flow_Sum <= 1.02874e+10 )
									ret := -0.684211
								if( Negative_Money_Flow_Sum > 1.02874e+10 )
									ret := 0.750000 // buy
		if( d_k > -1.76477 )
			if( Raw_Money_Flow <= 2.27543e+08 )
				if( Negative_Money_Flow <= 1380.64 )
					if( Positive_Money_Flow <= 1.25333e+06 )
						if( smoothK_k <= 11.8971 )
							if( Negative_Money_Flow_Sum <= 6.57958e+09 )
								if( MFI_High <= -79.8166 )
									ret := -0.500000
								if( MFI_High > -79.8166 )
									ret := 0.042105
							if( Negative_Money_Flow_Sum > 6.57958e+09 )
								ret := -0.800000 // sell
						if( smoothK_k > 11.8971 )
							if( MFI <= 88.7706 )
								if( Negative_Money_Flow_Sum <= 6.61881e+08 )
									ret := -0.013632
								if( Negative_Money_Flow_Sum > 6.61881e+08 )
									ret := -0.097727
							if( MFI > 88.7706 )
								if( Raw_Money_Flow <= 515431 )
									ret := -0.022222
								if( Raw_Money_Flow > 515431 )
									ret := -0.450980
					if( Positive_Money_Flow > 1.25333e+06 )
						if( Money_Flow_Ratio <= 9.66833 )
							if( MFI_High <= -10.9199 )
								if( Negative_Money_Flow_Sum <= 1.18426e+08 )
									ret := 0.370968
								if( Negative_Money_Flow_Sum > 1.18426e+08 )
									ret := 0.038175
							if( MFI_High > -10.9199 )
								if( k <= 64.7044 )
									ret := 0.007205
								if( k > 64.7044 )
									ret := 0.215201
						if( Money_Flow_Ratio > 9.66833 )
							if( MFI_High <= 15.8758 )
								if( Positive_Money_Flow <= 9.98462e+06 )
									ret := -0.459016
								if( Positive_Money_Flow > 9.98462e+06 )
									ret := -0.059322
							if( MFI_High > 15.8758 )
								if( d <= 95.8426 )
									ret := 0.250000
								if( d > 95.8426 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow > 1380.64 )
					if( rsi1 <= 33.6495 )
						if( Positive_Money_Flow <= 564.744 )
							if( Typical_Price <= 324.995 )
								if( Positive_Money_Flow_Sum <= 1.36404e+09 )
									ret := 0.143020
								if( Positive_Money_Flow_Sum > 1.36404e+09 )
									ret := -0.081522
							if( Typical_Price > 324.995 )
								if( Negative_Money_Flow_Sum <= 8.84571e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 8.84571e+07 )
									ret := -0.014085
						if( Positive_Money_Flow > 564.744 )
							if( rsi1 <= 10.579 )
								if( Typical_Price <= 222.061 )
									ret := -1.000000 // sell
								if( Typical_Price > 222.061 )
									ret := 0.666667
							if( rsi1 > 10.579 )
								if( MFI_High <= -28.5802 )
									ret := 0.326923
								if( MFI_High > -28.5802 )
									ret := 0.714286 // buy
					if( rsi1 > 33.6495 )
						if( MFI_High <= -66.3908 )
							if( Negative_Money_Flow_Sum <= 2.6471e+09 )
								if( Raw_Money_Flow <= 1.58003e+08 )
									ret := 0.015730
								if( Raw_Money_Flow > 1.58003e+08 )
									ret := -0.205882
							if( Negative_Money_Flow_Sum > 2.6471e+09 )
								if( Typical_Price <= 258.271 )
									ret := -0.782609 // sell
								if( Typical_Price > 258.271 )
									ret := 0.000000
						if( MFI_High > -66.3908 )
							if( Negative_Money_Flow_Sum <= 2.38778e+09 )
								if( MFI_High <= 2.70961 )
									ret := 0.064509
								if( MFI_High > 2.70961 )
									ret := 0.166521
							if( Negative_Money_Flow_Sum > 2.38778e+09 )
								if( Negative_Money_Flow <= 1.14385e+06 )
									ret := 0.500000
								if( Negative_Money_Flow > 1.14385e+06 )
									ret := 0.126415
			if( Raw_Money_Flow > 2.27543e+08 )
				if( rsi1 <= 72.4647 )
					if( Positive_Money_Flow_Sum <= 4.62284e+09 )
						if( Raw_Money_Flow <= 2.97396e+08 )
							if( Positive_Money_Flow_Sum <= 8.83966e+08 )
								if( d_k <= -0.086756 )
									ret := 0.314917
								if( d_k > -0.086756 )
									ret := -0.046346
							if( Positive_Money_Flow_Sum > 8.83966e+08 )
								if( Positive_Money_Flow_Sum <= 1.50071e+09 )
									ret := -0.240117
								if( Positive_Money_Flow_Sum > 1.50071e+09 )
									ret := -0.041921
						if( Raw_Money_Flow > 2.97396e+08 )
							if( d <= 85.2266 )
								if( Negative_Money_Flow <= 5.50559e+08 )
									ret := 0.098454
								if( Negative_Money_Flow > 5.50559e+08 )
									ret := -0.026293
							if( d > 85.2266 )
								if( Typical_Price <= 173.453 )
									ret := 0.119048
								if( Typical_Price > 173.453 )
									ret := -0.180420
					if( Positive_Money_Flow_Sum > 4.62284e+09 )
						if( Negative_Money_Flow_Sum <= 7.56932e+09 )
							if( rsi1 <= 52.8387 )
								if( d_k <= 13.5097 )
									ret := -0.810606 // sell
								if( d_k > 13.5097 )
									ret := 0.000000
							if( rsi1 > 52.8387 )
								if( d_k <= 0.684329 )
									ret := 0.269841
								if( d_k > 0.684329 )
									ret := -0.445946
						if( Negative_Money_Flow_Sum > 7.56932e+09 )
							if( Negative_Money_Flow <= 7.37575e+08 )
								if( rsi1 <= 64.63 )
									ret := 0.684932
								if( rsi1 > 64.63 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 7.37575e+08 )
								if( Typical_Price <= 355.113 )
									ret := -0.545455
								if( Typical_Price > 355.113 )
									ret := 0.750000 // buy
				if( rsi1 > 72.4647 )
					if( k <= 90.9759 )
						if( Negative_Money_Flow_Sum <= 3.21667e+08 )
							if( Typical_Price <= 181.77 )
								if( Positive_Money_Flow <= 1.71994e+09 )
									ret := -0.142857
								if( Positive_Money_Flow > 1.71994e+09 )
									ret := 1.000000 // buy
							if( Typical_Price > 181.77 )
								if( Positive_Money_Flow_Sum <= 3.83383e+09 )
									ret := 0.844444 // buy
								if( Positive_Money_Flow_Sum > 3.83383e+09 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 3.21667e+08 )
							if( MFI_High <= 11.2357 )
								if( d_k <= -1.05355 )
									ret := -0.320000
								if( d_k > -1.05355 )
									ret := 0.250000
							if( MFI_High > 11.2357 )
								if( d <= 87.7718 )
									ret := -0.200000
								if( d > 87.7718 )
									ret := -0.888889 // sell
					if( k > 90.9759 )
						if( Negative_Money_Flow_Sum <= 1.73049e+08 )
							if( Positive_Money_Flow <= 3.26309e+08 )
								ret := 0.166667
							if( Positive_Money_Flow > 3.26309e+08 )
								if( Money_Flow_Ratio <= 23.6093 )
									ret := -0.285714
								if( Money_Flow_Ratio > 23.6093 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.73049e+08 )
							if( Typical_Price <= 167.765 )
								if( d_k <= 0.924699 )
									ret := 0.057143
								if( d_k > 0.924699 )
									ret := 0.555556
							if( Typical_Price > 167.765 )
								if( MFI_High <= 5.88874 )
									ret := -0.081560
								if( MFI_High > 5.88874 )
									ret := 0.147059
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_META_30Min_693525c3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


