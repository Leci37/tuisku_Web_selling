//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ADBE_15Min_2MS0_4abb9bea Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_2MS0_4abb9bea", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_4abb9bea(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 48.2248 )
		if( Raw_Money_Flow <= 3.49316e+06 )
			if( Negative_Money_Flow <= 761.666 )
				if( Positive_Money_Flow <= 254269 )
					if( Negative_Money_Flow_Sum <= 9.60997e+08 )
						if( smoothD_d <= 6.33993 )
							if( Negative_Money_Flow_Sum <= 4.83483e+06 )
								if( MFI_Low <= 49.4781 )
									ret := -0.782609 // sell
								if( MFI_Low > 49.4781 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 4.83483e+06 )
								if( rsi1 <= 24.8755 )
									ret := 0.280702
								if( rsi1 > 24.8755 )
									ret := -0.024316
						if( smoothD_d > 6.33993 )
							if( rsi1 <= 28.9863 )
								if( Negative_Money_Flow_Sum <= 2.42255e+08 )
									ret := 0.647059
								if( Negative_Money_Flow_Sum > 2.42255e+08 )
									ret := 0.245283
							if( rsi1 > 28.9863 )
								if( rsi1 <= 47.8777 )
									ret := 0.176355
								if( rsi1 > 47.8777 )
									ret := -0.217391
					if( Negative_Money_Flow_Sum > 9.60997e+08 )
						if( Negative_Money_Flow_Sum <= 1.57467e+09 )
							if( MFI <= 21.8029 )
								if( Negative_Money_Flow_Sum <= 1.32489e+09 )
									ret := -0.461538
								if( Negative_Money_Flow_Sum > 1.32489e+09 )
									ret := -1.000000 // sell
							if( MFI > 21.8029 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.57467e+09 )
							if( rsi1 <= 32.8353 )
								ret := 0.000000
							if( rsi1 > 32.8353 )
								ret := 0.500000
				if( Positive_Money_Flow > 254269 )
					if( MFI_High <= -26.3872 )
						if( Negative_Money_Flow_Sum <= 5.59369e+06 )
							if( Positive_Money_Flow_Sum <= 666106 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 666106 )
								if( Raw_Money_Flow <= 1.86144e+06 )
									ret := -0.655556
								if( Raw_Money_Flow > 1.86144e+06 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 5.59369e+06 )
							if( Positive_Money_Flow_Sum <= 4.39554e+06 )
								if( d_k <= -7.85815 )
									ret := -0.171429
								if( d_k > -7.85815 )
									ret := 0.421053
							if( Positive_Money_Flow_Sum > 4.39554e+06 )
								if( MFI_High <= -65.4335 )
									ret := -0.238494
								if( MFI_High > -65.4335 )
									ret := -0.010060
					if( MFI_High > -26.3872 )
						if( rsi1 <= 28.7578 )
							if( Negative_Money_Flow_Sum <= 1.78709e+06 )
								if( Money_Flow_Ratio <= 2.49803 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 2.49803 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.78709e+06 )
								if( k <= 5.10695 )
									ret := 0.187500
								if( k > 5.10695 )
									ret := 0.906977 // buy
						if( rsi1 > 28.7578 )
							if( Positive_Money_Flow_Sum <= 4.06096e+08 )
								if( Negative_Money_Flow_Sum <= 1.23351e+06 )
									ret := -0.538462
								if( Negative_Money_Flow_Sum > 1.23351e+06 )
									ret := 0.188679
							if( Positive_Money_Flow_Sum > 4.06096e+08 )
								if( d_k <= 16.3692 )
									ret := -0.276786
								if( d_k > 16.3692 )
									ret := 0.583333
			if( Negative_Money_Flow > 761.666 )
				if( Positive_Money_Flow_Sum <= 6.83335e+07 )
					if( Typical_Price <= 220.909 )
						if( Negative_Money_Flow_Sum <= 4.03293e+08 )
							if( rsi1 <= 10.7819 )
								ret := -0.800000 // sell
							if( rsi1 > 10.7819 )
								if( Negative_Money_Flow <= 458018 )
									ret := 0.644670
								if( Negative_Money_Flow > 458018 )
									ret := 0.281250
						if( Negative_Money_Flow_Sum > 4.03293e+08 )
							if( Negative_Money_Flow_Sum <= 4.29577e+08 )
								if( d_k <= -0.926873 )
									ret := -0.750000 // sell
								if( d_k > -0.926873 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.29577e+08 )
								ret := 0.250000
					if( Typical_Price > 220.909 )
						if( Negative_Money_Flow_Sum <= 4.74646e+08 )
							if( MFI <= 12.2798 )
								if( Typical_Price <= 304.212 )
									ret := 0.078534
								if( Typical_Price > 304.212 )
									ret := 0.487472
							if( MFI > 12.2798 )
								if( Negative_Money_Flow_Sum <= 2.2953e+08 )
									ret := 0.155622
								if( Negative_Money_Flow_Sum > 2.2953e+08 )
									ret := -0.191011
						if( Negative_Money_Flow_Sum > 4.74646e+08 )
							if( rsi1 <= 32.5465 )
								if( k <= 18.8379 )
									ret := -0.075581
								if( k > 18.8379 )
									ret := 0.504274
							if( rsi1 > 32.5465 )
								if( MFI_High <= -71.313 )
									ret := -0.285714
								if( MFI_High > -71.313 )
									ret := 0.451613
				if( Positive_Money_Flow_Sum > 6.83335e+07 )
					if( Positive_Money_Flow_Sum <= 1.8978e+08 )
						if( Typical_Price <= 345.933 )
							if( d_k <= -2.4006 )
								if( Negative_Money_Flow_Sum <= 6.91335e+07 )
									ret := -0.322581
								if( Negative_Money_Flow_Sum > 6.91335e+07 )
									ret := 0.450185
							if( d_k > -2.4006 )
								if( MFI_Low <= 23.1391 )
									ret := 0.490909
								if( MFI_Low > 23.1391 )
									ret := 0.715655 // buy
						if( Typical_Price > 345.933 )
							if( smoothK_k <= 20.4949 )
								if( Money_Flow_Ratio <= 0.191128 )
									ret := 0.480583
								if( Money_Flow_Ratio > 0.191128 )
									ret := -0.025641
							if( smoothK_k > 20.4949 )
								if( d_k <= 3.24715 )
									ret := 0.356234
								if( d_k > 3.24715 )
									ret := 0.699531
					if( Positive_Money_Flow_Sum > 1.8978e+08 )
						if( MFI_Low <= 61.3209 )
							if( Typical_Price <= 354.627 )
								if( Money_Flow_Ratio <= 2.95745 )
									ret := 0.082192
								if( Money_Flow_Ratio > 2.95745 )
									ret := 0.475000
							if( Typical_Price > 354.627 )
								if( k <= 64.5529 )
									ret := 0.414133
								if( k > 64.5529 )
									ret := 0.123457
						if( MFI_Low > 61.3209 )
							if( d_k <= -3.93961 )
								if( Money_Flow_Ratio <= 65.7178 )
									ret := 0.762712 // buy
								if( Money_Flow_Ratio > 65.7178 )
									ret := 0.000000
							if( d_k > -3.93961 )
								if( Positive_Money_Flow_Sum <= 7.29827e+08 )
									ret := -0.046018
								if( Positive_Money_Flow_Sum > 7.29827e+08 )
									ret := 0.642857
		if( Raw_Money_Flow > 3.49316e+06 )
			if( Positive_Money_Flow_Sum <= 5.42212e+08 )
				if( MFI_High <= -47.1818 )
					if( Typical_Price <= 415.633 )
						if( Raw_Money_Flow <= 8.71754e+07 )
							if( Negative_Money_Flow_Sum <= 1.92268e+08 )
								if( Negative_Money_Flow <= 2.99666e+07 )
									ret := 0.065191
								if( Negative_Money_Flow > 2.99666e+07 )
									ret := 0.369281
							if( Negative_Money_Flow_Sum > 1.92268e+08 )
								if( d_k <= 6.85278 )
									ret := 0.025151
								if( d_k > 6.85278 )
									ret := -0.176548
						if( Raw_Money_Flow > 8.71754e+07 )
							if( smoothK_k <= 17.4359 )
								if( Negative_Money_Flow <= 4.45127e+08 )
									ret := 0.147410
								if( Negative_Money_Flow > 4.45127e+08 )
									ret := -0.909091 // sell
							if( smoothK_k > 17.4359 )
								if( d_k <= 20.6677 )
									ret := 0.590625
								if( d_k > 20.6677 )
									ret := -0.411765
					if( Typical_Price > 415.633 )
						if( Negative_Money_Flow <= 2.66192e+07 )
							if( Raw_Money_Flow <= 1.09107e+07 )
								if( Negative_Money_Flow_Sum <= 7.93287e+06 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 7.93287e+06 )
									ret := 0.360947
							if( Raw_Money_Flow > 1.09107e+07 )
								if( rsi1 <= 35.2042 )
									ret := 0.079937
								if( rsi1 > 35.2042 )
									ret := -0.072300
						if( Negative_Money_Flow > 2.66192e+07 )
							if( Positive_Money_Flow_Sum <= 1.03046e+06 )
								if( Negative_Money_Flow_Sum <= 7.75154e+08 )
									ret := 0.378151
								if( Negative_Money_Flow_Sum > 7.75154e+08 )
									ret := -0.687500
							if( Positive_Money_Flow_Sum > 1.03046e+06 )
								if( Positive_Money_Flow_Sum <= 2.20245e+07 )
									ret := -0.246753
								if( Positive_Money_Flow_Sum > 2.20245e+07 )
									ret := -0.082395
				if( MFI_High > -47.1818 )
					if( Negative_Money_Flow_Sum <= 4.29293e+07 )
						if( Money_Flow_Ratio <= 113.419 )
							if( Money_Flow_Ratio <= 7.29118 )
								if( Typical_Price <= 155.124 )
									ret := 0.000000
								if( Typical_Price > 155.124 )
									ret := -0.372340
							if( Money_Flow_Ratio > 7.29118 )
								if( d_k <= 10.7645 )
									ret := 0.167665
								if( d_k > 10.7645 )
									ret := -0.600000
						if( Money_Flow_Ratio > 113.419 )
							if( Typical_Price <= 265.033 )
								ret := 0.000000
							if( Typical_Price > 265.033 )
								if( Positive_Money_Flow <= 2.52793e+07 )
									ret := -0.500000
								if( Positive_Money_Flow > 2.52793e+07 )
									ret := -0.931034 // sell
					if( Negative_Money_Flow_Sum > 4.29293e+07 )
						if( Negative_Money_Flow_Sum <= 4.28196e+08 )
							if( Negative_Money_Flow_Sum <= 3.0813e+08 )
								if( Negative_Money_Flow <= 8.2835e+07 )
									ret := 0.082239
								if( Negative_Money_Flow > 8.2835e+07 )
									ret := 0.323944
							if( Negative_Money_Flow_Sum > 3.0813e+08 )
								if( Raw_Money_Flow <= 1.88828e+08 )
									ret := -0.071788
								if( Raw_Money_Flow > 1.88828e+08 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 4.28196e+08 )
							if( Negative_Money_Flow_Sum <= 4.5877e+08 )
								if( Typical_Price <= 483.977 )
									ret := 0.535484
								if( Typical_Price > 483.977 )
									ret := 0.123077
							if( Negative_Money_Flow_Sum > 4.5877e+08 )
								if( smoothD_d <= 44.1701 )
									ret := 0.300733
								if( smoothD_d > 44.1701 )
									ret := 0.015564
			if( Positive_Money_Flow_Sum > 5.42212e+08 )
				if( MFI_High <= -42.5604 )
					if( MFI_High <= -57.8443 )
						if( Typical_Price <= 487.223 )
							if( Negative_Money_Flow_Sum <= 2.95214e+09 )
								if( k <= 34.4108 )
									ret := 0.000000
								if( k > 34.4108 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 2.95214e+09 )
								ret := 1.000000 // buy
						if( Typical_Price > 487.223 )
							if( rsi1 <= 20.4865 )
								ret := -1.000000 // sell
							if( rsi1 > 20.4865 )
								if( Positive_Money_Flow <= 1.65807e+08 )
									ret := -0.090909
								if( Positive_Money_Flow > 1.65807e+08 )
									ret := 0.500000
					if( MFI_High > -57.8443 )
						if( Typical_Price <= 310.333 )
							if( Negative_Money_Flow_Sum <= 3.5475e+09 )
								if( d <= 59.7319 )
									ret := -0.375000
								if( d > 59.7319 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.5475e+09 )
								ret := 1.000000 // buy
						if( Typical_Price > 310.333 )
							if( d_k <= -3.27343 )
								if( Typical_Price <= 490.187 )
									ret := -0.666667
								if( Typical_Price > 490.187 )
									ret := -0.929825 // sell
							if( d_k > -3.27343 )
								if( d_k <= -3.0826 )
									ret := 0.750000 // buy
								if( d_k > -3.0826 )
									ret := -0.491228
				if( MFI_High > -42.5604 )
					if( d_k <= 8.5794 )
						if( Negative_Money_Flow_Sum <= 1.98943e+09 )
							if( MFI <= 58.2401 )
								if( k <= 34.195 )
									ret := 0.571429
								if( k > 34.195 )
									ret := -0.020270
							if( MFI > 58.2401 )
								if( Negative_Money_Flow_Sum <= 3.80869e+08 )
									ret := 0.043478
								if( Negative_Money_Flow_Sum > 3.80869e+08 )
									ret := -0.426471
						if( Negative_Money_Flow_Sum > 1.98943e+09 )
							if( Negative_Money_Flow <= 1.43051e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow > 1.43051e+07 )
								ret := -1.000000 // sell
					if( d_k > 8.5794 )
						if( Raw_Money_Flow <= 1.42298e+08 )
							if( Typical_Price <= 567.117 )
								if( Money_Flow_Ratio <= 2.55152 )
									ret := -0.717391 // sell
								if( Money_Flow_Ratio > 2.55152 )
									ret := 0.086957
							if( Typical_Price > 567.117 )
								if( Money_Flow_Ratio <= 1.55096 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.55096 )
									ret := -0.250000
						if( Raw_Money_Flow > 1.42298e+08 )
							if( rsi1 <= 44.7082 )
								if( d_k <= 16.1857 )
									ret := 0.818182 // buy
								if( d_k > 16.1857 )
									ret := 0.200000
							if( rsi1 > 44.7082 )
								if( smoothD_d <= 63.9416 )
									ret := -0.500000
								if( smoothD_d > 63.9416 )
									ret := 0.000000
	if( rsi1 > 48.2248 )
		if( Positive_Money_Flow <= 14374.4 )
			if( Typical_Price <= 600.637 )
				if( Negative_Money_Flow <= 1.36849e+08 )
					if( Negative_Money_Flow_Sum <= 5.59337e+08 )
						if( Negative_Money_Flow_Sum <= 3.62971e+08 )
							if( rsi1 <= 73.0709 )
								if( Negative_Money_Flow_Sum <= 3.6669e+06 )
									ret := 0.225434
								if( Negative_Money_Flow_Sum > 3.6669e+06 )
									ret := 0.068966
							if( rsi1 > 73.0709 )
								if( k <= 83.9587 )
									ret := -0.108590
								if( k > 83.9587 )
									ret := 0.034976
						if( Negative_Money_Flow_Sum > 3.62971e+08 )
							if( MFI <= 57.8472 )
								if( Negative_Money_Flow_Sum <= 5.3742e+08 )
									ret := -0.111765
								if( Negative_Money_Flow_Sum > 5.3742e+08 )
									ret := -0.517241
							if( MFI > 57.8472 )
								if( smoothD_d <= 75.2387 )
									ret := 0.520833
								if( smoothD_d > 75.2387 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 5.59337e+08 )
						if( MFI_High <= -71.542 )
							if( smoothD_d <= 57.1954 )
								if( d <= 27.8529 )
									ret := 0.250000
								if( d > 27.8529 )
									ret := -0.869565 // sell
							if( smoothD_d > 57.1954 )
								if( Negative_Money_Flow <= 287552 )
									ret := 0.785714 // buy
								if( Negative_Money_Flow > 287552 )
									ret := -0.250000
						if( MFI_High > -71.542 )
							if( d_k <= -6.28912 )
								if( Positive_Money_Flow_Sum <= 4.23541e+08 )
									ret := -0.300000
								if( Positive_Money_Flow_Sum > 4.23541e+08 )
									ret := 0.391304
							if( d_k > -6.28912 )
								if( Negative_Money_Flow_Sum <= 5.62806e+08 )
									ret := 0.928571 // buy
								if( Negative_Money_Flow_Sum > 5.62806e+08 )
									ret := 0.281609
				if( Negative_Money_Flow > 1.36849e+08 )
					if( MFI_Low <= 41.4633 )
						if( Negative_Money_Flow_Sum <= 1.42306e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.42306e+08 )
							if( Negative_Money_Flow_Sum <= 1.50972e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.50972e+08 )
								if( Negative_Money_Flow_Sum <= 1.63347e+08 )
									ret := 0.625000
								if( Negative_Money_Flow_Sum > 1.63347e+08 )
									ret := -0.166282
					if( MFI_Low > 41.4633 )
						if( MFI_Low <= 53.3091 )
							if( rsi1 <= 77.1509 )
								if( Negative_Money_Flow <= 1.52868e+08 )
									ret := 0.428571
								if( Negative_Money_Flow > 1.52868e+08 )
									ret := 0.848485 // buy
							if( rsi1 > 77.1509 )
								if( d_k <= -0.085975 )
									ret := 1.000000 // buy
								if( d_k > -0.085975 )
									ret := -0.500000
						if( MFI_Low > 53.3091 )
							if( smoothD_d <= 81.6584 )
								if( d <= 67.8153 )
									ret := -0.500000
								if( d > 67.8153 )
									ret := -1.000000 // sell
							if( smoothD_d > 81.6584 )
								ret := 0.333333
			if( Typical_Price > 600.637 )
				if( Negative_Money_Flow <= 4.70134e+07 )
					if( Money_Flow_Ratio <= 543.75 )
						if( Negative_Money_Flow_Sum <= 3.22231e+07 )
							if( d <= 18.7843 )
								ret := -1.000000 // sell
							if( d > 18.7843 )
								if( k <= 12.5186 )
									ret := 0.750000 // buy
								if( k > 12.5186 )
									ret := -0.358491
						if( Negative_Money_Flow_Sum > 3.22231e+07 )
							if( Positive_Money_Flow_Sum <= 6.68789e+08 )
								if( MFI_Low <= 73.2763 )
									ret := -0.036765
								if( MFI_Low > 73.2763 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 6.68789e+08 )
								if( Positive_Money_Flow_Sum <= 1.02963e+09 )
									ret := 0.448980
								if( Positive_Money_Flow_Sum > 1.02963e+09 )
									ret := -0.250000
					if( Money_Flow_Ratio > 543.75 )
						ret := 1.000000 // buy
				if( Negative_Money_Flow > 4.70134e+07 )
					if( Positive_Money_Flow_Sum <= 5.93574e+08 )
						if( MFI_Low <= 11.2803 )
							if( rsi1 <= 58.1662 )
								if( d <= 45.5138 )
									ret := -0.250000
								if( d > 45.5138 )
									ret := 0.000000
							if( rsi1 > 58.1662 )
								if( Typical_Price <= 659.34 )
									ret := 1.000000 // buy
								if( Typical_Price > 659.34 )
									ret := 0.000000
						if( MFI_Low > 11.2803 )
							if( Negative_Money_Flow_Sum <= 1.43059e+08 )
								if( Negative_Money_Flow_Sum <= 6.42328e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 6.42328e+07 )
									ret := -0.833333 // sell
							if( Negative_Money_Flow_Sum > 1.43059e+08 )
								if( rsi1 <= 61.4254 )
									ret := -0.515625
								if( rsi1 > 61.4254 )
									ret := -0.083333
					if( Positive_Money_Flow_Sum > 5.93574e+08 )
						if( Typical_Price <= 623.106 )
							ret := 0.714286 // buy
						if( Typical_Price > 623.106 )
							if( smoothK_k <= 87.3186 )
								ret := -0.250000
							if( smoothK_k > 87.3186 )
								if( k <= 95.0569 )
									ret := 0.000000
								if( k > 95.0569 )
									ret := 0.250000
		if( Positive_Money_Flow > 14374.4 )
			if( Positive_Money_Flow <= 2.45615e+06 )
				if( Negative_Money_Flow <= 2307.26 )
					if( MFI_Low <= 70.2828 )
						if( Negative_Money_Flow_Sum <= 3.20378e+08 )
							if( MFI_High <= -42.2724 )
								if( Positive_Money_Flow_Sum <= 9.33949e+07 )
									ret := -0.197289
								if( Positive_Money_Flow_Sum > 9.33949e+07 )
									ret := -0.637427
							if( MFI_High > -42.2724 )
								if( Positive_Money_Flow_Sum <= 1.77377e+06 )
									ret := 0.234043
								if( Positive_Money_Flow_Sum > 1.77377e+06 )
									ret := -0.145312
						if( Negative_Money_Flow_Sum > 3.20378e+08 )
							if( Negative_Money_Flow_Sum <= 4.33896e+08 )
								if( MFI_High <= -54.6368 )
									ret := 0.209677
								if( MFI_High > -54.6368 )
									ret := -0.020408
							if( Negative_Money_Flow_Sum > 4.33896e+08 )
								if( Positive_Money_Flow_Sum <= 9.84828e+07 )
									ret := -0.316583
								if( Positive_Money_Flow_Sum > 9.84828e+07 )
									ret := -0.040650
					if( MFI_Low > 70.2828 )
						if( Positive_Money_Flow <= 795254 )
							if( d_k <= -12.3515 )
								if( Positive_Money_Flow <= 443687 )
									ret := -0.261905
								if( Positive_Money_Flow > 443687 )
									ret := -0.866667 // sell
							if( d_k > -12.3515 )
								if( MFI_High <= 18.8574 )
									ret := 0.182195
								if( MFI_High > 18.8574 )
									ret := -0.037037
						if( Positive_Money_Flow > 795254 )
							if( rsi1 <= 67.1225 )
								if( k <= 39.424 )
									ret := -0.562500
								if( k > 39.424 )
									ret := 0.281250
							if( rsi1 > 67.1225 )
								if( rsi1 <= 75.5451 )
									ret := -0.684211
								if( rsi1 > 75.5451 )
									ret := -0.212766
				if( Negative_Money_Flow > 2307.26 )
					if( Negative_Money_Flow <= 386181 )
						if( Negative_Money_Flow_Sum <= 1.49307e+08 )
							if( k <= 99.5214 )
								if( Negative_Money_Flow_Sum <= 335814 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 335814 )
									ret := 0.004068
							if( k > 99.5214 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.49307e+08 )
							if( d_k <= 1.3218 )
								if( Raw_Money_Flow <= 115094 )
									ret := -0.248485
								if( Raw_Money_Flow > 115094 )
									ret := 0.154684
							if( d_k > 1.3218 )
								if( Typical_Price <= 418.888 )
									ret := 0.157360
								if( Typical_Price > 418.888 )
									ret := 0.482234
					if( Negative_Money_Flow > 386181 )
						if( smoothD_d <= 23.4183 )
							if( smoothK_k <= 0.658799 )
								ret := -0.500000
							if( smoothK_k > 0.658799 )
								ret := -1.000000 // sell
						if( smoothD_d > 23.4183 )
							if( rsi1 <= 55.4275 )
								if( k <= 58.0893 )
									ret := 0.041667
								if( k > 58.0893 )
									ret := 0.533333
							if( rsi1 > 55.4275 )
								if( Positive_Money_Flow_Sum <= 1.0128e+09 )
									ret := -0.188235
								if( Positive_Money_Flow_Sum > 1.0128e+09 )
									ret := -0.909091 // sell
			if( Positive_Money_Flow > 2.45615e+06 )
				if( MFI_High <= -70.8429 )
					if( Negative_Money_Flow_Sum <= 7.18267e+08 )
						if( d_k <= 3.42685 )
							if( smoothD_d <= 39.7499 )
								if( d <= 18.3882 )
									ret := 0.000000
								if( d > 18.3882 )
									ret := -0.750000 // sell
							if( smoothD_d > 39.7499 )
								if( MFI <= 6.24611 )
									ret := 0.666667
								if( MFI > 6.24611 )
									ret := 0.000000
						if( d_k > 3.42685 )
							if( MFI_High <= -73.0527 )
								ret := -1.000000 // sell
							if( MFI_High > -73.0527 )
								ret := -0.333333
					if( Negative_Money_Flow_Sum > 7.18267e+08 )
						if( smoothK_k <= 53.5111 )
							ret := -0.750000 // sell
						if( smoothK_k > 53.5111 )
							ret := -1.000000 // sell
				if( MFI_High > -70.8429 )
					if( d <= 48.6047 )
						if( MFI <= 73.7081 )
							if( Negative_Money_Flow_Sum <= 5.08754e+08 )
								if( Positive_Money_Flow_Sum <= 4.09665e+08 )
									ret := 0.035068
								if( Positive_Money_Flow_Sum > 4.09665e+08 )
									ret := -0.110553
							if( Negative_Money_Flow_Sum > 5.08754e+08 )
								if( MFI <= 62.3217 )
									ret := 0.473054
								if( MFI > 62.3217 )
									ret := -0.500000
						if( MFI > 73.7081 )
							if( Positive_Money_Flow_Sum <= 8.74429e+07 )
								if( rsi1 <= 56.4654 )
									ret := 0.192308
								if( rsi1 > 56.4654 )
									ret := -0.365385
							if( Positive_Money_Flow_Sum > 8.74429e+07 )
								if( Typical_Price <= 445.33 )
									ret := 0.270960
								if( Typical_Price > 445.33 )
									ret := 0.083779
					if( d > 48.6047 )
						if( Money_Flow_Ratio <= 278.584 )
							if( MFI <= 53.8984 )
								if( Positive_Money_Flow_Sum <= 2.19563e+08 )
									ret := -0.003579
								if( Positive_Money_Flow_Sum > 2.19563e+08 )
									ret := -0.164994
							if( MFI > 53.8984 )
								if( Raw_Money_Flow <= 1.05677e+08 )
									ret := 0.042654
								if( Raw_Money_Flow > 1.05677e+08 )
									ret := -0.059603
						if( Money_Flow_Ratio > 278.584 )
							if( Raw_Money_Flow <= 4.47529e+07 )
								if( Positive_Money_Flow_Sum <= 5.47906e+08 )
									ret := 0.277778
								if( Positive_Money_Flow_Sum > 5.47906e+08 )
									ret := -0.500000
							if( Raw_Money_Flow > 4.47529e+07 )
								if( smoothD_d <= 60.9638 )
									ret := 0.000000
								if( smoothD_d > 60.9638 )
									ret := -0.613924
	
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
float op_operation = decision_tree_0_ADBE_15Min_4abb9bea(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


