//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: TRXUSDT_15Min_2MV0_c4977ce8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2MV0_c4977ce8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_c4977ce8(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 0.065292 )
		if( Negative_Money_Flow <= 150416 )
			if( VIP_VIM <= -0.284243 )
				if( Positive_Money_Flow_Sum <= 6.29678e+06 )
					if( Typical_Price <= 0.062035 )
						if( Money_Flow_Ratio <= 0.78127 )
							if( Typical_Price <= 0.049248 )
								if( Positive_Money_Flow_Sum <= 3.30188e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.30188e+06 )
									ret := 0.200000
							if( Typical_Price > 0.049248 )
								if( Negative_Money_Flow_Sum <= 4.42896e+06 )
									ret := 0.191415
								if( Negative_Money_Flow_Sum > 4.42896e+06 )
									ret := 0.021053
						if( Money_Flow_Ratio > 0.78127 )
							if( Negative_Money_Flow_Sum <= 1.99802e+06 )
								if( Positive_Money_Flow_Sum <= 934517 )
									ret := 0.043478
								if( Positive_Money_Flow_Sum > 934517 )
									ret := -0.333333
							if( Negative_Money_Flow_Sum > 1.99802e+06 )
								if( Typical_Price <= 0.055353 )
									ret := -0.500000
								if( Typical_Price > 0.055353 )
									ret := -1.000000 // sell
					if( Typical_Price > 0.062035 )
						if( Negative_Money_Flow_Sum <= 5.31901e+06 )
							if( Positive_Money_Flow <= 146955 )
								if( Money_Flow_Ratio <= 0.593935 )
									ret := 0.464684
								if( Money_Flow_Ratio > 0.593935 )
									ret := -0.027778
							if( Positive_Money_Flow > 146955 )
								if( Negative_Money_Flow_Sum <= 5.15495e+06 )
									ret := 0.134565
								if( Negative_Money_Flow_Sum > 5.15495e+06 )
									ret := -0.888889 // sell
						if( Negative_Money_Flow_Sum > 5.31901e+06 )
							if( Positive_Money_Flow <= 299715 )
								if( MFI_Low <= 7.47018 )
									ret := 0.300000
								if( MFI_Low > 7.47018 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow > 299715 )
								if( Typical_Price <= 0.065135 )
									ret := 0.707692 // buy
								if( Typical_Price > 0.065135 )
									ret := -0.166667
				if( Positive_Money_Flow_Sum > 6.29678e+06 )
					if( Positive_Money_Flow_Sum <= 9.36264e+06 )
						if( VIP_VIM <= -0.314639 )
							if( Positive_Money_Flow <= 2.4961e+06 )
								if( Positive_Money_Flow_Sum <= 6.45572e+06 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 6.45572e+06 )
									ret := -0.931034 // sell
							if( Positive_Money_Flow > 2.4961e+06 )
								ret := 0.000000
						if( VIP_VIM > -0.314639 )
							ret := 0.200000
					if( Positive_Money_Flow_Sum > 9.36264e+06 )
						if( Typical_Price <= 0.063483 )
							if( Negative_Money_Flow_Sum <= 3.70805e+07 )
								if( VIP <= 0.829492 )
									ret := 0.730769 // buy
								if( VIP > 0.829492 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 3.70805e+07 )
								ret := -0.600000
						if( Typical_Price > 0.063483 )
							ret := -1.000000 // sell
			if( VIP_VIM > -0.284243 )
				if( Money_Flow_Ratio <= 4.20889 )
					if( Negative_Money_Flow_Sum <= 3.0072e+07 )
						if( Positive_Money_Flow_Sum <= 4.70782e+07 )
							if( Positive_Money_Flow_Sum <= 1.35775e+07 )
								if( Negative_Money_Flow_Sum <= 1.37106e+06 )
									ret := 0.010413
								if( Negative_Money_Flow_Sum > 1.37106e+06 )
									ret := 0.068026
							if( Positive_Money_Flow_Sum > 1.35775e+07 )
								if( Money_Flow_Ratio <= 1.77469 )
									ret := -0.039604
								if( Money_Flow_Ratio > 1.77469 )
									ret := -0.653333
						if( Positive_Money_Flow_Sum > 4.70782e+07 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.0072e+07 )
						if( VIM <= 1.08619 )
							if( Raw_Money_Flow <= 6.31807e+06 )
								if( Negative_Money_Flow_Sum <= 3.34728e+07 )
									ret := 0.555556
								if( Negative_Money_Flow_Sum > 3.34728e+07 )
									ret := 0.944444 // buy
							if( Raw_Money_Flow > 6.31807e+06 )
								ret := 1.000000 // buy
						if( VIM > 1.08619 )
							ret := 0.000000
				if( Money_Flow_Ratio > 4.20889 )
					if( Negative_Money_Flow <= 64049.2 )
						if( Negative_Money_Flow_Sum <= 963542 )
							if( Typical_Price <= 0.060603 )
								if( Negative_Money_Flow_Sum <= 356728 )
									ret := -0.164835
								if( Negative_Money_Flow_Sum > 356728 )
									ret := -0.539394
							if( Typical_Price > 0.060603 )
								if( Negative_Money_Flow_Sum <= 783251 )
									ret := -0.129450
								if( Negative_Money_Flow_Sum > 783251 )
									ret := -0.480769
						if( Negative_Money_Flow_Sum > 963542 )
							if( VIM <= 0.578198 )
								if( Typical_Price <= 0.061448 )
									ret := -0.333333
								if( Typical_Price > 0.061448 )
									ret := 0.916667 // buy
							if( VIM > 0.578198 )
								if( Raw_Money_Flow <= 694861 )
									ret := 0.114754
								if( Raw_Money_Flow > 694861 )
									ret := -0.510638
					if( Negative_Money_Flow > 64049.2 )
						if( Typical_Price <= 0.062947 )
							if( Negative_Money_Flow_Sum <= 735493 )
								if( Raw_Money_Flow <= 114245 )
									ret := 0.300000
								if( Raw_Money_Flow > 114245 )
									ret := 0.842105 // buy
							if( Negative_Money_Flow_Sum > 735493 )
								ret := -0.142857
						if( Typical_Price > 0.062947 )
							if( Negative_Money_Flow_Sum <= 399624 )
								ret := 0.400000
							if( Negative_Money_Flow_Sum > 399624 )
								if( VIP <= 1.27771 )
									ret := -0.428571
								if( VIP > 1.27771 )
									ret := 0.250000
		if( Negative_Money_Flow > 150416 )
			if( VIM <= 0.812541 )
				if( Raw_Money_Flow <= 443644 )
					if( Positive_Money_Flow_Sum <= 4.66038e+06 )
						if( Negative_Money_Flow <= 372106 )
							if( Negative_Money_Flow_Sum <= 1.56266e+06 )
								if( Typical_Price <= 0.064577 )
									ret := -0.027190
								if( Typical_Price > 0.064577 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 1.56266e+06 )
								if( MFI_Low <= 49.007 )
									ret := -0.200000
								if( MFI_Low > 49.007 )
									ret := -0.850000 // sell
						if( Negative_Money_Flow > 372106 )
							if( Negative_Money_Flow_Sum <= 1.37039e+06 )
								if( Money_Flow_Ratio <= 1.84461 )
									ret := 0.333333
								if( Money_Flow_Ratio > 1.84461 )
									ret := 0.791667 // buy
							if( Negative_Money_Flow_Sum > 1.37039e+06 )
								if( Typical_Price <= 0.062723 )
									ret := 0.166667
								if( Typical_Price > 0.062723 )
									ret := -0.500000
					if( Positive_Money_Flow_Sum > 4.66038e+06 )
						if( Positive_Money_Flow_Sum <= 5.94514e+06 )
							if( VIM <= 0.786754 )
								if( Raw_Money_Flow <= 359162 )
									ret := 0.636364
								if( Raw_Money_Flow > 359162 )
									ret := 0.166667
							if( VIM > 0.786754 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.94514e+06 )
							if( VIM <= 0.804205 )
								if( VIP_VIM <= 0.457454 )
									ret := 0.857143 // buy
								if( VIP_VIM > 0.457454 )
									ret := -0.086957
							if( VIM > 0.804205 )
								ret := -1.000000 // sell
				if( Raw_Money_Flow > 443644 )
					if( Typical_Price <= 0.060293 )
						if( Negative_Money_Flow_Sum <= 1.09431e+07 )
							if( MFI <= 77.3304 )
								if( MFI_High <= -19.2051 )
									ret := 0.571429
								if( MFI_High > -19.2051 )
									ret := -0.372093
							if( MFI > 77.3304 )
								if( Raw_Money_Flow <= 802086 )
									ret := 0.875000 // buy
								if( Raw_Money_Flow > 802086 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 1.09431e+07 )
							if( VIP_VIM <= 0.484557 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.484557 )
								ret := 0.500000
					if( Typical_Price > 0.060293 )
						if( Typical_Price <= 0.062918 )
							if( Typical_Price <= 0.062318 )
								if( VIM <= 0.785368 )
									ret := -0.428571
								if( VIM > 0.785368 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.062318 )
								if( VIM <= 0.796955 )
									ret := -1.000000 // sell
								if( VIM > 0.796955 )
									ret := -0.750000 // sell
						if( Typical_Price > 0.062918 )
							if( Typical_Price <= 0.063767 )
								if( VIP <= 1.20096 )
									ret := -0.388889
								if( VIP > 1.20096 )
									ret := 0.529412
							if( Typical_Price > 0.063767 )
								if( Negative_Money_Flow <= 2.61139e+06 )
									ret := -0.566667
								if( Negative_Money_Flow > 2.61139e+06 )
									ret := 0.750000 // buy
			if( VIM > 0.812541 )
				if( Positive_Money_Flow_Sum <= 2.65357e+07 )
					if( Positive_Money_Flow_Sum <= 2.53764e+06 )
						if( Negative_Money_Flow_Sum <= 5.3228e+06 )
							if( Positive_Money_Flow_Sum <= 2.42782e+06 )
								if( Negative_Money_Flow_Sum <= 2.88638e+06 )
									ret := 0.178170
								if( Negative_Money_Flow_Sum > 2.88638e+06 )
									ret := 0.319166
							if( Positive_Money_Flow_Sum > 2.42782e+06 )
								if( Negative_Money_Flow_Sum <= 1.03342e+06 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 1.03342e+06 )
									ret := 0.647482
						if( Negative_Money_Flow_Sum > 5.3228e+06 )
							if( Negative_Money_Flow_Sum <= 1.01557e+07 )
								if( Negative_Money_Flow_Sum <= 7.869e+06 )
									ret := 0.037801
								if( Negative_Money_Flow_Sum > 7.869e+06 )
									ret := -0.641026
							if( Negative_Money_Flow_Sum > 1.01557e+07 )
								if( Raw_Money_Flow <= 416206 )
									ret := -0.600000
								if( Raw_Money_Flow > 416206 )
									ret := 0.715789 // buy
					if( Positive_Money_Flow_Sum > 2.53764e+06 )
						if( Money_Flow_Ratio <= 0.300672 )
							if( Raw_Money_Flow <= 3.09452e+06 )
								if( VIM <= 1.28263 )
									ret := 0.315789
								if( VIM > 1.28263 )
									ret := 0.873239 // buy
							if( Raw_Money_Flow > 3.09452e+06 )
								if( Raw_Money_Flow <= 4.42767e+06 )
									ret := -0.666667
								if( Raw_Money_Flow > 4.42767e+06 )
									ret := 0.555556
						if( Money_Flow_Ratio > 0.300672 )
							if( Positive_Money_Flow_Sum <= 4.30906e+06 )
								if( MFI <= 35.7466 )
									ret := -0.343284
								if( MFI > 35.7466 )
									ret := 0.038388
							if( Positive_Money_Flow_Sum > 4.30906e+06 )
								if( Raw_Money_Flow <= 1.00156e+06 )
									ret := 0.314815
								if( Raw_Money_Flow > 1.00156e+06 )
									ret := -0.025943
				if( Positive_Money_Flow_Sum > 2.65357e+07 )
					if( Negative_Money_Flow_Sum <= 2.67172e+07 )
						if( VIM <= 0.880798 )
							if( MFI_High <= -14.5413 )
								ret := 1.000000 // buy
							if( MFI_High > -14.5413 )
								ret := 0.500000
						if( VIM > 0.880798 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.67172e+07 )
						if( Typical_Price <= 0.063449 )
							if( MFI_High <= -23.2144 )
								if( Positive_Money_Flow_Sum <= 3.30313e+07 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow_Sum > 3.30313e+07 )
									ret := 1.000000 // buy
							if( MFI_High > -23.2144 )
								if( VIM <= 0.925162 )
									ret := 1.000000 // buy
								if( VIM > 0.925162 )
									ret := -0.250000
						if( Typical_Price > 0.063449 )
							if( Positive_Money_Flow_Sum <= 5.97072e+07 )
								if( Typical_Price <= 0.063954 )
									ret := 0.000000
								if( Typical_Price > 0.063954 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.97072e+07 )
								ret := -1.000000 // sell
	if( Typical_Price > 0.065292 )
		if( Negative_Money_Flow_Sum <= 1.34154e+07 )
			if( Positive_Money_Flow <= 5.4622e+06 )
				if( VIP <= 0.705972 )
					if( Typical_Price <= 0.076812 )
						if( Negative_Money_Flow_Sum <= 1.15713e+07 )
							if( Money_Flow_Ratio <= 0.24749 )
								if( MFI <= 15.0918 )
									ret := 0.135385
								if( MFI > 15.0918 )
									ret := 0.391089
							if( Money_Flow_Ratio > 0.24749 )
								if( Raw_Money_Flow <= 798291 )
									ret := 0.091787
								if( Raw_Money_Flow > 798291 )
									ret := -0.316667
						if( Negative_Money_Flow_Sum > 1.15713e+07 )
							if( VIM <= 1.43313 )
								if( MFI_High <= -67.0321 )
									ret := 0.666667
								if( MFI_High > -67.0321 )
									ret := 0.956522 // buy
							if( VIM > 1.43313 )
								ret := -0.250000
					if( Typical_Price > 0.076812 )
						if( Money_Flow_Ratio <= 0.056912 )
							if( Negative_Money_Flow_Sum <= 8.42903e+06 )
								if( Negative_Money_Flow_Sum <= 4.36769e+06 )
									ret := -0.357143
								if( Negative_Money_Flow_Sum > 4.36769e+06 )
									ret := 0.576577
							if( Negative_Money_Flow_Sum > 8.42903e+06 )
								if( Negative_Money_Flow_Sum <= 1.0549e+07 )
									ret := -0.700000 // sell
								if( Negative_Money_Flow_Sum > 1.0549e+07 )
									ret := 0.600000
						if( Money_Flow_Ratio > 0.056912 )
							if( Negative_Money_Flow <= 128154 )
								if( MFI_High <= -59.0324 )
									ret := 0.118388
								if( MFI_High > -59.0324 )
									ret := -0.158333
							if( Negative_Money_Flow > 128154 )
								if( Raw_Money_Flow <= 1.88562e+06 )
									ret := -0.250823
								if( Raw_Money_Flow > 1.88562e+06 )
									ret := 0.049080
				if( VIP > 0.705972 )
					if( Negative_Money_Flow <= 3.7139e+06 )
						if( VIM <= 1.19101 )
							if( VIP_VIM <= -0.377241 )
								if( Raw_Money_Flow <= 3.13028e+06 )
									ret := -0.122166
								if( Raw_Money_Flow > 3.13028e+06 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.377241 )
								if( Negative_Money_Flow_Sum <= 1.05949e+07 )
									ret := 0.044742
								if( Negative_Money_Flow_Sum > 1.05949e+07 )
									ret := -0.155245
						if( VIM > 1.19101 )
							if( Negative_Money_Flow_Sum <= 1.17056e+07 )
								if( Positive_Money_Flow_Sum <= 7.09852e+06 )
									ret := 0.077048
								if( Positive_Money_Flow_Sum > 7.09852e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.17056e+07 )
								if( Raw_Money_Flow <= 2.0583e+06 )
									ret := 0.734848 // buy
								if( Raw_Money_Flow > 2.0583e+06 )
									ret := -0.200000
					if( Negative_Money_Flow > 3.7139e+06 )
						if( Raw_Money_Flow <= 5.74518e+06 )
							if( VIM <= 0.69642 )
								if( VIP <= 1.28738 )
									ret := -0.750000 // sell
								if( VIP > 1.28738 )
									ret := -1.000000 // sell
							if( VIM > 0.69642 )
								if( Negative_Money_Flow_Sum <= 6.55922e+06 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 6.55922e+06 )
									ret := -0.640000
						if( Raw_Money_Flow > 5.74518e+06 )
							ret := 0.333333
			if( Positive_Money_Flow > 5.4622e+06 )
				if( VIM <= 0.446455 )
					if( Negative_Money_Flow_Sum <= 2.03616e+06 )
						if( Negative_Money_Flow_Sum <= 877143 )
							ret := -0.500000
						if( Negative_Money_Flow_Sum > 877143 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.03616e+06 )
						ret := 0.250000
				if( VIM > 0.446455 )
					if( Positive_Money_Flow_Sum <= 3.27598e+07 )
						if( VIP_VIM <= 0.728116 )
							if( Negative_Money_Flow_Sum <= 2.41278e+06 )
								if( VIM <= 0.609784 )
									ret := 0.666667
								if( VIM > 0.609784 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.41278e+06 )
								if( MFI_Low <= 51.9581 )
									ret := 0.272727
								if( MFI_Low > 51.9581 )
									ret := 0.945946 // buy
						if( VIP_VIM > 0.728116 )
							if( Negative_Money_Flow_Sum <= 3.00904e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.00904e+06 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 3.27598e+07 )
						if( Positive_Money_Flow <= 9.68955e+06 )
							if( Positive_Money_Flow <= 7.97822e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 7.97822e+06 )
								if( Positive_Money_Flow_Sum <= 5.4062e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 5.4062e+07 )
									ret := 0.500000
						if( Positive_Money_Flow > 9.68955e+06 )
							ret := -0.250000
		if( Negative_Money_Flow_Sum > 1.34154e+07 )
			if( Typical_Price <= 0.083672 )
				if( Positive_Money_Flow_Sum <= 1.08205e+08 )
					if( VIP <= 1.24905 )
						if( MFI <= 52.076 )
							if( VIM <= 1.0327 )
								if( Money_Flow_Ratio <= 0.888108 )
									ret := 0.611111
								if( Money_Flow_Ratio > 0.888108 )
									ret := 0.151515
							if( VIM > 1.0327 )
								if( Typical_Price <= 0.073293 )
									ret := 0.159091
								if( Typical_Price > 0.073293 )
									ret := -0.048919
						if( MFI > 52.076 )
							if( Positive_Money_Flow <= 6.42206e+06 )
								if( Negative_Money_Flow <= 1.9207e+06 )
									ret := -0.360882
								if( Negative_Money_Flow > 1.9207e+06 )
									ret := -0.011765
							if( Positive_Money_Flow > 6.42206e+06 )
								if( Negative_Money_Flow_Sum <= 2.89873e+07 )
									ret := 0.588235
								if( Negative_Money_Flow_Sum > 2.89873e+07 )
									ret := -0.157895
					if( VIP > 1.24905 )
						if( Positive_Money_Flow_Sum <= 5.44339e+07 )
							if( VIM <= 0.80998 )
								if( Typical_Price <= 0.077879 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.077879 )
									ret := 0.000000
							if( VIM > 0.80998 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.44339e+07 )
							if( Typical_Price <= 0.082374 )
								ret := 1.000000 // buy
							if( Typical_Price > 0.082374 )
								if( VIP_VIM <= 0.567759 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.567759 )
									ret := 0.250000
				if( Positive_Money_Flow_Sum > 1.08205e+08 )
					ret := -1.000000 // sell
			if( Typical_Price > 0.083672 )
				if( VIM <= 1.31984 )
					if( Negative_Money_Flow_Sum <= 1.52968e+07 )
						if( VIP <= 0.663971 )
							ret := 0.600000
						if( VIP > 0.663971 )
							if( VIP <= 1.22151 )
								if( Positive_Money_Flow_Sum <= 3.16473e+07 )
									ret := -0.715447 // sell
								if( Positive_Money_Flow_Sum > 3.16473e+07 )
									ret := -0.100000
							if( VIP > 1.22151 )
								if( VIM <= 0.722922 )
									ret := -1.000000 // sell
								if( VIM > 0.722922 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 1.52968e+07 )
						if( Raw_Money_Flow <= 667503 )
							if( Negative_Money_Flow_Sum <= 1.55869e+07 )
								if( VIM <= 1.23196 )
									ret := -1.000000 // sell
								if( VIM > 1.23196 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.55869e+07 )
								if( Negative_Money_Flow_Sum <= 1.81489e+07 )
									ret := 0.593750
								if( Negative_Money_Flow_Sum > 1.81489e+07 )
									ret := 0.026316
						if( Raw_Money_Flow > 667503 )
							if( Typical_Price <= 0.086311 )
								if( Money_Flow_Ratio <= 0.291079 )
									ret := 0.277778
								if( Money_Flow_Ratio > 0.291079 )
									ret := -0.642458
							if( Typical_Price > 0.086311 )
								if( VIP <= 0.750062 )
									ret := -0.544974
								if( VIP > 0.750062 )
									ret := -0.218569
				if( VIM > 1.31984 )
					if( Typical_Price <= 0.11819 )
						if( Raw_Money_Flow <= 2.19061e+06 )
							if( Positive_Money_Flow_Sum <= 1.717e+06 )
								if( MFI_High <= -71.6985 )
									ret := 0.272727
								if( MFI_High > -71.6985 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 1.717e+06 )
								if( Negative_Money_Flow <= 758299 )
									ret := 0.357143
								if( Negative_Money_Flow > 758299 )
									ret := 0.846154 // buy
						if( Raw_Money_Flow > 2.19061e+06 )
							if( VIP <= 0.627142 )
								if( VIM <= 1.45119 )
									ret := -0.633333
								if( VIM > 1.45119 )
									ret := 0.416667
							if( VIP > 0.627142 )
								ret := 0.666667
					if( Typical_Price > 0.11819 )
						if( Typical_Price <= 0.126405 )
							if( VIP_VIM <= -0.69039 )
								if( Money_Flow_Ratio <= 0.064578 )
									ret := -0.200000
								if( Money_Flow_Ratio > 0.064578 )
									ret := -0.882353 // sell
							if( VIP_VIM > -0.69039 )
								ret := 0.600000
						if( Typical_Price > 0.126405 )
							if( Positive_Money_Flow <= 98388.6 )
								if( Positive_Money_Flow_Sum <= 6.03879e+06 )
									ret := 0.361111
								if( Positive_Money_Flow_Sum > 6.03879e+06 )
									ret := -0.600000
							if( Positive_Money_Flow > 98388.6 )
								if( VIP <= 0.667534 )
									ret := -0.500000
								if( VIP > 0.667534 )
									ret := -1.000000 // sell
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_TRXUSDT_15Min_c4977ce8(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


