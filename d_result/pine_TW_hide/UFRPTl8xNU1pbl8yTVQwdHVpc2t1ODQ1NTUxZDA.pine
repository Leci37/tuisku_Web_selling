//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: PTON_15Min_2MT0_845551d0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_2MT0_845551d0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_845551d0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 885612 )
		if( ema12 <= 0.011795 )
			if( Positive_Money_Flow <= 206.15 )
				if( ema3 <= 10.6209 )
					if( ema12 <= -0.005376 )
						if( Positive_Money_Flow_Sum <= 24927.7 )
							if( ema13 <= -0.028426 )
								if( MFI_High <= -42.7339 )
									ret := 0.236364
								if( MFI_High > -42.7339 )
									ret := 0.900000 // buy
							if( ema13 > -0.028426 )
								if( Typical_Price <= 4.92735 )
									ret := 0.526316
								if( Typical_Price > 4.92735 )
									ret := 0.896552 // buy
						if( Positive_Money_Flow_Sum > 24927.7 )
							if( MFI <= 31.1809 )
								if( Negative_Money_Flow <= 47491.9 )
									ret := -0.242268
								if( Negative_Money_Flow > 47491.9 )
									ret := 0.185965
							if( MFI > 31.1809 )
								if( Negative_Money_Flow_Sum <= 215139 )
									ret := 0.241830
								if( Negative_Money_Flow_Sum > 215139 )
									ret := 0.456067
					if( ema12 > -0.005376 )
						if( MFI_High <= -1.3308 )
							if( Positive_Money_Flow_Sum <= 126987 )
								if( MFI <= 69.2449 )
									ret := -0.092814
								if( MFI > 69.2449 )
									ret := 0.375000
							if( Positive_Money_Flow_Sum > 126987 )
								if( Money_Flow_Ratio <= 2.58021 )
									ret := 0.353623
								if( Money_Flow_Ratio > 2.58021 )
									ret := -0.342857
						if( MFI_High > -1.3308 )
							if( MFI_Low <= 71.1057 )
								if( Negative_Money_Flow_Sum <= 412664 )
									ret := 0.618056
								if( Negative_Money_Flow_Sum > 412664 )
									ret := -0.181818
							if( MFI_Low > 71.1057 )
								if( ema1 <= 4.34941 )
									ret := 0.250000
								if( ema1 > 4.34941 )
									ret := -0.244444
				if( ema3 > 10.6209 )
					if( ema12 <= -0.078387 )
						if( ema12 <= -0.296991 )
							if( MFI_High <= -13.9226 )
								ret := 0.833333 // buy
							if( MFI_High > -13.9226 )
								ret := 0.600000
						if( ema12 > -0.296991 )
							if( Raw_Money_Flow <= 214031 )
								if( ema13 <= -0.145212 )
									ret := 0.516484
								if( ema13 > -0.145212 )
									ret := -0.018868
							if( Raw_Money_Flow > 214031 )
								if( MFI <= 37.943 )
									ret := 0.458333
								if( MFI > 37.943 )
									ret := -0.666667
					if( ema12 > -0.078387 )
						if( Raw_Money_Flow <= 79754.7 )
							if( tema <= 10.6422 )
								ret := -1.000000 // sell
							if( tema > 10.6422 )
								if( MFI_Low <= 13.9162 )
									ret := -0.207143
								if( MFI_Low > 13.9162 )
									ret := 0.120287
						if( Raw_Money_Flow > 79754.7 )
							if( ema13 <= -0.015896 )
								if( ema1 <= 45.4331 )
									ret := -0.236287
								if( ema1 > 45.4331 )
									ret := 0.365854
							if( ema13 > -0.015896 )
								if( MFI_Low <= 49.0871 )
									ret := -0.580153
								if( MFI_Low > 49.0871 )
									ret := 0.187500
			if( Positive_Money_Flow > 206.15 )
				if( Positive_Money_Flow_Sum <= 146904 )
					if( Negative_Money_Flow <= 788.711 )
						if( Negative_Money_Flow_Sum <= 33442.2 )
							if( Positive_Money_Flow_Sum <= 102224 )
								if( Money_Flow_Ratio <= 4.11881 )
									ret := 0.283784
								if( Money_Flow_Ratio > 4.11881 )
									ret := -0.565217
							if( Positive_Money_Flow_Sum > 102224 )
								if( ema12 <= 0.008269 )
									ret := -0.551724
								if( ema12 > 0.008269 )
									ret := 0.700000 // buy
						if( Negative_Money_Flow_Sum > 33442.2 )
							if( MFI <= 56.3032 )
								if( Negative_Money_Flow_Sum <= 70166.7 )
									ret := 0.193237
								if( Negative_Money_Flow_Sum > 70166.7 )
									ret := -0.280603
							if( MFI > 56.3032 )
								if( ema3 <= 8.92513 )
									ret := -0.617544
								if( ema3 > 8.92513 )
									ret := -0.100000
					if( Negative_Money_Flow > 788.711 )
						if( ema1 <= 3.94218 )
							if( ema1 <= 3.60933 )
								if( Raw_Money_Flow <= 5053.87 )
									ret := -0.833333 // sell
								if( Raw_Money_Flow > 5053.87 )
									ret := -0.111111
							if( ema1 > 3.60933 )
								ret := -0.904762 // sell
						if( ema1 > 3.94218 )
							if( MFI_High <= -63.527 )
								if( Negative_Money_Flow_Sum <= 455780 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 455780 )
									ret := 0.500000
							if( MFI_High > -63.527 )
								if( Positive_Money_Flow_Sum <= 76926.3 )
									ret := 0.569620
								if( Positive_Money_Flow_Sum > 76926.3 )
									ret := 0.150685
				if( Positive_Money_Flow_Sum > 146904 )
					if( Money_Flow_Ratio <= 128.349 )
						if( Raw_Money_Flow <= 3.37258e+06 )
							if( Raw_Money_Flow <= 2.76901e+06 )
								if( Raw_Money_Flow <= 2.15518e+06 )
									ret := 0.021572
								if( Raw_Money_Flow > 2.15518e+06 )
									ret := -0.736842 // sell
							if( Raw_Money_Flow > 2.76901e+06 )
								if( ema2 <= 8.14959 )
									ret := 0.666667
								if( ema2 > 8.14959 )
									ret := 0.928571 // buy
						if( Raw_Money_Flow > 3.37258e+06 )
							if( ema12 <= -0.000391 )
								if( ema13 <= -0.051301 )
									ret := -0.500000
								if( ema13 > -0.051301 )
									ret := -0.865385 // sell
							if( ema12 > -0.000391 )
								if( ema12 <= 0.005253 )
									ret := 0.187500
								if( ema12 > 0.005253 )
									ret := -0.684211
					if( Money_Flow_Ratio > 128.349 )
						if( ema1 <= 4.6822 )
							if( Positive_Money_Flow <= 1669.57 )
								ret := -0.733333 // sell
							if( Positive_Money_Flow > 1669.57 )
								if( ema3 <= 4.03044 )
									ret := 0.733333 // buy
								if( ema3 > 4.03044 )
									ret := 0.200000
						if( ema1 > 4.6822 )
							if( ema13 <= 0.009236 )
								if( Positive_Money_Flow <= 78414.9 )
									ret := 0.722892 // buy
								if( Positive_Money_Flow > 78414.9 )
									ret := 0.333333
							if( ema13 > 0.009236 )
								ret := 0.920000 // buy
		if( ema12 > 0.011795 )
			if( MFI_High <= 13.0926 )
				if( ema2 <= 11.2794 )
					if( Negative_Money_Flow_Sum <= 138213 )
						if( Typical_Price <= 4.25651 )
							if( ema3 <= 3.25641 )
								if( ema13 <= 0.024127 )
									ret := -0.636364
								if( ema13 > 0.024127 )
									ret := -0.031250
							if( ema3 > 3.25641 )
								if( Raw_Money_Flow <= 2461.03 )
									ret := -0.840000 // sell
								if( Raw_Money_Flow > 2461.03 )
									ret := -0.560000
						if( Typical_Price > 4.25651 )
							if( ema12 <= 0.016177 )
								if( MFI <= 69.3144 )
									ret := -0.211538
								if( MFI > 69.3144 )
									ret := 0.225225
							if( ema12 > 0.016177 )
								if( Positive_Money_Flow <= 207.765 )
									ret := -0.096296
								if( Positive_Money_Flow > 207.765 )
									ret := -0.442529
					if( Negative_Money_Flow_Sum > 138213 )
						if( Positive_Money_Flow_Sum <= 3.13709e+06 )
							if( Money_Flow_Ratio <= 2.22373 )
								if( Money_Flow_Ratio <= 1.83435 )
									ret := -0.045007
								if( Money_Flow_Ratio > 1.83435 )
									ret := 0.595238
							if( Money_Flow_Ratio > 2.22373 )
								if( ema12 <= 0.014086 )
									ret := 0.294118
								if( ema12 > 0.014086 )
									ret := -0.486301
						if( Positive_Money_Flow_Sum > 3.13709e+06 )
							ret := 0.750000 // buy
				if( ema2 > 11.2794 )
					if( Typical_Price <= 41.1089 )
						if( ema13 <= 0.425787 )
							if( ema13 <= 0.051416 )
								if( Positive_Money_Flow <= 294271 )
									ret := -0.580952
								if( Positive_Money_Flow > 294271 )
									ret := 0.064516
							if( ema13 > 0.051416 )
								if( Negative_Money_Flow <= 11597.1 )
									ret := -0.461969
								if( Negative_Money_Flow > 11597.1 )
									ret := -0.232184
						if( ema13 > 0.425787 )
							if( Money_Flow_Ratio <= 0.777488 )
								ret := 0.875000 // buy
							if( Money_Flow_Ratio > 0.777488 )
								ret := -0.466667
					if( Typical_Price > 41.1089 )
						if( ema3 <= 43.1163 )
							if( ema13 <= 0.147105 )
								ret := 0.727273 // buy
							if( ema13 > 0.147105 )
								if( Negative_Money_Flow_Sum <= 381881 )
									ret := 0.071429
								if( Negative_Money_Flow_Sum > 381881 )
									ret := -0.625000
						if( ema3 > 43.1163 )
							if( Positive_Money_Flow_Sum <= 247996 )
								if( Negative_Money_Flow <= 3836.48 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow > 3836.48 )
									ret := 0.529412
							if( Positive_Money_Flow_Sum > 247996 )
								if( Positive_Money_Flow <= 450038 )
									ret := -0.247580
								if( Positive_Money_Flow > 450038 )
									ret := 0.029412
			if( MFI_High > 13.0926 )
				if( MFI_Low <= 78.9413 )
					if( tema <= 70.7985 )
						if( MFI_High <= 18.5699 )
							if( Negative_Money_Flow_Sum <= 385767 )
								if( tema <= 8.43775 )
									ret := 0.041451
								if( tema > 8.43775 )
									ret := -0.240580
							if( Negative_Money_Flow_Sum > 385767 )
								if( Raw_Money_Flow <= 1.85798e+07 )
									ret := 0.277778
								if( Raw_Money_Flow > 1.85798e+07 )
									ret := -0.378378
						if( MFI_High > 18.5699 )
							if( Raw_Money_Flow <= 67320.5 )
								if( Negative_Money_Flow_Sum <= 231192 )
									ret := -0.684211
								if( Negative_Money_Flow_Sum > 231192 )
									ret := 0.166667
							if( Raw_Money_Flow > 67320.5 )
								if( ema3 <= 15.926 )
									ret := 0.125000
								if( ema3 > 15.926 )
									ret := 0.562500
					if( tema > 70.7985 )
						if( Negative_Money_Flow_Sum <= 734851 )
							if( ema3 <= 87.8166 )
								ret := -0.800000 // sell
							if( ema3 > 87.8166 )
								if( tema <= 109.53 )
									ret := 0.153846
								if( tema > 109.53 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 734851 )
							if( ema1 <= 116.484 )
								ret := -0.941176 // sell
							if( ema1 > 116.484 )
								ret := -0.545455
				if( MFI_Low > 78.9413 )
					if( Positive_Money_Flow_Sum <= 5.35798e+07 )
						if( Positive_Money_Flow_Sum <= 2.9463e+07 )
							if( tema <= 8.92771 )
								if( Money_Flow_Ratio <= 626.622 )
									ret := -0.303644
								if( Money_Flow_Ratio > 626.622 )
									ret := -0.760000 // sell
							if( tema > 8.92771 )
								if( ema2 <= 9.11359 )
									ret := 0.636364
								if( ema2 > 9.11359 )
									ret := -0.004329
						if( Positive_Money_Flow_Sum > 2.9463e+07 )
							if( Typical_Price <= 25.5005 )
								if( Negative_Money_Flow <= 2328.64 )
									ret := -0.823529 // sell
								if( Negative_Money_Flow > 2328.64 )
									ret := -0.045455
							if( Typical_Price > 25.5005 )
								if( ema3 <= 64.0936 )
									ret := -0.067797
								if( ema3 > 64.0936 )
									ret := -0.956522 // sell
					if( Positive_Money_Flow_Sum > 5.35798e+07 )
						if( Negative_Money_Flow_Sum <= 266946 )
							if( MFI <= 99.8244 )
								if( Positive_Money_Flow <= 2.73816e+06 )
									ret := 0.263158
								if( Positive_Money_Flow > 2.73816e+06 )
									ret := 0.891304 // buy
							if( MFI > 99.8244 )
								if( Money_Flow_Ratio <= 3214.46 )
									ret := 0.266667
								if( Money_Flow_Ratio > 3214.46 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 266946 )
							if( Negative_Money_Flow_Sum <= 277659 )
								ret := -0.600000
							if( Negative_Money_Flow_Sum > 277659 )
								if( Positive_Money_Flow_Sum <= 6.4372e+07 )
									ret := 0.531915
								if( Positive_Money_Flow_Sum > 6.4372e+07 )
									ret := -0.201389
	if( Negative_Money_Flow_Sum > 885612 )
		if( ema13 <= -4.00225 )
			if( Negative_Money_Flow_Sum <= 8.13675e+08 )
				if( Money_Flow_Ratio <= 0.00962 )
					ret := 0.666667
				if( Money_Flow_Ratio > 0.00962 )
					if( ema2 <= 129.648 )
						if( Money_Flow_Ratio <= 0.431888 )
							if( Raw_Money_Flow <= 5.93448e+06 )
								ret := -0.833333 // sell
							if( Raw_Money_Flow > 5.93448e+06 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.431888 )
							ret := -0.636364
					if( ema2 > 129.648 )
						ret := -0.125000
			if( Negative_Money_Flow_Sum > 8.13675e+08 )
				if( ema2 <= 98.8953 )
					if( MFI <= 30.5711 )
						if( ema3 <= 93.0299 )
							ret := -0.636364
						if( ema3 > 93.0299 )
							if( ema2 <= 94.2548 )
								ret := -1.000000 // sell
							if( ema2 > 94.2548 )
								ret := -0.818182 // sell
					if( MFI > 30.5711 )
						ret := -0.333333
				if( ema2 > 98.8953 )
					if( tema <= 99.6563 )
						ret := 1.000000 // buy
					if( tema > 99.6563 )
						ret := 0.625000
		if( ema13 > -4.00225 )
			if( Negative_Money_Flow <= 51.4374 )
				if( Positive_Money_Flow <= 254649 )
					if( MFI_Low <= 6.11873 )
						if( tema <= 30.4033 )
							if( Typical_Price <= 7.5853 )
								if( ema12 <= 0.006464 )
									ret := -0.050481
								if( ema12 > 0.006464 )
									ret := -0.348214
							if( Typical_Price > 7.5853 )
								if( Positive_Money_Flow_Sum <= 4.60459e+06 )
									ret := -0.439252
								if( Positive_Money_Flow_Sum > 4.60459e+06 )
									ret := -0.171004
						if( tema > 30.4033 )
							if( Positive_Money_Flow_Sum <= 242046 )
								if( ema3 <= 80.5904 )
									ret := 0.500000
								if( ema3 > 80.5904 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 242046 )
								if( ema12 <= 0.319258 )
									ret := -0.016917
								if( ema12 > 0.319258 )
									ret := -0.565217
					if( MFI_Low > 6.11873 )
						if( ema12 <= -0.004174 )
							if( Raw_Money_Flow <= 13792.8 )
								if( Positive_Money_Flow_Sum <= 1.61324e+07 )
									ret := 0.254848
								if( Positive_Money_Flow_Sum > 1.61324e+07 )
									ret := 0.023041
							if( Raw_Money_Flow > 13792.8 )
								if( MFI_Low <= 12.0233 )
									ret := 0.187755
								if( MFI_Low > 12.0233 )
									ret := -0.134529
						if( ema12 > -0.004174 )
							if( ema1 <= 23.6891 )
								if( Money_Flow_Ratio <= 18.7214 )
									ret := -0.180682
								if( Money_Flow_Ratio > 18.7214 )
									ret := 0.592593
							if( ema1 > 23.6891 )
								if( ema2 <= 24.4911 )
									ret := 0.446809
								if( ema2 > 24.4911 )
									ret := -0.046232
				if( Positive_Money_Flow > 254649 )
					if( Positive_Money_Flow <= 3.63824e+06 )
						if( Positive_Money_Flow_Sum <= 7.96017e+06 )
							if( Raw_Money_Flow <= 2.11088e+06 )
								if( Positive_Money_Flow_Sum <= 726084 )
									ret := 0.545455
								if( Positive_Money_Flow_Sum > 726084 )
									ret := -0.085137
							if( Raw_Money_Flow > 2.11088e+06 )
								if( ema1 <= 8.83855 )
									ret := 0.410138
								if( ema1 > 8.83855 )
									ret := 0.056604
						if( Positive_Money_Flow_Sum > 7.96017e+06 )
							if( ema3 <= 8.53966 )
								if( Money_Flow_Ratio <= 6.40801 )
									ret := 0.033404
								if( Money_Flow_Ratio > 6.40801 )
									ret := -0.262500
							if( ema3 > 8.53966 )
								if( MFI_Low <= 23.5898 )
									ret := 0.009009
								if( MFI_Low > 23.5898 )
									ret := 0.186133
					if( Positive_Money_Flow > 3.63824e+06 )
						if( Positive_Money_Flow_Sum <= 1.40713e+09 )
							if( Typical_Price <= 49.4454 )
								if( ema12 <= -0.279482 )
									ret := 0.132743
								if( ema12 > -0.279482 )
									ret := -0.061582
							if( Typical_Price > 49.4454 )
								if( ema2 <= 98.1617 )
									ret := 0.137108
								if( ema2 > 98.1617 )
									ret := -0.056144
						if( Positive_Money_Flow_Sum > 1.40713e+09 )
							if( ema1 <= 54.2747 )
								ret := 0.545455
							if( ema1 > 54.2747 )
								if( MFI_Low <= 64.9522 )
									ret := -0.771654 // sell
								if( MFI_Low > 64.9522 )
									ret := -0.206897
			if( Negative_Money_Flow > 51.4374 )
				if( Negative_Money_Flow <= 460584 )
					if( ema1 <= 80.7811 )
						if( Negative_Money_Flow_Sum <= 1.70685e+07 )
							if( Positive_Money_Flow_Sum <= 74590.8 )
								if( MFI <= 0.245909 )
									ret := -0.315789
								if( MFI > 0.245909 )
									ret := 0.709459 // buy
							if( Positive_Money_Flow_Sum > 74590.8 )
								if( Positive_Money_Flow <= 7545.82 )
									ret := 0.146325
								if( Positive_Money_Flow > 7545.82 )
									ret := 0.290162
						if( Negative_Money_Flow_Sum > 1.70685e+07 )
							if( ema12 <= -0.004274 )
								if( ema2 <= 9.75222 )
									ret := 0.021792
								if( ema2 > 9.75222 )
									ret := 0.174855
							if( ema12 > -0.004274 )
								if( Positive_Money_Flow_Sum <= 5.8495e+08 )
									ret := -0.073806
								if( Positive_Money_Flow_Sum > 5.8495e+08 )
									ret := 0.814815 // buy
					if( ema1 > 80.7811 )
						if( ema13 <= -1.22656 )
							if( Negative_Money_Flow_Sum <= 7.23858e+06 )
								if( ema12 <= -0.985451 )
									ret := 1.000000 // buy
								if( ema12 > -0.985451 )
									ret := 0.480000
							if( Negative_Money_Flow_Sum > 7.23858e+06 )
								if( tema <= 109.744 )
									ret := -0.200000
								if( tema > 109.744 )
									ret := 0.108108
						if( ema13 > -1.22656 )
							if( MFI_High <= -65.8161 )
								if( Positive_Money_Flow <= 13198.9 )
									ret := -0.127572
								if( Positive_Money_Flow > 13198.9 )
									ret := -0.807692 // sell
							if( MFI_High > -65.8161 )
								if( Positive_Money_Flow_Sum <= 5.39541e+06 )
									ret := -0.088391
								if( Positive_Money_Flow_Sum > 5.39541e+06 )
									ret := 0.061566
				if( Negative_Money_Flow > 460584 )
					if( MFI_High <= 3.8561 )
						if( ema13 <= -0.554283 )
							if( ema2 <= 38.9765 )
								if( ema13 <= -0.687903 )
									ret := 0.601562
								if( ema13 > -0.687903 )
									ret := 0.241636
							if( ema2 > 38.9765 )
								if( Raw_Money_Flow <= 2.00703e+06 )
									ret := 0.314050
								if( Raw_Money_Flow > 2.00703e+06 )
									ret := 0.037289
						if( ema13 > -0.554283 )
							if( MFI <= 38.5409 )
								if( MFI_High <= -79.7559 )
									ret := 0.216049
								if( MFI_High > -79.7559 )
									ret := -0.040147
							if( MFI > 38.5409 )
								if( ema3 <= 7.57411 )
									ret := -0.022744
								if( ema3 > 7.57411 )
									ret := 0.066256
					if( MFI_High > 3.8561 )
						if( Positive_Money_Flow_Sum <= 2.42961e+08 )
							if( MFI_Low <= 67.7298 )
								if( ema3 <= 34.0975 )
									ret := -0.308989
								if( ema3 > 34.0975 )
									ret := -0.641791
							if( MFI_Low > 67.7298 )
								if( MFI_Low <= 77.7725 )
									ret := -0.776119 // sell
								if( MFI_Low > 77.7725 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 2.42961e+08 )
							if( Positive_Money_Flow_Sum <= 4.70562e+09 )
								if( Positive_Money_Flow_Sum <= 2.75616e+08 )
									ret := 0.827586 // buy
								if( Positive_Money_Flow_Sum > 2.75616e+08 )
									ret := 0.126050
							if( Positive_Money_Flow_Sum > 4.70562e+09 )
								ret := -0.947368 // sell
	
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
float op_operation = decision_tree_0_PTON_15Min_845551d0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


