//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: UBER_1Min_2MT0_582af41e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2MT0_582af41e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_582af41e(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( Negative_Money_Flow <= 1.55553 )
		if( Raw_Money_Flow <= 31727.6 )
			if( ema12 <= -0.015004 )
				if( MFI <= 27.5005 )
					if( ema2 <= 64.0095 )
						if( Raw_Money_Flow <= 23734.9 )
							if( Raw_Money_Flow <= 9893.54 )
								ret := 0.000000
							if( Raw_Money_Flow > 9893.54 )
								if( ema1 <= 61.7015 )
									ret := -0.967742 // sell
								if( ema1 > 61.7015 )
									ret := -0.705882 // sell
						if( Raw_Money_Flow > 23734.9 )
							ret := 0.111111
					if( ema2 > 64.0095 )
						if( ema13 <= -0.06602 )
							if( ema12 <= -0.03601 )
								if( Positive_Money_Flow <= 21309.6 )
									ret := 0.151163
								if( Positive_Money_Flow > 21309.6 )
									ret := 0.736842 // buy
							if( ema12 > -0.03601 )
								ret := -0.545455
						if( ema13 > -0.06602 )
							if( Negative_Money_Flow_Sum <= 2.64226e+06 )
								if( ema1 <= 70.567 )
									ret := -0.568966
								if( ema1 > 70.567 )
									ret := -0.162791
							if( Negative_Money_Flow_Sum > 2.64226e+06 )
								if( Positive_Money_Flow_Sum <= 689841 )
									ret := 0.294118
								if( Positive_Money_Flow_Sum > 689841 )
									ret := -0.090909
				if( MFI > 27.5005 )
					if( Positive_Money_Flow_Sum <= 510070 )
						if( MFI_Low <= 49.07 )
							if( Negative_Money_Flow_Sum <= 498016 )
								if( Positive_Money_Flow_Sum <= 214318 )
									ret := 0.336634
								if( Positive_Money_Flow_Sum > 214318 )
									ret := 0.652778
							if( Negative_Money_Flow_Sum > 498016 )
								if( MFI_High <= -46.2325 )
									ret := 0.280000
								if( MFI_High > -46.2325 )
									ret := -0.440000
						if( MFI_Low > 49.07 )
							if( Positive_Money_Flow <= 16402.9 )
								ret := 0.600000
							if( Positive_Money_Flow > 16402.9 )
								if( MFI <= 73.7335 )
									ret := -0.863636 // sell
								if( MFI > 73.7335 )
									ret := -0.384615
					if( Positive_Money_Flow_Sum > 510070 )
						if( Positive_Money_Flow_Sum <= 6.52091e+06 )
							if( ema3 <= 65.4852 )
								if( Positive_Money_Flow <= 17152.3 )
									ret := 0.000000
								if( Positive_Money_Flow > 17152.3 )
									ret := 0.750000 // buy
							if( ema3 > 65.4852 )
								if( MFI_High <= -4.55431 )
									ret := -0.230769
								if( MFI_High > -4.55431 )
									ret := -0.627907
						if( Positive_Money_Flow_Sum > 6.52091e+06 )
							if( MFI_Low <= 76.3095 )
								if( MFI_High <= 4.64041 )
									ret := 0.000000
								if( MFI_High > 4.64041 )
									ret := 0.250000
							if( MFI_Low > 76.3095 )
								ret := 0.571429
			if( ema12 > -0.015004 )
				if( ema13 <= -0.022238 )
					if( Typical_Price <= 67.1279 )
						if( ema1 <= 64.2758 )
							if( Typical_Price <= 61.5804 )
								ret := -1.000000 // sell
							if( Typical_Price > 61.5804 )
								ret := -0.800000 // sell
						if( ema1 > 64.2758 )
							if( ema13 <= -0.034949 )
								ret := 0.500000
							if( ema13 > -0.034949 )
								ret := -0.142857
					if( Typical_Price > 67.1279 )
						if( Positive_Money_Flow <= 1109.44 )
							ret := 0.000000
						if( Positive_Money_Flow > 1109.44 )
							if( Negative_Money_Flow_Sum <= 203831 )
								ret := -0.100000
							if( Negative_Money_Flow_Sum > 203831 )
								if( Positive_Money_Flow_Sum <= 2.63771e+06 )
									ret := -0.811321 // sell
								if( Positive_Money_Flow_Sum > 2.63771e+06 )
									ret := -0.352941
				if( ema13 > -0.022238 )
					if( ema12 <= 0.025779 )
						if( MFI_Low <= 16.7702 )
							if( Raw_Money_Flow <= 11309.3 )
								if( ema12 <= -0.003309 )
									ret := -0.075000
								if( ema12 > -0.003309 )
									ret := -0.460317
							if( Raw_Money_Flow > 11309.3 )
								if( MFI_High <= -44.0205 )
									ret := -0.104377
								if( MFI_High > -44.0205 )
									ret := -0.777778 // sell
						if( MFI_Low > 16.7702 )
							if( Positive_Money_Flow <= 24044.3 )
								if( MFI <= 53.1611 )
									ret := 0.160338
								if( MFI > 53.1611 )
									ret := -0.066142
							if( Positive_Money_Flow > 24044.3 )
								if( Raw_Money_Flow <= 30029.1 )
									ret := -0.400000
								if( Raw_Money_Flow > 30029.1 )
									ret := 0.315789
					if( ema12 > 0.025779 )
						if( Negative_Money_Flow_Sum <= 213276 )
							if( MFI <= 67.6202 )
								if( Negative_Money_Flow_Sum <= 144741 )
									ret := -0.282051
								if( Negative_Money_Flow_Sum > 144741 )
									ret := 0.320988
							if( MFI > 67.6202 )
								if( MFI_High <= -7.94788 )
									ret := -0.826923 // sell
								if( MFI_High > -7.94788 )
									ret := -0.160804
						if( Negative_Money_Flow_Sum > 213276 )
							if( Raw_Money_Flow <= 18619.1 )
								if( ema12 <= 0.111618 )
									ret := -0.318713
								if( ema12 > 0.111618 )
									ret := 0.266667
							if( Raw_Money_Flow > 18619.1 )
								if( Positive_Money_Flow_Sum <= 246066 )
									ret := -0.102564
								if( Positive_Money_Flow_Sum > 246066 )
									ret := -0.607843
		if( Raw_Money_Flow > 31727.6 )
			if( Raw_Money_Flow <= 3.90853e+06 )
				if( ema13 <= -0.450151 )
					if( ema12 <= -0.242112 )
						if( ema1 <= 56.5911 )
							ret := 0.000000
						if( ema1 > 56.5911 )
							if( Positive_Money_Flow <= 2.79333e+06 )
								if( MFI_Low <= 14.2157 )
									ret := 0.818182 // buy
								if( MFI_Low > 14.2157 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 2.79333e+06 )
								if( ema13 <= -0.520868 )
									ret := 0.600000
								if( ema13 > -0.520868 )
									ret := 0.111111
					if( ema12 > -0.242112 )
						ret := -0.214286
				if( ema13 > -0.450151 )
					if( Positive_Money_Flow_Sum <= 1.00256e+08 )
						if( Negative_Money_Flow_Sum <= 87053.6 )
							if( tema <= 74.1731 )
								if( ema12 <= 0.04842 )
									ret := -0.066038
								if( ema12 > 0.04842 )
									ret := -0.635659
							if( tema > 74.1731 )
								if( Positive_Money_Flow <= 65127.1 )
									ret := 0.944444 // buy
								if( Positive_Money_Flow > 65127.1 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 87053.6 )
							if( MFI_Low <= 61.5586 )
								if( ema12 <= 0.062927 )
									ret := 0.005637
								if( ema12 > 0.062927 )
									ret := -0.124013
							if( MFI_Low > 61.5586 )
								if( tema <= 55.0999 )
									ret := 0.888889 // buy
								if( tema > 55.0999 )
									ret := 0.077348
					if( Positive_Money_Flow_Sum > 1.00256e+08 )
						if( ema13 <= 0.033247 )
							if( Negative_Money_Flow_Sum <= 3.39783e+07 )
								if( Positive_Money_Flow <= 73993.1 )
									ret := 0.477273
								if( Positive_Money_Flow > 73993.1 )
									ret := -0.150000
							if( Negative_Money_Flow_Sum > 3.39783e+07 )
								if( ema3 <= 68.625 )
									ret := -0.533333
								if( ema3 > 68.625 )
									ret := 0.065217
						if( ema13 > 0.033247 )
							if( Positive_Money_Flow <= 58863.6 )
								if( Raw_Money_Flow <= 42037.2 )
									ret := -0.428571
								if( Raw_Money_Flow > 42037.2 )
									ret := 0.173913
							if( Positive_Money_Flow > 58863.6 )
								if( Typical_Price <= 71.6577 )
									ret := -0.536364
								if( Typical_Price > 71.6577 )
									ret := -0.911111 // sell
			if( Raw_Money_Flow > 3.90853e+06 )
				if( ema12 <= 0.359839 )
					if( Positive_Money_Flow_Sum <= 1.47116e+07 )
						if( ema2 <= 66.5076 )
							if( ema13 <= -0.054264 )
								if( MFI <= 18.2538 )
									ret := 0.913043 // buy
								if( MFI > 18.2538 )
									ret := 0.280000
							if( ema13 > -0.054264 )
								if( MFI <= 50.7009 )
									ret := -0.611111
								if( MFI > 50.7009 )
									ret := 0.000000
						if( ema2 > 66.5076 )
							if( Positive_Money_Flow <= 8.39171e+06 )
								if( Positive_Money_Flow <= 7.32255e+06 )
									ret := -0.257669
								if( Positive_Money_Flow > 7.32255e+06 )
									ret := 0.476190
							if( Positive_Money_Flow > 8.39171e+06 )
								if( MFI_High <= -34.058 )
									ret := -1.000000 // sell
								if( MFI_High > -34.058 )
									ret := -0.647059
					if( Positive_Money_Flow_Sum > 1.47116e+07 )
						if( Positive_Money_Flow <= 1.69786e+07 )
							if( MFI <= 32.8392 )
								if( Positive_Money_Flow <= 7.61763e+06 )
									ret := -0.327273
								if( Positive_Money_Flow > 7.61763e+06 )
									ret := 0.395833
							if( MFI > 32.8392 )
								if( Negative_Money_Flow_Sum <= 2.00867e+07 )
									ret := 0.075565
								if( Negative_Money_Flow_Sum > 2.00867e+07 )
									ret := 0.225957
						if( Positive_Money_Flow > 1.69786e+07 )
							if( ema1 <= 74.5122 )
								if( Money_Flow_Ratio <= 36.8367 )
									ret := -0.374286
								if( Money_Flow_Ratio > 36.8367 )
									ret := 0.500000
							if( ema1 > 74.5122 )
								if( MFI <= 88.7691 )
									ret := 0.580645
								if( MFI > 88.7691 )
									ret := -0.473684
				if( ema12 > 0.359839 )
					if( Positive_Money_Flow_Sum <= 2.77526e+07 )
						ret := 0.166667
					if( Positive_Money_Flow_Sum > 2.77526e+07 )
						ret := -1.000000 // sell
	if( Negative_Money_Flow > 1.55553 )
		if( Positive_Money_Flow_Sum <= 549853 )
			if( ema12 <= -0.017103 )
				if( Raw_Money_Flow <= 42687.1 )
					if( ema1 <= 67.4088 )
						if( Positive_Money_Flow <= 1665.69 )
							if( Positive_Money_Flow_Sum <= 335532 )
								if( Positive_Money_Flow_Sum <= 103068 )
									ret := 0.288288
								if( Positive_Money_Flow_Sum > 103068 )
									ret := 0.662857
							if( Positive_Money_Flow_Sum > 335532 )
								if( ema3 <= 66.073 )
									ret := 0.323529
								if( ema3 > 66.073 )
									ret := -0.529412
						if( Positive_Money_Flow > 1665.69 )
							if( ema12 <= -0.069366 )
								ret := -0.900000 // sell
							if( ema12 > -0.069366 )
								if( Raw_Money_Flow <= 24083.8 )
									ret := -0.333333
								if( Raw_Money_Flow > 24083.8 )
									ret := 0.809524 // buy
					if( ema1 > 67.4088 )
						if( Typical_Price <= 72.2782 )
							if( Positive_Money_Flow_Sum <= 165647 )
								if( MFI_High <= -71.0209 )
									ret := 0.717949 // buy
								if( MFI_High > -71.0209 )
									ret := 0.939535 // buy
							if( Positive_Money_Flow_Sum > 165647 )
								if( MFI_High <= -76.2631 )
									ret := -0.357143
								if( MFI_High > -76.2631 )
									ret := 0.692521
						if( Typical_Price > 72.2782 )
							if( Typical_Price <= 77.3912 )
								if( MFI <= 26.2755 )
									ret := 0.354167
								if( MFI > 26.2755 )
									ret := 0.627907
							if( Typical_Price > 77.3912 )
								ret := -0.100000
				if( Raw_Money_Flow > 42687.1 )
					if( MFI_High <= -78.9556 )
						if( Typical_Price <= 65.5555 )
							if( Negative_Money_Flow <= 6.32919e+06 )
								ret := 0.875000 // buy
							if( Negative_Money_Flow > 6.32919e+06 )
								ret := 0.444444
						if( Typical_Price > 65.5555 )
							if( ema13 <= -0.223067 )
								if( MFI_High <= -79.8039 )
									ret := -0.333333
								if( MFI_High > -79.8039 )
									ret := -0.950000 // sell
							if( ema13 > -0.223067 )
								ret := 0.150000
					if( MFI_High > -78.9556 )
						if( Negative_Money_Flow <= 84601.9 )
							if( tema <= 71.2701 )
								if( tema <= 66.2402 )
									ret := 0.027523
								if( tema > 66.2402 )
									ret := 0.449704
							if( tema > 71.2701 )
								if( ema3 <= 72.3704 )
									ret := -0.653846
								if( ema3 > 72.3704 )
									ret := 0.098901
						if( Negative_Money_Flow > 84601.9 )
							if( ema12 <= -0.038659 )
								if( Negative_Money_Flow_Sum <= 839401 )
									ret := 0.823529 // buy
								if( Negative_Money_Flow_Sum > 839401 )
									ret := 0.436667
							if( ema12 > -0.038659 )
								if( ema1 <= 68.6102 )
									ret := 0.628205
								if( ema1 > 68.6102 )
									ret := -0.175000
			if( ema12 > -0.017103 )
				if( ema3 <= 62.5775 )
					if( Negative_Money_Flow_Sum <= 265156 )
						if( Raw_Money_Flow <= 48754.8 )
							if( MFI_High <= -21.4007 )
								ret := -0.750000 // sell
							if( MFI_High > -21.4007 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 48754.8 )
							ret := -0.384615
					if( Negative_Money_Flow_Sum > 265156 )
						if( MFI_High <= -50.6907 )
							if( ema12 <= 0.027933 )
								ret := -1.000000 // sell
							if( ema12 > 0.027933 )
								ret := -0.363636
						if( MFI_High > -50.6907 )
							if( Positive_Money_Flow <= 1297.24 )
								if( Negative_Money_Flow <= 18002.2 )
									ret := 0.827586 // buy
								if( Negative_Money_Flow > 18002.2 )
									ret := 0.000000
							if( Positive_Money_Flow > 1297.24 )
								ret := -0.625000
				if( ema3 > 62.5775 )
					if( Typical_Price <= 70.8563 )
						if( MFI_Low <= 52.5509 )
							if( ema12 <= 0.058561 )
								if( Negative_Money_Flow_Sum <= 450315 )
									ret := 0.377000
								if( Negative_Money_Flow_Sum > 450315 )
									ret := 0.191525
							if( ema12 > 0.058561 )
								if( Negative_Money_Flow_Sum <= 338736 )
									ret := -0.233871
								if( Negative_Money_Flow_Sum > 338736 )
									ret := 0.325301
						if( MFI_Low > 52.5509 )
							if( Positive_Money_Flow_Sum <= 373759 )
								if( ema1 <= 68.5316 )
									ret := 0.833333 // buy
								if( ema1 > 68.5316 )
									ret := -0.263158
							if( Positive_Money_Flow_Sum > 373759 )
								if( Money_Flow_Ratio <= 4.58342 )
									ret := 0.735294 // buy
								if( Money_Flow_Ratio > 4.58342 )
									ret := 1.000000 // buy
					if( Typical_Price > 70.8563 )
						if( ema1 <= 71.0143 )
							if( ema13 <= 0.04263 )
								ret := -0.300000
							if( ema13 > 0.04263 )
								ret := -0.882353 // sell
						if( ema1 > 71.0143 )
							if( tema <= 71.152 )
								if( Negative_Money_Flow_Sum <= 135381 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 135381 )
									ret := 0.875000 // buy
							if( tema > 71.152 )
								if( ema13 <= -0.014413 )
									ret := -0.132948
								if( ema13 > -0.014413 )
									ret := 0.140642
		if( Positive_Money_Flow_Sum > 549853 )
			if( ema12 <= -0.081371 )
				if( Negative_Money_Flow_Sum <= 9.02781e+07 )
					if( Positive_Money_Flow_Sum <= 2.01517e+08 )
						if( Negative_Money_Flow_Sum <= 3.9894e+07 )
							if( tema <= 81.3424 )
								if( Negative_Money_Flow_Sum <= 2.22893e+07 )
									ret := 0.097934
								if( Negative_Money_Flow_Sum > 2.22893e+07 )
									ret := 0.269308
							if( tema > 81.3424 )
								ret := -0.904762 // sell
						if( Negative_Money_Flow_Sum > 3.9894e+07 )
							if( Negative_Money_Flow_Sum <= 4.83023e+07 )
								if( ema1 <= 64.807 )
									ret := 0.916667 // buy
								if( ema1 > 64.807 )
									ret := -0.298387
							if( Negative_Money_Flow_Sum > 4.83023e+07 )
								if( Negative_Money_Flow_Sum <= 5.3436e+07 )
									ret := 0.369427
								if( Negative_Money_Flow_Sum > 5.3436e+07 )
									ret := 0.013913
					if( Positive_Money_Flow_Sum > 2.01517e+08 )
						ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 9.02781e+07 )
					if( ema3 <= 85.0125 )
						if( MFI_Low <= 27.6808 )
							if( Raw_Money_Flow <= 1.1063e+07 )
								if( ema12 <= -0.328377 )
									ret := 0.250000
								if( ema12 > -0.328377 )
									ret := 0.859375 // buy
							if( Raw_Money_Flow > 1.1063e+07 )
								if( Negative_Money_Flow_Sum <= 1.49794e+08 )
									ret := 0.232558
								if( Negative_Money_Flow_Sum > 1.49794e+08 )
									ret := 0.911765 // buy
						if( MFI_Low > 27.6808 )
							if( MFI_High <= -19.7706 )
								ret := -0.636364
							if( MFI_High > -19.7706 )
								ret := 0.615385
					if( ema3 > 85.0125 )
						if( Negative_Money_Flow <= 9.68323e+06 )
							ret := 0.200000
						if( Negative_Money_Flow > 9.68323e+06 )
							ret := -0.583333
			if( ema12 > -0.081371 )
				if( Typical_Price <= 58.9909 )
					if( ema12 <= 0.107549 )
						if( Positive_Money_Flow_Sum <= 2.32392e+07 )
							if( ema12 <= -0.033406 )
								if( MFI <= 32.3246 )
									ret := 0.357143
								if( MFI > 32.3246 )
									ret := -0.115385
							if( ema12 > -0.033406 )
								if( ema1 <= 58.9784 )
									ret := 0.695238
								if( ema1 > 58.9784 )
									ret := 0.090909
						if( Positive_Money_Flow_Sum > 2.32392e+07 )
							if( Negative_Money_Flow_Sum <= 2.87691e+07 )
								if( MFI_High <= -13.888 )
									ret := -0.750000 // sell
								if( MFI_High > -13.888 )
									ret := -0.100000
							if( Negative_Money_Flow_Sum > 2.87691e+07 )
								if( MFI <= 51.0512 )
									ret := -0.142857
								if( MFI > 51.0512 )
									ret := 0.888889 // buy
					if( ema12 > 0.107549 )
						if( MFI <= 62.7082 )
							ret := 0.454545
						if( MFI > 62.7082 )
							if( ema12 <= 0.211275 )
								ret := 1.000000 // buy
							if( ema12 > 0.211275 )
								ret := 0.888889 // buy
				if( Typical_Price > 58.9909 )
					if( ema12 <= 0.480563 )
						if( Positive_Money_Flow_Sum <= 2.99082e+07 )
							if( Negative_Money_Flow_Sum <= 2.47255e+06 )
								if( Positive_Money_Flow_Sum <= 803501 )
									ret := -0.017653
								if( Positive_Money_Flow_Sum > 803501 )
									ret := 0.196148
							if( Negative_Money_Flow_Sum > 2.47255e+06 )
								if( Positive_Money_Flow_Sum <= 7.26799e+06 )
									ret := -0.030759
								if( Positive_Money_Flow_Sum > 7.26799e+06 )
									ret := 0.035674
						if( Positive_Money_Flow_Sum > 2.99082e+07 )
							if( Raw_Money_Flow <= 3.48053e+06 )
								if( ema13 <= 0.391563 )
									ret := 0.071393
								if( ema13 > 0.391563 )
									ret := -0.783784 // sell
							if( Raw_Money_Flow > 3.48053e+06 )
								if( Negative_Money_Flow <= 6.1346e+06 )
									ret := 0.284799
								if( Negative_Money_Flow > 6.1346e+06 )
									ret := 0.135235
					if( ema12 > 0.480563 )
						if( tema <= 72.2438 )
							ret := -0.875000 // sell
						if( tema > 72.2438 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_582af41e(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


