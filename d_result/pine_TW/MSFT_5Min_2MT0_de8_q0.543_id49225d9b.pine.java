//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: MSFT_5Min_2MT0_49225d9b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2MT0_49225d9b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_49225d9b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 25.9519 )
		if( Positive_Money_Flow_Sum <= 4.43179e+06 )
			if( Money_Flow_Ratio <= 0.009421 )
				if( ema3 <= 416.228 )
					if( MFI_High <= -79.3322 )
						if( Negative_Money_Flow <= 1.4459e+08 )
							if( ema13 <= -0.145713 )
								ret := 0.333333
							if( ema13 > -0.145713 )
								if( MFI_High <= -79.5826 )
									ret := 0.000000
								if( MFI_High > -79.5826 )
									ret := 0.083333
						if( Negative_Money_Flow > 1.4459e+08 )
							ret := -0.333333
					if( MFI_High > -79.3322 )
						if( Typical_Price <= 371.796 )
							ret := -0.333333
						if( Typical_Price > 371.796 )
							if( MFI <= 0.83892 )
								ret := -0.666667
							if( MFI > 0.83892 )
								ret := -1.000000 // sell
				if( ema3 > 416.228 )
					if( Negative_Money_Flow <= 3.30321e+07 )
						ret := 0.000000
					if( Negative_Money_Flow > 3.30321e+07 )
						ret := 0.562500
			if( Money_Flow_Ratio > 0.009421 )
				if( Negative_Money_Flow_Sum <= 2.79371e+06 )
					if( ema3 <= 330.139 )
						if( ema2 <= 329.522 )
							if( Positive_Money_Flow_Sum <= 732709 )
								if( MFI_Low <= 1.96151 )
									ret := -0.428571
								if( MFI_Low > 1.96151 )
									ret := 0.133333
							if( Positive_Money_Flow_Sum > 732709 )
								if( MFI_Low <= 5.18972 )
									ret := 0.500000
								if( MFI_Low > 5.18972 )
									ret := 1.000000 // buy
						if( ema2 > 329.522 )
							ret := 0.857143 // buy
					if( ema3 > 330.139 )
						if( Positive_Money_Flow <= 42745.1 )
							if( ema1 <= 409.454 )
								if( MFI <= 22.2672 )
									ret := -0.842105 // sell
								if( MFI > 22.2672 )
									ret := -0.166667
							if( ema1 > 409.454 )
								if( ema12 <= -0.144664 )
									ret := 0.000000
								if( ema12 > -0.144664 )
									ret := -0.363636
						if( Positive_Money_Flow > 42745.1 )
							if( ema2 <= 395.02 )
								if( Raw_Money_Flow <= 142756 )
									ret := 0.166667
								if( Raw_Money_Flow > 142756 )
									ret := -0.545455
							if( ema2 > 395.02 )
								ret := 0.333333
				if( Negative_Money_Flow_Sum > 2.79371e+06 )
					if( ema13 <= -0.265967 )
						if( Negative_Money_Flow <= 5124.89 )
							if( Positive_Money_Flow <= 115151 )
								if( ema12 <= -0.153698 )
									ret := -0.318841
								if( ema12 > -0.153698 )
									ret := 0.500000
							if( Positive_Money_Flow > 115151 )
								if( Negative_Money_Flow_Sum <= 8.50484e+06 )
									ret := 0.418605
								if( Negative_Money_Flow_Sum > 8.50484e+06 )
									ret := 0.063380
						if( Negative_Money_Flow > 5124.89 )
							if( ema2 <= 414.343 )
								if( Money_Flow_Ratio <= 0.329898 )
									ret := 0.375862
								if( Money_Flow_Ratio > 0.329898 )
									ret := -0.155556
							if( ema2 > 414.343 )
								if( MFI_Low <= -2.12688 )
									ret := 0.707692 // buy
								if( MFI_Low > -2.12688 )
									ret := 0.315789
					if( ema13 > -0.265967 )
						if( Negative_Money_Flow <= 1.89179e+06 )
							if( MFI <= 20.3588 )
								if( Negative_Money_Flow <= 953915 )
									ret := 0.234694
								if( Negative_Money_Flow > 953915 )
									ret := 0.580357
							if( MFI > 20.3588 )
								if( ema2 <= 401.832 )
									ret := 0.185484
								if( ema2 > 401.832 )
									ret := -0.110320
						if( Negative_Money_Flow > 1.89179e+06 )
							if( ema1 <= 331.773 )
								if( MFI_Low <= 2.25857 )
									ret := -0.666667
								if( MFI_Low > 2.25857 )
									ret := 0.100000
							if( ema1 > 331.773 )
								if( MFI <= 24.3098 )
									ret := 0.165138
								if( MFI > 24.3098 )
									ret := -0.500000
		if( Positive_Money_Flow_Sum > 4.43179e+06 )
			if( Negative_Money_Flow_Sum <= 5.83238e+08 )
				if( Positive_Money_Flow_Sum <= 1.64584e+08 )
					if( tema <= 422.649 )
						if( ema3 <= 422.669 )
							if( ema12 <= 0.242468 )
								if( ema13 <= -0.647635 )
									ret := 0.299621
								if( ema13 > -0.647635 )
									ret := 0.126131
							if( ema12 > 0.242468 )
								if( ema1 <= 407.224 )
									ret := -0.225000
								if( ema1 > 407.224 )
									ret := -0.920000 // sell
						if( ema3 > 422.669 )
							if( ema13 <= -1.00711 )
								ret := 0.692308
							if( ema13 > -1.00711 )
								ret := 1.000000 // buy
					if( tema > 422.649 )
						if( Money_Flow_Ratio <= 0.014496 )
							ret := 0.909091 // buy
						if( Money_Flow_Ratio > 0.014496 )
							if( Raw_Money_Flow <= 2.86352e+08 )
								if( Negative_Money_Flow_Sum <= 1.67028e+07 )
									ret := -0.910714 // sell
								if( Negative_Money_Flow_Sum > 1.67028e+07 )
									ret := -0.059761
							if( Raw_Money_Flow > 2.86352e+08 )
								if( MFI <= 3.96706 )
									ret := 0.058824
								if( MFI > 3.96706 )
									ret := 0.925926 // buy
				if( Positive_Money_Flow_Sum > 1.64584e+08 )
					if( ema2 <= 327.267 )
						if( Negative_Money_Flow_Sum <= 5.28195e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 5.28195e+08 )
							ret := 0.916667 // buy
					if( ema2 > 327.267 )
						if( ema12 <= -0.220249 )
							if( tema <= 338.177 )
								if( ema3 <= 334.22 )
									ret := 0.307692
								if( ema3 > 334.22 )
									ret := -0.416667
							if( tema > 338.177 )
								if( ema13 <= -0.482895 )
									ret := 0.574468
								if( ema13 > -0.482895 )
									ret := -0.187500
						if( ema12 > -0.220249 )
							if( MFI <= 25.036 )
								ret := 0.750000 // buy
							if( MFI > 25.036 )
								ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 5.83238e+08 )
				if( ema12 <= -1.41477 )
					if( ema1 <= 422.969 )
						if( MFI_High <= -63.0166 )
							if( Negative_Money_Flow_Sum <= 9.41161e+08 )
								ret := 0.100000
							if( Negative_Money_Flow_Sum > 9.41161e+08 )
								if( tema <= 403.613 )
									ret := 0.880342 // buy
								if( tema > 403.613 )
									ret := 0.603774
						if( MFI_High > -63.0166 )
							if( Typical_Price <= 403.31 )
								if( ema12 <= -1.63284 )
									ret := 0.739130 // buy
								if( ema12 > -1.63284 )
									ret := 0.190476
							if( Typical_Price > 403.31 )
								if( ema12 <= -1.92471 )
									ret := 0.875000 // buy
								if( ema12 > -1.92471 )
									ret := -0.486486
					if( ema1 > 422.969 )
						if( MFI_High <= -70.4112 )
							if( Raw_Money_Flow <= 1.05509e+08 )
								ret := 0.636364
							if( Raw_Money_Flow > 1.05509e+08 )
								if( tema <= 439.84 )
									ret := -0.285714
								if( tema > 439.84 )
									ret := -0.200000
						if( MFI_High > -70.4112 )
							if( Positive_Money_Flow <= 2.98463e+07 )
								ret := -0.071429
							if( Positive_Money_Flow > 2.98463e+07 )
								if( Negative_Money_Flow_Sum <= 1.35546e+09 )
									ret := -0.916667 // sell
								if( Negative_Money_Flow_Sum > 1.35546e+09 )
									ret := -1.000000 // sell
				if( ema12 > -1.41477 )
					if( ema2 <= 381.738 )
						if( Positive_Money_Flow_Sum <= 2.28491e+08 )
							if( ema12 <= -1.18197 )
								if( Negative_Money_Flow <= 2.46868e+08 )
									ret := 0.926829 // buy
								if( Negative_Money_Flow > 2.46868e+08 )
									ret := 0.272727
							if( ema12 > -1.18197 )
								if( ema12 <= -0.412034 )
									ret := -0.245902
								if( ema12 > -0.412034 )
									ret := 0.094298
						if( Positive_Money_Flow_Sum > 2.28491e+08 )
							if( ema12 <= -0.374918 )
								if( MFI_High <= -71.8443 )
									ret := 0.954545 // buy
								if( MFI_High > -71.8443 )
									ret := 0.172740
							if( ema12 > -0.374918 )
								if( ema2 <= 370.787 )
									ret := -0.090643
								if( ema2 > 370.787 )
									ret := 0.277108
					if( ema2 > 381.738 )
						if( ema2 <= 385.277 )
							if( ema13 <= -1.24057 )
								if( ema12 <= -0.872517 )
									ret := -0.615385
								if( ema12 > -0.872517 )
									ret := 0.666667
							if( ema13 > -1.24057 )
								if( MFI <= 18.3239 )
									ret := -0.846154 // sell
								if( MFI > 18.3239 )
									ret := -0.294118
						if( ema2 > 385.277 )
							if( Negative_Money_Flow <= 2.58562e+08 )
								if( ema12 <= -1.25895 )
									ret := -0.572650
								if( ema12 > -1.25895 )
									ret := -0.068545
							if( Negative_Money_Flow > 2.58562e+08 )
								if( ema13 <= -1.53189 )
									ret := -0.352941
								if( ema13 > -1.53189 )
									ret := 0.357576
	if( MFI > 25.9519 )
		if( ema12 <= 0.235814 )
			if( Positive_Money_Flow_Sum <= 1.20772e+07 )
				if( Negative_Money_Flow <= 2.30041e+06 )
					if( Positive_Money_Flow <= 1.66412e+06 )
						if( ema13 <= -0.353991 )
							if( Typical_Price <= 393.665 )
								if( MFI <= 29.6965 )
									ret := 0.018868
								if( MFI > 29.6965 )
									ret := 0.320245
							if( Typical_Price > 393.665 )
								if( MFI_Low <= 17.1601 )
									ret := 0.225806
								if( MFI_Low > 17.1601 )
									ret := -0.080169
						if( ema13 > -0.353991 )
							if( ema1 <= 358.716 )
								if( Positive_Money_Flow_Sum <= 4.49009e+06 )
									ret := -0.101997
								if( Positive_Money_Flow_Sum > 4.49009e+06 )
									ret := 0.042198
							if( ema1 > 358.716 )
								if( MFI <= 57.8283 )
									ret := -0.005920
								if( MFI > 57.8283 )
									ret := 0.129569
					if( Positive_Money_Flow > 1.66412e+06 )
						if( Positive_Money_Flow_Sum <= 8.97578e+06 )
							if( MFI_Low <= 10.6962 )
								if( Negative_Money_Flow_Sum <= 1.4836e+07 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow_Sum > 1.4836e+07 )
									ret := 0.000000
							if( MFI_Low > 10.6962 )
								if( Negative_Money_Flow_Sum <= 8.91461e+06 )
									ret := -0.139860
								if( Negative_Money_Flow_Sum > 8.91461e+06 )
									ret := 0.352518
						if( Positive_Money_Flow_Sum > 8.97578e+06 )
							if( MFI_Low <= 8.29528 )
								ret := 0.636364
							if( MFI_Low > 8.29528 )
								if( ema12 <= 0.027023 )
									ret := -0.257009
								if( ema12 > 0.027023 )
									ret := -0.587302
				if( Negative_Money_Flow > 2.30041e+06 )
					if( ema1 <= 412.106 )
						if( MFI_High <= -52.6288 )
							if( Negative_Money_Flow <= 5.76072e+06 )
								if( ema13 <= -0.04594 )
									ret := 0.000000
								if( ema13 > -0.04594 )
									ret := -0.928571 // sell
							if( Negative_Money_Flow > 5.76072e+06 )
								if( ema12 <= -0.03671 )
									ret := 0.888889 // buy
								if( ema12 > -0.03671 )
									ret := -0.117647
						if( MFI_High > -52.6288 )
							if( ema12 <= 0.146454 )
								if( ema1 <= 305.503 )
									ret := -0.333333
								if( ema1 > 305.503 )
									ret := 0.527211
							if( ema12 > 0.146454 )
								if( ema13 <= 0.349735 )
									ret := 0.000000
								if( ema13 > 0.349735 )
									ret := -0.400000
					if( ema1 > 412.106 )
						if( Money_Flow_Ratio <= 0.51891 )
							if( MFI_Low <= 8.39425 )
								ret := 0.142857
							if( MFI_Low > 8.39425 )
								if( ema2 <= 423.276 )
									ret := 0.782609 // buy
								if( ema2 > 423.276 )
									ret := 0.333333
						if( Money_Flow_Ratio > 0.51891 )
							if( ema2 <= 430.358 )
								if( ema12 <= -0.225871 )
									ret := 0.583333
								if( ema12 > -0.225871 )
									ret := -0.528571
							if( ema2 > 430.358 )
								if( Negative_Money_Flow_Sum <= 9.02486e+06 )
									ret := 0.857143 // buy
								if( Negative_Money_Flow_Sum > 9.02486e+06 )
									ret := -0.529412
			if( Positive_Money_Flow_Sum > 1.20772e+07 )
				if( Raw_Money_Flow <= 1.72401e+08 )
					if( Positive_Money_Flow <= 1.31955e+08 )
						if( Negative_Money_Flow_Sum <= 2.34882e+09 )
							if( Negative_Money_Flow <= 7.21001e+07 )
								if( ema2 <= 412.428 )
									ret := -0.008420
								if( ema2 > 412.428 )
									ret := -0.066519
							if( Negative_Money_Flow > 7.21001e+07 )
								if( Money_Flow_Ratio <= 2.53449 )
									ret := 0.071527
								if( Money_Flow_Ratio > 2.53449 )
									ret := -0.461078
						if( Negative_Money_Flow_Sum > 2.34882e+09 )
							if( Positive_Money_Flow_Sum <= 1.10477e+09 )
								if( ema1 <= 402.953 )
									ret := -1.000000 // sell
								if( ema1 > 402.953 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 1.10477e+09 )
								if( Raw_Money_Flow <= 5.38052e+07 )
									ret := -0.744681 // sell
								if( Raw_Money_Flow > 5.38052e+07 )
									ret := 0.000000
					if( Positive_Money_Flow > 1.31955e+08 )
						if( ema2 <= 317.788 )
							if( ema12 <= -0.060554 )
								if( Positive_Money_Flow <= 1.4857e+08 )
									ret := 0.500000
								if( Positive_Money_Flow > 1.4857e+08 )
									ret := 1.000000 // buy
							if( ema12 > -0.060554 )
								ret := 0.071429
						if( ema2 > 317.788 )
							if( ema13 <= 0.234711 )
								if( ema3 <= 410.577 )
									ret := 0.015385
								if( ema3 > 410.577 )
									ret := 0.359712
							if( ema13 > 0.234711 )
								if( Raw_Money_Flow <= 1.44248e+08 )
									ret := 0.483871
								if( Raw_Money_Flow > 1.44248e+08 )
									ret := 0.769231 // buy
				if( Raw_Money_Flow > 1.72401e+08 )
					if( ema3 <= 332.645 )
						if( Positive_Money_Flow <= 3.00025e+08 )
							if( Raw_Money_Flow <= 1.84905e+08 )
								if( MFI <= 43.7479 )
									ret := 0.000000
								if( MFI > 43.7479 )
									ret := -0.782609 // sell
							if( Raw_Money_Flow > 1.84905e+08 )
								if( Raw_Money_Flow <= 2.11141e+08 )
									ret := 0.542373
								if( Raw_Money_Flow > 2.11141e+08 )
									ret := 0.038168
						if( Positive_Money_Flow > 3.00025e+08 )
							if( ema2 <= 305.956 )
								if( ema13 <= -0.526236 )
									ret := 1.000000 // buy
								if( ema13 > -0.526236 )
									ret := 0.846154 // buy
							if( ema2 > 305.956 )
								if( MFI_Low <= 46.36 )
									ret := 0.071429
								if( MFI_Low > 46.36 )
									ret := 0.492754
					if( ema3 > 332.645 )
						if( Raw_Money_Flow <= 1.28951e+09 )
							if( Negative_Money_Flow_Sum <= 6.56751e+08 )
								if( ema2 <= 338.803 )
									ret := -0.656716
								if( ema2 > 338.803 )
									ret := -0.123664
							if( Negative_Money_Flow_Sum > 6.56751e+08 )
								if( ema3 <= 412.853 )
									ret := -0.436975
								if( ema3 > 412.853 )
									ret := -0.052174
						if( Raw_Money_Flow > 1.28951e+09 )
							if( ema3 <= 404.24 )
								if( MFI <= 61.9043 )
									ret := 0.687500
								if( MFI > 61.9043 )
									ret := -0.257576
							if( ema3 > 404.24 )
								if( MFI_High <= -51.5896 )
									ret := 0.937500 // buy
								if( MFI_High > -51.5896 )
									ret := 0.195652
		if( ema12 > 0.235814 )
			if( Negative_Money_Flow_Sum <= 3.87526e+07 )
				if( MFI_Low <= 76.3744 )
					if( Positive_Money_Flow <= 2.22859e+06 )
						if( Negative_Money_Flow_Sum <= 1.9538e+07 )
							if( Positive_Money_Flow_Sum <= 8.72264e+06 )
								if( ema12 <= 0.707511 )
									ret := -0.174789
								if( ema12 > 0.707511 )
									ret := 0.134503
							if( Positive_Money_Flow_Sum > 8.72264e+06 )
								if( MFI <= 60.6571 )
									ret := -0.258427
								if( MFI > 60.6571 )
									ret := 0.064322
						if( Negative_Money_Flow_Sum > 1.9538e+07 )
							if( Positive_Money_Flow <= 1.67304e+06 )
								if( MFI_High <= -2.96748 )
									ret := -0.564854
								if( MFI_High > -2.96748 )
									ret := 0.434783
							if( Positive_Money_Flow > 1.67304e+06 )
								ret := 0.466667
					if( Positive_Money_Flow > 2.22859e+06 )
						if( Positive_Money_Flow <= 3.57853e+08 )
							if( Typical_Price <= 408.582 )
								if( MFI_Low <= 56.1671 )
									ret := -0.192308
								if( MFI_Low > 56.1671 )
									ret := -0.418182
							if( Typical_Price > 408.582 )
								if( Positive_Money_Flow_Sum <= 1.02568e+08 )
									ret := -0.607029
								if( Positive_Money_Flow_Sum > 1.02568e+08 )
									ret := -0.273810
						if( Positive_Money_Flow > 3.57853e+08 )
							if( Raw_Money_Flow <= 3.87943e+08 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 3.87943e+08 )
								ret := 0.230769
				if( MFI_Low > 76.3744 )
					if( tema <= 346.263 )
						if( ema13 <= 0.531448 )
							if( ema3 <= 331.649 )
								if( ema3 <= 321.362 )
									ret := 0.933333 // buy
								if( ema3 > 321.362 )
									ret := 0.857143 // buy
							if( ema3 > 331.649 )
								ret := 1.000000 // buy
						if( ema13 > 0.531448 )
							if( Raw_Money_Flow <= 1.89181e+08 )
								if( tema <= 334.501 )
									ret := -0.372093
								if( tema > 334.501 )
									ret := 0.510204
							if( Raw_Money_Flow > 1.89181e+08 )
								if( MFI_Low <= 78.0085 )
									ret := 0.333333
								if( MFI_Low > 78.0085 )
									ret := 0.812500 // buy
					if( tema > 346.263 )
						if( Money_Flow_Ratio <= 31.5438 )
							if( ema3 <= 419.567 )
								ret := 0.500000
							if( ema3 > 419.567 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 31.5438 )
							if( Positive_Money_Flow_Sum <= 3.7958e+08 )
								if( Positive_Money_Flow_Sum <= 2.57783e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.57783e+08 )
									ret := 0.916667 // buy
							if( Positive_Money_Flow_Sum > 3.7958e+08 )
								if( Money_Flow_Ratio <= 65.1358 )
									ret := -0.108434
								if( Money_Flow_Ratio > 65.1358 )
									ret := -0.600000
			if( Negative_Money_Flow_Sum > 3.87526e+07 )
				if( MFI_Low <= 32.5874 )
					if( Typical_Price <= 415.179 )
						if( Negative_Money_Flow_Sum <= 2.07073e+09 )
							if( Raw_Money_Flow <= 9.0902e+07 )
								if( Positive_Money_Flow_Sum <= 8.0682e+08 )
									ret := 0.303730
								if( Positive_Money_Flow_Sum > 8.0682e+08 )
									ret := 0.705882 // buy
							if( Raw_Money_Flow > 9.0902e+07 )
								if( MFI_High <= -29.0724 )
									ret := 0.071090
								if( MFI_High > -29.0724 )
									ret := -0.615385
						if( Negative_Money_Flow_Sum > 2.07073e+09 )
							if( ema3 <= 397.852 )
								ret := -0.352941
							if( ema3 > 397.852 )
								ret := -1.000000 // sell
					if( Typical_Price > 415.179 )
						if( Raw_Money_Flow <= 8.35498e+07 )
							if( Money_Flow_Ratio <= 1.01084 )
								if( Negative_Money_Flow <= 6.92169e+07 )
									ret := -0.228426
								if( Negative_Money_Flow > 6.92169e+07 )
									ret := 0.642857
							if( Money_Flow_Ratio > 1.01084 )
								if( Positive_Money_Flow <= 5.16428e+07 )
									ret := 0.661017
								if( Positive_Money_Flow > 5.16428e+07 )
									ret := -0.333333
						if( Raw_Money_Flow > 8.35498e+07 )
							if( Negative_Money_Flow_Sum <= 3.73072e+08 )
								ret := 0.187500
							if( Negative_Money_Flow_Sum > 3.73072e+08 )
								if( MFI <= 49.1114 )
									ret := -0.859155 // sell
								if( MFI > 49.1114 )
									ret := 0.090909
				if( MFI_Low > 32.5874 )
					if( Money_Flow_Ratio <= 77.3728 )
						if( ema13 <= 0.961528 )
							if( Money_Flow_Ratio <= 1.26225 )
								if( Typical_Price <= 348.626 )
									ret := 0.090909
								if( Typical_Price > 348.626 )
									ret := -0.348624
							if( Money_Flow_Ratio > 1.26225 )
								if( Money_Flow_Ratio <= 14.5722 )
									ret := 0.015088
								if( Money_Flow_Ratio > 14.5722 )
									ret := -0.274648
						if( ema13 > 0.961528 )
							if( Raw_Money_Flow <= 6.79458e+07 )
								if( Negative_Money_Flow_Sum <= 3.21904e+08 )
									ret := 0.175630
								if( Negative_Money_Flow_Sum > 3.21904e+08 )
									ret := -0.188144
							if( Raw_Money_Flow > 6.79458e+07 )
								if( Positive_Money_Flow_Sum <= 9.40308e+08 )
									ret := -0.377358
								if( Positive_Money_Flow_Sum > 9.40308e+08 )
									ret := -0.110647
					if( Money_Flow_Ratio > 77.3728 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_MSFT_5Min_49225d9b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


