//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: PYPL_1Min_2MM0_a9706e79 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2MM0_a9706e79", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_a9706e79(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI_High <= -38.7234 )
		if( Positive_Money_Flow <= 68.4761 )
			if( Raw_Money_Flow <= 195998 )
				if( MFI_High <= -40.848 )
					if( Positive_Money_Flow_Sum <= 237303 )
						if( Raw_Money_Flow <= 29748.2 )
							if( Negative_Money_Flow <= 6469.03 )
								if( Negative_Money_Flow_Sum <= 337592 )
									ret := 0.280702
								if( Negative_Money_Flow_Sum > 337592 )
									ret := -0.306818
							if( Negative_Money_Flow > 6469.03 )
								if( Long_MA <= 60.6048 )
									ret := 0.077295
								if( Long_MA > 60.6048 )
									ret := 0.400000
						if( Raw_Money_Flow > 29748.2 )
							if( Short_MA <= 61.641 )
								if( Positive_Money_Flow_Sum <= 146481 )
									ret := 0.484848
								if( Positive_Money_Flow_Sum > 146481 )
									ret := -0.045455
							if( Short_MA > 61.641 )
								if( MFI_Low <= -0.736204 )
									ret := 0.228723
								if( MFI_Low > -0.736204 )
									ret := -0.067381
					if( Positive_Money_Flow_Sum > 237303 )
						if( Negative_Money_Flow_Sum <= 8.41699e+07 )
							if( Negative_Money_Flow_Sum <= 442380 )
								if( Long_MA <= 62.1922 )
									ret := 1.000000 // buy
								if( Long_MA > 62.1922 )
									ret := 0.709677 // buy
							if( Negative_Money_Flow_Sum > 442380 )
								if( Long_MA <= 65.6159 )
									ret := 0.228022
								if( Long_MA > 65.6159 )
									ret := 0.487179
						if( Negative_Money_Flow_Sum > 8.41699e+07 )
							if( Short_MA <= 68.8777 )
								if( Short_Long_Diff <= -0.007974 )
									ret := 0.030303
								if( Short_Long_Diff > -0.007974 )
									ret := -0.460000
							if( Short_MA > 68.8777 )
								if( Typical_Price <= 70.6233 )
									ret := 0.533333
								if( Typical_Price > 70.6233 )
									ret := 0.000000
				if( MFI_High > -40.848 )
					if( MFI <= 40.8603 )
						if( Negative_Money_Flow_Sum <= 188661 )
							if( Negative_Money_Flow_Sum <= 165805 )
								if( Positive_Money_Flow_Sum <= 93186.2 )
									ret := -0.428571
								if( Positive_Money_Flow_Sum > 93186.2 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 165805 )
								if( Positive_Money_Flow_Sum <= 119460 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 119460 )
									ret := -0.769231 // sell
						if( Negative_Money_Flow_Sum > 188661 )
							if( Raw_Money_Flow <= 26475.5 )
								if( Raw_Money_Flow <= 14349.4 )
									ret := 0.000000
								if( Raw_Money_Flow > 14349.4 )
									ret := -0.454545
							if( Raw_Money_Flow > 26475.5 )
								if( Long_MA <= 72.4017 )
									ret := -0.128440
								if( Long_MA > 72.4017 )
									ret := 0.600000
					if( MFI > 40.8603 )
						if( Negative_Money_Flow_Sum <= 266383 )
							if( Negative_Money_Flow <= 18091.4 )
								ret := 0.400000
							if( Negative_Money_Flow > 18091.4 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 266383 )
							if( Short_Long_Diff <= 0.02127 )
								if( Long_MA <= 66.9397 )
									ret := -0.210526
								if( Long_MA > 66.9397 )
									ret := 0.650000
							if( Short_Long_Diff > 0.02127 )
								ret := -0.692308
			if( Raw_Money_Flow > 195998 )
				if( MFI_Low <= -16.8661 )
					if( Money_Flow_Ratio <= 0.01245 )
						if( Negative_Money_Flow <= 3.11492e+06 )
							if( Long_MA <= 73.3642 )
								if( MFI_Low <= -19.94 )
									ret := 0.142857
								if( MFI_Low > -19.94 )
									ret := 0.615385
							if( Long_MA > 73.3642 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 3.11492e+06 )
							if( Negative_Money_Flow <= 1.8884e+07 )
								if( Short_MA <= 61.4114 )
									ret := 0.200000
								if( Short_MA > 61.4114 )
									ret := -0.741935 // sell
							if( Negative_Money_Flow > 1.8884e+07 )
								ret := 0.357143
					if( Money_Flow_Ratio > 0.01245 )
						if( Money_Flow_Ratio <= 0.024013 )
							if( Positive_Money_Flow_Sum <= 247920 )
								if( MFI_Low <= -18.3505 )
									ret := 0.500000
								if( MFI_Low > -18.3505 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 247920 )
								if( Negative_Money_Flow <= 1.98048e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.98048e+06 )
									ret := -0.777778 // sell
						if( Money_Flow_Ratio > 0.024013 )
							if( Long_MA <= 61.4989 )
								ret := 0.642857
							if( Long_MA > 61.4989 )
								if( Short_Long_Diff <= -0.071894 )
									ret := -0.733333 // sell
								if( Short_Long_Diff > -0.071894 )
									ret := -0.951220 // sell
				if( MFI_Low > -16.8661 )
					if( MA_Cross <= 11.5035 )
						if( Short_Long_Diff <= -0.123274 )
							if( MFI_Low <= -7.63961 )
								if( Negative_Money_Flow <= 4.06886e+06 )
									ret := 0.372483
								if( Negative_Money_Flow > 4.06886e+06 )
									ret := 0.855072 // buy
							if( MFI_Low > -7.63961 )
								if( MFI_High <= -55.7211 )
									ret := 0.201764
								if( MFI_High > -55.7211 )
									ret := 0.035538
						if( Short_Long_Diff > -0.123274 )
							if( Negative_Money_Flow_Sum <= 2.81904e+07 )
								if( Negative_Money_Flow <= 6.35108e+06 )
									ret := -0.015419
								if( Negative_Money_Flow > 6.35108e+06 )
									ret := -0.387931
							if( Negative_Money_Flow_Sum > 2.81904e+07 )
								if( MFI <= 14.8505 )
									ret := -0.142157
								if( MFI > 14.8505 )
									ret := 0.303441
					if( MA_Cross > 11.5035 )
						if( Negative_Money_Flow <= 6.25777e+06 )
							if( MFI_Low <= 14.1285 )
								if( Short_Long_Diff <= 0.000879 )
									ret := 0.901408 // buy
								if( Short_Long_Diff > 0.000879 )
									ret := 0.295455
							if( MFI_Low > 14.1285 )
								if( Positive_Money_Flow_Sum <= 1.95125e+07 )
									ret := -0.021277
								if( Positive_Money_Flow_Sum > 1.95125e+07 )
									ret := 0.785714 // buy
						if( Negative_Money_Flow > 6.25777e+06 )
							ret := -0.600000
		if( Positive_Money_Flow > 68.4761 )
			if( Positive_Money_Flow <= 81577.1 )
				if( Short_MA <= 59.1623 )
					if( MFI <= 32.7517 )
						if( Short_MA <= 58.2786 )
							if( MFI_Low <= -0.367696 )
								if( MFI_High <= -66.381 )
									ret := 0.250000
								if( MFI_High > -66.381 )
									ret := 0.000000
							if( MFI_Low > -0.367696 )
								if( Negative_Money_Flow_Sum <= 591106 )
									ret := -0.230769
								if( Negative_Money_Flow_Sum > 591106 )
									ret := -0.636364
						if( Short_MA > 58.2786 )
							if( Negative_Money_Flow_Sum <= 2.4073e+06 )
								if( Typical_Price <= 58.8533 )
									ret := 0.553191
								if( Typical_Price > 58.8533 )
									ret := -0.185185
							if( Negative_Money_Flow_Sum > 2.4073e+06 )
								ret := -0.500000
					if( MFI > 32.7517 )
						if( Typical_Price <= 59.0903 )
							if( Negative_Money_Flow_Sum <= 162147 )
								ret := 0.937500 // buy
							if( Negative_Money_Flow_Sum > 162147 )
								if( Short_Long_Diff <= 0.011168 )
									ret := 0.413793
								if( Short_Long_Diff > 0.011168 )
									ret := -0.375000
						if( Typical_Price > 59.0903 )
							ret := 1.000000 // buy
				if( Short_MA > 59.1623 )
					if( Short_Long_Diff <= -0.075081 )
						if( MFI_Low <= -7.49454 )
							if( Raw_Money_Flow <= 25105.4 )
								if( Long_MA <= 64.1677 )
									ret := -0.666667
								if( Long_MA > 64.1677 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 25105.4 )
								if( Positive_Money_Flow_Sum <= 234633 )
									ret := 0.254902
								if( Positive_Money_Flow_Sum > 234633 )
									ret := -0.642857
						if( MFI_Low > -7.49454 )
							if( Raw_Money_Flow <= 23965 )
								if( MFI <= 23.2978 )
									ret := 0.826667 // buy
								if( MFI > 23.2978 )
									ret := 0.349398
							if( Raw_Money_Flow > 23965 )
								if( MFI_High <= -52.4577 )
									ret := -0.068966
								if( MFI_High > -52.4577 )
									ret := 0.375000
					if( Short_Long_Diff > -0.075081 )
						if( MA_Cross <= 0.373946 )
							if( Negative_Money_Flow <= 4386.03 )
								if( Positive_Money_Flow_Sum <= 579488 )
									ret := -0.255019
								if( Positive_Money_Flow_Sum > 579488 )
									ret := 0.012461
							if( Negative_Money_Flow > 4386.03 )
								if( Positive_Money_Flow_Sum <= 194216 )
									ret := -0.212766
								if( Positive_Money_Flow_Sum > 194216 )
									ret := 0.194539
						if( MA_Cross > 0.373946 )
							if( MFI <= 22.85 )
								if( Money_Flow_Ratio <= 0.179418 )
									ret := -0.592593
								if( Money_Flow_Ratio > 0.179418 )
									ret := -1.000000 // sell
							if( MFI > 22.85 )
								if( Negative_Money_Flow_Sum <= 245150 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow_Sum > 245150 )
									ret := -0.436090
			if( Positive_Money_Flow > 81577.1 )
				if( Positive_Money_Flow <= 3.16096e+06 )
					if( MFI_Low <= 19.7794 )
						if( Short_Long_Diff <= -0.211696 )
							if( Money_Flow_Ratio <= 0.220305 )
								if( Long_MA <= 70.1872 )
									ret := 0.694737
								if( Long_MA > 70.1872 )
									ret := 0.125000
							if( Money_Flow_Ratio > 0.220305 )
								if( Positive_Money_Flow_Sum <= 864869 )
									ret := 0.772727 // buy
								if( Positive_Money_Flow_Sum > 864869 )
									ret := 0.097720
						if( Short_Long_Diff > -0.211696 )
							if( Positive_Money_Flow_Sum <= 1.73461e+07 )
								if( MFI_High <= -74.1866 )
									ret := -0.571429
								if( MFI_High > -74.1866 )
									ret := -0.006742
							if( Positive_Money_Flow_Sum > 1.73461e+07 )
								if( MFI_Low <= 16.0947 )
									ret := -0.350000
								if( MFI_Low > 16.0947 )
									ret := 0.200000
					if( MFI_Low > 19.7794 )
						if( MA_Cross <= 27.2151 )
							if( Positive_Money_Flow <= 2.54283e+06 )
								if( Typical_Price <= 66.1728 )
									ret := 0.132450
								if( Typical_Price > 66.1728 )
									ret := 0.403183
							if( Positive_Money_Flow > 2.54283e+06 )
								if( MFI <= 40.5769 )
									ret := -0.535714
								if( MFI > 40.5769 )
									ret := 0.400000
						if( MA_Cross > 27.2151 )
							if( Short_MA <= 63.4309 )
								ret := 0.133333
							if( Short_MA > 63.4309 )
								ret := -0.750000 // sell
				if( Positive_Money_Flow > 3.16096e+06 )
					if( Typical_Price <= 63.6489 )
						if( Positive_Money_Flow_Sum <= 2.12187e+07 )
							if( Negative_Money_Flow_Sum <= 3.03919e+07 )
								if( Money_Flow_Ratio <= 0.286963 )
									ret := -0.642857
								if( Money_Flow_Ratio > 0.286963 )
									ret := 0.259740
							if( Negative_Money_Flow_Sum > 3.03919e+07 )
								if( Raw_Money_Flow <= 3.40501e+06 )
									ret := 0.333333
								if( Raw_Money_Flow > 3.40501e+06 )
									ret := -0.612500
						if( Positive_Money_Flow_Sum > 2.12187e+07 )
							if( MFI_High <= -53.7918 )
								ret := -0.333333
							if( MFI_High > -53.7918 )
								if( Short_MA <= 62.1722 )
									ret := 0.800000 // buy
								if( Short_MA > 62.1722 )
									ret := 0.975610 // buy
					if( Typical_Price > 63.6489 )
						if( Negative_Money_Flow <= 755.176 )
							if( MFI_High <= -57.0941 )
								if( Money_Flow_Ratio <= 0.167156 )
									ret := -0.590909
								if( Money_Flow_Ratio > 0.167156 )
									ret := 0.236111
							if( MFI_High > -57.0941 )
								if( Money_Flow_Ratio <= 0.398986 )
									ret := -0.782609 // sell
								if( Money_Flow_Ratio > 0.398986 )
									ret := -0.338608
						if( Negative_Money_Flow > 755.176 )
							if( Short_MA <= 67.3685 )
								ret := 0.666667
							if( Short_MA > 67.3685 )
								ret := 0.000000
	if( MFI_High > -38.7234 )
		if( Typical_Price <= 68.08 )
			if( Short_MA <= 59.039 )
				if( MFI <= 99.0872 )
					if( MFI <= 65.227 )
						if( MFI_Low <= 34.4827 )
							if( Negative_Money_Flow_Sum <= 1.17694e+07 )
								if( MA_Cross <= 1.46074 )
									ret := 0.069094
								if( MA_Cross > 1.46074 )
									ret := -0.203125
							if( Negative_Money_Flow_Sum > 1.17694e+07 )
								if( Long_MA <= 58.3731 )
									ret := 0.057143
								if( Long_MA > 58.3731 )
									ret := -0.466102
						if( MFI_Low > 34.4827 )
							if( Positive_Money_Flow_Sum <= 170838 )
								if( Money_Flow_Ratio <= 1.53118 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.53118 )
									ret := 0.692308
							if( Positive_Money_Flow_Sum > 170838 )
								if( Positive_Money_Flow <= 264536 )
									ret := 0.237347
								if( Positive_Money_Flow > 264536 )
									ret := 0.040115
					if( MFI > 65.227 )
						if( Short_MA <= 57.8087 )
							if( MFI_High <= 0.302417 )
								if( Positive_Money_Flow_Sum <= 1.2407e+07 )
									ret := -0.186047
								if( Positive_Money_Flow_Sum > 1.2407e+07 )
									ret := 0.355556
							if( MFI_High > 0.302417 )
								if( Long_MA <= 57.6331 )
									ret := 0.000000
								if( Long_MA > 57.6331 )
									ret := 0.909091 // buy
						if( Short_MA > 57.8087 )
							if( Long_MA <= 58.8577 )
								if( Positive_Money_Flow_Sum <= 154910 )
									ret := 0.764706 // buy
								if( Positive_Money_Flow_Sum > 154910 )
									ret := -0.122034
							if( Long_MA > 58.8577 )
								if( Short_MA <= 59.0283 )
									ret := 0.138462
								if( Short_MA > 59.0283 )
									ret := 0.636364
				if( MFI > 99.0872 )
					if( Typical_Price <= 57.8553 )
						ret := 1.000000 // buy
					if( Typical_Price > 57.8553 )
						if( Positive_Money_Flow <= 33899.5 )
							if( Negative_Money_Flow_Sum <= 166933 )
								ret := -0.071429
							if( Negative_Money_Flow_Sum > 166933 )
								ret := 0.461538
						if( Positive_Money_Flow > 33899.5 )
							ret := 1.000000 // buy
			if( Short_MA > 59.039 )
				if( Negative_Money_Flow <= 5552.81 )
					if( Negative_Money_Flow_Sum <= 1.20208e+06 )
						if( Money_Flow_Ratio <= 0.932548 )
							if( MFI <= 43.0794 )
								if( Raw_Money_Flow <= 126003 )
									ret := -0.125000
								if( Raw_Money_Flow > 126003 )
									ret := -0.800000 // sell
							if( MFI > 43.0794 )
								if( Positive_Money_Flow_Sum <= 165867 )
									ret := 0.481752
								if( Positive_Money_Flow_Sum > 165867 )
									ret := 0.066116
						if( Money_Flow_Ratio > 0.932548 )
							if( Positive_Money_Flow <= 109.578 )
								if( Money_Flow_Ratio <= 1.59297 )
									ret := 0.248731
								if( Money_Flow_Ratio > 1.59297 )
									ret := -0.079755
							if( Positive_Money_Flow > 109.578 )
								if( MFI <= 95.9025 )
									ret := -0.248375
								if( MFI > 95.9025 )
									ret := -0.578616
					if( Negative_Money_Flow_Sum > 1.20208e+06 )
						if( Short_Long_Diff <= 0.288603 )
							if( Money_Flow_Ratio <= 10.1547 )
								if( MFI_High <= -35.6883 )
									ret := -0.187255
								if( MFI_High > -35.6883 )
									ret := -0.056365
							if( Money_Flow_Ratio > 10.1547 )
								if( MFI_Low <= 75.527 )
									ret := 0.340314
								if( MFI_Low > 75.527 )
									ret := -0.302326
						if( Short_Long_Diff > 0.288603 )
							if( MFI <= 64.3873 )
								ret := -0.615385
							if( MFI > 64.3873 )
								if( Raw_Money_Flow <= 1.92494e+06 )
									ret := -0.400000
								if( Raw_Money_Flow > 1.92494e+06 )
									ret := 0.664179
				if( Negative_Money_Flow > 5552.81 )
					if( Short_Long_Diff <= 0.520084 )
						if( Positive_Money_Flow_Sum <= 332415 )
							if( Positive_Money_Flow_Sum <= 266168 )
								if( Raw_Money_Flow <= 27768.8 )
									ret := 0.309735
								if( Raw_Money_Flow > 27768.8 )
									ret := 0.035714
							if( Positive_Money_Flow_Sum > 266168 )
								if( Raw_Money_Flow <= 37565.6 )
									ret := 0.545833
								if( Raw_Money_Flow > 37565.6 )
									ret := 0.241935
						if( Positive_Money_Flow_Sum > 332415 )
							if( MFI_Low <= 74.2788 )
								if( Money_Flow_Ratio <= 0.99833 )
									ret := -0.069076
								if( Money_Flow_Ratio > 0.99833 )
									ret := 0.026333
							if( MFI_Low > 74.2788 )
								if( Positive_Money_Flow_Sum <= 9.65841e+06 )
									ret := -0.081633
								if( Positive_Money_Flow_Sum > 9.65841e+06 )
									ret := 0.725806 // buy
					if( Short_Long_Diff > 0.520084 )
						if( Typical_Price <= 63.6611 )
							if( Money_Flow_Ratio <= 3.93059 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 3.93059 )
								ret := -0.928571 // sell
						if( Typical_Price > 63.6611 )
							if( Long_MA <= 63.6211 )
								ret := -0.307692
							if( Long_MA > 63.6211 )
								ret := 0.666667
		if( Typical_Price > 68.08 )
			if( Money_Flow_Ratio <= 47.4213 )
				if( Negative_Money_Flow_Sum <= 884274 )
					if( Positive_Money_Flow <= 77.0348 )
						if( Positive_Money_Flow_Sum <= 280617 )
							if( Long_MA <= 79.1167 )
								if( MFI <= 55.6785 )
									ret := 0.472222
								if( MFI > 55.6785 )
									ret := -0.215827
							if( Long_MA > 79.1167 )
								if( MFI_Low <= 34.2755 )
									ret := -0.047619
								if( MFI_Low > 34.2755 )
									ret := -0.722222 // sell
						if( Positive_Money_Flow_Sum > 280617 )
							if( Negative_Money_Flow <= 87483.5 )
								if( Money_Flow_Ratio <= 0.897581 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.897581 )
									ret := 0.456298
							if( Negative_Money_Flow > 87483.5 )
								if( Positive_Money_Flow_Sum <= 625371 )
									ret := -0.356322
								if( Positive_Money_Flow_Sum > 625371 )
									ret := 0.205882
					if( Positive_Money_Flow > 77.0348 )
						if( Raw_Money_Flow <= 10389.5 )
							if( Negative_Money_Flow <= 304.975 )
								if( Short_Long_Diff <= 0.049389 )
									ret := -0.492188
								if( Short_Long_Diff > 0.049389 )
									ret := 0.071429
							if( Negative_Money_Flow > 304.975 )
								if( Negative_Money_Flow <= 5920.32 )
									ret := 0.352941
								if( Negative_Money_Flow > 5920.32 )
									ret := -0.750000 // sell
						if( Raw_Money_Flow > 10389.5 )
							if( Money_Flow_Ratio <= 0.795573 )
								if( Raw_Money_Flow <= 19749 )
									ret := -0.735294 // sell
								if( Raw_Money_Flow > 19749 )
									ret := -0.024691
							if( Money_Flow_Ratio > 0.795573 )
								if( MA_Cross <= 74.0716 )
									ret := 0.107788
								if( MA_Cross > 74.0716 )
									ret := -0.413793
				if( Negative_Money_Flow_Sum > 884274 )
					if( Raw_Money_Flow <= 1.34343e+07 )
						if( Negative_Money_Flow <= 837339 )
							if( MFI <= 69.1143 )
								if( Negative_Money_Flow_Sum <= 3.19202e+07 )
									ret := 0.011586
								if( Negative_Money_Flow_Sum > 3.19202e+07 )
									ret := 0.416216
							if( MFI > 69.1143 )
								if( MFI_Low <= 49.2037 )
									ret := -0.600000
								if( MFI_Low > 49.2037 )
									ret := -0.083443
						if( Negative_Money_Flow > 837339 )
							if( Positive_Money_Flow_Sum <= 3.37945e+07 )
								if( Short_Long_Diff <= -0.049087 )
									ret := -0.183246
								if( Short_Long_Diff > -0.049087 )
									ret := 0.070294
							if( Positive_Money_Flow_Sum > 3.37945e+07 )
								if( Negative_Money_Flow <= 6.49436e+06 )
									ret := 0.445428
								if( Negative_Money_Flow > 6.49436e+06 )
									ret := -0.222222
					if( Raw_Money_Flow > 1.34343e+07 )
						if( MA_Cross <= 43.719 )
							if( Money_Flow_Ratio <= 0.745255 )
								ret := 0.300000
							if( Money_Flow_Ratio > 0.745255 )
								if( MFI <= 86.2222 )
									ret := -0.777778 // sell
								if( MFI > 86.2222 )
									ret := -0.176471
						if( MA_Cross > 43.719 )
							ret := 0.769231 // buy
			if( Money_Flow_Ratio > 47.4213 )
				if( Positive_Money_Flow_Sum <= 9.9991e+07 )
					if( MFI_High <= 19.2955 )
						if( Negative_Money_Flow <= 4951.04 )
							if( MFI <= 96.8919 )
								ret := -0.176471
							if( MFI > 96.8919 )
								if( Positive_Money_Flow <= 271816 )
									ret := 0.000000
								if( Positive_Money_Flow > 271816 )
									ret := -0.919355 // sell
						if( Negative_Money_Flow > 4951.04 )
							ret := -0.166667
					if( MFI_High > 19.2955 )
						if( Negative_Money_Flow_Sum <= 145836 )
							ret := -0.500000
						if( Negative_Money_Flow_Sum > 145836 )
							ret := 0.333333
				if( Positive_Money_Flow_Sum > 9.9991e+07 )
					if( Short_MA <= 69.4737 )
						ret := -0.333333
					if( Short_MA > 69.4737 )
						if( Long_MA <= 71.8771 )
							ret := 0.500000
						if( Long_MA > 71.8771 )
							if( Short_MA <= 77.2783 )
								ret := 0.000000
							if( Short_MA > 77.2783 )
								ret := 0.111111
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_a9706e79(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


