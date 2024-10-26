//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: UBER_1Min_2MV0_7a43d9ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2MV0_7a43d9ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_7a43d9ec(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIM <= 1.27364 )
		if( Money_Flow_Ratio <= 2.91657 )
			if( Raw_Money_Flow <= 7.03187e+06 )
				if( Typical_Price <= 56.9517 )
					if( Raw_Money_Flow <= 340753 )
						if( VIP <= 1.0962 )
							ret := 0.727273 // buy
						if( VIP > 1.0962 )
							ret := -0.190476
					if( Raw_Money_Flow > 340753 )
						if( VIP_VIM <= -0.218843 )
							ret := 0.000000
						if( VIP_VIM > -0.218843 )
							if( Typical_Price <= 56.8775 )
								if( MFI_High <= -41.4435 )
									ret := 0.692308
								if( MFI_High > -41.4435 )
									ret := 1.000000 // buy
							if( Typical_Price > 56.8775 )
								ret := 0.444444
				if( Typical_Price > 56.9517 )
					if( Positive_Money_Flow_Sum <= 1.66186e+06 )
						if( Raw_Money_Flow <= 66431.7 )
							if( Positive_Money_Flow_Sum <= 918875 )
								if( Positive_Money_Flow_Sum <= 875300 )
									ret := 0.058824
								if( Positive_Money_Flow_Sum > 875300 )
									ret := 0.833333 // buy
							if( Positive_Money_Flow_Sum > 918875 )
								if( Negative_Money_Flow_Sum <= 1.7045e+06 )
									ret := -0.616541
								if( Negative_Money_Flow_Sum > 1.7045e+06 )
									ret := 0.428571
						if( Raw_Money_Flow > 66431.7 )
							if( MFI_Low <= -11.2501 )
								if( Typical_Price <= 68.993 )
									ret := -0.723404 // sell
								if( Typical_Price > 68.993 )
									ret := 0.444444
							if( MFI_Low > -11.2501 )
								if( VIP <= 0.883508 )
									ret := 0.716049 // buy
								if( VIP > 0.883508 )
									ret := 0.260949
					if( Positive_Money_Flow_Sum > 1.66186e+06 )
						if( MFI_Low <= 51.7928 )
							if( Negative_Money_Flow <= 6.65011e+06 )
								if( Negative_Money_Flow_Sum <= 1.24236e+06 )
									ret := -0.487395
								if( Negative_Money_Flow_Sum > 1.24236e+06 )
									ret := -0.031111
							if( Negative_Money_Flow > 6.65011e+06 )
								if( Positive_Money_Flow_Sum <= 1.40075e+07 )
									ret := -0.589744
								if( Positive_Money_Flow_Sum > 1.40075e+07 )
									ret := -0.239130
						if( MFI_Low > 51.7928 )
							if( Raw_Money_Flow <= 3.25274e+06 )
								if( VIP <= 1.30505 )
									ret := 0.045942
								if( VIP > 1.30505 )
									ret := -0.254630
							if( Raw_Money_Flow > 3.25274e+06 )
								if( Positive_Money_Flow_Sum <= 2.15916e+07 )
									ret := -0.527778
								if( Positive_Money_Flow_Sum > 2.15916e+07 )
									ret := 0.447301
			if( Raw_Money_Flow > 7.03187e+06 )
				if( Raw_Money_Flow <= 1.37251e+08 )
					if( VIP <= 0.785729 )
						if( Money_Flow_Ratio <= 0.397624 )
							if( Positive_Money_Flow_Sum <= 2.07891e+07 )
								if( Negative_Money_Flow <= 7.33382e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow > 7.33382e+06 )
									ret := 0.026549
							if( Positive_Money_Flow_Sum > 2.07891e+07 )
								if( VIP <= 0.761361 )
									ret := 0.735294 // buy
								if( VIP > 0.761361 )
									ret := 0.055556
						if( Money_Flow_Ratio > 0.397624 )
							if( VIP_VIM <= -0.488 )
								if( VIP_VIM <= -0.508854 )
									ret := 0.611111
								if( VIP_VIM > -0.508854 )
									ret := -0.375000
							if( VIP_VIM > -0.488 )
								if( MFI <= 31.8794 )
									ret := 0.250000
								if( MFI > 31.8794 )
									ret := 0.846154 // buy
					if( VIP > 0.785729 )
						if( MFI_High <= -7.5924 )
							if( Negative_Money_Flow_Sum <= 1.54686e+08 )
								if( Positive_Money_Flow <= 1.62363e+07 )
									ret := 0.079667
								if( Positive_Money_Flow > 1.62363e+07 )
									ret := -0.181435
							if( Negative_Money_Flow_Sum > 1.54686e+08 )
								if( VIM <= 0.816082 )
									ret := -0.583333
								if( VIM > 0.816082 )
									ret := 0.470588
						if( MFI_High > -7.5924 )
							if( Positive_Money_Flow <= 1.11341e+07 )
								if( VIP_VIM <= 0.242907 )
									ret := -0.583333
								if( VIP_VIM > 0.242907 )
									ret := 0.409091
							if( Positive_Money_Flow > 1.11341e+07 )
								if( MFI_High <= -7.06352 )
									ret := 0.294118
								if( MFI_High > -7.06352 )
									ret := 0.720000 // buy
				if( Raw_Money_Flow > 1.37251e+08 )
					ret := -0.884615 // sell
		if( Money_Flow_Ratio > 2.91657 )
			if( VIP <= 1.12412 )
				if( Raw_Money_Flow <= 3.28603e+06 )
					if( MFI <= 76.6445 )
						if( Negative_Money_Flow_Sum <= 7.02294e+06 )
							if( MFI_High <= -3.96917 )
								if( MFI_High <= -4.80354 )
									ret := 0.297872
								if( MFI_High > -4.80354 )
									ret := -0.066667
							if( MFI_High > -3.96917 )
								if( VIP <= 1.05166 )
									ret := -0.846154 // sell
								if( VIP > 1.05166 )
									ret := -0.318182
						if( Negative_Money_Flow_Sum > 7.02294e+06 )
							if( Positive_Money_Flow_Sum <= 2.37341e+07 )
								ret := 0.090909
							if( Positive_Money_Flow_Sum > 2.37341e+07 )
								if( Positive_Money_Flow_Sum <= 3.37868e+07 )
									ret := -0.702703 // sell
								if( Positive_Money_Flow_Sum > 3.37868e+07 )
									ret := -0.370370
					if( MFI > 76.6445 )
						if( Positive_Money_Flow_Sum <= 6.9951e+07 )
							if( VIP <= 1.09217 )
								if( MFI_Low <= 60.8396 )
									ret := 0.385965
								if( MFI_Low > 60.8396 )
									ret := 0.104348
							if( VIP > 1.09217 )
								if( MFI_High <= -1.94697 )
									ret := -0.216216
								if( MFI_High > -1.94697 )
									ret := 0.142857
						if( Positive_Money_Flow_Sum > 6.9951e+07 )
							if( Money_Flow_Ratio <= 6.40814 )
								if( Negative_Money_Flow_Sum <= 3.38472e+07 )
									ret := -0.222222
								if( Negative_Money_Flow_Sum > 3.38472e+07 )
									ret := 0.238095
							if( Money_Flow_Ratio > 6.40814 )
								if( Positive_Money_Flow_Sum <= 2.4699e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.4699e+08 )
									ret := -0.222222
				if( Raw_Money_Flow > 3.28603e+06 )
					if( VIM <= 0.605298 )
						ret := -1.000000 // sell
					if( VIM > 0.605298 )
						if( Typical_Price <= 69.3692 )
							if( VIP_VIM <= 0.11194 )
								if( Money_Flow_Ratio <= 4.59783 )
									ret := 0.979167 // buy
								if( Money_Flow_Ratio > 4.59783 )
									ret := 0.750000 // buy
							if( VIP_VIM > 0.11194 )
								if( MFI_High <= 0.923501 )
									ret := 0.697674
								if( MFI_High > 0.923501 )
									ret := -0.555556
						if( Typical_Price > 69.3692 )
							if( VIM <= 0.884651 )
								if( Positive_Money_Flow_Sum <= 4.18081e+07 )
									ret := -0.037037
								if( Positive_Money_Flow_Sum > 4.18081e+07 )
									ret := 0.523077
							if( VIM > 0.884651 )
								if( Negative_Money_Flow_Sum <= 1.98754e+07 )
									ret := 0.203704
								if( Negative_Money_Flow_Sum > 1.98754e+07 )
									ret := -0.360000
			if( VIP > 1.12412 )
				if( Positive_Money_Flow <= 1.4345e+07 )
					if( MFI_High <= -1.71331 )
						if( VIP <= 1.4029 )
							if( Negative_Money_Flow_Sum <= 5.09971e+07 )
								if( Typical_Price <= 74.7766 )
									ret := -0.161732
								if( Typical_Price > 74.7766 )
									ret := 0.073059
							if( Negative_Money_Flow_Sum > 5.09971e+07 )
								if( Positive_Money_Flow_Sum <= 1.9678e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.9678e+08 )
									ret := -0.611111
						if( VIP > 1.4029 )
							if( VIP_VIM <= 0.552377 )
								if( Positive_Money_Flow_Sum <= 2.64744e+06 )
									ret := -0.947368 // sell
								if( Positive_Money_Flow_Sum > 2.64744e+06 )
									ret := -0.500000
							if( VIP_VIM > 0.552377 )
								if( MFI <= 75.2041 )
									ret := -0.588235
								if( MFI > 75.2041 )
									ret := -0.175000
					if( MFI_High > -1.71331 )
						if( Typical_Price <= 54.9593 )
							if( MFI <= 85.8395 )
								ret := 0.875000 // buy
							if( MFI > 85.8395 )
								ret := 1.000000 // buy
						if( Typical_Price > 54.9593 )
							if( Positive_Money_Flow <= 5.95739e+06 )
								if( Positive_Money_Flow <= 4.63613e+06 )
									ret := -0.053778
								if( Positive_Money_Flow > 4.63613e+06 )
									ret := -0.419355
							if( Positive_Money_Flow > 5.95739e+06 )
								if( MFI <= 89.4873 )
									ret := 0.325301
								if( MFI > 89.4873 )
									ret := -0.209424
				if( Positive_Money_Flow > 1.4345e+07 )
					if( MFI_High <= 17.5571 )
						if( VIM <= 1.0037 )
							if( Raw_Money_Flow <= 2.26589e+07 )
								if( Money_Flow_Ratio <= 4.32628 )
									ret := 0.200000
								if( Money_Flow_Ratio > 4.32628 )
									ret := -0.583333
							if( Raw_Money_Flow > 2.26589e+07 )
								if( VIM <= 0.804577 )
									ret := -0.773333 // sell
								if( VIM > 0.804577 )
									ret := -0.183673
						if( VIM > 1.0037 )
							ret := -1.000000 // sell
					if( MFI_High > 17.5571 )
						if( Positive_Money_Flow <= 2.31852e+07 )
							ret := -0.545455
						if( Positive_Money_Flow > 2.31852e+07 )
							if( Positive_Money_Flow_Sum <= 3.22405e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.22405e+07 )
								ret := 0.636364
	if( VIM > 1.27364 )
		if( MFI <= 73.3332 )
			if( Negative_Money_Flow <= 19.3922 )
				if( Positive_Money_Flow <= 56701.7 )
					if( Positive_Money_Flow <= 719.003 )
						if( VIM <= 2.10544 )
							if( MFI_High <= -19.7327 )
								if( VIP_VIM <= 0.023183 )
									ret := -0.189189
								if( VIP_VIM > 0.023183 )
									ret := -0.595238
							if( MFI_High > -19.7327 )
								if( Positive_Money_Flow_Sum <= 731460 )
									ret := 0.484848
								if( Positive_Money_Flow_Sum > 731460 )
									ret := -0.086957
						if( VIM > 2.10544 )
							if( MFI_Low <= 21.1383 )
								if( VIM <= 5.65798 )
									ret := 0.443750
								if( VIM > 5.65798 )
									ret := 0.081871
							if( MFI_Low > 21.1383 )
								if( Negative_Money_Flow_Sum <= 759692 )
									ret := 0.123779
								if( Negative_Money_Flow_Sum > 759692 )
									ret := -0.937500 // sell
					if( Positive_Money_Flow > 719.003 )
						if( VIP_VIM <= -0.164174 )
							if( Raw_Money_Flow <= 15188.1 )
								if( Positive_Money_Flow_Sum <= 229704 )
									ret := -0.384146
								if( Positive_Money_Flow_Sum > 229704 )
									ret := -0.058036
							if( Raw_Money_Flow > 15188.1 )
								if( MFI_Low <= -4.47383 )
									ret := -0.246696
								if( MFI_Low > -4.47383 )
									ret := 0.071262
						if( VIP_VIM > -0.164174 )
							if( Positive_Money_Flow_Sum <= 284498 )
								if( Raw_Money_Flow <= 30524.2 )
									ret := -0.163352
								if( Raw_Money_Flow > 30524.2 )
									ret := 0.225806
							if( Positive_Money_Flow_Sum > 284498 )
								if( MFI <= 66.018 )
									ret := -0.401899
								if( MFI > 66.018 )
									ret := -0.217391
				if( Positive_Money_Flow > 56701.7 )
					if( MFI_High <= -68.8858 )
						if( MFI_High <= -77.2961 )
							if( Positive_Money_Flow <= 93909.3 )
								ret := -0.200000
							if( Positive_Money_Flow > 93909.3 )
								ret := 0.538462
						if( MFI_High > -77.2961 )
							if( Negative_Money_Flow_Sum <= 1.80772e+07 )
								if( Typical_Price <= 70.7054 )
									ret := -0.217391
								if( Typical_Price > 70.7054 )
									ret := 0.625000
							if( Negative_Money_Flow_Sum > 1.80772e+07 )
								if( Positive_Money_Flow_Sum <= 5.61146e+06 )
									ret := -0.432432
								if( Positive_Money_Flow_Sum > 5.61146e+06 )
									ret := -0.692308
					if( MFI_High > -68.8858 )
						if( VIM <= 3.13011 )
							if( Money_Flow_Ratio <= 0.194172 )
								if( Positive_Money_Flow_Sum <= 3.65305e+06 )
									ret := -0.012048
								if( Positive_Money_Flow_Sum > 3.65305e+06 )
									ret := 0.425121
							if( Money_Flow_Ratio > 0.194172 )
								if( MFI <= 71.9794 )
									ret := -0.045770
								if( MFI > 71.9794 )
									ret := 0.509804
						if( VIM > 3.13011 )
							if( Money_Flow_Ratio <= 0.486148 )
								if( Money_Flow_Ratio <= 0.341878 )
									ret := 0.256410
								if( Money_Flow_Ratio > 0.341878 )
									ret := 0.835294 // buy
							if( Money_Flow_Ratio > 0.486148 )
								if( VIP_VIM <= 0.680487 )
									ret := 0.138436
								if( VIP_VIM > 0.680487 )
									ret := -0.336842
			if( Negative_Money_Flow > 19.3922 )
				if( VIM <= 10.5573 )
					if( Negative_Money_Flow <= 146422 )
						if( Positive_Money_Flow <= 1171.08 )
							if( Negative_Money_Flow <= 122493 )
								if( Positive_Money_Flow_Sum <= 180611 )
									ret := 0.374343
								if( Positive_Money_Flow_Sum > 180611 )
									ret := 0.191425
							if( Negative_Money_Flow > 122493 )
								if( Typical_Price <= 63.3267 )
									ret := -0.093750
								if( Typical_Price > 63.3267 )
									ret := 0.569620
						if( Positive_Money_Flow > 1171.08 )
							if( Negative_Money_Flow <= 11934.7 )
								if( MFI_High <= -76.5133 )
									ret := -0.500000
								if( MFI_High > -76.5133 )
									ret := 0.192630
							if( Negative_Money_Flow > 11934.7 )
								if( MFI <= 56.4893 )
									ret := -0.289720
								if( MFI > 56.4893 )
									ret := 0.545455
					if( Negative_Money_Flow > 146422 )
						if( Money_Flow_Ratio <= 0.024289 )
							if( Negative_Money_Flow <= 5.2068e+06 )
								if( MFI_Low <= -19.9108 )
									ret := 0.000000
								if( MFI_Low > -19.9108 )
									ret := 0.672414
							if( Negative_Money_Flow > 5.2068e+06 )
								if( Typical_Price <= 64.3666 )
									ret := 0.846154 // buy
								if( Typical_Price > 64.3666 )
									ret := 0.034091
						if( Money_Flow_Ratio > 0.024289 )
							if( VIP <= 0.616685 )
								if( MFI <= 5.50458 )
									ret := -0.655172
								if( MFI > 5.50458 )
									ret := -0.057143
							if( VIP > 0.616685 )
								if( Positive_Money_Flow_Sum <= 110868 )
									ret := 0.794872 // buy
								if( Positive_Money_Flow_Sum > 110868 )
									ret := 0.089001
				if( VIM > 10.5573 )
					if( VIM <= 1066.52 )
						if( Raw_Money_Flow <= 48244.7 )
							if( Typical_Price <= 63.3543 )
								if( Positive_Money_Flow_Sum <= 142776 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 142776 )
									ret := 0.571429
							if( Typical_Price > 63.3543 )
								if( VIP_VIM <= -1.98278 )
									ret := 0.214815
								if( VIP_VIM > -1.98278 )
									ret := 0.536391
						if( Raw_Money_Flow > 48244.7 )
							if( Negative_Money_Flow_Sum <= 256488 )
								if( MFI_High <= -16.9376 )
									ret := 0.636364
								if( MFI_High > -16.9376 )
									ret := -0.636364
							if( Negative_Money_Flow_Sum > 256488 )
								if( MFI <= 56.5719 )
									ret := 0.099585
								if( MFI > 56.5719 )
									ret := -0.500000
					if( VIM > 1066.52 )
						if( Raw_Money_Flow <= 22364.6 )
							if( Negative_Money_Flow <= 9405.03 )
								ret := 0.846154 // buy
							if( Negative_Money_Flow > 9405.03 )
								ret := 0.375000
						if( Raw_Money_Flow > 22364.6 )
							if( Negative_Money_Flow_Sum <= 168508 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 168508 )
								ret := -0.533333
		if( MFI > 73.3332 )
			if( Negative_Money_Flow_Sum <= 349471 )
				if( Money_Flow_Ratio <= 84.8423 )
					if( Positive_Money_Flow <= 397.554 )
						if( Positive_Money_Flow_Sum <= 331352 )
							if( Money_Flow_Ratio <= 3.48499 )
								if( Raw_Money_Flow <= 10981.7 )
									ret := 0.066667
								if( Raw_Money_Flow > 10981.7 )
									ret := -0.688889
							if( Money_Flow_Ratio > 3.48499 )
								ret := 0.100000
						if( Positive_Money_Flow_Sum > 331352 )
							if( Negative_Money_Flow <= 27806.5 )
								if( VIP_VIM <= 1.2797 )
									ret := 0.329876
								if( VIP_VIM > 1.2797 )
									ret := -0.271605
							if( Negative_Money_Flow > 27806.5 )
								if( VIM <= 3.4659 )
									ret := -0.299320
								if( VIM > 3.4659 )
									ret := 0.053763
					if( Positive_Money_Flow > 397.554 )
						if( Negative_Money_Flow_Sum <= 123291 )
							if( Positive_Money_Flow_Sum <= 254490 )
								if( Raw_Money_Flow <= 31054.8 )
									ret := -0.918919 // sell
								if( Raw_Money_Flow > 31054.8 )
									ret := -0.266667
							if( Positive_Money_Flow_Sum > 254490 )
								if( Money_Flow_Ratio <= 8.03918 )
									ret := 0.115869
								if( Money_Flow_Ratio > 8.03918 )
									ret := -0.259542
						if( Negative_Money_Flow_Sum > 123291 )
							if( MFI_Low <= 54.9861 )
								if( Raw_Money_Flow <= 10225.6 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 10225.6 )
									ret := 0.236559
							if( MFI_Low > 54.9861 )
								if( Raw_Money_Flow <= 207542 )
									ret := -0.276569
								if( Raw_Money_Flow > 207542 )
									ret := -0.531250
				if( Money_Flow_Ratio > 84.8423 )
					if( Positive_Money_Flow <= 46347 )
						if( Positive_Money_Flow <= 8793.24 )
							if( VIP <= 3.4201 )
								ret := 0.000000
							if( VIP > 3.4201 )
								if( VIM <= 7.14568 )
									ret := 0.900000 // buy
								if( VIM > 7.14568 )
									ret := 0.375000
						if( Positive_Money_Flow > 8793.24 )
							ret := -0.600000
					if( Positive_Money_Flow > 46347 )
						if( Typical_Price <= 69.538 )
							ret := 0.533333
						if( Typical_Price > 69.538 )
							ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 349471 )
				if( Positive_Money_Flow <= 590.069 )
					if( Raw_Money_Flow <= 1.84027e+06 )
						if( Positive_Money_Flow_Sum <= 1.01434e+08 )
							if( Positive_Money_Flow_Sum <= 1.19077e+06 )
								ret := -0.133333
							if( Positive_Money_Flow_Sum > 1.19077e+06 )
								if( VIP <= 2.46405 )
									ret := 0.762887 // buy
								if( VIP > 2.46405 )
									ret := 0.336283
						if( Positive_Money_Flow_Sum > 1.01434e+08 )
							if( Typical_Price <= 69.005 )
								if( Typical_Price <= 68.1 )
									ret := 0.137255
								if( Typical_Price > 68.1 )
									ret := -0.647059
							if( Typical_Price > 69.005 )
								if( Positive_Money_Flow_Sum <= 1.14457e+08 )
									ret := -0.240000
								if( Positive_Money_Flow_Sum > 1.14457e+08 )
									ret := 0.500000
					if( Raw_Money_Flow > 1.84027e+06 )
						if( MFI_Low <= 57.6828 )
							if( VIP <= 1.14539 )
								ret := 0.818182 // buy
							if( VIP > 1.14539 )
								ret := -1.000000 // sell
						if( MFI_Low > 57.6828 )
							if( Raw_Money_Flow <= 3.0176e+06 )
								if( VIP <= 1.36504 )
									ret := -1.000000 // sell
								if( VIP > 1.36504 )
									ret := -0.500000
							if( Raw_Money_Flow > 3.0176e+06 )
								ret := 0.000000
				if( Positive_Money_Flow > 590.069 )
					if( Negative_Money_Flow_Sum <= 387727 )
						if( VIP_VIM <= 0.131836 )
							ret := -0.777778 // sell
						if( VIP_VIM > 0.131836 )
							if( Positive_Money_Flow_Sum <= 1.45034e+06 )
								ret := 0.294118
							if( Positive_Money_Flow_Sum > 1.45034e+06 )
								if( Typical_Price <= 70.7347 )
									ret := 1.000000 // buy
								if( Typical_Price > 70.7347 )
									ret := 0.454545
					if( Negative_Money_Flow_Sum > 387727 )
						if( MFI_High <= 5.48392 )
							if( Money_Flow_Ratio <= 5.25265 )
								if( Money_Flow_Ratio <= 3.80653 )
									ret := -0.355372
								if( Money_Flow_Ratio > 3.80653 )
									ret := 0.088889
							if( Money_Flow_Ratio > 5.25265 )
								if( Money_Flow_Ratio <= 5.45536 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 5.45536 )
									ret := -0.413793
						if( MFI_High > 5.48392 )
							if( MFI <= 97.8035 )
								if( VIP <= 2.49417 )
									ret := 0.278027
								if( VIP > 2.49417 )
									ret := -0.130841
							if( MFI > 97.8035 )
								if( Positive_Money_Flow_Sum <= 9.15789e+07 )
									ret := 0.363636
								if( Positive_Money_Flow_Sum > 9.15789e+07 )
									ret := -0.609375
	
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
float op_operation = decision_tree_0_UBER_1Min_7a43d9ec(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)

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


