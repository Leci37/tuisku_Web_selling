//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: AAPL_5Min_2MM0_b9b210d3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_2MM0_b9b210d3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_b9b210d3(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 37955 )
		if( Money_Flow_Ratio <= 0.479669 )
			if( Positive_Money_Flow <= 374121 )
				if( MFI_Low <= 6.02992 )
					if( Short_Long_Diff <= -0.105143 )
						if( Negative_Money_Flow_Sum <= 5.70052e+06 )
							if( Negative_Money_Flow_Sum <= 4.00197e+06 )
								if( Raw_Money_Flow <= 96403.7 )
									ret := 0.400000
								if( Raw_Money_Flow > 96403.7 )
									ret := -0.100000
							if( Negative_Money_Flow_Sum > 4.00197e+06 )
								if( Long_MA <= 191.586 )
									ret := 0.716981 // buy
								if( Long_MA > 191.586 )
									ret := 0.142857
						if( Negative_Money_Flow_Sum > 5.70052e+06 )
							if( MFI <= 24.3881 )
								if( Negative_Money_Flow_Sum <= 8.93429e+06 )
									ret := -0.100000
								if( Negative_Money_Flow_Sum > 8.93429e+06 )
									ret := 0.134615
							if( MFI > 24.3881 )
								if( Negative_Money_Flow_Sum <= 6.85762e+06 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 6.85762e+06 )
									ret := 0.777778 // buy
					if( Short_Long_Diff > -0.105143 )
						if( Negative_Money_Flow_Sum <= 3.67245e+06 )
							if( Negative_Money_Flow_Sum <= 3.62564e+06 )
								if( Positive_Money_Flow_Sum <= 839498 )
									ret := 0.289474
								if( Positive_Money_Flow_Sum > 839498 )
									ret := -0.120000
							if( Negative_Money_Flow_Sum > 3.62564e+06 )
								if( MFI_Low <= 0.285973 )
									ret := 1.000000 // buy
								if( MFI_Low > 0.285973 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 3.67245e+06 )
							if( Negative_Money_Flow_Sum <= 4.58894e+06 )
								if( Long_MA <= 191.647 )
									ret := -0.333333
								if( Long_MA > 191.647 )
									ret := 0.133333
							if( Negative_Money_Flow_Sum > 4.58894e+06 )
								if( Negative_Money_Flow_Sum <= 5.78343e+06 )
									ret := 0.230769
								if( Negative_Money_Flow_Sum > 5.78343e+06 )
									ret := 0.012469
				if( MFI_Low > 6.02992 )
					if( Short_Long_Diff <= -0.004017 )
						if( Positive_Money_Flow_Sum <= 3.48717e+06 )
							if( Short_Long_Diff <= -0.209265 )
								if( Negative_Money_Flow <= 722.401 )
									ret := -0.129032
								if( Negative_Money_Flow > 722.401 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > -0.209265 )
								if( Positive_Money_Flow_Sum <= 691278 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 691278 )
									ret := 0.033333
						if( Positive_Money_Flow_Sum > 3.48717e+06 )
							if( Positive_Money_Flow_Sum <= 4.33373e+06 )
								if( Short_MA <= 183.304 )
									ret := 0.300000
								if( Short_MA > 183.304 )
									ret := 0.909091 // buy
							if( Positive_Money_Flow_Sum > 4.33373e+06 )
								if( Positive_Money_Flow_Sum <= 1.05762e+07 )
									ret := -0.043478
								if( Positive_Money_Flow_Sum > 1.05762e+07 )
									ret := 0.222222
					if( Short_Long_Diff > -0.004017 )
						if( Short_MA <= 174.467 )
							if( Positive_Money_Flow_Sum <= 2.87489e+06 )
								if( Raw_Money_Flow <= 159928 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 159928 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 2.87489e+06 )
								if( Short_MA <= 170.266 )
									ret := 0.000000
								if( Short_MA > 170.266 )
									ret := -0.250000
						if( Short_MA > 174.467 )
							if( Positive_Money_Flow_Sum <= 986267 )
								if( Negative_Money_Flow_Sum <= 2.27892e+06 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 2.27892e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 986267 )
								if( Money_Flow_Ratio <= 0.379584 )
									ret := -0.300000
								if( Money_Flow_Ratio > 0.379584 )
									ret := 0.122449
			if( Positive_Money_Flow > 374121 )
				if( Raw_Money_Flow <= 1.79831e+08 )
					if( Positive_Money_Flow <= 1.09766e+08 )
						if( Negative_Money_Flow_Sum <= 9.18669e+06 )
							if( Short_Long_Diff <= -0.090694 )
								if( Positive_Money_Flow_Sum <= 3.57351e+06 )
									ret := -0.385057
								if( Positive_Money_Flow_Sum > 3.57351e+06 )
									ret := 0.142857
							if( Short_Long_Diff > -0.090694 )
								if( Negative_Money_Flow_Sum <= 3.3438e+06 )
									ret := 0.538462
								if( Negative_Money_Flow_Sum > 3.3438e+06 )
									ret := -0.108844
						if( Negative_Money_Flow_Sum > 9.18669e+06 )
							if( Negative_Money_Flow_Sum <= 1.75002e+07 )
								if( MFI_High <= -48.5459 )
									ret := 0.187075
								if( MFI_High > -48.5459 )
									ret := -0.342105
							if( Negative_Money_Flow_Sum > 1.75002e+07 )
								if( MFI_Low <= 4.49843 )
									ret := -0.131937
								if( MFI_Low > 4.49843 )
									ret := -0.040205
					if( Positive_Money_Flow > 1.09766e+08 )
						if( MFI_High <= -69.4695 )
							if( Short_MA <= 189.757 )
								ret := 1.000000 // buy
							if( Short_MA > 189.757 )
								if( MFI <= 7.00519 )
									ret := 0.750000 // buy
								if( MFI > 7.00519 )
									ret := -0.750000 // sell
						if( MFI_High > -69.4695 )
							if( Positive_Money_Flow <= 1.14418e+08 )
								if( Negative_Money_Flow_Sum <= 6.97905e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 6.97905e+08 )
									ret := -0.793103 // sell
							if( Positive_Money_Flow > 1.14418e+08 )
								if( Short_MA <= 174.341 )
									ret := -0.630769
								if( Short_MA > 174.341 )
									ret := -0.158031
				if( Raw_Money_Flow > 1.79831e+08 )
					if( Raw_Money_Flow <= 2.32205e+08 )
						if( Positive_Money_Flow_Sum <= 4.40007e+08 )
							if( Short_Long_Diff <= -0.222646 )
								if( Positive_Money_Flow_Sum <= 2.06586e+08 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 2.06586e+08 )
									ret := 0.759259 // buy
							if( Short_Long_Diff > -0.222646 )
								if( MFI_Low <= 5.77548 )
									ret := -0.416667
								if( MFI_Low > 5.77548 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.40007e+08 )
							if( MFI_Low <= 11.5103 )
								if( Negative_Money_Flow_Sum <= 1.39459e+09 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 1.39459e+09 )
									ret := -0.120690
							if( MFI_Low > 11.5103 )
								if( Negative_Money_Flow_Sum <= 2.12659e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.12659e+09 )
									ret := 0.750000 // buy
					if( Raw_Money_Flow > 2.32205e+08 )
						if( Negative_Money_Flow_Sum <= 1.07121e+09 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.07121e+09 )
							if( Negative_Money_Flow_Sum <= 1.99211e+09 )
								if( Negative_Money_Flow_Sum <= 1.88137e+09 )
									ret := 0.083333
								if( Negative_Money_Flow_Sum > 1.88137e+09 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.99211e+09 )
								if( Negative_Money_Flow_Sum <= 3.76215e+09 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 3.76215e+09 )
									ret := 0.333333
		if( Money_Flow_Ratio > 0.479669 )
			if( Short_Long_Diff <= 1.93062 )
				if( Short_Long_Diff <= 0.152827 )
					if( Raw_Money_Flow <= 1.29509e+06 )
						if( Negative_Money_Flow_Sum <= 525412 )
							if( Short_Long_Diff <= 0.078524 )
								if( Short_Long_Diff <= -0.02357 )
									ret := 0.333333
								if( Short_Long_Diff > -0.02357 )
									ret := -0.452381
							if( Short_Long_Diff > 0.078524 )
								if( Raw_Money_Flow <= 185598 )
									ret := -0.250000
								if( Raw_Money_Flow > 185598 )
									ret := 0.038462
						if( Negative_Money_Flow_Sum > 525412 )
							if( Short_Long_Diff <= -0.036041 )
								if( MFI_High <= -30.2995 )
									ret := -0.093250
								if( MFI_High > -30.2995 )
									ret := 0.012161
							if( Short_Long_Diff > -0.036041 )
								if( Short_MA <= 198.749 )
									ret := 0.024616
								if( Short_MA > 198.749 )
									ret := 0.168456
					if( Raw_Money_Flow > 1.29509e+06 )
						if( Long_MA <= 191.449 )
							if( Positive_Money_Flow_Sum <= 1.25016e+07 )
								if( Positive_Money_Flow <= 2.44981e+06 )
									ret := 0.003170
								if( Positive_Money_Flow > 2.44981e+06 )
									ret := -0.211726
							if( Positive_Money_Flow_Sum > 1.25016e+07 )
								if( Raw_Money_Flow <= 8.0389e+07 )
									ret := 0.145749
								if( Raw_Money_Flow > 8.0389e+07 )
									ret := 0.038565
						if( Long_MA > 191.449 )
							if( Negative_Money_Flow_Sum <= 5.11349e+06 )
								if( Short_Long_Diff <= 0.134489 )
									ret := 0.243697
								if( Short_Long_Diff > 0.134489 )
									ret := -0.517241
							if( Negative_Money_Flow_Sum > 5.11349e+06 )
								if( Short_Long_Diff <= -1.19212 )
									ret := 0.720930 // buy
								if( Short_Long_Diff > -1.19212 )
									ret := 0.018698
				if( Short_Long_Diff > 0.152827 )
					if( Negative_Money_Flow_Sum <= 3.34322e+07 )
						if( Positive_Money_Flow_Sum <= 7.63342e+08 )
							if( Short_Long_Diff <= 0.716827 )
								if( Positive_Money_Flow_Sum <= 7.26043e+07 )
									ret := -0.113760
								if( Positive_Money_Flow_Sum > 7.26043e+07 )
									ret := 0.127090
							if( Short_Long_Diff > 0.716827 )
								if( Long_MA <= 228.049 )
									ret := 0.240000
								if( Long_MA > 228.049 )
									ret := 0.962963 // buy
						if( Positive_Money_Flow_Sum > 7.63342e+08 )
							if( Raw_Money_Flow <= 3.87052e+08 )
								if( Positive_Money_Flow_Sum <= 1.20248e+09 )
									ret := -0.653061
								if( Positive_Money_Flow_Sum > 1.20248e+09 )
									ret := -0.206349
							if( Raw_Money_Flow > 3.87052e+08 )
								if( Positive_Money_Flow_Sum <= 2.47285e+09 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 2.47285e+09 )
									ret := -0.333333
					if( Negative_Money_Flow_Sum > 3.34322e+07 )
						if( Negative_Money_Flow_Sum <= 1.87489e+08 )
							if( Positive_Money_Flow_Sum <= 2.84107e+09 )
								if( Raw_Money_Flow <= 3.21423e+07 )
									ret := -0.059406
								if( Raw_Money_Flow > 3.21423e+07 )
									ret := 0.241885
							if( Positive_Money_Flow_Sum > 2.84107e+09 )
								if( Positive_Money_Flow <= 1.48394e+08 )
									ret := -0.071429
								if( Positive_Money_Flow > 1.48394e+08 )
									ret := -0.928571 // sell
						if( Negative_Money_Flow_Sum > 1.87489e+08 )
							if( Positive_Money_Flow <= 1.86509e+08 )
								if( Short_MA <= 177.147 )
									ret := 0.065509
								if( Short_MA > 177.147 )
									ret := -0.074799
							if( Positive_Money_Flow > 1.86509e+08 )
								if( Typical_Price <= 222.697 )
									ret := 0.177749
								if( Typical_Price > 222.697 )
									ret := -0.214286
			if( Short_Long_Diff > 1.93062 )
				if( MFI_High <= -15.5452 )
					ret := -0.333333
				if( MFI_High > -15.5452 )
					if( Money_Flow_Ratio <= 43.2111 )
						if( Short_Long_Diff <= 2.70913 )
							if( MFI_Low <= 55.5109 )
								ret := 1.000000 // buy
							if( MFI_Low > 55.5109 )
								if( MFI_High <= 0.987543 )
									ret := -0.571429
								if( MFI_High > 0.987543 )
									ret := 0.705882 // buy
						if( Short_Long_Diff > 2.70913 )
							if( Raw_Money_Flow <= 3.34662e+08 )
								if( Positive_Money_Flow <= 2.19001e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 2.19001e+08 )
									ret := 0.000000
							if( Raw_Money_Flow > 3.34662e+08 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 43.2111 )
						ret := -0.166667
	if( Negative_Money_Flow > 37955 )
		if( Typical_Price <= 169.567 )
			if( Raw_Money_Flow <= 1.33074e+06 )
				if( Positive_Money_Flow <= 57472.3 )
					if( Positive_Money_Flow <= 11837.1 )
						if( Positive_Money_Flow_Sum <= 1.5441e+06 )
							if( Long_MA <= 169.562 )
								if( Raw_Money_Flow <= 105404 )
									ret := -0.166667
								if( Raw_Money_Flow > 105404 )
									ret := 0.333333
							if( Long_MA > 169.562 )
								if( Short_Long_Diff <= -0.135239 )
									ret := 0.200000
								if( Short_Long_Diff > -0.135239 )
									ret := 0.900000 // buy
						if( Positive_Money_Flow_Sum > 1.5441e+06 )
							if( Negative_Money_Flow_Sum <= 1.08632e+06 )
								if( Raw_Money_Flow <= 153258 )
									ret := 0.166667
								if( Raw_Money_Flow > 153258 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.08632e+06 )
								if( Positive_Money_Flow_Sum <= 1.95063e+06 )
									ret := -0.215686
								if( Positive_Money_Flow_Sum > 1.95063e+06 )
									ret := 0.043659
					if( Positive_Money_Flow > 11837.1 )
						ret := 1.000000 // buy
				if( Positive_Money_Flow > 57472.3 )
					if( Long_MA <= 168.655 )
						ret := -1.000000 // sell
					if( Long_MA > 168.655 )
						ret := -0.500000
			if( Raw_Money_Flow > 1.33074e+06 )
				if( Negative_Money_Flow_Sum <= 2.96135e+09 )
					if( Positive_Money_Flow_Sum <= 3.84845e+06 )
						if( Negative_Money_Flow_Sum <= 1.87025e+07 )
							if( Negative_Money_Flow_Sum <= 5.15267e+06 )
								if( Negative_Money_Flow_Sum <= 3.91692e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 3.91692e+06 )
									ret := 0.923077 // buy
							if( Negative_Money_Flow_Sum > 5.15267e+06 )
								if( Negative_Money_Flow_Sum <= 1.08733e+07 )
									ret := 0.066667
								if( Negative_Money_Flow_Sum > 1.08733e+07 )
									ret := 0.600000
						if( Negative_Money_Flow_Sum > 1.87025e+07 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.84845e+06 )
						if( Negative_Money_Flow_Sum <= 9.9893e+08 )
							if( Positive_Money_Flow_Sum <= 9.46559e+06 )
								if( Short_MA <= 169.059 )
									ret := -0.156250
								if( Short_MA > 169.059 )
									ret := -0.636364
							if( Positive_Money_Flow_Sum > 9.46559e+06 )
								if( Money_Flow_Ratio <= 0.245969 )
									ret := 0.661765
								if( Money_Flow_Ratio > 0.245969 )
									ret := 0.253359
						if( Negative_Money_Flow_Sum > 9.9893e+08 )
							if( Positive_Money_Flow_Sum <= 1.16923e+09 )
								if( Short_Long_Diff <= -0.226443 )
									ret := -0.175926
								if( Short_Long_Diff > -0.226443 )
									ret := 0.192982
							if( Positive_Money_Flow_Sum > 1.16923e+09 )
								if( Short_Long_Diff <= -0.126964 )
									ret := 0.500000
								if( Short_Long_Diff > -0.126964 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 2.96135e+09 )
					if( Short_Long_Diff <= -0.626159 )
						if( Negative_Money_Flow <= 2.01707e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 2.01707e+07 )
							ret := -0.750000 // sell
					if( Short_Long_Diff > -0.626159 )
						ret := 0.000000
		if( Typical_Price > 169.567 )
			if( Typical_Price <= 199.509 )
				if( Negative_Money_Flow <= 7.96929e+07 )
					if( MFI <= 8.79874 )
						if( Raw_Money_Flow <= 1.2482e+06 )
							if( Negative_Money_Flow_Sum <= 2.24172e+07 )
								if( Typical_Price <= 189.091 )
									ret := 0.571429
								if( Typical_Price > 189.091 )
									ret := -0.100000
							if( Negative_Money_Flow_Sum > 2.24172e+07 )
								if( Typical_Price <= 171.532 )
									ret := 0.230769
								if( Typical_Price > 171.532 )
									ret := -0.017544
						if( Raw_Money_Flow > 1.2482e+06 )
							if( Positive_Money_Flow_Sum <= 6.16833e+06 )
								if( Negative_Money_Flow_Sum <= 8.72885e+06 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 8.72885e+06 )
									ret := 0.647482
							if( Positive_Money_Flow_Sum > 6.16833e+06 )
								if( Negative_Money_Flow_Sum <= 1.95918e+08 )
									ret := -0.324324
								if( Negative_Money_Flow_Sum > 1.95918e+08 )
									ret := 0.275424
					if( MFI > 8.79874 )
						if( Positive_Money_Flow <= 9553.97 )
							if( Negative_Money_Flow <= 7.79143e+07 )
								if( Negative_Money_Flow_Sum <= 8.9571e+08 )
									ret := 0.077154
								if( Negative_Money_Flow_Sum > 8.9571e+08 )
									ret := -0.071910
							if( Negative_Money_Flow > 7.79143e+07 )
								if( Negative_Money_Flow <= 7.84532e+07 )
									ret := 0.517647
								if( Negative_Money_Flow > 7.84532e+07 )
									ret := 0.195122
						if( Positive_Money_Flow > 9553.97 )
							if( Money_Flow_Ratio <= 0.134736 )
								if( Negative_Money_Flow_Sum <= 3.99357e+09 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow_Sum > 3.99357e+09 )
									ret := 0.500000
							if( Money_Flow_Ratio > 0.134736 )
								if( Positive_Money_Flow_Sum <= 2.57987e+06 )
									ret := 0.311475
								if( Positive_Money_Flow_Sum > 2.57987e+06 )
									ret := -0.086792
				if( Negative_Money_Flow > 7.96929e+07 )
					if( Negative_Money_Flow_Sum <= 3.28766e+09 )
						if( Negative_Money_Flow_Sum <= 1.69374e+08 )
							if( MFI <= 75.1264 )
								if( Typical_Price <= 179.982 )
									ret := -0.636364
								if( Typical_Price > 179.982 )
									ret := 0.190476
							if( MFI > 75.1264 )
								if( Negative_Money_Flow_Sum <= 1.45354e+08 )
									ret := -0.258065
								if( Negative_Money_Flow_Sum > 1.45354e+08 )
									ret := -0.697674
						if( Negative_Money_Flow_Sum > 1.69374e+08 )
							if( MFI_Low <= 59.4223 )
								if( MFI <= 69.7817 )
									ret := 0.017728
								if( MFI > 69.7817 )
									ret := -0.182927
							if( MFI_Low > 59.4223 )
								if( Negative_Money_Flow <= 1.34595e+08 )
									ret := 0.009434
								if( Negative_Money_Flow > 1.34595e+08 )
									ret := 0.439490
					if( Negative_Money_Flow_Sum > 3.28766e+09 )
						if( Positive_Money_Flow_Sum <= 1.70447e+09 )
							if( Positive_Money_Flow_Sum <= 5.97373e+08 )
								if( Long_MA <= 175.456 )
									ret := -0.400000
								if( Long_MA > 175.456 )
									ret := 0.727273 // buy
							if( Positive_Money_Flow_Sum > 5.97373e+08 )
								if( Long_MA <= 185.453 )
									ret := -0.636364
								if( Long_MA > 185.453 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 1.70447e+09 )
							if( Money_Flow_Ratio <= 0.44912 )
								ret := 0.500000
							if( Money_Flow_Ratio > 0.44912 )
								if( Raw_Money_Flow <= 2.26375e+08 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 2.26375e+08 )
									ret := 1.000000 // buy
			if( Typical_Price > 199.509 )
				if( Long_MA <= 218.256 )
					if( Short_Long_Diff <= -0.749292 )
						if( Short_Long_Diff <= -3.35133 )
							if( Negative_Money_Flow <= 8.08871e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 8.08871e+06 )
								ret := 0.000000
						if( Short_Long_Diff > -3.35133 )
							if( Typical_Price <= 202.393 )
								if( Short_MA <= 200.945 )
									ret := 0.714286 // buy
								if( Short_MA > 200.945 )
									ret := -0.400000
							if( Typical_Price > 202.393 )
								if( Positive_Money_Flow_Sum <= 8.13283e+08 )
									ret := 0.644295
								if( Positive_Money_Flow_Sum > 8.13283e+08 )
									ret := 0.205882
					if( Short_Long_Diff > -0.749292 )
						if( Positive_Money_Flow_Sum <= 3.83438e+08 )
							if( Short_Long_Diff <= 1.20885 )
								if( Positive_Money_Flow_Sum <= 3.66747e+08 )
									ret := 0.210137
								if( Positive_Money_Flow_Sum > 3.66747e+08 )
									ret := 0.744681 // buy
							if( Short_Long_Diff > 1.20885 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.83438e+08 )
							if( Money_Flow_Ratio <= 0.915467 )
								if( Positive_Money_Flow_Sum <= 1.56349e+09 )
									ret := -0.010417
								if( Positive_Money_Flow_Sum > 1.56349e+09 )
									ret := -0.806452 // sell
							if( Money_Flow_Ratio > 0.915467 )
								if( Negative_Money_Flow <= 7.47079e+07 )
									ret := 0.001912
								if( Negative_Money_Flow > 7.47079e+07 )
									ret := 0.261131
				if( Long_MA > 218.256 )
					if( Money_Flow_Ratio <= 0.261052 )
						if( MFI_Low <= -17.292 )
							if( Negative_Money_Flow <= 1.92025e+08 )
								if( Negative_Money_Flow <= 7.48201e+07 )
									ret := -0.034483
								if( Negative_Money_Flow > 7.48201e+07 )
									ret := 0.666667
							if( Negative_Money_Flow > 1.92025e+08 )
								if( MFI_Low <= -18.3835 )
									ret := -0.437500
								if( MFI_Low > -18.3835 )
									ret := -0.954545 // sell
						if( MFI_Low > -17.292 )
							if( Short_Long_Diff <= -0.440586 )
								if( Negative_Money_Flow_Sum <= 2.84554e+09 )
									ret := 0.484211
								if( Negative_Money_Flow_Sum > 2.84554e+09 )
									ret := -0.411765
							if( Short_Long_Diff > -0.440586 )
								if( Negative_Money_Flow_Sum <= 3.83108e+08 )
									ret := 0.283217
								if( Negative_Money_Flow_Sum > 3.83108e+08 )
									ret := -0.010101
					if( Money_Flow_Ratio > 0.261052 )
						if( Negative_Money_Flow_Sum <= 1.71046e+09 )
							if( Positive_Money_Flow_Sum <= 2.98263e+08 )
								if( Short_MA <= 230.025 )
									ret := 0.111586
								if( Short_MA > 230.025 )
									ret := -0.161157
							if( Positive_Money_Flow_Sum > 2.98263e+08 )
								if( Negative_Money_Flow <= 5.58056e+07 )
									ret := -0.129323
								if( Negative_Money_Flow > 5.58056e+07 )
									ret := 0.047585
						if( Negative_Money_Flow_Sum > 1.71046e+09 )
							if( Raw_Money_Flow <= 1.01795e+08 )
								if( Positive_Money_Flow_Sum <= 7.51143e+08 )
									ret := -0.391304
								if( Positive_Money_Flow_Sum > 7.51143e+08 )
									ret := 0.118644
							if( Raw_Money_Flow > 1.01795e+08 )
								if( Positive_Money_Flow_Sum <= 1.0999e+09 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 1.0999e+09 )
									ret := -0.064516
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_AAPL_5Min_b9b210d3(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


