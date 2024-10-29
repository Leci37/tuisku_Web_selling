//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: BABA_1Min_2CM0_ba8a2f4a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Min_2CM0_ba8a2f4a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Min_ba8a2f4a(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 11.5813 )
		if( Raw_Money_Flow <= 589251 )
			if( Positive_Money_Flow <= 5138.2 )
				if( ad <= -311.716 )
					if( Typical_Price <= 80.09 )
						if( mf <= -0.551732 )
							if( MFI_High <= -72.7817 )
								ret := -0.666667
							if( MFI_High > -72.7817 )
								ret := -0.142857
						if( mf > -0.551732 )
							if( Positive_Money_Flow_Sum <= 804097 )
								if( MFI_High <= -68.8489 )
									ret := 0.644670
								if( MFI_High > -68.8489 )
									ret := 0.100000
							if( Positive_Money_Flow_Sum > 804097 )
								if( MFI_High <= -73.5131 )
									ret := 0.684211
								if( MFI_High > -73.5131 )
									ret := -0.363636
					if( Typical_Price > 80.09 )
						if( Typical_Price <= 81.3418 )
							if( Positive_Money_Flow_Sum <= 442091 )
								if( Raw_Money_Flow <= 128702 )
									ret := 0.363636
								if( Raw_Money_Flow > 128702 )
									ret := -0.187500
							if( Positive_Money_Flow_Sum > 442091 )
								ret := -0.909091 // sell
						if( Typical_Price > 81.3418 )
							if( mf <= 0.23431 )
								if( Positive_Money_Flow_Sum <= 990113 )
									ret := 0.325397
								if( Positive_Money_Flow_Sum > 990113 )
									ret := -0.571429
							if( mf > 0.23431 )
								ret := 0.842105 // buy
				if( ad > -311.716 )
					if( MFI_Low <= -9.23024 )
						if( Raw_Money_Flow <= 386845 )
							if( Positive_Money_Flow_Sum <= 94262.1 )
								if( Positive_Money_Flow_Sum <= 63583.5 )
									ret := 0.010638
								if( Positive_Money_Flow_Sum > 63583.5 )
									ret := -0.518987
							if( Positive_Money_Flow_Sum > 94262.1 )
								if( Typical_Price <= 89.3923 )
									ret := -0.016393
								if( Typical_Price > 89.3923 )
									ret := 0.545455
						if( Raw_Money_Flow > 386845 )
							if( Negative_Money_Flow_Sum <= 4.59942e+06 )
								ret := -0.071429
							if( Negative_Money_Flow_Sum > 4.59942e+06 )
								if( MFI_High <= -73.4423 )
									ret := -0.666667
								if( MFI_High > -73.4423 )
									ret := -1.000000 // sell
					if( MFI_Low > -9.23024 )
						if( ad <= 1743.95 )
							if( Positive_Money_Flow_Sum <= 271214 )
								if( Raw_Money_Flow <= 16125.5 )
									ret := 0.666667
								if( Raw_Money_Flow > 16125.5 )
									ret := 0.173077
							if( Positive_Money_Flow_Sum > 271214 )
								if( MFI_Low <= -8.72449 )
									ret := 0.083333
								if( MFI_Low > -8.72449 )
									ret := -0.384615
						if( ad > 1743.95 )
							ret := 0.750000 // buy
			if( Positive_Money_Flow > 5138.2 )
				if( Money_Flow_Ratio <= 0.096312 )
					if( Typical_Price <= 95.8333 )
						if( ad_mf <= -635.811 )
							if( MFI <= 6.58924 )
								if( MFI <= 3.88848 )
									ret := 0.000000
								if( MFI > 3.88848 )
									ret := 0.714286 // buy
							if( MFI > 6.58924 )
								ret := -0.125000
						if( ad_mf > -635.811 )
							if( mf <= 0.905523 )
								if( Typical_Price <= 82.6941 )
									ret := -0.183463
								if( Typical_Price > 82.6941 )
									ret := -0.435185
							if( mf > 0.905523 )
								ret := 0.681818
					if( Typical_Price > 95.8333 )
						if( Money_Flow_Ratio <= 0.087625 )
							if( MFI <= 5.51069 )
								ret := 0.533333
							if( MFI > 5.51069 )
								ret := 0.055556
						if( Money_Flow_Ratio > 0.087625 )
							ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.096312 )
					if( mf <= -0.205588 )
						if( ad <= 10.1522 )
							if( Positive_Money_Flow <= 37644.7 )
								if( ad_mf <= 0.484621 )
									ret := 0.300000
								if( ad_mf > 0.484621 )
									ret := -0.411765
							if( Positive_Money_Flow > 37644.7 )
								if( ad_mf <= 0.256215 )
									ret := -0.904762 // sell
								if( ad_mf > 0.256215 )
									ret := -0.500000
						if( ad > 10.1522 )
							if( Positive_Money_Flow_Sum <= 583791 )
								if( Positive_Money_Flow_Sum <= 394668 )
									ret := -0.757576 // sell
								if( Positive_Money_Flow_Sum > 394668 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 583791 )
								if( Money_Flow_Ratio <= 0.113551 )
									ret := -0.230769
								if( Money_Flow_Ratio > 0.113551 )
									ret := -1.000000 // sell
					if( mf > -0.205588 )
						if( MFI <= 10.7123 )
							if( MFI_High <= -69.7247 )
								if( ad <= -729.53 )
									ret := 0.083333
								if( ad > -729.53 )
									ret := -0.288889
							if( MFI_High > -69.7247 )
								if( Positive_Money_Flow <= 32283.9 )
									ret := -0.944444 // sell
								if( Positive_Money_Flow > 32283.9 )
									ret := -0.714286 // sell
						if( MFI > 10.7123 )
							if( Positive_Money_Flow_Sum <= 445078 )
								if( Positive_Money_Flow_Sum <= 230113 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 230113 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 445078 )
								ret := 0.750000 // buy
		if( Raw_Money_Flow > 589251 )
			if( ad <= 165246 )
				if( MFI_Low <= -15.5149 )
					if( mf <= -0.426546 )
						if( Money_Flow_Ratio <= 0.032028 )
							if( ad <= -65043.5 )
								ret := 0.900000 // buy
							if( ad > -65043.5 )
								if( mf <= -0.663276 )
									ret := 0.923077 // buy
								if( mf > -0.663276 )
									ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.032028 )
							ret := 0.625000
					if( mf > -0.426546 )
						if( Positive_Money_Flow_Sum <= 4.28244e+06 )
							if( Positive_Money_Flow_Sum <= 693927 )
								if( Negative_Money_Flow_Sum <= 1.30502e+07 )
									ret := 0.846154 // buy
								if( Negative_Money_Flow_Sum > 1.30502e+07 )
									ret := 0.187500
							if( Positive_Money_Flow_Sum > 693927 )
								if( Positive_Money_Flow_Sum <= 1.78117e+06 )
									ret := 0.688889
								if( Positive_Money_Flow_Sum > 1.78117e+06 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.28244e+06 )
							ret := -0.133333
				if( MFI_Low > -15.5149 )
					if( Raw_Money_Flow <= 1.16425e+07 )
						if( Raw_Money_Flow <= 2.19778e+06 )
							if( MFI_Low <= -10.4201 )
								if( Typical_Price <= 83.4269 )
									ret := 0.022901
								if( Typical_Price > 83.4269 )
									ret := 0.361111
							if( MFI_Low > -10.4201 )
								if( Negative_Money_Flow_Sum <= 1.97418e+07 )
									ret := 0.300885
								if( Negative_Money_Flow_Sum > 1.97418e+07 )
									ret := 0.602740
						if( Raw_Money_Flow > 2.19778e+06 )
							if( MFI <= 11.4373 )
								if( Raw_Money_Flow <= 3.28641e+06 )
									ret := 0.732394 // buy
								if( Raw_Money_Flow > 3.28641e+06 )
									ret := 0.270742
							if( MFI > 11.4373 )
								ret := 0.913043 // buy
					if( Raw_Money_Flow > 1.16425e+07 )
						if( Negative_Money_Flow_Sum <= 1.72821e+08 )
							if( mf <= -0.264513 )
								if( Negative_Money_Flow_Sum <= 4.54466e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.54466e+07 )
									ret := 0.384615
							if( mf > -0.264513 )
								if( Positive_Money_Flow_Sum <= 6.93918e+06 )
									ret := -0.030303
								if( Positive_Money_Flow_Sum > 6.93918e+06 )
									ret := -0.588235
						if( Negative_Money_Flow_Sum > 1.72821e+08 )
							if( Raw_Money_Flow <= 5.35374e+07 )
								if( ad_mf <= -29059.2 )
									ret := -0.571429
								if( ad_mf > -29059.2 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 5.35374e+07 )
								ret := 1.000000 // buy
			if( ad > 165246 )
				if( Money_Flow_Ratio <= 0.06948 )
					if( ad <= 313064 )
						ret := 0.888889 // buy
					if( ad > 313064 )
						ret := -0.300000
				if( Money_Flow_Ratio > 0.06948 )
					if( Money_Flow_Ratio <= 0.09229 )
						ret := -0.384615
					if( Money_Flow_Ratio > 0.09229 )
						ret := -0.800000 // sell
	if( MFI > 11.5813 )
		if( ad_mf <= -0.648919 )
			if( Positive_Money_Flow_Sum <= 2.4031e+06 )
				if( Negative_Money_Flow_Sum <= 3.01642e+06 )
					if( Positive_Money_Flow_Sum <= 2.10466e+06 )
						if( Negative_Money_Flow_Sum <= 2.07768e+06 )
							if( Negative_Money_Flow <= 14.2212 )
								if( Positive_Money_Flow_Sum <= 322288 )
									ret := -0.267030
								if( Positive_Money_Flow_Sum > 322288 )
									ret := 0.094309
							if( Negative_Money_Flow > 14.2212 )
								if( Typical_Price <= 82.8515 )
									ret := 0.280186
								if( Typical_Price > 82.8515 )
									ret := 0.080944
						if( Negative_Money_Flow_Sum > 2.07768e+06 )
							if( Positive_Money_Flow <= 10183 )
								if( ad <= -1110.95 )
									ret := 0.523035
								if( ad > -1110.95 )
									ret := 0.360825
							if( Positive_Money_Flow > 10183 )
								if( Raw_Money_Flow <= 419376 )
									ret := 0.094118
								if( Raw_Money_Flow > 419376 )
									ret := 0.744186 // buy
					if( Positive_Money_Flow_Sum > 2.10466e+06 )
						if( ad_mf <= -805.006 )
							if( Typical_Price <= 81.5008 )
								if( MFI <= 87.4417 )
									ret := 0.636364
								if( MFI > 87.4417 )
									ret := 0.058824
							if( Typical_Price > 81.5008 )
								if( Money_Flow_Ratio <= 1.05517 )
									ret := 0.651163
								if( Money_Flow_Ratio > 1.05517 )
									ret := 0.010417
						if( ad_mf > -805.006 )
							if( Raw_Money_Flow <= 154257 )
								if( MFI_High <= -13.6506 )
									ret := 0.957447 // buy
								if( MFI_High > -13.6506 )
									ret := 0.633333
							if( Raw_Money_Flow > 154257 )
								if( MFI <= 54.2706 )
									ret := -0.083333
								if( MFI > 54.2706 )
									ret := 0.450000
				if( Negative_Money_Flow_Sum > 3.01642e+06 )
					if( MFI_Low <= 6.45594 )
						if( Negative_Money_Flow_Sum <= 6.58375e+06 )
							if( Positive_Money_Flow <= 303539 )
								if( Negative_Money_Flow_Sum <= 6.28461e+06 )
									ret := -0.174863
								if( Negative_Money_Flow_Sum > 6.28461e+06 )
									ret := -0.608696
							if( Positive_Money_Flow > 303539 )
								if( ad <= -5059.62 )
									ret := 0.750000 // buy
								if( ad > -5059.62 )
									ret := 0.083333
						if( Negative_Money_Flow_Sum > 6.58375e+06 )
							if( Money_Flow_Ratio <= 0.19469 )
								if( Typical_Price <= 85.5333 )
									ret := -0.410256
								if( Typical_Price > 85.5333 )
									ret := 0.493151
							if( Money_Flow_Ratio > 0.19469 )
								if( Positive_Money_Flow <= 416121 )
									ret := 0.328125
								if( Positive_Money_Flow > 416121 )
									ret := 0.920000 // buy
					if( MFI_Low > 6.45594 )
						if( Typical_Price <= 111.756 )
							if( MFI_High <= -46.3808 )
								if( ad_mf <= -3300.96 )
									ret := 0.298077
								if( ad_mf > -3300.96 )
									ret := 0.669643
							if( MFI_High > -46.3808 )
								if( Positive_Money_Flow_Sum <= 1.64694e+06 )
									ret := -0.700000 // sell
								if( Positive_Money_Flow_Sum > 1.64694e+06 )
									ret := 0.198347
						if( Typical_Price > 111.756 )
							if( Typical_Price <= 116.225 )
								if( mf <= -0.147724 )
									ret := -0.461538
								if( mf > -0.147724 )
									ret := -0.928571 // sell
							if( Typical_Price > 116.225 )
								if( MFI_Low <= 10.9809 )
									ret := 0.153846
								if( MFI_Low > 10.9809 )
									ret := -0.277778
			if( Positive_Money_Flow_Sum > 2.4031e+06 )
				if( Negative_Money_Flow <= 2.13112e+07 )
					if( MFI_Low <= 67.1414 )
						if( Negative_Money_Flow_Sum <= 3.86717e+06 )
							if( Typical_Price <= 85.6391 )
								if( Positive_Money_Flow_Sum <= 1.02316e+07 )
									ret := 0.031061
								if( Positive_Money_Flow_Sum > 1.02316e+07 )
									ret := -0.245487
							if( Typical_Price > 85.6391 )
								if( Money_Flow_Ratio <= 1.06959 )
									ret := 0.250000
								if( Money_Flow_Ratio > 1.06959 )
									ret := -0.339350
						if( Negative_Money_Flow_Sum > 3.86717e+06 )
							if( Positive_Money_Flow_Sum <= 5.28108e+06 )
								if( Positive_Money_Flow_Sum <= 2.67943e+06 )
									ret := -0.151899
								if( Positive_Money_Flow_Sum > 2.67943e+06 )
									ret := 0.127855
							if( Positive_Money_Flow_Sum > 5.28108e+06 )
								if( Typical_Price <= 79.1883 )
									ret := 0.035564
								if( Typical_Price > 79.1883 )
									ret := -0.028863
					if( MFI_Low > 67.1414 )
						if( MFI <= 95.0897 )
							if( Raw_Money_Flow <= 389888 )
								if( ad_mf <= -2.97615 )
									ret := 0.617241
								if( ad_mf > -2.97615 )
									ret := 0.114286
							if( Raw_Money_Flow > 389888 )
								if( ad_mf <= -88048 )
									ret := 0.743902 // buy
								if( ad_mf > -88048 )
									ret := 0.156780
						if( MFI > 95.0897 )
							if( MFI_High <= 19.3343 )
								if( Positive_Money_Flow <= 3136.48 )
									ret := 0.086022
								if( Positive_Money_Flow > 3136.48 )
									ret := -0.369159
							if( MFI_High > 19.3343 )
								if( ad_mf <= -674.005 )
									ret := 0.166667
								if( ad_mf > -674.005 )
									ret := 0.812500 // buy
				if( Negative_Money_Flow > 2.13112e+07 )
					if( ad <= -105604 )
						if( Raw_Money_Flow <= 2.39411e+07 )
							if( Positive_Money_Flow_Sum <= 6.415e+07 )
								ret := -0.076923
							if( Positive_Money_Flow_Sum > 6.415e+07 )
								if( MFI <= 40.228 )
									ret := 1.000000 // buy
								if( MFI > 40.228 )
									ret := 0.763636 // buy
						if( Raw_Money_Flow > 2.39411e+07 )
							if( Raw_Money_Flow <= 4.02517e+07 )
								if( mf <= -0.156929 )
									ret := 0.621212
								if( mf > -0.156929 )
									ret := -0.171171
							if( Raw_Money_Flow > 4.02517e+07 )
								if( MFI_Low <= 17.2207 )
									ret := 0.608696
								if( MFI_Low > 17.2207 )
									ret := 0.861111 // buy
					if( ad > -105604 )
						if( Typical_Price <= 110.803 )
							if( Positive_Money_Flow_Sum <= 2.07613e+08 )
								if( Typical_Price <= 82.5368 )
									ret := 0.666667
								if( Typical_Price > 82.5368 )
									ret := -0.464286
							if( Positive_Money_Flow_Sum > 2.07613e+08 )
								if( Positive_Money_Flow_Sum <= 2.43116e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.43116e+08 )
									ret := -0.181818
						if( Typical_Price > 110.803 )
							if( Negative_Money_Flow <= 2.65697e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 2.65697e+07 )
								ret := 0.000000
		if( ad_mf > -0.648919 )
			if( Negative_Money_Flow_Sum <= 6.60644e+06 )
				if( Positive_Money_Flow <= 137.795 )
					if( Raw_Money_Flow <= 140705 )
						if( MFI_High <= -0.277481 )
							if( Negative_Money_Flow <= 7691.61 )
								if( Typical_Price <= 81.955 )
									ret := -0.023845
								if( Typical_Price > 81.955 )
									ret := -0.221116
							if( Negative_Money_Flow > 7691.61 )
								if( MFI <= 19.4066 )
									ret := 0.215139
								if( MFI > 19.4066 )
									ret := 0.060300
						if( MFI_High > -0.277481 )
							if( ad_mf <= 0.005168 )
								if( MFI <= 80.0022 )
									ret := 0.583333
								if( MFI > 80.0022 )
									ret := 0.088803
							if( ad_mf > 0.005168 )
								if( MFI <= 97.8512 )
									ret := 0.306024
								if( MFI > 97.8512 )
									ret := -0.076923
					if( Raw_Money_Flow > 140705 )
						if( Raw_Money_Flow <= 474415 )
							if( ad_mf <= 15.7659 )
								if( mf <= 0.076345 )
									ret := -0.068354
								if( mf > 0.076345 )
									ret := 0.090909
							if( ad_mf > 15.7659 )
								if( MFI <= 89.4483 )
									ret := -0.296669
								if( MFI > 89.4483 )
									ret := 0.387097
						if( Raw_Money_Flow > 474415 )
							if( Negative_Money_Flow_Sum <= 1.5829e+06 )
								if( Positive_Money_Flow_Sum <= 500161 )
									ret := -0.418605
								if( Positive_Money_Flow_Sum > 500161 )
									ret := 0.453416
							if( Negative_Money_Flow_Sum > 1.5829e+06 )
								if( MFI_Low <= -3.66511 )
									ret := -0.589744
								if( MFI_Low > -3.66511 )
									ret := -0.083213
				if( Positive_Money_Flow > 137.795 )
					if( MFI_High <= 13.4121 )
						if( MFI_High <= 7.72861 )
							if( Positive_Money_Flow_Sum <= 2.79488e+07 )
								if( MFI <= 40.9947 )
									ret := -0.152714
								if( MFI > 40.9947 )
									ret := -0.093076
							if( Positive_Money_Flow_Sum > 2.79488e+07 )
								if( mf <= 0.226071 )
									ret := -0.716216 // sell
								if( mf > 0.226071 )
									ret := -0.308824
						if( MFI_High > 7.72861 )
							if( ad_mf <= 130707 )
								if( ad_mf <= 104641 )
									ret := 0.024390
								if( ad_mf > 104641 )
									ret := -1.000000 // sell
							if( ad_mf > 130707 )
								if( Raw_Money_Flow <= 2.176e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.176e+07 )
									ret := 0.444444
					if( MFI_High > 13.4121 )
						if( Positive_Money_Flow_Sum <= 4.60378e+06 )
							if( Negative_Money_Flow_Sum <= 183047 )
								if( ad <= 725.884 )
									ret := 0.226415
								if( ad > 725.884 )
									ret := -0.466667
							if( Negative_Money_Flow_Sum > 183047 )
								if( MFI_Low <= 74.4634 )
									ret := 0.444444
								if( MFI_Low > 74.4634 )
									ret := 0.843750 // buy
						if( Positive_Money_Flow_Sum > 4.60378e+06 )
							if( Typical_Price <= 76.564 )
								if( Positive_Money_Flow_Sum <= 2.81801e+07 )
									ret := -0.432432
								if( Positive_Money_Flow_Sum > 2.81801e+07 )
									ret := 0.269663
							if( Typical_Price > 76.564 )
								if( Negative_Money_Flow_Sum <= 1.36714e+06 )
									ret := -0.556872
								if( Negative_Money_Flow_Sum > 1.36714e+06 )
									ret := -0.113744
			if( Negative_Money_Flow_Sum > 6.60644e+06 )
				if( Positive_Money_Flow_Sum <= 2.53804e+06 )
					if( ad <= 9289.32 )
						if( mf <= -0.367653 )
							ret := 0.687500
						if( mf > -0.367653 )
							if( Negative_Money_Flow_Sum <= 1.20502e+07 )
								if( Raw_Money_Flow <= 825191 )
									ret := -0.256000
								if( Raw_Money_Flow > 825191 )
									ret := 0.155556
							if( Negative_Money_Flow_Sum > 1.20502e+07 )
								if( mf <= -0.162527 )
									ret := 0.500000
								if( mf > -0.162527 )
									ret := -0.875000 // sell
					if( ad > 9289.32 )
						if( Money_Flow_Ratio <= 0.282307 )
							if( ad <= 18668.8 )
								if( MFI_High <= -65.7726 )
									ret := -0.363636
								if( MFI_High > -65.7726 )
									ret := 0.000000
							if( ad > 18668.8 )
								ret := -0.823529 // sell
						if( Money_Flow_Ratio > 0.282307 )
							ret := -0.952381 // sell
				if( Positive_Money_Flow_Sum > 2.53804e+06 )
					if( Positive_Money_Flow <= 4.52416e+07 )
						if( Positive_Money_Flow_Sum <= 1.09072e+08 )
							if( ad <= 126289 )
								if( MFI <= 87.4537 )
									ret := 0.003394
								if( MFI > 87.4537 )
									ret := -0.370588
							if( ad > 126289 )
								if( Money_Flow_Ratio <= 3.09129 )
									ret := -0.353723
								if( Money_Flow_Ratio > 3.09129 )
									ret := 0.581081
						if( Positive_Money_Flow_Sum > 1.09072e+08 )
							if( mf <= 0.142538 )
								if( Positive_Money_Flow_Sum <= 2.95979e+08 )
									ret := 0.013333
								if( Positive_Money_Flow_Sum > 2.95979e+08 )
									ret := -0.659091
							if( mf > 0.142538 )
								if( MFI_High <= -3.45971 )
									ret := 0.383721
								if( MFI_High > -3.45971 )
									ret := 0.050881
					if( Positive_Money_Flow > 4.52416e+07 )
						if( ad_mf <= 66727.9 )
							ret := 0.437500
						if( ad_mf > 66727.9 )
							if( Negative_Money_Flow_Sum <= 2.20263e+08 )
								if( Positive_Money_Flow <= 6.48004e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 6.48004e+07 )
									ret := -0.766667 // sell
							if( Negative_Money_Flow_Sum > 2.20263e+08 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_BABA_1Min_ba8a2f4a(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


