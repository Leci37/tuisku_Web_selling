//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: AAPL_5Min_2BM0_dc226b01 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_2BM0_dc226b01", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_dc226b01(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 272560 )
		if( Positive_Money_Flow_Sum <= 9.8363e+08 )
			if( Negative_Money_Flow_Sum <= 3.84384e+06 )
				if( Negative_Money_Flow <= 511316 )
					if( bbm <= 0.034536 )
						if( bearPower <= 0.165733 )
							if( Money_Flow_Ratio <= 0.298287 )
								if( bbp <= -0.258719 )
									ret := -0.071429
								if( bbp > -0.258719 )
									ret := 0.361905
							if( Money_Flow_Ratio > 0.298287 )
								if( bbm <= 0.000258 )
									ret := 0.021968
								if( bbm > 0.000258 )
									ret := -0.070363
						if( bearPower > 0.165733 )
							if( Money_Flow_Ratio <= 4.85443 )
								if( Negative_Money_Flow <= 62539.8 )
									ret := -0.257576
								if( Negative_Money_Flow > 62539.8 )
									ret := 0.220339
							if( Money_Flow_Ratio > 4.85443 )
								if( bbp <= 0.413027 )
									ret := -0.916667 // sell
								if( bbp > 0.413027 )
									ret := -0.184211
					if( bbm > 0.034536 )
						if( bullPower <= 0.226526 )
							if( bbp <= -0.390076 )
								if( Positive_Money_Flow_Sum <= 6.47538e+06 )
									ret := 0.231579
								if( Positive_Money_Flow_Sum > 6.47538e+06 )
									ret := 0.937500 // buy
							if( bbp > -0.390076 )
								if( MFI_High <= -33.5697 )
									ret := -0.084437
								if( MFI_High > -33.5697 )
									ret := 0.147968
						if( bullPower > 0.226526 )
							if( MFI_High <= -1.81866 )
								if( BBPower_Color <= 0.5 )
									ret := 0.625000
								if( BBPower_Color > 0.5 )
									ret := -0.123711
							if( MFI_High > -1.81866 )
								if( bullPower <= 0.335776 )
									ret := -0.615385
								if( bullPower > 0.335776 )
									ret := -0.250000
				if( Negative_Money_Flow > 511316 )
					if( bullPower <= 0.111647 )
						if( Raw_Money_Flow <= 1.07758e+06 )
							if( MFI_Low <= 62.117 )
								if( MFI_Low <= 7.42729 )
									ret := 0.296296
								if( MFI_Low > 7.42729 )
									ret := -0.183206
							if( MFI_Low > 62.117 )
								if( MFI <= 85.9657 )
									ret := 1.000000 // buy
								if( MFI > 85.9657 )
									ret := 0.000000
						if( Raw_Money_Flow > 1.07758e+06 )
							if( Raw_Money_Flow <= 1.50036e+06 )
								if( bbp <= -0.150738 )
									ret := -0.655738
								if( bbp > -0.150738 )
									ret := -0.311475
							if( Raw_Money_Flow > 1.50036e+06 )
								if( MFI <= 51.2237 )
									ret := 0.208333
								if( MFI > 51.2237 )
									ret := -0.555556
					if( bullPower > 0.111647 )
						if( bbp <= -0.021744 )
							ret := 0.772727 // buy
						if( bbp > -0.021744 )
							if( Negative_Money_Flow_Sum <= 1.9812e+06 )
								if( MFI_Low <= 54.9988 )
									ret := 0.000000
								if( MFI_Low > 54.9988 )
									ret := -0.340909
							if( Negative_Money_Flow_Sum > 1.9812e+06 )
								if( Typical_Price <= 198.838 )
									ret := -0.083770
								if( Typical_Price > 198.838 )
									ret := 0.269231
			if( Negative_Money_Flow_Sum > 3.84384e+06 )
				if( Negative_Money_Flow_Sum <= 3.30612e+08 )
					if( bullPower <= -0.101494 )
						if( Money_Flow_Ratio <= 0.056431 )
							if( Raw_Money_Flow <= 1.75975e+07 )
								if( Positive_Money_Flow_Sum <= 353898 )
									ret := 0.444444
								if( Positive_Money_Flow_Sum > 353898 )
									ret := 0.861111 // buy
							if( Raw_Money_Flow > 1.75975e+07 )
								ret := -0.187500
						if( Money_Flow_Ratio > 0.056431 )
							if( Negative_Money_Flow_Sum <= 1.08588e+07 )
								if( MFI <= 30.707 )
									ret := -0.001195
								if( MFI > 30.707 )
									ret := 0.173575
							if( Negative_Money_Flow_Sum > 1.08588e+07 )
								if( Positive_Money_Flow_Sum <= 4.67855e+06 )
									ret := 0.419780
								if( Positive_Money_Flow_Sum > 4.67855e+06 )
									ret := 0.183134
					if( bullPower > -0.101494 )
						if( Positive_Money_Flow_Sum <= 5.70747e+08 )
							if( MFI_High <= -53.2859 )
								if( bullPower <= 0.426676 )
									ret := 0.114687
								if( bullPower > 0.426676 )
									ret := 0.757282 // buy
							if( MFI_High > -53.2859 )
								if( bullPower <= 0.383809 )
									ret := 0.052032
								if( bullPower > 0.383809 )
									ret := -0.089691
						if( Positive_Money_Flow_Sum > 5.70747e+08 )
							if( bbm <= 0.321739 )
								if( MFI_High <= -13.8158 )
									ret := 0.648148
								if( MFI_High > -13.8158 )
									ret := 0.076807
							if( bbm > 0.321739 )
								if( Typical_Price <= 208.218 )
									ret := 0.392694
								if( Typical_Price > 208.218 )
									ret := 0.707143 // buy
				if( Negative_Money_Flow_Sum > 3.30612e+08 )
					if( bearPower <= 0.319583 )
						if( Negative_Money_Flow_Sum <= 3.77091e+08 )
							if( Negative_Money_Flow <= 2.98068e+07 )
								if( MFI_High <= -25.9432 )
									ret := 0.387755
								if( MFI_High > -25.9432 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 2.98068e+07 )
								if( MFI_High <= -9.86569 )
									ret := -0.135563
								if( MFI_High > -9.86569 )
									ret := -0.697248
						if( Negative_Money_Flow_Sum > 3.77091e+08 )
							if( MFI <= 67.3287 )
								if( bearPower <= -0.676257 )
									ret := -0.053962
								if( bearPower > -0.676257 )
									ret := 0.038597
							if( MFI > 67.3287 )
								if( bullPower <= 0.307762 )
									ret := 0.212766
								if( bullPower > 0.307762 )
									ret := 0.648352
					if( bearPower > 0.319583 )
						if( MFI_Low <= 42.5375 )
							if( MFI_Low <= 31.7765 )
								ret := 0.416667
							if( MFI_Low > 31.7765 )
								ret := 1.000000 // buy
						if( MFI_Low > 42.5375 )
							if( Positive_Money_Flow_Sum <= 8.34465e+08 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 8.34465e+08 )
								ret := 0.785714 // buy
		if( Positive_Money_Flow_Sum > 9.8363e+08 )
			if( MFI_Low <= 60.5299 )
				if( Positive_Money_Flow_Sum <= 3.25435e+09 )
					if( bbp <= 0.078186 )
						if( Raw_Money_Flow <= 4.69495e+08 )
							if( bbp <= -2.00328 )
								if( Positive_Money_Flow_Sum <= 1.78067e+09 )
									ret := 0.965517 // buy
								if( Positive_Money_Flow_Sum > 1.78067e+09 )
									ret := 0.571429
							if( bbp > -2.00328 )
								if( bullPower <= 0.245933 )
									ret := -0.041667
								if( bullPower > 0.245933 )
									ret := 0.254777
						if( Raw_Money_Flow > 4.69495e+08 )
							if( Money_Flow_Ratio <= 0.577265 )
								if( MFI_Low <= 10.5335 )
									ret := -0.416667
								if( MFI_Low > 10.5335 )
									ret := 0.700000 // buy
							if( Money_Flow_Ratio > 0.577265 )
								if( Negative_Money_Flow <= 5.2078e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.2078e+08 )
									ret := -0.702703 // sell
					if( bbp > 0.078186 )
						if( Negative_Money_Flow <= 1.26327e+08 )
							if( Positive_Money_Flow_Sum <= 3.00184e+09 )
								if( bullPower <= 0.429894 )
									ret := -0.419573
								if( bullPower > 0.429894 )
									ret := -0.178926
							if( Positive_Money_Flow_Sum > 3.00184e+09 )
								ret := 0.928571 // buy
						if( Negative_Money_Flow > 1.26327e+08 )
							if( bullPower <= 0.920478 )
								if( Typical_Price <= 215.008 )
									ret := 0.044568
								if( Typical_Price > 215.008 )
									ret := -0.247863
							if( bullPower > 0.920478 )
								if( Negative_Money_Flow_Sum <= 6.88754e+08 )
									ret := -0.862069 // sell
								if( Negative_Money_Flow_Sum > 6.88754e+08 )
									ret := -0.184783
				if( Positive_Money_Flow_Sum > 3.25435e+09 )
					if( MFI_Low <= 55.1527 )
						if( Typical_Price <= 198.487 )
							ret := -0.250000
						if( Typical_Price > 198.487 )
							if( Negative_Money_Flow <= 8.74291e+07 )
								ret := 0.000000
							if( Negative_Money_Flow > 8.74291e+07 )
								if( Negative_Money_Flow <= 3.27595e+08 )
									ret := 0.954545 // buy
								if( Negative_Money_Flow > 3.27595e+08 )
									ret := 0.181818
					if( MFI_Low > 55.1527 )
						if( Negative_Money_Flow_Sum <= 1.26778e+09 )
							if( Negative_Money_Flow <= 1.82554e+08 )
								ret := -0.200000
							if( Negative_Money_Flow > 1.82554e+08 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.26778e+09 )
							if( Money_Flow_Ratio <= 3.45252 )
								ret := -0.882353 // sell
							if( Money_Flow_Ratio > 3.45252 )
								ret := 0.000000
			if( MFI_Low > 60.5299 )
				if( Money_Flow_Ratio <= 8.12874 )
					if( bbm <= 0.408483 )
						if( MFI_Low <= 63.0962 )
							if( bearPower <= 0.083362 )
								if( Raw_Money_Flow <= 1.12512e+07 )
									ret := -0.076923
								if( Raw_Money_Flow > 1.12512e+07 )
									ret := 0.333333
							if( bearPower > 0.083362 )
								if( bbp <= 0.511062 )
									ret := 0.000000
								if( bbp > 0.511062 )
									ret := 0.595506
						if( MFI_Low > 63.0962 )
							if( Negative_Money_Flow_Sum <= 2.55631e+08 )
								if( bbm <= 0.314978 )
									ret := -0.080645
								if( bbm > 0.314978 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.55631e+08 )
								if( Negative_Money_Flow <= 1.53145e+08 )
									ret := 0.075145
								if( Negative_Money_Flow > 1.53145e+08 )
									ret := -0.333333
					if( bbm > 0.408483 )
						if( Positive_Money_Flow_Sum <= 3.02178e+09 )
							if( MFI_High <= 4.27866 )
								if( bullPower <= 0.788273 )
									ret := 0.627451
								if( bullPower > 0.788273 )
									ret := -0.392857
							if( MFI_High > 4.27866 )
								if( Positive_Money_Flow_Sum <= 1.21316e+09 )
									ret := 0.181818
								if( Positive_Money_Flow_Sum > 1.21316e+09 )
									ret := 0.829545 // buy
						if( Positive_Money_Flow_Sum > 3.02178e+09 )
							if( Typical_Price <= 213.115 )
								if( Negative_Money_Flow <= 4.37809e+08 )
									ret := 0.090909
								if( Negative_Money_Flow > 4.37809e+08 )
									ret := 0.900000 // buy
							if( Typical_Price > 213.115 )
								ret := -0.785714 // sell
				if( Money_Flow_Ratio > 8.12874 )
					if( Negative_Money_Flow <= 3.53904e+08 )
						if( MFI <= 92.8096 )
							if( bearPower <= -0.321938 )
								ret := 0.700000 // buy
							if( bearPower > -0.321938 )
								if( MFI_High <= 12.2448 )
									ret := -0.352459
								if( MFI_High > 12.2448 )
									ret := -0.615385
						if( MFI > 92.8096 )
							if( MFI_High <= 13.3261 )
								ret := -0.125000
							if( MFI_High > 13.3261 )
								if( BBPower_Color <= 0.5 )
									ret := 0.051282
								if( BBPower_Color > 0.5 )
									ret := -0.015625
					if( Negative_Money_Flow > 3.53904e+08 )
						ret := 0.692308
	if( Positive_Money_Flow > 272560 )
		if( MFI_Low <= 13.0268 )
			if( Raw_Money_Flow <= 1.58269e+08 )
				if( Negative_Money_Flow_Sum <= 1.00929e+09 )
					if( bbp <= -4.90659 )
						ret := -1.000000 // sell
					if( bbp > -4.90659 )
						if( bbm <= 1.40208 )
							if( Positive_Money_Flow_Sum <= 3.84729e+08 )
								if( MFI <= 31.7026 )
									ret := -0.045974
								if( MFI > 31.7026 )
									ret := -0.280576
							if( Positive_Money_Flow_Sum > 3.84729e+08 )
								if( MFI_Low <= 11.98 )
									ret := 0.622951
								if( MFI_Low > 11.98 )
									ret := 0.254545
						if( bbm > 1.40208 )
							if( MFI_Low <= -1.96165 )
								ret := 0.777778 // buy
							if( MFI_Low > -1.96165 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 1.00929e+09 )
					if( Money_Flow_Ratio <= 0.160889 )
						if( Negative_Money_Flow_Sum <= 2.81182e+09 )
							if( bbp <= -0.494939 )
								if( bearPower <= -0.860963 )
									ret := -0.692308
								if( bearPower > -0.860963 )
									ret := 0.397260
							if( bbp > -0.494939 )
								if( Negative_Money_Flow_Sum <= 2.32422e+09 )
									ret := -0.123377
								if( Negative_Money_Flow_Sum > 2.32422e+09 )
									ret := 0.025000
						if( Negative_Money_Flow_Sum > 2.81182e+09 )
							if( Money_Flow_Ratio <= 0.023681 )
								if( Positive_Money_Flow_Sum <= 8.70447e+07 )
									ret := -0.062500
								if( Positive_Money_Flow_Sum > 8.70447e+07 )
									ret := 0.647059
							if( Money_Flow_Ratio > 0.023681 )
								if( Money_Flow_Ratio <= 0.126158 )
									ret := -0.526316
								if( Money_Flow_Ratio > 0.126158 )
									ret := -0.013514
					if( Money_Flow_Ratio > 0.160889 )
						if( Positive_Money_Flow <= 8.84331e+07 )
							if( bullPower <= -0.174178 )
								if( Negative_Money_Flow_Sum <= 1.13532e+09 )
									ret := -0.268293
								if( Negative_Money_Flow_Sum > 1.13532e+09 )
									ret := 0.111111
							if( bullPower > -0.174178 )
								if( bearPower <= -0.413491 )
									ret := -0.691358
								if( bearPower > -0.413491 )
									ret := -0.277496
						if( Positive_Money_Flow > 8.84331e+07 )
							if( bearPower <= -0.668282 )
								if( MFI <= 20.6624 )
									ret := -0.731707 // sell
								if( MFI > 20.6624 )
									ret := -0.008065
							if( bearPower > -0.668282 )
								if( bullPower <= -0.300514 )
									ret := -1.000000 // sell
								if( bullPower > -0.300514 )
									ret := -0.508889
			if( Raw_Money_Flow > 1.58269e+08 )
				if( MFI_Low <= 3.48747 )
					if( MFI <= 10.2396 )
						if( MFI_Low <= -10.4618 )
							if( bbp <= -1.62993 )
								ret := -0.363636
							if( bbp > -1.62993 )
								ret := 0.727273 // buy
						if( MFI_Low > -10.4618 )
							ret := 0.833333 // buy
					if( MFI > 10.2396 )
						if( bbm <= 0.746517 )
							if( bearPower <= -1.01909 )
								if( MFI <= 14.9464 )
									ret := -0.400000
								if( MFI > 14.9464 )
									ret := 0.647059
							if( bearPower > -1.01909 )
								if( bbp <= -1.04793 )
									ret := -0.404255
								if( bbp > -1.04793 )
									ret := 0.000000
						if( bbm > 0.746517 )
							if( Raw_Money_Flow <= 1.79182e+08 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.79182e+08 )
								if( bullPower <= -0.663738 )
									ret := -0.840000 // sell
								if( bullPower > -0.663738 )
									ret := 0.028571
				if( MFI_Low > 3.48747 )
					if( bbm <= 1.16331 )
						if( Negative_Money_Flow_Sum <= 2.32711e+09 )
							if( Typical_Price <= 189.816 )
								if( Positive_Money_Flow_Sum <= 9.34698e+08 )
									ret := 0.691057
								if( Positive_Money_Flow_Sum > 9.34698e+08 )
									ret := -1.000000 // sell
							if( Typical_Price > 189.816 )
								if( Raw_Money_Flow <= 1.80071e+08 )
									ret := 0.450000
								if( Raw_Money_Flow > 1.80071e+08 )
									ret := -0.123288
						if( Negative_Money_Flow_Sum > 2.32711e+09 )
							if( MFI_High <= -52.2193 )
								ret := -0.764706 // sell
							if( MFI_High > -52.2193 )
								if( bullPower <= -0.200741 )
									ret := -0.666667
								if( bullPower > -0.200741 )
									ret := 0.700000 // buy
					if( bbm > 1.16331 )
						if( Positive_Money_Flow_Sum <= 5.14706e+08 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.14706e+08 )
							ret := 0.454545
		if( MFI_Low > 13.0268 )
			if( bearPower <= 0.212861 )
				if( Positive_Money_Flow <= 6.63831e+07 )
					if( bullPower <= -0.141956 )
						if( MFI_Low <= 37.9341 )
							if( bbm <= 0.633908 )
								if( Money_Flow_Ratio <= 0.875893 )
									ret := 0.242038
								if( Money_Flow_Ratio > 0.875893 )
									ret := 0.620370
							if( bbm > 0.633908 )
								if( Raw_Money_Flow <= 3.16094e+07 )
									ret := -0.333333
								if( Raw_Money_Flow > 3.16094e+07 )
									ret := -1.000000 // sell
						if( MFI_Low > 37.9341 )
							if( MFI_Low <= 41.8746 )
								if( bearPower <= -0.460937 )
									ret := -1.000000 // sell
								if( bearPower > -0.460937 )
									ret := -0.375000
							if( MFI_Low > 41.8746 )
								if( MFI_Low <= 68.0084 )
									ret := -0.146667
								if( MFI_Low > 68.0084 )
									ret := 0.230769
					if( bullPower > -0.141956 )
						if( Positive_Money_Flow <= 9.81978e+06 )
							if( MFI_Low <= 22.089 )
								if( MFI_Low <= 14.3854 )
									ret := 0.120773
								if( MFI_Low > 14.3854 )
									ret := -0.141139
							if( MFI_Low > 22.089 )
								if( Negative_Money_Flow_Sum <= 3.27608e+07 )
									ret := 0.027036
								if( Negative_Money_Flow_Sum > 3.27608e+07 )
									ret := -0.159041
						if( Positive_Money_Flow > 9.81978e+06 )
							if( Raw_Money_Flow <= 2.09591e+07 )
								if( Negative_Money_Flow_Sum <= 4.02979e+07 )
									ret := 0.357843
								if( Negative_Money_Flow_Sum > 4.02979e+07 )
									ret := 0.035256
							if( Raw_Money_Flow > 2.09591e+07 )
								if( Raw_Money_Flow <= 3.45492e+07 )
									ret := -0.099656
								if( Raw_Money_Flow > 3.45492e+07 )
									ret := 0.043353
				if( Positive_Money_Flow > 6.63831e+07 )
					if( Typical_Price <= 188.131 )
						if( MFI_Low <= 56.3563 )
							if( bullPower <= 0.733141 )
								if( MFI_Low <= 40.1044 )
									ret := 0.049568
								if( MFI_Low > 40.1044 )
									ret := -0.105680
							if( bullPower > 0.733141 )
								if( Money_Flow_Ratio <= 0.979349 )
									ret := -0.076923
								if( Money_Flow_Ratio > 0.979349 )
									ret := -0.795455 // sell
						if( MFI_Low > 56.3563 )
							if( bearPower <= -0.726558 )
								if( Positive_Money_Flow <= 5.83557e+08 )
									ret := 0.000000
								if( Positive_Money_Flow > 5.83557e+08 )
									ret := -0.913043 // sell
							if( bearPower > -0.726558 )
								if( Raw_Money_Flow <= 9.32637e+07 )
									ret := 0.515464
								if( Raw_Money_Flow > 9.32637e+07 )
									ret := 0.140590
					if( Typical_Price > 188.131 )
						if( bullPower <= -0.092578 )
							if( MFI_High <= -45.218 )
								if( Negative_Money_Flow_Sum <= 1.57801e+09 )
									ret := -0.543860
								if( Negative_Money_Flow_Sum > 1.57801e+09 )
									ret := 1.000000 // buy
							if( MFI_High > -45.218 )
								if( Positive_Money_Flow <= 7.03641e+07 )
									ret := 0.842105 // buy
								if( Positive_Money_Flow > 7.03641e+07 )
									ret := 0.179153
						if( bullPower > -0.092578 )
							if( Money_Flow_Ratio <= 1.05232 )
								if( MFI_Low <= 30.1303 )
									ret := -0.131458
								if( MFI_Low > 30.1303 )
									ret := -0.520362
							if( Money_Flow_Ratio > 1.05232 )
								if( bbp <= -0.28529 )
									ret := 0.304094
								if( bbp > -0.28529 )
									ret := -0.078615
			if( bearPower > 0.212861 )
				if( Positive_Money_Flow_Sum <= 6.13215e+09 )
					if( Negative_Money_Flow_Sum <= 2.35182e+06 )
						if( Money_Flow_Ratio <= 43.4652 )
							if( MFI <= 74.8654 )
								if( bbm <= 0.08826 )
									ret := 0.173913
								if( bbm > 0.08826 )
									ret := -0.272727
							if( MFI > 74.8654 )
								if( Positive_Money_Flow_Sum <= 4.59442e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 4.59442e+06 )
									ret := -0.516807
						if( Money_Flow_Ratio > 43.4652 )
							if( Positive_Money_Flow <= 4.01393e+06 )
								ret := 0.842105 // buy
							if( Positive_Money_Flow > 4.01393e+06 )
								ret := 0.400000
					if( Negative_Money_Flow_Sum > 2.35182e+06 )
						if( MFI_High <= -14.3964 )
							if( bullPower <= 1.21279 )
								if( Money_Flow_Ratio <= 1.37891 )
									ret := 0.024668
								if( Money_Flow_Ratio > 1.37891 )
									ret := -0.327660
							if( bullPower > 1.21279 )
								if( Positive_Money_Flow_Sum <= 4.23836e+08 )
									ret := -0.187500
								if( Positive_Money_Flow_Sum > 4.23836e+08 )
									ret := -0.898551 // sell
						if( MFI_High > -14.3964 )
							if( Positive_Money_Flow <= 1.1151e+06 )
								if( MFI_Low <= 68.6113 )
									ret := 0.477707
								if( MFI_Low > 68.6113 )
									ret := -0.285714
							if( Positive_Money_Flow > 1.1151e+06 )
								if( MFI_High <= 12.7179 )
									ret := -0.013909
								if( MFI_High > 12.7179 )
									ret := -0.191239
				if( Positive_Money_Flow_Sum > 6.13215e+09 )
					if( bullPower <= 1.85402 )
						ret := 0.230769
					if( bullPower > 1.85402 )
						if( Raw_Money_Flow <= 7.03948e+08 )
							if( Raw_Money_Flow <= 6.18801e+08 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 6.18801e+08 )
								ret := 0.666667
						if( Raw_Money_Flow > 7.03948e+08 )
							ret := 0.100000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_AAPL_5Min_dc226b01(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


