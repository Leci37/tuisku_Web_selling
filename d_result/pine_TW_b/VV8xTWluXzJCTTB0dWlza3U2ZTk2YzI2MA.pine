//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: U_1Min_2BM0_6e96c260 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BM0_6e96c260", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_6e96c260(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( Negative_Money_Flow_Sum <= 462575 )
			if( Positive_Money_Flow <= 2623.46 )
				if( bbp <= -0.04535 )
					if( Negative_Money_Flow_Sum <= 118686 )
						if( Negative_Money_Flow <= 65204.9 )
							if( bullPower <= -0.06197 )
								if( Positive_Money_Flow_Sum <= 150556 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 150556 )
									ret := 0.758621 // buy
							if( bullPower > -0.06197 )
								if( Positive_Money_Flow_Sum <= 44742.8 )
									ret := 0.615721
								if( Positive_Money_Flow_Sum > 44742.8 )
									ret := 0.445674
						if( Negative_Money_Flow > 65204.9 )
							if( MFI <= 34.0686 )
								ret := -0.857143 // sell
							if( MFI > 34.0686 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 118686 )
						if( Money_Flow_Ratio <= 0.169156 )
							if( Raw_Money_Flow <= 56156.8 )
								if( Positive_Money_Flow_Sum <= 65934.3 )
									ret := 0.633333
								if( Positive_Money_Flow_Sum > 65934.3 )
									ret := -0.600000
							if( Raw_Money_Flow > 56156.8 )
								if( bullPower <= 0.002979 )
									ret := 0.038462
								if( bullPower > 0.002979 )
									ret := 0.941176 // buy
						if( Money_Flow_Ratio > 0.169156 )
							if( Negative_Money_Flow <= 483.098 )
								if( Raw_Money_Flow <= 3059.91 )
									ret := 0.448276
								if( Raw_Money_Flow > 3059.91 )
									ret := -0.125000
							if( Negative_Money_Flow > 483.098 )
								if( Typical_Price <= 16.4351 )
									ret := 0.050420
								if( Typical_Price > 16.4351 )
									ret := 0.369702
				if( bbp > -0.04535 )
					if( bbm <= 0.031982 )
						if( Raw_Money_Flow <= 29416.8 )
							if( Negative_Money_Flow_Sum <= 87156.9 )
								if( MFI <= 70.7629 )
									ret := 0.257636
								if( MFI > 70.7629 )
									ret := 0.451064
							if( Negative_Money_Flow_Sum > 87156.9 )
								if( MFI_Low <= -8.11284 )
									ret := 0.530612
								if( MFI_Low > -8.11284 )
									ret := 0.129960
						if( Raw_Money_Flow > 29416.8 )
							if( Negative_Money_Flow <= 29565.4 )
								if( bearPower <= -0.000745 )
									ret := -0.181818
								if( bearPower > -0.000745 )
									ret := -0.809524 // sell
							if( Negative_Money_Flow > 29565.4 )
								if( bbp <= 0.069455 )
									ret := 0.106481
								if( bbp > 0.069455 )
									ret := -0.750000 // sell
					if( bbm > 0.031982 )
						if( Positive_Money_Flow <= 1081.27 )
							if( bbm <= 0.036993 )
								if( Negative_Money_Flow <= 91535.8 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 91535.8 )
									ret := 0.285714
							if( bbm > 0.036993 )
								if( Negative_Money_Flow_Sum <= 87756.8 )
									ret := 0.187500
								if( Negative_Money_Flow_Sum > 87756.8 )
									ret := 0.536496
						if( Positive_Money_Flow > 1081.27 )
							ret := -0.666667
			if( Positive_Money_Flow > 2623.46 )
				if( bullPower <= 0.001999 )
					if( MFI_High <= -40.5124 )
						if( bullPower <= -0.03862 )
							if( bbm <= 0.035557 )
								if( Typical_Price <= 23.1974 )
									ret := 0.671329
								if( Typical_Price > 23.1974 )
									ret := -0.200000
							if( bbm > 0.035557 )
								if( MFI <= 36.4681 )
									ret := -0.777778 // sell
								if( MFI > 36.4681 )
									ret := 1.000000 // buy
						if( bullPower > -0.03862 )
							if( Typical_Price <= 15.7335 )
								if( Positive_Money_Flow_Sum <= 38741.1 )
									ret := 0.176471
								if( Positive_Money_Flow_Sum > 38741.1 )
									ret := 0.734375 // buy
							if( Typical_Price > 15.7335 )
								if( Raw_Money_Flow <= 26906.6 )
									ret := 0.247788
								if( Raw_Money_Flow > 26906.6 )
									ret := -0.215686
					if( MFI_High > -40.5124 )
						if( Negative_Money_Flow_Sum <= 56298.8 )
							if( Typical_Price <= 16.6781 )
								if( Negative_Money_Flow_Sum <= 19231.9 )
									ret := -0.100000
								if( Negative_Money_Flow_Sum > 19231.9 )
									ret := 0.720721 // buy
							if( Typical_Price > 16.6781 )
								if( bbm <= 0.005442 )
									ret := 0.330357
								if( bbm > 0.005442 )
									ret := -0.200000
						if( Negative_Money_Flow_Sum > 56298.8 )
							if( Negative_Money_Flow <= 0.490356 )
								if( MFI_Low <= 31.9311 )
									ret := -0.289062
								if( MFI_Low > 31.9311 )
									ret := 0.031477
							if( Negative_Money_Flow > 0.490356 )
								if( Positive_Money_Flow <= 4055.61 )
									ret := 0.047619
								if( Positive_Money_Flow > 4055.61 )
									ret := 0.594595
				if( bullPower > 0.001999 )
					if( Positive_Money_Flow <= 155797 )
						if( MFI_High <= -40.7487 )
							if( bearPower <= -0.007516 )
								if( bearPower <= -0.043632 )
									ret := -0.333333
								if( bearPower > -0.043632 )
									ret := 0.524390
							if( bearPower > -0.007516 )
								if( Typical_Price <= 17.748 )
									ret := -0.333333
								if( Typical_Price > 17.748 )
									ret := 0.192771
						if( MFI_High > -40.7487 )
							if( Negative_Money_Flow_Sum <= 58790.7 )
								if( bbm <= 0.099439 )
									ret := 0.224138
								if( bbm > 0.099439 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 58790.7 )
								if( Positive_Money_Flow_Sum <= 536902 )
									ret := -0.426854
								if( Positive_Money_Flow_Sum > 536902 )
									ret := 0.069307
					if( Positive_Money_Flow > 155797 )
						if( Positive_Money_Flow <= 2.95167e+06 )
							if( bbm <= 0.082396 )
								if( bearPower <= -0.037525 )
									ret := -0.700000 // sell
								if( bearPower > -0.037525 )
									ret := 0.387755
							if( bbm > 0.082396 )
								if( Positive_Money_Flow_Sum <= 875663 )
									ret := 0.297297
								if( Positive_Money_Flow_Sum > 875663 )
									ret := 0.947368 // buy
						if( Positive_Money_Flow > 2.95167e+06 )
							if( Typical_Price <= 22.7211 )
								if( MFI_Low <= 74.734 )
									ret := -1.000000 // sell
								if( MFI_Low > 74.734 )
									ret := -0.500000
							if( Typical_Price > 22.7211 )
								ret := 0.600000
		if( Negative_Money_Flow_Sum > 462575 )
			if( Positive_Money_Flow_Sum <= 4.10827e+06 )
				if( bbm <= 0.024985 )
					if( Positive_Money_Flow_Sum <= 431181 )
						if( bullPower <= -0.020913 )
							if( Typical_Price <= 23.2176 )
								if( Negative_Money_Flow <= 79.1757 )
									ret := 0.012048
								if( Negative_Money_Flow > 79.1757 )
									ret := 0.405542
							if( Typical_Price > 23.2176 )
								if( MFI <= 1.68948 )
									ret := 1.000000 // buy
								if( MFI > 1.68948 )
									ret := -0.180000
						if( bullPower > -0.020913 )
							if( MFI <= 4.93358 )
								if( bearPower <= 0.006304 )
									ret := 0.380282
								if( bearPower > 0.006304 )
									ret := -1.000000 // sell
							if( MFI > 4.93358 )
								if( Raw_Money_Flow <= 8803.13 )
									ret := 0.407407
								if( Raw_Money_Flow > 8803.13 )
									ret := -0.017214
					if( Positive_Money_Flow_Sum > 431181 )
						if( Negative_Money_Flow_Sum <= 1.60742e+06 )
							if( MFI <= 53.3737 )
								if( Typical_Price <= 17.7946 )
									ret := 0.105338
								if( Typical_Price > 17.7946 )
									ret := -0.050267
							if( MFI > 53.3737 )
								if( Negative_Money_Flow_Sum <= 1.19248e+06 )
									ret := -0.018776
								if( Negative_Money_Flow_Sum > 1.19248e+06 )
									ret := -0.217550
						if( Negative_Money_Flow_Sum > 1.60742e+06 )
							if( Typical_Price <= 14.266 )
								if( MFI <= 12.9692 )
									ret := 0.875000 // buy
								if( MFI > 12.9692 )
									ret := 0.279412
							if( Typical_Price > 14.266 )
								if( Negative_Money_Flow <= 431985 )
									ret := -0.095567
								if( Negative_Money_Flow > 431985 )
									ret := 0.096828
				if( bbm > 0.024985 )
					if( bearPower <= -9e-06 )
						if( MFI_Low <= 21.1696 )
							if( bearPower <= -0.050798 )
								if( Money_Flow_Ratio <= 0.027899 )
									ret := -0.201581
								if( Money_Flow_Ratio > 0.027899 )
									ret := 0.077184
							if( bearPower > -0.050798 )
								if( Typical_Price <= 16.9492 )
									ret := -0.106769
								if( Typical_Price > 16.9492 )
									ret := 0.023717
						if( MFI_Low > 21.1696 )
							if( Raw_Money_Flow <= 611460 )
								if( bbp <= -0.140996 )
									ret := 0.517857
								if( bbp > -0.140996 )
									ret := 0.061407
							if( Raw_Money_Flow > 611460 )
								if( bearPower <= -0.170828 )
									ret := -0.600000
								if( bearPower > -0.170828 )
									ret := 0.321752
					if( bearPower > -9e-06 )
						if( MFI <= 76.2532 )
							if( Raw_Money_Flow <= 284776 )
								if( Negative_Money_Flow_Sum <= 2.29834e+06 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 2.29834e+06 )
									ret := -0.215686
							if( Raw_Money_Flow > 284776 )
								if( bbp <= 0.090793 )
									ret := 0.382550
								if( bbp > 0.090793 )
									ret := 0.808219 // buy
						if( MFI > 76.2532 )
							if( Typical_Price <= 18.0615 )
								ret := -1.000000 // sell
							if( Typical_Price > 18.0615 )
								ret := -0.500000
			if( Positive_Money_Flow_Sum > 4.10827e+06 )
				if( Typical_Price <= 21.8 )
					if( MFI <= 75.964 )
						if( Positive_Money_Flow <= 5.69656e+06 )
							if( MFI <= 18.5163 )
								if( bbm <= 0.285 )
									ret := 0.660870
								if( bbm > 0.285 )
									ret := -0.600000
							if( MFI > 18.5163 )
								if( Positive_Money_Flow_Sum <= 6.95681e+06 )
									ret := 0.137421
								if( Positive_Money_Flow_Sum > 6.95681e+06 )
									ret := 0.277937
						if( Positive_Money_Flow > 5.69656e+06 )
							if( MFI_High <= -16.2862 )
								if( Typical_Price <= 20.0345 )
									ret := -1.000000 // sell
								if( Typical_Price > 20.0345 )
									ret := -0.428571
							if( MFI_High > -16.2862 )
								ret := 0.000000
					if( MFI > 75.964 )
						if( Raw_Money_Flow <= 1.45232e+07 )
							if( Positive_Money_Flow_Sum <= 1.5132e+07 )
								if( Positive_Money_Flow <= 9560.6 )
									ret := 0.178862
								if( Positive_Money_Flow > 9560.6 )
									ret := 0.722222 // buy
							if( Positive_Money_Flow_Sum > 1.5132e+07 )
								if( Negative_Money_Flow <= 35.2684 )
									ret := 0.187500
								if( Negative_Money_Flow > 35.2684 )
									ret := 0.843137 // buy
						if( Raw_Money_Flow > 1.45232e+07 )
							ret := -1.000000 // sell
				if( Typical_Price > 21.8 )
					if( MFI_High <= -14.4092 )
						if( bullPower <= 0.012037 )
							if( Raw_Money_Flow <= 1.35822e+06 )
								if( Positive_Money_Flow_Sum <= 1.25279e+07 )
									ret := 0.019856
								if( Positive_Money_Flow_Sum > 1.25279e+07 )
									ret := 0.666667
							if( Raw_Money_Flow > 1.35822e+06 )
								if( Negative_Money_Flow <= 1.97224e+06 )
									ret := -0.355191
								if( Negative_Money_Flow > 1.97224e+06 )
									ret := 0.098039
						if( bullPower > 0.012037 )
							if( bbp <= -0.117641 )
								ret := -1.000000 // sell
							if( bbp > -0.117641 )
								if( Positive_Money_Flow_Sum <= 8.78515e+06 )
									ret := 0.163424
								if( Positive_Money_Flow_Sum > 8.78515e+06 )
									ret := 0.529915
					if( MFI_High > -14.4092 )
						if( Negative_Money_Flow_Sum <= 4.4068e+06 )
							if( MFI <= 88.7076 )
								if( bbm <= 0.016422 )
									ret := 0.100000
								if( bbm > 0.016422 )
									ret := -0.439153
							if( MFI > 88.7076 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 4.4068e+06 )
							if( Positive_Money_Flow_Sum <= 2.69446e+07 )
								if( bullPower <= 0.046691 )
									ret := 0.205128
								if( bullPower > 0.046691 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.69446e+07 )
								if( bbp <= 0.000882 )
									ret := -0.250000
								if( bbp > 0.000882 )
									ret := -1.000000 // sell
	if( BBPower_Color > 0.5 )
		if( Negative_Money_Flow_Sum <= 238918 )
			if( Positive_Money_Flow <= 2.64833 )
				if( bearPower <= 0.017608 )
					if( bbp <= 0.038097 )
						if( Typical_Price <= 15.515 )
							if( Money_Flow_Ratio <= 1.79348 )
								if( Positive_Money_Flow_Sum <= 232637 )
									ret := -0.140625
								if( Positive_Money_Flow_Sum > 232637 )
									ret := 0.600000
							if( Money_Flow_Ratio > 1.79348 )
								if( Typical_Price <= 14.5139 )
									ret := -1.000000 // sell
								if( Typical_Price > 14.5139 )
									ret := -0.428571
						if( Typical_Price > 15.515 )
							if( MFI_High <= -23.0567 )
								if( Money_Flow_Ratio <= 0.470587 )
									ret := 0.095694
								if( Money_Flow_Ratio > 0.470587 )
									ret := -0.068519
							if( MFI_High > -23.0567 )
								if( Negative_Money_Flow_Sum <= 119647 )
									ret := 0.032149
								if( Negative_Money_Flow_Sum > 119647 )
									ret := 0.251969
					if( bbp > 0.038097 )
						if( Negative_Money_Flow <= 70537.6 )
							if( Negative_Money_Flow_Sum <= 107102 )
								if( Negative_Money_Flow_Sum <= 64599.1 )
									ret := 0.454545
								if( Negative_Money_Flow_Sum > 64599.1 )
									ret := -0.052632
							if( Negative_Money_Flow_Sum > 107102 )
								if( MFI <= 44.8087 )
									ret := 0.000000
								if( MFI > 44.8087 )
									ret := 0.731707 // buy
						if( Negative_Money_Flow > 70537.6 )
							if( MFI <= 73.6253 )
								ret := -1.000000 // sell
							if( MFI > 73.6253 )
								ret := -0.166667
				if( bearPower > 0.017608 )
					if( Negative_Money_Flow_Sum <= 46989 )
						if( bbp <= 0.051357 )
							if( Typical_Price <= 17.32 )
								if( Raw_Money_Flow <= 9322.12 )
									ret := -0.684211
								if( Raw_Money_Flow > 9322.12 )
									ret := 0.166667
							if( Typical_Price > 17.32 )
								if( Raw_Money_Flow <= 5501.38 )
									ret := -0.181818
								if( Raw_Money_Flow > 5501.38 )
									ret := 0.354839
						if( bbp > 0.051357 )
							if( Typical_Price <= 18.4737 )
								if( MFI_High <= -21.6422 )
									ret := -0.125000
								if( MFI_High > -21.6422 )
									ret := 0.353982
							if( Typical_Price > 18.4737 )
								if( bearPower <= 0.026103 )
									ret := 0.625000
								if( bearPower > 0.026103 )
									ret := -0.161765
					if( Negative_Money_Flow_Sum > 46989 )
						if( Negative_Money_Flow_Sum <= 130572 )
							if( Typical_Price <= 15.394 )
								if( bbm <= 0.009535 )
									ret := -0.800000 // sell
								if( bbm > 0.009535 )
									ret := 0.000000
							if( Typical_Price > 15.394 )
								if( Negative_Money_Flow <= 3753.67 )
									ret := -0.037838
								if( Negative_Money_Flow > 3753.67 )
									ret := -0.276190
						if( Negative_Money_Flow_Sum > 130572 )
							if( bbp <= 0.191854 )
								if( Negative_Money_Flow_Sum <= 172036 )
									ret := 0.259259
								if( Negative_Money_Flow_Sum > 172036 )
									ret := -0.138462
							if( bbp > 0.191854 )
								if( bbp <= 0.261503 )
									ret := 0.571429
								if( bbp > 0.261503 )
									ret := 1.000000 // buy
			if( Positive_Money_Flow > 2.64833 )
				if( bbp <= 0.021978 )
					if( Positive_Money_Flow_Sum <= 51128.9 )
						if( Typical_Price <= 16.34 )
							if( Negative_Money_Flow_Sum <= 37577.7 )
								if( Positive_Money_Flow_Sum <= 14647.9 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 14647.9 )
									ret := -0.550000
							if( Negative_Money_Flow_Sum > 37577.7 )
								if( bullPower <= 0.012268 )
									ret := 0.041667
								if( bullPower > 0.012268 )
									ret := -0.750000 // sell
						if( Typical_Price > 16.34 )
							if( Negative_Money_Flow_Sum <= 53546.5 )
								if( Positive_Money_Flow_Sum <= 24649.9 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 24649.9 )
									ret := 0.631579
							if( Negative_Money_Flow_Sum > 53546.5 )
								if( Positive_Money_Flow_Sum <= 24068.3 )
									ret := 0.458333
								if( Positive_Money_Flow_Sum > 24068.3 )
									ret := -0.071429
					if( Positive_Money_Flow_Sum > 51128.9 )
						if( Negative_Money_Flow <= 1516.98 )
							if( Negative_Money_Flow_Sum <= 82149.1 )
								if( Positive_Money_Flow <= 3605.98 )
									ret := -0.254545
								if( Positive_Money_Flow > 3605.98 )
									ret := 0.039841
							if( Negative_Money_Flow_Sum > 82149.1 )
								if( bullPower <= 0.005295 )
									ret := -0.011494
								if( bullPower > 0.005295 )
									ret := -0.243056
						if( Negative_Money_Flow > 1516.98 )
							if( bbp <= 0.01306 )
								ret := -1.000000 // sell
							if( bbp > 0.01306 )
								if( MFI_Low <= 23.9856 )
									ret := -1.000000 // sell
								if( MFI_Low > 23.9856 )
									ret := -0.090909
				if( bbp > 0.021978 )
					if( Raw_Money_Flow <= 39799.3 )
						if( Typical_Price <= 20.1117 )
							if( Negative_Money_Flow_Sum <= 36476.1 )
								if( Typical_Price <= 15.5349 )
									ret := -0.571429
								if( Typical_Price > 15.5349 )
									ret := -0.142857
							if( Negative_Money_Flow_Sum > 36476.1 )
								if( bbp <= 0.067819 )
									ret := -0.398953
								if( bbp > 0.067819 )
									ret := -0.550000
						if( Typical_Price > 20.1117 )
							if( Negative_Money_Flow <= 1.8297 )
								if( bullPower <= 0.045927 )
									ret := -0.190608
								if( bullPower > 0.045927 )
									ret := -0.399586
							if( Negative_Money_Flow > 1.8297 )
								if( MFI_High <= 7.15327 )
									ret := 0.217391
								if( MFI_High > 7.15327 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 39799.3 )
						if( bbp <= 0.60833 )
							if( MFI <= 50.9697 )
								if( bbp <= 0.078612 )
									ret := -0.400000
								if( bbp > 0.078612 )
									ret := -0.937500 // sell
							if( MFI > 50.9697 )
								if( bearPower <= 0.140991 )
									ret := -0.082147
								if( bearPower > 0.140991 )
									ret := -0.611111
						if( bbp > 0.60833 )
							if( MFI_High <= 18.0993 )
								if( bbm <= 0.10985 )
									ret := 0.750000 // buy
								if( bbm > 0.10985 )
									ret := 0.000000
							if( MFI_High > 18.0993 )
								ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 238918 )
			if( bbp <= 0.080591 )
				if( MFI <= 60.8658 )
					if( Negative_Money_Flow_Sum <= 247641 )
						if( Typical_Price <= 23.2967 )
							if( Negative_Money_Flow_Sum <= 246295 )
								if( Typical_Price <= 16.7431 )
									ret := 0.000000
								if( Typical_Price > 16.7431 )
									ret := 0.421053
							if( Negative_Money_Flow_Sum > 246295 )
								ret := 1.000000 // buy
						if( Typical_Price > 23.2967 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 247641 )
						if( Negative_Money_Flow <= 229536 )
							if( Positive_Money_Flow_Sum <= 2.0921e+06 )
								if( Raw_Money_Flow <= 291337 )
									ret := -0.034004
								if( Raw_Money_Flow > 291337 )
									ret := 0.108963
							if( Positive_Money_Flow_Sum > 2.0921e+06 )
								if( Typical_Price <= 17.7566 )
									ret := -0.229401
								if( Typical_Price > 17.7566 )
									ret := -0.047424
						if( Negative_Money_Flow > 229536 )
							if( Money_Flow_Ratio <= 0.968722 )
								if( Negative_Money_Flow_Sum <= 452974 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 452974 )
									ret := -0.039950
							if( Money_Flow_Ratio > 0.968722 )
								if( Positive_Money_Flow_Sum <= 1.64794e+07 )
									ret := 0.139955
								if( Positive_Money_Flow_Sum > 1.64794e+07 )
									ret := -0.625000
				if( MFI > 60.8658 )
					if( Positive_Money_Flow_Sum <= 763791 )
						if( MFI_Low <= 42.3264 )
							if( Typical_Price <= 17.7795 )
								if( Typical_Price <= 16.4408 )
									ret := 0.066667
								if( Typical_Price > 16.4408 )
									ret := 0.875000 // buy
							if( Typical_Price > 17.7795 )
								if( Typical_Price <= 22.175 )
									ret := -0.500000
								if( Typical_Price > 22.175 )
									ret := 0.000000
						if( MFI_Low > 42.3264 )
							if( Raw_Money_Flow <= 11738.5 )
								if( bbp <= 0.023864 )
									ret := 0.000000
								if( bbp > 0.023864 )
									ret := -0.888889 // sell
							if( Raw_Money_Flow > 11738.5 )
								if( bearPower <= 0.024965 )
									ret := -0.285714
								if( bearPower > 0.024965 )
									ret := 0.500000
					if( Positive_Money_Flow_Sum > 763791 )
						if( Typical_Price <= 16.3319 )
							if( bbm <= 0.030537 )
								if( Typical_Price <= 16.1567 )
									ret := -0.007407
								if( Typical_Price > 16.1567 )
									ret := 0.231746
							if( bbm > 0.030537 )
								if( Typical_Price <= 15.7025 )
									ret := 0.108247
								if( Typical_Price > 15.7025 )
									ret := 0.405128
						if( Typical_Price > 16.3319 )
							if( bearPower <= -0.056544 )
								if( Raw_Money_Flow <= 1.36532e+06 )
									ret := 0.555556
								if( Raw_Money_Flow > 1.36532e+06 )
									ret := 1.000000 // buy
							if( bearPower > -0.056544 )
								if( MFI_High <= -11.5851 )
									ret := 0.054688
								if( MFI_High > -11.5851 )
									ret := -0.020006
			if( bbp > 0.080591 )
				if( Negative_Money_Flow_Sum <= 1.09716e+07 )
					if( bbm <= 0.01145 )
						if( bullPower <= 0.06413 )
							if( Negative_Money_Flow_Sum <= 801061 )
								if( Raw_Money_Flow <= 25841 )
									ret := -0.087912
								if( Raw_Money_Flow > 25841 )
									ret := 0.379310
							if( Negative_Money_Flow_Sum > 801061 )
								if( Raw_Money_Flow <= 415856 )
									ret := -0.138614
								if( Raw_Money_Flow > 415856 )
									ret := -0.642857
						if( bullPower > 0.06413 )
							if( Raw_Money_Flow <= 729497 )
								if( MFI <= 70.8024 )
									ret := -0.430000
								if( MFI > 70.8024 )
									ret := 0.000000
							if( Raw_Money_Flow > 729497 )
								if( Typical_Price <= 21.4458 )
									ret := -1.000000 // sell
								if( Typical_Price > 21.4458 )
									ret := -0.750000 // sell
					if( bbm > 0.01145 )
						if( Positive_Money_Flow_Sum <= 2.21007e+07 )
							if( Positive_Money_Flow <= 1.90877e+06 )
								if( Positive_Money_Flow_Sum <= 2.96119e+06 )
									ret := 0.246753
								if( Positive_Money_Flow_Sum > 2.96119e+06 )
									ret := 0.106320
							if( Positive_Money_Flow > 1.90877e+06 )
								if( bbm <= 0.2325 )
									ret := -0.203704
								if( bbm > 0.2325 )
									ret := 0.575758
						if( Positive_Money_Flow_Sum > 2.21007e+07 )
							if( Raw_Money_Flow <= 5.31527e+06 )
								if( bbm <= 0.10043 )
									ret := 0.668182
								if( bbm > 0.10043 )
									ret := 0.116279
							if( Raw_Money_Flow > 5.31527e+06 )
								if( Positive_Money_Flow_Sum <= 4.01369e+07 )
									ret := -0.920000 // sell
								if( Positive_Money_Flow_Sum > 4.01369e+07 )
									ret := -0.250000
				if( Negative_Money_Flow_Sum > 1.09716e+07 )
					if( Raw_Money_Flow <= 78043 )
						if( Typical_Price <= 20.3721 )
							if( Typical_Price <= 16.155 )
								ret := -0.400000
							if( Typical_Price > 16.155 )
								if( Negative_Money_Flow_Sum <= 3.02965e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.02965e+07 )
									ret := -0.750000 // sell
						if( Typical_Price > 20.3721 )
							if( Typical_Price <= 20.5017 )
								ret := 0.000000
							if( Typical_Price > 20.5017 )
								if( MFI_High <= -68.74 )
									ret := -0.250000
								if( MFI_High > -68.74 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 78043 )
						if( MFI_Low <= -2.49877 )
							if( Raw_Money_Flow <= 387161 )
								ret := 0.200000
							if( Raw_Money_Flow > 387161 )
								ret := 1.000000 // buy
						if( MFI_Low > -2.49877 )
							if( MFI_Low <= 31.7993 )
								if( MFI <= 31.573 )
									ret := -0.722222 // sell
								if( MFI > 31.573 )
									ret := 0.139535
							if( MFI_Low > 31.7993 )
								if( bearPower <= -0.588414 )
									ret := 1.000000 // buy
								if( bearPower > -0.588414 )
									ret := -0.609589
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_6e96c260(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


