//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: EPAM_15Min_2MS0_fc20f7ae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2MS0_fc20f7ae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_fc20f7ae(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 295.643 )
		if( Negative_Money_Flow_Sum <= 3.61321e+07 )
			if( Negative_Money_Flow <= 5.36755e+06 )
				if( MFI <= 43.9989 )
					if( Raw_Money_Flow <= 2.2391e+06 )
						if( Negative_Money_Flow_Sum <= 5.17349e+06 )
							if( Positive_Money_Flow_Sum <= 845042 )
								if( Typical_Price <= 116.846 )
									ret := -0.357143
								if( Typical_Price > 116.846 )
									ret := -0.937500 // sell
							if( Positive_Money_Flow_Sum > 845042 )
								if( smoothK_k <= 6.92791 )
									ret := -0.157025
								if( smoothK_k > 6.92791 )
									ret := 0.208267
						if( Negative_Money_Flow_Sum > 5.17349e+06 )
							if( Raw_Money_Flow <= 158960 )
								if( Negative_Money_Flow_Sum <= 8.36236e+06 )
									ret := -0.093750
								if( Negative_Money_Flow_Sum > 8.36236e+06 )
									ret := 0.303867
							if( Raw_Money_Flow > 158960 )
								if( d_k <= 4.81428 )
									ret := -0.070942
								if( d_k > 4.81428 )
									ret := 0.025601
					if( Raw_Money_Flow > 2.2391e+06 )
						if( Positive_Money_Flow_Sum <= 8.58851e+06 )
							if( Money_Flow_Ratio <= 0.133423 )
								if( d_k <= 9.33027 )
									ret := 0.734375 // buy
								if( d_k > 9.33027 )
									ret := -0.111111
							if( Money_Flow_Ratio > 0.133423 )
								if( d <= 40.9511 )
									ret := 0.101523
								if( d > 40.9511 )
									ret := 0.278846
						if( Positive_Money_Flow_Sum > 8.58851e+06 )
							if( rsi1 <= 23.1922 )
								if( d_k <= 2.86543 )
									ret := -0.666667
								if( d_k > 2.86543 )
									ret := -0.280000
							if( rsi1 > 23.1922 )
								if( Typical_Price <= 209.192 )
									ret := -0.102857
								if( Typical_Price > 209.192 )
									ret := 0.162304
				if( MFI > 43.9989 )
					if( Negative_Money_Flow_Sum <= 2.5036e+06 )
						if( Positive_Money_Flow_Sum <= 976906 )
							if( Raw_Money_Flow <= 151826 )
								if( rsi1 <= 50.7128 )
									ret := 1.000000 // buy
								if( rsi1 > 50.7128 )
									ret := 0.600000
							if( Raw_Money_Flow > 151826 )
								if( Positive_Money_Flow <= 121177 )
									ret := 0.500000
								if( Positive_Money_Flow > 121177 )
									ret := -0.500000
						if( Positive_Money_Flow_Sum > 976906 )
							if( Positive_Money_Flow <= 4.77553e+07 )
								if( Typical_Price <= 64.2247 )
									ret := 0.338462
								if( Typical_Price > 64.2247 )
									ret := -0.076494
							if( Positive_Money_Flow > 4.77553e+07 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.5036e+06 )
						if( Typical_Price <= 206.864 )
							if( Negative_Money_Flow_Sum <= 9.29916e+06 )
								if( rsi1 <= 32.582 )
									ret := 0.318766
								if( rsi1 > 32.582 )
									ret := 0.056013
							if( Negative_Money_Flow_Sum > 9.29916e+06 )
								if( Negative_Money_Flow_Sum <= 1.01712e+07 )
									ret := 0.318471
								if( Negative_Money_Flow_Sum > 1.01712e+07 )
									ret := 0.138902
						if( Typical_Price > 206.864 )
							if( MFI_High <= -1.3267 )
								if( rsi1 <= 35.6071 )
									ret := -0.171901
								if( rsi1 > 35.6071 )
									ret := 0.004946
							if( MFI_High > -1.3267 )
								if( rsi1 <= 68.6623 )
									ret := 0.210837
								if( rsi1 > 68.6623 )
									ret := -0.006645
			if( Negative_Money_Flow > 5.36755e+06 )
				if( MFI <= 83.6915 )
					if( MFI <= 74.4063 )
						if( MFI_High <= -34.07 )
							if( Positive_Money_Flow_Sum <= 1.36091e+07 )
								if( Negative_Money_Flow <= 1.63205e+07 )
									ret := 0.182830
								if( Negative_Money_Flow > 1.63205e+07 )
									ret := 0.631579
							if( Positive_Money_Flow_Sum > 1.36091e+07 )
								if( Negative_Money_Flow <= 5.51988e+06 )
									ret := 0.611111
								if( Negative_Money_Flow > 5.51988e+06 )
									ret := -0.114391
						if( MFI_High > -34.07 )
							if( Positive_Money_Flow_Sum <= 2.05111e+07 )
								if( Typical_Price <= 280.579 )
									ret := 0.621622
								if( Typical_Price > 280.579 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 2.05111e+07 )
								if( Raw_Money_Flow <= 8.29511e+06 )
									ret := -0.035714
								if( Raw_Money_Flow > 8.29511e+06 )
									ret := 0.423280
					if( MFI > 74.4063 )
						if( d <= 78.1954 )
							if( rsi1 <= 58.8364 )
								ret := -0.142857
							if( rsi1 > 58.8364 )
								if( Negative_Money_Flow <= 7.91827e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 7.91827e+06 )
									ret := 1.000000 // buy
						if( d > 78.1954 )
							if( smoothK_k <= 95.7317 )
								if( Typical_Price <= 212.99 )
									ret := -0.647059
								if( Typical_Price > 212.99 )
									ret := -1.000000 // sell
							if( smoothK_k > 95.7317 )
								ret := 0.000000
				if( MFI > 83.6915 )
					if( d <= 98.6702 )
						if( d <= 94.97 )
							ret := 1.000000 // buy
						if( d > 94.97 )
							ret := 0.833333 // buy
					if( d > 98.6702 )
						ret := 0.000000
		if( Negative_Money_Flow_Sum > 3.61321e+07 )
			if( Typical_Price <= 210.88 )
				if( Money_Flow_Ratio <= 0.072002 )
					if( rsi1 <= 26.4687 )
						if( Negative_Money_Flow_Sum <= 6.6156e+07 )
							if( d_k <= -0.22865 )
								if( Typical_Price <= 189.127 )
									ret := 0.200000
								if( Typical_Price > 189.127 )
									ret := 1.000000 // buy
							if( d_k > -0.22865 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 6.6156e+07 )
							if( MFI <= 1.56761 )
								ret := 0.500000
							if( MFI > 1.56761 )
								if( Typical_Price <= 164.018 )
									ret := 0.666667
								if( Typical_Price > 164.018 )
									ret := 1.000000 // buy
					if( rsi1 > 26.4687 )
						if( smoothD_d <= 52.4065 )
							if( Positive_Money_Flow_Sum <= 4.11742e+06 )
								if( Positive_Money_Flow_Sum <= 1.57127e+06 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 1.57127e+06 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 4.11742e+06 )
								ret := 0.750000 // buy
						if( smoothD_d > 52.4065 )
							ret := -0.600000
				if( Money_Flow_Ratio > 0.072002 )
					if( Negative_Money_Flow_Sum <= 4.38071e+07 )
						if( Positive_Money_Flow <= 1.6261e+07 )
							if( d_k <= 4.29521 )
								if( Positive_Money_Flow_Sum <= 5.61731e+07 )
									ret := 0.002309
								if( Positive_Money_Flow_Sum > 5.61731e+07 )
									ret := 0.736842 // buy
							if( d_k > 4.29521 )
								if( rsi1 <= 35.8947 )
									ret := 0.734177 // buy
								if( rsi1 > 35.8947 )
									ret := 0.203008
						if( Positive_Money_Flow > 1.6261e+07 )
							if( rsi1 <= 44.9873 )
								ret := -1.000000 // sell
							if( rsi1 > 44.9873 )
								ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 4.38071e+07 )
						if( Positive_Money_Flow_Sum <= 1.69137e+08 )
							if( Negative_Money_Flow_Sum <= 5.93171e+07 )
								if( Raw_Money_Flow <= 1.26393e+06 )
									ret := -0.420000
								if( Raw_Money_Flow > 1.26393e+06 )
									ret := -0.127232
							if( Negative_Money_Flow_Sum > 5.93171e+07 )
								if( d_k <= -6.76065 )
									ret := -0.240196
								if( d_k > -6.76065 )
									ret := 0.064205
						if( Positive_Money_Flow_Sum > 1.69137e+08 )
							if( Negative_Money_Flow_Sum <= 5.38866e+08 )
								if( k <= 84.0626 )
									ret := 1.000000 // buy
								if( k > 84.0626 )
									ret := 0.125000
							if( Negative_Money_Flow_Sum > 5.38866e+08 )
								if( smoothD_d <= 64.1614 )
									ret := -1.000000 // sell
								if( smoothD_d > 64.1614 )
									ret := 0.750000 // buy
			if( Typical_Price > 210.88 )
				if( Negative_Money_Flow_Sum <= 1.66827e+08 )
					if( Positive_Money_Flow_Sum <= 1.92562e+07 )
						if( Positive_Money_Flow <= 2.8557e+06 )
							if( Raw_Money_Flow <= 3.14118e+07 )
								if( Negative_Money_Flow_Sum <= 7.53832e+07 )
									ret := 0.221698
								if( Negative_Money_Flow_Sum > 7.53832e+07 )
									ret := 0.455882
							if( Raw_Money_Flow > 3.14118e+07 )
								if( d_k <= -0.699974 )
									ret := 0.500000
								if( d_k > -0.699974 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow > 2.8557e+06 )
							if( rsi1 <= 59.7252 )
								if( k <= 69.9507 )
									ret := 0.552632
								if( k > 69.9507 )
									ret := -0.083333
							if( rsi1 > 59.7252 )
								if( Money_Flow_Ratio <= 0.279198 )
									ret := 0.777778 // buy
								if( Money_Flow_Ratio > 0.279198 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.92562e+07 )
						if( Positive_Money_Flow_Sum <= 2.46714e+07 )
							if( Negative_Money_Flow_Sum <= 1.17762e+08 )
								if( smoothD_d <= 12.9955 )
									ret := -0.312977
								if( smoothD_d > 12.9955 )
									ret := 0.015924
							if( Negative_Money_Flow_Sum > 1.17762e+08 )
								if( Positive_Money_Flow <= 546406 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 546406 )
									ret := 0.500000
						if( Positive_Money_Flow_Sum > 2.46714e+07 )
							if( smoothD_d <= 79.8172 )
								if( Negative_Money_Flow <= 2.03818e+07 )
									ret := 0.234620
								if( Negative_Money_Flow > 2.03818e+07 )
									ret := -0.028169
							if( smoothD_d > 79.8172 )
								if( MFI_High <= -38.5449 )
									ret := 0.212766
								if( MFI_High > -38.5449 )
									ret := -0.140468
				if( Negative_Money_Flow_Sum > 1.66827e+08 )
					if( Raw_Money_Flow <= 5.96845e+06 )
						if( MFI <= 24.8834 )
							if( Negative_Money_Flow_Sum <= 4.05152e+08 )
								if( Negative_Money_Flow_Sum <= 2.21048e+08 )
									ret := 0.395349
								if( Negative_Money_Flow_Sum > 2.21048e+08 )
									ret := 0.884615 // buy
							if( Negative_Money_Flow_Sum > 4.05152e+08 )
								ret := -1.000000 // sell
						if( MFI > 24.8834 )
							if( d_k <= 4.23033 )
								if( Positive_Money_Flow <= 588043 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 588043 )
									ret := 0.333333
							if( d_k > 4.23033 )
								if( Positive_Money_Flow_Sum <= 3.00369e+08 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 3.00369e+08 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 5.96845e+06 )
						if( k <= 0.84676 )
							ret := 0.833333 // buy
						if( k > 0.84676 )
							if( rsi1 <= 36.3612 )
								if( Raw_Money_Flow <= 1.04631e+08 )
									ret := -0.790698 // sell
								if( Raw_Money_Flow > 1.04631e+08 )
									ret := 0.750000 // buy
							if( rsi1 > 36.3612 )
								if( Negative_Money_Flow_Sum <= 4.48899e+08 )
									ret := 0.076923
								if( Negative_Money_Flow_Sum > 4.48899e+08 )
									ret := -0.777778 // sell
	if( Typical_Price > 295.643 )
		if( Positive_Money_Flow_Sum <= 4.27202e+07 )
			if( d <= 81.9848 )
				if( Negative_Money_Flow_Sum <= 5.19729e+08 )
					if( MFI <= 20.7085 )
						if( d_k <= -3.73993 )
							if( Positive_Money_Flow_Sum <= 3.05331e+07 )
								if( Positive_Money_Flow_Sum <= 2.53601e+07 )
									ret := 0.163594
								if( Positive_Money_Flow_Sum > 2.53601e+07 )
									ret := 0.722222 // buy
							if( Positive_Money_Flow_Sum > 3.05331e+07 )
								if( Typical_Price <= 318.908 )
									ret := 0.200000
								if( Typical_Price > 318.908 )
									ret := -0.717949 // sell
						if( d_k > -3.73993 )
							if( Positive_Money_Flow_Sum <= 1.14024e+07 )
								if( Positive_Money_Flow <= 3.30362e+06 )
									ret := -0.243464
								if( Positive_Money_Flow > 3.30362e+06 )
									ret := 0.642857
							if( Positive_Money_Flow_Sum > 1.14024e+07 )
								if( Positive_Money_Flow_Sum <= 2.04484e+07 )
									ret := 0.153846
								if( Positive_Money_Flow_Sum > 2.04484e+07 )
									ret := -0.184116
					if( MFI > 20.7085 )
						if( Negative_Money_Flow_Sum <= 6.55276e+07 )
							if( Positive_Money_Flow_Sum <= 2.64625e+07 )
								if( MFI <= 79.0456 )
									ret := 0.015198
								if( MFI > 79.0456 )
									ret := 0.494845
							if( Positive_Money_Flow_Sum > 2.64625e+07 )
								if( Negative_Money_Flow_Sum <= 6.33379e+07 )
									ret := 0.139706
								if( Negative_Money_Flow_Sum > 6.33379e+07 )
									ret := -0.362069
						if( Negative_Money_Flow_Sum > 6.55276e+07 )
							if( Typical_Price <= 457.155 )
								if( Raw_Money_Flow <= 4.30842e+06 )
									ret := 0.505535
								if( Raw_Money_Flow > 4.30842e+06 )
									ret := 0.322493
							if( Typical_Price > 457.155 )
								if( smoothK_k <= 21.1428 )
									ret := -0.173913
								if( smoothK_k > 21.1428 )
									ret := 0.352941
				if( Negative_Money_Flow_Sum > 5.19729e+08 )
					if( smoothD_d <= 7.77149 )
						ret := 0.750000 // buy
					if( smoothD_d > 7.77149 )
						if( Raw_Money_Flow <= 1.54678e+06 )
							ret := 0.800000 // buy
						if( Raw_Money_Flow > 1.54678e+06 )
							ret := 1.000000 // buy
			if( d > 81.9848 )
				if( Raw_Money_Flow <= 1.50578e+06 )
					if( MFI <= 32.0054 )
						if( MFI <= 14.6795 )
							if( Positive_Money_Flow <= 1.21411e+06 )
								if( Raw_Money_Flow <= 325692 )
									ret := -0.500000
								if( Raw_Money_Flow > 325692 )
									ret := 0.000000
							if( Positive_Money_Flow > 1.21411e+06 )
								ret := -0.750000 // sell
						if( MFI > 14.6795 )
							if( Negative_Money_Flow <= 638314 )
								if( d_k <= 2.87313 )
									ret := 0.300000
								if( d_k > 2.87313 )
									ret := 0.894737 // buy
							if( Negative_Money_Flow > 638314 )
								if( MFI_High <= -49.9001 )
									ret := -0.166667
								if( MFI_High > -49.9001 )
									ret := 0.571429
					if( MFI > 32.0054 )
						if( d_k <= -6.77956 )
							if( d_k <= -7.76565 )
								if( Positive_Money_Flow_Sum <= 1.84009e+07 )
									ret := 0.045455
								if( Positive_Money_Flow_Sum > 1.84009e+07 )
									ret := -0.250000
							if( d_k > -7.76565 )
								if( MFI <= 76.798 )
									ret := 0.600000
								if( MFI > 76.798 )
									ret := 0.000000
						if( d_k > -6.77956 )
							if( d <= 93.8553 )
								if( rsi1 <= 81.8892 )
									ret := -0.293515
								if( rsi1 > 81.8892 )
									ret := -0.863636 // sell
							if( d > 93.8553 )
								if( Negative_Money_Flow_Sum <= 5.11003e+07 )
									ret := -0.066298
								if( Negative_Money_Flow_Sum > 5.11003e+07 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 1.50578e+06 )
					if( Negative_Money_Flow_Sum <= 3.21354e+07 )
						if( Positive_Money_Flow_Sum <= 3.14884e+07 )
							if( Raw_Money_Flow <= 1.31659e+07 )
								if( Positive_Money_Flow <= 3.84785e+06 )
									ret := -0.027375
								if( Positive_Money_Flow > 3.84785e+06 )
									ret := 0.408163
							if( Raw_Money_Flow > 1.31659e+07 )
								if( Typical_Price <= 339.003 )
									ret := -0.200000
								if( Typical_Price > 339.003 )
									ret := -0.900000 // sell
						if( Positive_Money_Flow_Sum > 3.14884e+07 )
							if( Money_Flow_Ratio <= 1.67641 )
								if( d_k <= -10.4365 )
									ret := -0.750000 // sell
								if( d_k > -10.4365 )
									ret := 0.528302
							if( Money_Flow_Ratio > 1.67641 )
								if( Raw_Money_Flow <= 1.04171e+07 )
									ret := -0.030303
								if( Raw_Money_Flow > 1.04171e+07 )
									ret := 0.535714
					if( Negative_Money_Flow_Sum > 3.21354e+07 )
						if( Negative_Money_Flow_Sum <= 4.75704e+07 )
							if( MFI_High <= -48.8675 )
								if( MFI_Low <= 5.21572 )
									ret := -0.700000 // sell
								if( MFI_Low > 5.21572 )
									ret := 0.500000
							if( MFI_High > -48.8675 )
								if( d_k <= 0.603899 )
									ret := -0.615385
								if( d_k > 0.603899 )
									ret := -0.181818
						if( Negative_Money_Flow_Sum > 4.75704e+07 )
							if( MFI_Low <= 17.1617 )
								if( Positive_Money_Flow_Sum <= 1.56173e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 1.56173e+07 )
									ret := -0.085106
							if( MFI_Low > 17.1617 )
								if( Typical_Price <= 352.973 )
									ret := 0.800000 // buy
								if( Typical_Price > 352.973 )
									ret := -0.032258
		if( Positive_Money_Flow_Sum > 4.27202e+07 )
			if( Negative_Money_Flow_Sum <= 5.43891e+07 )
				if( smoothK_k <= 21.7415 )
					if( rsi1 <= 34.6898 )
						if( Negative_Money_Flow <= 854240 )
							if( Typical_Price <= 533.346 )
								if( MFI_High <= -17.1535 )
									ret := 0.882353 // buy
								if( MFI_High > -17.1535 )
									ret := 0.135135
							if( Typical_Price > 533.346 )
								if( smoothK_k <= -1.65071 )
									ret := -1.000000 // sell
								if( smoothK_k > -1.65071 )
									ret := -0.142857
						if( Negative_Money_Flow > 854240 )
							if( Raw_Money_Flow <= 1.00949e+07 )
								if( Raw_Money_Flow <= 3.25669e+06 )
									ret := -0.013333
								if( Raw_Money_Flow > 3.25669e+06 )
									ret := -0.538462
							if( Raw_Money_Flow > 1.00949e+07 )
								ret := 1.000000 // buy
					if( rsi1 > 34.6898 )
						if( Raw_Money_Flow <= 2.73224e+07 )
							if( d_k <= 9.08966 )
								if( Raw_Money_Flow <= 9.52085e+06 )
									ret := 0.175127
								if( Raw_Money_Flow > 9.52085e+06 )
									ret := -0.260000
							if( d_k > 9.08966 )
								if( Negative_Money_Flow <= 7.08249e+06 )
									ret := 0.502924
								if( Negative_Money_Flow > 7.08249e+06 )
									ret := -0.250000
						if( Raw_Money_Flow > 2.73224e+07 )
							if( MFI_Low <= 65.5721 )
								if( rsi1 <= 40.3403 )
									ret := 0.200000
								if( rsi1 > 40.3403 )
									ret := 0.818182 // buy
							if( MFI_Low > 65.5721 )
								ret := -0.166667
				if( smoothK_k > 21.7415 )
					if( Positive_Money_Flow_Sum <= 5.02108e+07 )
						if( rsi1 <= 77.9 )
							if( Raw_Money_Flow <= 1.91654e+06 )
								if( k <= 59.0784 )
									ret := -0.175000
								if( k > 59.0784 )
									ret := -0.588785
							if( Raw_Money_Flow > 1.91654e+06 )
								if( rsi1 <= 32.7504 )
									ret := -0.708333 // sell
								if( rsi1 > 32.7504 )
									ret := -0.076923
						if( rsi1 > 77.9 )
							if( d_k <= 0.07309 )
								if( d_k <= -3.06221 )
									ret := -0.285714
								if( d_k > -3.06221 )
									ret := 0.620690
							if( d_k > 0.07309 )
								if( k <= 88.7251 )
									ret := 0.166667
								if( k > 88.7251 )
									ret := -0.319149
					if( Positive_Money_Flow_Sum > 5.02108e+07 )
						if( Money_Flow_Ratio <= 22.9856 )
							if( Positive_Money_Flow <= 2.97817e+07 )
								if( Negative_Money_Flow_Sum <= 4.01555e+07 )
									ret := 0.029244
								if( Negative_Money_Flow_Sum > 4.01555e+07 )
									ret := 0.162516
							if( Positive_Money_Flow > 2.97817e+07 )
								if( Raw_Money_Flow <= 8.00345e+07 )
									ret := 0.387850
								if( Raw_Money_Flow > 8.00345e+07 )
									ret := -0.529412
						if( Money_Flow_Ratio > 22.9856 )
							if( Raw_Money_Flow <= 3.47424e+06 )
								if( d <= 32.5769 )
									ret := 1.000000 // buy
								if( d > 32.5769 )
									ret := -0.142857
							if( Raw_Money_Flow > 3.47424e+06 )
								if( Positive_Money_Flow <= 5.9841e+07 )
									ret := -0.681818
								if( Positive_Money_Flow > 5.9841e+07 )
									ret := -0.181818
			if( Negative_Money_Flow_Sum > 5.43891e+07 )
				if( Money_Flow_Ratio <= 3.5573 )
					if( Raw_Money_Flow <= 1.34337e+07 )
						if( rsi1 <= 40.2239 )
							if( MFI_High <= -25.3879 )
								if( Positive_Money_Flow_Sum <= 6.55802e+07 )
									ret := -0.149718
								if( Positive_Money_Flow_Sum > 6.55802e+07 )
									ret := 0.237668
							if( MFI_High > -25.3879 )
								if( Positive_Money_Flow <= 7.13577e+06 )
									ret := -0.575000
								if( Positive_Money_Flow > 7.13577e+06 )
									ret := 0.750000 // buy
						if( rsi1 > 40.2239 )
							if( MFI <= 47.9794 )
								if( Negative_Money_Flow_Sum <= 6.55073e+07 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow_Sum > 6.55073e+07 )
									ret := -0.384501
							if( MFI > 47.9794 )
								if( Positive_Money_Flow_Sum <= 2.27486e+08 )
									ret := -0.175134
								if( Positive_Money_Flow_Sum > 2.27486e+08 )
									ret := 0.511628
					if( Raw_Money_Flow > 1.34337e+07 )
						if( smoothK_k <= 2.76904 )
							if( d_k <= 5.95842 )
								if( Negative_Money_Flow <= 2.48324e+07 )
									ret := 0.452830
								if( Negative_Money_Flow > 2.48324e+07 )
									ret := 0.956522 // buy
							if( d_k > 5.95842 )
								if( Raw_Money_Flow <= 5.2971e+07 )
									ret := 0.190476
								if( Raw_Money_Flow > 5.2971e+07 )
									ret := -1.000000 // sell
						if( smoothK_k > 2.76904 )
							if( Negative_Money_Flow_Sum <= 2.83627e+08 )
								if( Positive_Money_Flow_Sum <= 2.13299e+08 )
									ret := -0.027638
								if( Positive_Money_Flow_Sum > 2.13299e+08 )
									ret := -0.448000
							if( Negative_Money_Flow_Sum > 2.83627e+08 )
								if( smoothK_k <= 10.1323 )
									ret := 0.000000
								if( smoothK_k > 10.1323 )
									ret := 0.830508 // buy
				if( Money_Flow_Ratio > 3.5573 )
					if( d_k <= -7.29111 )
						if( MFI <= 82.7415 )
							ret := 1.000000 // buy
						if( MFI > 82.7415 )
							ret := -1.000000 // sell
					if( d_k > -7.29111 )
						if( d_k <= 0.080848 )
							ret := -1.000000 // sell
						if( d_k > 0.080848 )
							if( Negative_Money_Flow_Sum <= 8.99196e+07 )
								if( Positive_Money_Flow_Sum <= 4.64022e+08 )
									ret := -0.722222 // sell
								if( Positive_Money_Flow_Sum > 4.64022e+08 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 8.99196e+07 )
								if( Money_Flow_Ratio <= 14.4306 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 14.4306 )
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
float op_operation = decision_tree_0_EPAM_15Min_fc20f7ae(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


