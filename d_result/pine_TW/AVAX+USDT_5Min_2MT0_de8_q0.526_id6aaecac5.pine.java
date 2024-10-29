//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AVAXUSDT_5Min_2MT0_6aaecac5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_5Min_2MT0_6aaecac5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_5Min_6aaecac5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.113622 )
		if( Raw_Money_Flow <= 2.73479e+06 )
			if( ema2 <= 57.2348 )
				if( Negative_Money_Flow <= 302055 )
					if( Positive_Money_Flow_Sum <= 1.00166e+07 )
						if( Negative_Money_Flow_Sum <= 2.117e+07 )
							if( Negative_Money_Flow_Sum <= 3.8199e+06 )
								if( Negative_Money_Flow_Sum <= 1.63438e+06 )
									ret := 0.388889
								if( Negative_Money_Flow_Sum > 1.63438e+06 )
									ret := -0.069128
							if( Negative_Money_Flow_Sum > 3.8199e+06 )
								if( Raw_Money_Flow <= 255487 )
									ret := 0.321508
								if( Raw_Money_Flow > 255487 )
									ret := 0.070078
						if( Negative_Money_Flow_Sum > 2.117e+07 )
							if( ema13 <= -0.52608 )
								if( ema13 <= -0.742525 )
									ret := -0.540984
								if( ema13 > -0.742525 )
									ret := 0.000000
							if( ema13 > -0.52608 )
								if( ema3 <= 41.5675 )
									ret := -0.500000
								if( ema3 > 41.5675 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.00166e+07 )
						if( tema <= 38.5989 )
							if( MFI <= 29.4638 )
								ret := -0.600000
							if( MFI > 29.4638 )
								if( Money_Flow_Ratio <= 0.740237 )
									ret := 0.617647
								if( Money_Flow_Ratio > 0.740237 )
									ret := 0.977273 // buy
						if( tema > 38.5989 )
							if( Positive_Money_Flow_Sum <= 1.21241e+07 )
								if( Positive_Money_Flow <= 970384 )
									ret := -0.312500
								if( Positive_Money_Flow > 970384 )
									ret := 0.626667
							if( Positive_Money_Flow_Sum > 1.21241e+07 )
								if( ema13 <= -1.03112 )
									ret := 1.000000 // buy
								if( ema13 > -1.03112 )
									ret := -0.115789
				if( Negative_Money_Flow > 302055 )
					if( MFI_Low <= 13.9906 )
						if( Positive_Money_Flow_Sum <= 1.21401e+06 )
							if( Positive_Money_Flow_Sum <= 1.05862e+06 )
								if( ema12 <= -0.247632 )
									ret := -0.146199
								if( ema12 > -0.247632 )
									ret := 0.227031
							if( Positive_Money_Flow_Sum > 1.05862e+06 )
								if( Negative_Money_Flow <= 440478 )
									ret := 0.128205
								if( Negative_Money_Flow > 440478 )
									ret := 0.605714
						if( Positive_Money_Flow_Sum > 1.21401e+06 )
							if( Negative_Money_Flow_Sum <= 1.66017e+07 )
								if( Positive_Money_Flow_Sum <= 6.56457e+06 )
									ret := 0.090177
								if( Positive_Money_Flow_Sum > 6.56457e+06 )
									ret := -0.681818
							if( Negative_Money_Flow_Sum > 1.66017e+07 )
								if( MFI <= 16.6316 )
									ret := -0.252874
								if( MFI > 16.6316 )
									ret := 0.416887
					if( MFI_Low > 13.9906 )
						if( Positive_Money_Flow_Sum <= 1.22718e+07 )
							if( Positive_Money_Flow_Sum <= 1.01437e+07 )
								if( MFI <= 37.3513 )
									ret := 0.412121
								if( MFI > 37.3513 )
									ret := 0.173077
							if( Positive_Money_Flow_Sum > 1.01437e+07 )
								if( Negative_Money_Flow_Sum <= 2.10336e+07 )
									ret := 0.845361 // buy
								if( Negative_Money_Flow_Sum > 2.10336e+07 )
									ret := -0.500000
						if( Positive_Money_Flow_Sum > 1.22718e+07 )
							if( ema3 <= 43.1105 )
								if( ema13 <= -0.856577 )
									ret := -0.777778 // sell
								if( ema13 > -0.856577 )
									ret := 0.527273
							if( ema3 > 43.1105 )
								if( Negative_Money_Flow_Sum <= 2.30171e+07 )
									ret := -0.071429
								if( Negative_Money_Flow_Sum > 2.30171e+07 )
									ret := -0.925926 // sell
			if( ema2 > 57.2348 )
				if( ema12 <= -0.575972 )
					if( MFI_Low <= 9.51868 )
						if( Raw_Money_Flow <= 2.0521e+06 )
							if( ema13 <= -1.03825 )
								ret := 1.000000 // buy
							if( ema13 > -1.03825 )
								ret := 0.750000 // buy
						if( Raw_Money_Flow > 2.0521e+06 )
							ret := -0.250000
					if( MFI_Low > 9.51868 )
						ret := -1.000000 // sell
				if( ema12 > -0.575972 )
					if( MFI_Low <= 9.78405 )
						if( Raw_Money_Flow <= 856334 )
							if( ema1 <= 57.8984 )
								ret := 1.000000 // buy
							if( ema1 > 57.8984 )
								ret := 0.200000
						if( Raw_Money_Flow > 856334 )
							if( ema13 <= -0.363692 )
								if( Positive_Money_Flow_Sum <= 6.91274e+06 )
									ret := -0.319149
								if( Positive_Money_Flow_Sum > 6.91274e+06 )
									ret := -0.791667 // sell
							if( ema13 > -0.363692 )
								if( Money_Flow_Ratio <= 0.387916 )
									ret := 0.571429
								if( Money_Flow_Ratio > 0.387916 )
									ret := -0.750000 // sell
					if( MFI_Low > 9.78405 )
						if( ema2 <= 59.9128 )
							if( ema13 <= -0.722149 )
								if( tema <= 57.7743 )
									ret := 1.000000 // buy
								if( tema > 57.7743 )
									ret := 0.750000 // buy
							if( ema13 > -0.722149 )
								if( MFI_Low <= 37.8735 )
									ret := -0.419355
								if( MFI_Low > 37.8735 )
									ret := 1.000000 // buy
						if( ema2 > 59.9128 )
							if( Positive_Money_Flow_Sum <= 8.88444e+06 )
								if( ema2 <= 60.9563 )
									ret := 1.000000 // buy
								if( ema2 > 60.9563 )
									ret := 0.600000
							if( Positive_Money_Flow_Sum > 8.88444e+06 )
								if( Money_Flow_Ratio <= 0.862003 )
									ret := -0.166667
								if( Money_Flow_Ratio > 0.862003 )
									ret := 0.555556
		if( Raw_Money_Flow > 2.73479e+06 )
			if( MFI <= 42.0579 )
				if( Raw_Money_Flow <= 4.64289e+06 )
					if( MFI <= 34.1965 )
						if( ema12 <= -0.348177 )
							if( ema13 <= -0.788562 )
								if( Negative_Money_Flow_Sum <= 2.11185e+07 )
									ret := -0.406250
								if( Negative_Money_Flow_Sum > 2.11185e+07 )
									ret := 0.348214
							if( ema13 > -0.788562 )
								if( Positive_Money_Flow <= 3.34575e+06 )
									ret := 0.900000 // buy
								if( Positive_Money_Flow > 3.34575e+06 )
									ret := -0.500000
						if( ema12 > -0.348177 )
							if( Negative_Money_Flow_Sum <= 1.05922e+07 )
								if( Money_Flow_Ratio <= 0.368527 )
									ret := 0.685185
								if( Money_Flow_Ratio > 0.368527 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 1.05922e+07 )
								if( Negative_Money_Flow <= 3.8779e+06 )
									ret := 0.107438
								if( Negative_Money_Flow > 3.8779e+06 )
									ret := -0.484848
					if( MFI > 34.1965 )
						if( ema3 <= 60.0887 )
							if( Positive_Money_Flow_Sum <= 1.08916e+07 )
								if( Negative_Money_Flow_Sum <= 7.47724e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 7.47724e+06 )
									ret := 0.943396 // buy
							if( Positive_Money_Flow_Sum > 1.08916e+07 )
								if( ema12 <= -0.641297 )
									ret := 1.000000 // buy
								if( ema12 > -0.641297 )
									ret := 0.370370
						if( ema3 > 60.0887 )
							ret := -0.250000
				if( Raw_Money_Flow > 4.64289e+06 )
					if( ema2 <= 58.9225 )
						if( ema3 <= 39.9986 )
							if( MFI <= 21.0486 )
								if( MFI_Low <= -1.12271 )
									ret := 0.638889
								if( MFI_Low > -1.12271 )
									ret := -0.222222
							if( MFI > 21.0486 )
								if( Typical_Price <= 37.11 )
									ret := 1.000000 // buy
								if( Typical_Price > 37.11 )
									ret := 0.750000 // buy
						if( ema3 > 39.9986 )
							if( Typical_Price <= 55.5869 )
								if( MFI_Low <= -4.08807 )
									ret := 1.000000 // buy
								if( MFI_Low > -4.08807 )
									ret := 0.882353 // buy
							if( Typical_Price > 55.5869 )
								if( ema1 <= 56.935 )
									ret := 0.250000
								if( ema1 > 56.935 )
									ret := 1.000000 // buy
					if( ema2 > 58.9225 )
						ret := -0.200000
			if( MFI > 42.0579 )
				if( tema <= 37.1391 )
					if( Positive_Money_Flow <= 4.7021e+06 )
						if( Raw_Money_Flow <= 3.02478e+06 )
							ret := 0.333333
						if( Raw_Money_Flow > 3.02478e+06 )
							if( Negative_Money_Flow_Sum <= 2.96152e+07 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 2.96152e+07 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 4.7021e+06 )
						if( Typical_Price <= 35.1567 )
							ret := 0.800000 // buy
						if( Typical_Price > 35.1567 )
							ret := -1.000000 // sell
				if( tema > 37.1391 )
					if( ema13 <= -0.054245 )
						if( MFI_Low <= 25.9241 )
							if( ema13 <= -0.510282 )
								ret := 0.250000
							if( ema13 > -0.510282 )
								if( Positive_Money_Flow_Sum <= 9.64091e+06 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 9.64091e+06 )
									ret := -0.968750 // sell
						if( MFI_Low > 25.9241 )
							if( Positive_Money_Flow <= 2.91166e+06 )
								if( MFI <= 47.848 )
									ret := 1.000000 // buy
								if( MFI > 47.848 )
									ret := -0.222222
							if( Positive_Money_Flow > 2.91166e+06 )
								if( MFI <= 55.6103 )
									ret := -1.000000 // sell
								if( MFI > 55.6103 )
									ret := -0.500000
					if( ema13 > -0.054245 )
						if( Positive_Money_Flow_Sum <= 4.04914e+07 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.04914e+07 )
							ret := 0.250000
	if( ema12 > -0.113622 )
		if( Positive_Money_Flow_Sum <= 288128 )
			if( Raw_Money_Flow <= 445571 )
				if( Negative_Money_Flow_Sum <= 862858 )
					if( ema12 <= -0.024517 )
						if( ema1 <= 10.9448 )
							if( ema12 <= -0.026548 )
								if( MFI_High <= -60.6609 )
									ret := 0.630952
								if( MFI_High > -60.6609 )
									ret := 0.166667
							if( ema12 > -0.026548 )
								if( ema3 <= 9.54299 )
									ret := -0.409091
								if( ema3 > 9.54299 )
									ret := 0.242424
						if( ema1 > 10.9448 )
							if( Positive_Money_Flow_Sum <= 166778 )
								if( Negative_Money_Flow_Sum <= 565000 )
									ret := 0.085837
								if( Negative_Money_Flow_Sum > 565000 )
									ret := -0.156250
							if( Positive_Money_Flow_Sum > 166778 )
								if( Positive_Money_Flow_Sum <= 182623 )
									ret := 0.494382
								if( Positive_Money_Flow_Sum > 182623 )
									ret := 0.074820
					if( ema12 > -0.024517 )
						if( ema3 <= 10.1823 )
							if( MFI_Low <= 12.3565 )
								if( Negative_Money_Flow_Sum <= 91045.2 )
									ret := -0.220126
								if( Negative_Money_Flow_Sum > 91045.2 )
									ret := -0.021277
							if( MFI_Low > 12.3565 )
								if( ema13 <= 0.030386 )
									ret := 0.042996
								if( ema13 > 0.030386 )
									ret := 0.446429
						if( ema3 > 10.1823 )
							if( Positive_Money_Flow_Sum <= 181354 )
								if( ema2 <= 14.3161 )
									ret := -0.009970
								if( ema2 > 14.3161 )
									ret := 0.108434
							if( Positive_Money_Flow_Sum > 181354 )
								if( Money_Flow_Ratio <= 2.07788 )
									ret := -0.085904
								if( Money_Flow_Ratio > 2.07788 )
									ret := 0.121065
				if( Negative_Money_Flow_Sum > 862858 )
					if( Positive_Money_Flow <= 127529 )
						if( Negative_Money_Flow_Sum <= 3.05249e+06 )
							if( ema13 <= -0.09105 )
								if( MFI_High <= -75.7453 )
									ret := 0.170213
								if( MFI_High > -75.7453 )
									ret := -0.214027
							if( ema13 > -0.09105 )
								if( Negative_Money_Flow_Sum <= 898452 )
									ret := -0.292994
								if( Negative_Money_Flow_Sum > 898452 )
									ret := -0.004704
						if( Negative_Money_Flow_Sum > 3.05249e+06 )
							if( ema12 <= -0.046402 )
								if( ema3 <= 26.0077 )
									ret := 0.350000
								if( ema3 > 26.0077 )
									ret := 1.000000 // buy
							if( ema12 > -0.046402 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow > 127529 )
						if( ema3 <= 15.9661 )
							if( ema1 <= 11.4339 )
								ret := 0.000000
							if( ema1 > 11.4339 )
								ret := -0.500000
						if( ema3 > 15.9661 )
							if( Typical_Price <= 25.5629 )
								ret := 1.000000 // buy
							if( Typical_Price > 25.5629 )
								if( Negative_Money_Flow_Sum <= 1.88339e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.88339e+06 )
									ret := 0.500000
			if( Raw_Money_Flow > 445571 )
				if( tema <= 25.5066 )
					if( MFI_High <= -75.9497 )
						if( Raw_Money_Flow <= 1.0691e+06 )
							if( Positive_Money_Flow_Sum <= 36845 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 36845 )
								ret := -0.800000 // sell
						if( Raw_Money_Flow > 1.0691e+06 )
							ret := 0.600000
					if( MFI_High > -75.9497 )
						if( Negative_Money_Flow_Sum <= 3.00488e+06 )
							if( ema13 <= -0.142299 )
								ret := -0.571429
							if( ema13 > -0.142299 )
								if( ema1 <= 10.5053 )
									ret := 0.268293
								if( ema1 > 10.5053 )
									ret := 0.673469
						if( Negative_Money_Flow_Sum > 3.00488e+06 )
							ret := 1.000000 // buy
				if( tema > 25.5066 )
					if( Money_Flow_Ratio <= 0.100862 )
						if( Typical_Price <= 29.357 )
							if( ema12 <= -0.072452 )
								ret := -1.000000 // sell
							if( ema12 > -0.072452 )
								ret := -0.500000
						if( Typical_Price > 29.357 )
							if( Positive_Money_Flow_Sum <= 135772 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 135772 )
								ret := 0.000000
					if( Money_Flow_Ratio > 0.100862 )
						if( ema3 <= 27.5261 )
							if( ema1 <= 26.9414 )
								ret := 0.250000
							if( ema1 > 26.9414 )
								ret := 0.800000 // buy
						if( ema3 > 27.5261 )
							if( Positive_Money_Flow_Sum <= 269350 )
								if( Money_Flow_Ratio <= 0.132811 )
									ret := -0.250000
								if( Money_Flow_Ratio > 0.132811 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 269350 )
								ret := 0.333333
		if( Positive_Money_Flow_Sum > 288128 )
			if( Money_Flow_Ratio <= 0.341683 )
				if( tema <= 25.7279 )
					if( Positive_Money_Flow_Sum <= 1.00152e+06 )
						if( Positive_Money_Flow_Sum <= 356965 )
							if( Negative_Money_Flow_Sum <= 1.57448e+06 )
								if( Negative_Money_Flow_Sum <= 1.04744e+06 )
									ret := -0.119048
								if( Negative_Money_Flow_Sum > 1.04744e+06 )
									ret := 0.412844
							if( Negative_Money_Flow_Sum > 1.57448e+06 )
								if( Negative_Money_Flow_Sum <= 2.61276e+06 )
									ret := -0.123596
								if( Negative_Money_Flow_Sum > 2.61276e+06 )
									ret := 0.363636
						if( Positive_Money_Flow_Sum > 356965 )
							if( Negative_Money_Flow_Sum <= 2.54644e+06 )
								if( ema13 <= -0.14786 )
									ret := 0.617391
								if( ema13 > -0.14786 )
									ret := 0.177801
							if( Negative_Money_Flow_Sum > 2.54644e+06 )
								if( Positive_Money_Flow_Sum <= 519828 )
									ret := 0.634146
								if( Positive_Money_Flow_Sum > 519828 )
									ret := 0.339869
					if( Positive_Money_Flow_Sum > 1.00152e+06 )
						if( Positive_Money_Flow_Sum <= 1.07504e+06 )
							if( MFI <= 24.5376 )
								if( Money_Flow_Ratio <= 0.169617 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.169617 )
									ret := -0.532258
							if( MFI > 24.5376 )
								ret := 0.571429
						if( Positive_Money_Flow_Sum > 1.07504e+06 )
							if( MFI_High <= -55.7126 )
								if( Raw_Money_Flow <= 138390 )
									ret := 0.958333 // buy
								if( Raw_Money_Flow > 138390 )
									ret := 0.111111
							if( MFI_High > -55.7126 )
								if( Negative_Money_Flow_Sum <= 3.54873e+06 )
									ret := 0.058824
								if( Negative_Money_Flow_Sum > 3.54873e+06 )
									ret := -0.600000
				if( tema > 25.7279 )
					if( Raw_Money_Flow <= 112830 )
						if( Positive_Money_Flow_Sum <= 656874 )
							if( Negative_Money_Flow_Sum <= 2.43649e+06 )
								if( Negative_Money_Flow_Sum <= 976664 )
									ret := 0.536585
								if( Negative_Money_Flow_Sum > 976664 )
									ret := -0.049531
							if( Negative_Money_Flow_Sum > 2.43649e+06 )
								if( ema13 <= -0.148537 )
									ret := 0.093750
								if( ema13 > -0.148537 )
									ret := 0.645570
						if( Positive_Money_Flow_Sum > 656874 )
							if( Positive_Money_Flow_Sum <= 834504 )
								if( ema12 <= -0.086776 )
									ret := 0.250000
								if( ema12 > -0.086776 )
									ret := -0.485714
							if( Positive_Money_Flow_Sum > 834504 )
								if( MFI_High <= -56.135 )
									ret := -0.252874
								if( MFI_High > -56.135 )
									ret := 0.357143
					if( Raw_Money_Flow > 112830 )
						if( ema13 <= -0.181698 )
							if( Money_Flow_Ratio <= 0.16696 )
								if( MFI <= 13.7927 )
									ret := 0.441176
								if( MFI > 13.7927 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.16696 )
								if( ema13 <= -0.182961 )
									ret := -0.026820
								if( ema13 > -0.182961 )
									ret := -0.700000 // sell
						if( ema13 > -0.181698 )
							if( Negative_Money_Flow_Sum <= 2.17119e+06 )
								if( Raw_Money_Flow <= 212919 )
									ret := 0.200331
								if( Raw_Money_Flow > 212919 )
									ret := -0.106061
							if( Negative_Money_Flow_Sum > 2.17119e+06 )
								if( Negative_Money_Flow_Sum <= 3.32716e+06 )
									ret := 0.323202
								if( Negative_Money_Flow_Sum > 3.32716e+06 )
									ret := 0.130137
			if( Money_Flow_Ratio > 0.341683 )
				if( ema1 <= 34.6894 )
					if( Positive_Money_Flow_Sum <= 2.36742e+07 )
						if( ema12 <= 0.009009 )
							if( Negative_Money_Flow <= 588022 )
								if( Typical_Price <= 26.9362 )
									ret := 0.094919
								if( Typical_Price > 26.9362 )
									ret := 0.029349
							if( Negative_Money_Flow > 588022 )
								if( Negative_Money_Flow_Sum <= 1.05487e+07 )
									ret := 0.295992
								if( Negative_Money_Flow_Sum > 1.05487e+07 )
									ret := -0.146341
						if( ema12 > 0.009009 )
							if( ema12 <= 0.110978 )
								if( Positive_Money_Flow <= 2.73825e+06 )
									ret := 0.028338
								if( Positive_Money_Flow > 2.73825e+06 )
									ret := 0.772727 // buy
							if( ema12 > 0.110978 )
								if( Positive_Money_Flow <= 1.74665e+06 )
									ret := 0.141382
								if( Positive_Money_Flow > 1.74665e+06 )
									ret := -0.165289
					if( Positive_Money_Flow_Sum > 2.36742e+07 )
						if( ema12 <= 0.118488 )
							if( Positive_Money_Flow_Sum <= 2.47658e+07 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 2.47658e+07 )
								ret := 1.000000 // buy
						if( ema12 > 0.118488 )
							if( tema <= 29.4622 )
								if( Positive_Money_Flow <= 586576 )
									ret := -0.600000
								if( Positive_Money_Flow > 586576 )
									ret := -0.882353 // sell
							if( tema > 29.4622 )
								if( MFI_Low <= 61.247 )
									ret := 0.000000
								if( MFI_Low > 61.247 )
									ret := -0.800000 // sell
				if( ema1 > 34.6894 )
					if( ema1 <= 62.9603 )
						if( Positive_Money_Flow_Sum <= 4.60473e+06 )
							if( Negative_Money_Flow_Sum <= 1.36682e+06 )
								if( Positive_Money_Flow_Sum <= 2.93475e+06 )
									ret := -0.018654
								if( Positive_Money_Flow_Sum > 2.93475e+06 )
									ret := -0.137699
							if( Negative_Money_Flow_Sum > 1.36682e+06 )
								if( Raw_Money_Flow <= 533567 )
									ret := 0.038467
								if( Raw_Money_Flow > 533567 )
									ret := -0.062619
						if( Positive_Money_Flow_Sum > 4.60473e+06 )
							if( Negative_Money_Flow_Sum <= 5.81035e+06 )
								if( Negative_Money_Flow_Sum <= 5.33116e+06 )
									ret := 0.090405
								if( Negative_Money_Flow_Sum > 5.33116e+06 )
									ret := 0.395080
							if( Negative_Money_Flow_Sum > 5.81035e+06 )
								if( Raw_Money_Flow <= 536688 )
									ret := 0.282572
								if( Raw_Money_Flow > 536688 )
									ret := -0.053018
					if( ema1 > 62.9603 )
						if( Negative_Money_Flow_Sum <= 1.10533e+07 )
							if( Positive_Money_Flow_Sum <= 4.52415e+07 )
								if( tema <= 64.6338 )
									ret := -1.000000 // sell
								if( tema > 64.6338 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 4.52415e+07 )
								ret := -0.428571
						if( Negative_Money_Flow_Sum > 1.10533e+07 )
							if( Negative_Money_Flow_Sum <= 2.09437e+07 )
								ret := 0.285714
							if( Negative_Money_Flow_Sum > 2.09437e+07 )
								if( MFI_High <= -31.4925 )
									ret := -0.400000
								if( MFI_High > -31.4925 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_AVAXUSDT_5Min_6aaecac5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


