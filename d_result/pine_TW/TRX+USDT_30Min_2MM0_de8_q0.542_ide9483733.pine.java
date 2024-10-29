//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: TRXUSDT_30Min_2MM0_e9483733 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2MM0_e9483733", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_e9483733(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 0.059992 )
		if( Negative_Money_Flow_Sum <= 4.19413e+06 )
			if( Positive_Money_Flow <= 3.02691e+06 )
				if( Positive_Money_Flow_Sum <= 1.9197e+07 )
					if( Negative_Money_Flow <= 1.48133e+06 )
						if( Short_MA <= 0.025206 )
							if( Money_Flow_Ratio <= 1.91479 )
								if( Positive_Money_Flow_Sum <= 1.20959e+06 )
									ret := -0.161290
								if( Positive_Money_Flow_Sum > 1.20959e+06 )
									ret := 0.323810
							if( Money_Flow_Ratio > 1.91479 )
								if( Short_Long_Diff <= 3.6e-05 )
									ret := 0.583333
								if( Short_Long_Diff > 3.6e-05 )
									ret := -0.200000
						if( Short_MA > 0.025206 )
							if( MFI_High <= 12.1213 )
								if( Long_MA <= 0.057689 )
									ret := -0.003672
								if( Long_MA > 0.057689 )
									ret := 0.192308
							if( MFI_High > 12.1213 )
								if( Short_MA <= 0.055719 )
									ret := 0.769231 // buy
								if( Short_MA > 0.055719 )
									ret := -0.250000
					if( Negative_Money_Flow > 1.48133e+06 )
						if( Positive_Money_Flow_Sum <= 2.04657e+06 )
							if( Negative_Money_Flow_Sum <= 4.04101e+06 )
								ret := -0.166667
							if( Negative_Money_Flow_Sum > 4.04101e+06 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.04657e+06 )
							if( Long_MA <= 0.032828 )
								ret := 0.428571
							if( Long_MA > 0.032828 )
								if( Negative_Money_Flow_Sum <= 3.16429e+06 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 3.16429e+06 )
									ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 1.9197e+07 )
					if( Typical_Price <= 0.056875 )
						if( MFI_High <= 4.62666 )
							ret := -0.750000 // sell
						if( MFI_High > 4.62666 )
							ret := -1.000000 // sell
					if( Typical_Price > 0.056875 )
						ret := -0.571429
			if( Positive_Money_Flow > 3.02691e+06 )
				if( Money_Flow_Ratio <= 8.3459 )
					if( Positive_Money_Flow <= 5.98285e+06 )
						if( Positive_Money_Flow <= 5.24755e+06 )
							if( Raw_Money_Flow <= 4.54462e+06 )
								if( Money_Flow_Ratio <= 3.6839 )
									ret := -0.916667 // sell
								if( Money_Flow_Ratio > 3.6839 )
									ret := -0.444444
							if( Raw_Money_Flow > 4.54462e+06 )
								ret := 0.400000
						if( Positive_Money_Flow > 5.24755e+06 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow > 5.98285e+06 )
						ret := 0.250000
				if( Money_Flow_Ratio > 8.3459 )
					if( Positive_Money_Flow_Sum <= 1.79445e+07 )
						ret := -0.750000 // sell
					if( Positive_Money_Flow_Sum > 1.79445e+07 )
						ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 4.19413e+06 )
			if( MFI_Low <= 9.90674 )
				if( Negative_Money_Flow_Sum <= 6.32563e+06 )
					if( Positive_Money_Flow_Sum <= 814933 )
						if( Negative_Money_Flow_Sum <= 5.48111e+06 )
							if( Long_MA <= 0.053758 )
								if( Long_MA <= 0.029673 )
									ret := -0.750000 // sell
								if( Long_MA > 0.029673 )
									ret := -1.000000 // sell
							if( Long_MA > 0.053758 )
								if( Typical_Price <= 0.053582 )
									ret := -0.250000
								if( Typical_Price > 0.053582 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 5.48111e+06 )
							if( Short_MA <= 0.053386 )
								ret := 0.500000
							if( Short_MA > 0.053386 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 814933 )
						if( Short_MA <= 0.053218 )
							if( Negative_Money_Flow_Sum <= 5.17408e+06 )
								if( Positive_Money_Flow_Sum <= 1.56977e+06 )
									ret := 0.641975
								if( Positive_Money_Flow_Sum > 1.56977e+06 )
									ret := 0.190000
							if( Negative_Money_Flow_Sum > 5.17408e+06 )
								if( Negative_Money_Flow <= 948067 )
									ret := -0.260870
								if( Negative_Money_Flow > 948067 )
									ret := 0.677419
						if( Short_MA > 0.053218 )
							if( Negative_Money_Flow <= 732601 )
								if( Negative_Money_Flow_Sum <= 4.81817e+06 )
									ret := 0.347826
								if( Negative_Money_Flow_Sum > 4.81817e+06 )
									ret := -0.117647
							if( Negative_Money_Flow > 732601 )
								if( Positive_Money_Flow_Sum <= 1.72145e+06 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 1.72145e+06 )
									ret := 0.000000
				if( Negative_Money_Flow_Sum > 6.32563e+06 )
					if( Positive_Money_Flow_Sum <= 4.27723e+06 )
						if( Long_MA <= 0.02752 )
							if( Negative_Money_Flow_Sum <= 9.01176e+06 )
								if( Raw_Money_Flow <= 610919 )
									ret := 0.209677
								if( Raw_Money_Flow > 610919 )
									ret := 0.682927
							if( Negative_Money_Flow_Sum > 9.01176e+06 )
								if( Typical_Price <= 0.025342 )
									ret := 0.454545
								if( Typical_Price > 0.025342 )
									ret := -0.264706
						if( Long_MA > 0.02752 )
							if( Long_MA <= 0.059611 )
								if( Negative_Money_Flow <= 2.21397e+06 )
									ret := 0.477793
								if( Negative_Money_Flow > 2.21397e+06 )
									ret := 0.785714 // buy
							if( Long_MA > 0.059611 )
								if( Positive_Money_Flow_Sum <= 1.45036e+06 )
									ret := 0.909091 // buy
								if( Positive_Money_Flow_Sum > 1.45036e+06 )
									ret := 0.089888
					if( Positive_Money_Flow_Sum > 4.27723e+06 )
						if( Raw_Money_Flow <= 3.47453e+06 )
							if( Raw_Money_Flow <= 2.27919e+06 )
								if( MFI_High <= -66.8472 )
									ret := -0.833333 // sell
								if( MFI_High > -66.8472 )
									ret := 0.259259
							if( Raw_Money_Flow > 2.27919e+06 )
								if( Long_MA <= 0.053061 )
									ret := -0.482353
								if( Long_MA > 0.053061 )
									ret := 0.092105
						if( Raw_Money_Flow > 3.47453e+06 )
							if( Short_Long_Diff <= -0.001103 )
								if( Short_MA <= 0.039368 )
									ret := 0.108696
								if( Short_MA > 0.039368 )
									ret := 0.684492
							if( Short_Long_Diff > -0.001103 )
								if( Positive_Money_Flow_Sum <= 1.20048e+07 )
									ret := 0.613208
								if( Positive_Money_Flow_Sum > 1.20048e+07 )
									ret := -0.410714
			if( MFI_Low > 9.90674 )
				if( Long_MA <= 0.036076 )
					if( Negative_Money_Flow_Sum <= 2.25146e+07 )
						if( Positive_Money_Flow_Sum <= 3.45098e+07 )
							if( Typical_Price <= 0.030183 )
								if( Negative_Money_Flow_Sum <= 1.65798e+07 )
									ret := 0.162904
								if( Negative_Money_Flow_Sum > 1.65798e+07 )
									ret := 0.576087
							if( Typical_Price > 0.030183 )
								if( Short_MA <= 0.030639 )
									ret := -0.194946
								if( Short_MA > 0.030639 )
									ret := 0.081062
						if( Positive_Money_Flow_Sum > 3.45098e+07 )
							if( MFI_High <= -11.0595 )
								if( MFI <= 66.1439 )
									ret := -0.666667
								if( MFI > 66.1439 )
									ret := 0.750000 // buy
							if( MFI_High > -11.0595 )
								if( Positive_Money_Flow <= 391209 )
									ret := -0.200000
								if( Positive_Money_Flow > 391209 )
									ret := -0.937500 // sell
					if( Negative_Money_Flow_Sum > 2.25146e+07 )
						if( Positive_Money_Flow_Sum <= 2.02711e+07 )
							if( Positive_Money_Flow_Sum <= 1.60624e+07 )
								if( Positive_Money_Flow_Sum <= 1.40202e+07 )
									ret := -0.789474 // sell
								if( Positive_Money_Flow_Sum > 1.40202e+07 )
									ret := 0.083333
							if( Positive_Money_Flow_Sum > 1.60624e+07 )
								if( Negative_Money_Flow_Sum <= 3.44641e+07 )
									ret := -0.788732 // sell
								if( Negative_Money_Flow_Sum > 3.44641e+07 )
									ret := 0.142857
						if( Positive_Money_Flow_Sum > 2.02711e+07 )
							if( Positive_Money_Flow_Sum <= 2.10332e+07 )
								if( MFI_Low <= 19.2789 )
									ret := 1.000000 // buy
								if( MFI_Low > 19.2789 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 2.10332e+07 )
								if( MFI_Low <= 18.0826 )
									ret := 0.225806
								if( MFI_Low > 18.0826 )
									ret := -0.441176
				if( Long_MA > 0.036076 )
					if( Money_Flow_Ratio <= 0.824538 )
						if( Negative_Money_Flow_Sum <= 1.23845e+07 )
							if( Short_MA <= 0.051171 )
								if( MFI_Low <= 24.0225 )
									ret := 0.223485
								if( MFI_Low > 24.0225 )
									ret := 0.675676
							if( Short_MA > 0.051171 )
								if( Short_Long_Diff <= -0.000531 )
									ret := 0.500000
								if( Short_Long_Diff > -0.000531 )
									ret := -0.032520
						if( Negative_Money_Flow_Sum > 1.23845e+07 )
							if( Negative_Money_Flow_Sum <= 1.52e+07 )
								if( Negative_Money_Flow_Sum <= 1.32687e+07 )
									ret := 0.284553
								if( Negative_Money_Flow_Sum > 1.32687e+07 )
									ret := 0.686192
							if( Negative_Money_Flow_Sum > 1.52e+07 )
								if( Negative_Money_Flow_Sum <= 7.48638e+07 )
									ret := 0.266098
								if( Negative_Money_Flow_Sum > 7.48638e+07 )
									ret := -0.800000 // sell
					if( Money_Flow_Ratio > 0.824538 )
						if( Raw_Money_Flow <= 5.38143e+06 )
							if( Raw_Money_Flow <= 872407 )
								if( Raw_Money_Flow <= 420073 )
									ret := -0.152672
								if( Raw_Money_Flow > 420073 )
									ret := 0.304478
							if( Raw_Money_Flow > 872407 )
								if( Positive_Money_Flow <= 3.48123e+06 )
									ret := 0.094808
								if( Positive_Money_Flow > 3.48123e+06 )
									ret := 0.330961
						if( Raw_Money_Flow > 5.38143e+06 )
							if( Short_Long_Diff <= 0.000453 )
								if( Money_Flow_Ratio <= 0.86722 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.86722 )
									ret := -0.573171
							if( Short_Long_Diff > 0.000453 )
								if( Raw_Money_Flow <= 1.32989e+07 )
									ret := 0.077381
								if( Raw_Money_Flow > 1.32989e+07 )
									ret := -0.555556
	if( Typical_Price > 0.059992 )
		if( MFI_Low <= 3.93773 )
			if( Negative_Money_Flow_Sum <= 1.73591e+08 )
				if( Typical_Price <= 0.066285 )
					if( Negative_Money_Flow <= 562396 )
						if( Typical_Price <= 0.066004 )
							if( Negative_Money_Flow_Sum <= 4.08952e+07 )
								if( Negative_Money_Flow_Sum <= 1.86565e+07 )
									ret := -0.115512
								if( Negative_Money_Flow_Sum > 1.86565e+07 )
									ret := 0.233333
							if( Negative_Money_Flow_Sum > 4.08952e+07 )
								ret := -1.000000 // sell
						if( Typical_Price > 0.066004 )
							if( Positive_Money_Flow_Sum <= 2.2628e+06 )
								if( Positive_Money_Flow_Sum <= 1.24741e+06 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 1.24741e+06 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 2.2628e+06 )
								if( Typical_Price <= 0.066095 )
									ret := 0.833333 // buy
								if( Typical_Price > 0.066095 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow > 562396 )
						if( Typical_Price <= 0.061697 )
							if( Positive_Money_Flow_Sum <= 3.07816e+06 )
								if( Negative_Money_Flow_Sum <= 5.42197e+06 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 5.42197e+06 )
									ret := 0.263158
							if( Positive_Money_Flow_Sum > 3.07816e+06 )
								if( Short_Long_Diff <= -0.001869 )
									ret := -0.250000
								if( Short_Long_Diff > -0.001869 )
									ret := 0.716981 // buy
						if( Typical_Price > 0.061697 )
							if( Money_Flow_Ratio <= 0.284027 )
								if( Short_MA <= 0.063612 )
									ret := -0.324675
								if( Short_MA > 0.063612 )
									ret := 0.123223
							if( Money_Flow_Ratio > 0.284027 )
								if( Short_MA <= 0.062402 )
									ret := -0.600000
								if( Short_MA > 0.062402 )
									ret := 0.421687
				if( Typical_Price > 0.066285 )
					if( Long_MA <= 0.165729 )
						if( Positive_Money_Flow_Sum <= 1.38039e+07 )
							if( Short_Long_Diff <= -0.002256 )
								if( Negative_Money_Flow_Sum <= 1.14564e+08 )
									ret := -0.546667
								if( Negative_Money_Flow_Sum > 1.14564e+08 )
									ret := 1.000000 // buy
							if( Short_Long_Diff > -0.002256 )
								if( Negative_Money_Flow_Sum <= 3.94352e+07 )
									ret := -0.114976
								if( Negative_Money_Flow_Sum > 3.94352e+07 )
									ret := 0.120968
						if( Positive_Money_Flow_Sum > 1.38039e+07 )
							if( Negative_Money_Flow_Sum <= 1.47463e+08 )
								if( Raw_Money_Flow <= 8.92135e+06 )
									ret := -0.060465
								if( Raw_Money_Flow > 8.92135e+06 )
									ret := 0.403846
							if( Negative_Money_Flow_Sum > 1.47463e+08 )
								if( Short_Long_Diff <= -0.003702 )
									ret := -0.941176 // sell
								if( Short_Long_Diff > -0.003702 )
									ret := -0.400000
					if( Long_MA > 0.165729 )
						if( Negative_Money_Flow_Sum <= 4.95245e+07 )
							ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 4.95245e+07 )
							ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 1.73591e+08 )
				if( Typical_Price <= 0.136128 )
					if( Raw_Money_Flow <= 2.48178e+07 )
						if( MFI <= 23.4917 )
							if( Positive_Money_Flow_Sum <= 1.73057e+07 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 1.73057e+07 )
								ret := 1.000000 // buy
						if( MFI > 23.4917 )
							ret := 0.500000
					if( Raw_Money_Flow > 2.48178e+07 )
						if( MFI <= 20.1754 )
							ret := -0.333333
						if( MFI > 20.1754 )
							ret := 1.000000 // buy
				if( Typical_Price > 0.136128 )
					if( Positive_Money_Flow_Sum <= 5.08694e+07 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 5.08694e+07 )
						if( Money_Flow_Ratio <= 0.294516 )
							ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.294516 )
							ret := -0.500000
		if( MFI_Low > 3.93773 )
			if( Money_Flow_Ratio <= 2.89435 )
				if( Negative_Money_Flow_Sum <= 1.03095e+07 )
					if( Positive_Money_Flow_Sum <= 9.74501e+06 )
						if( Negative_Money_Flow <= 2.30888e+06 )
							if( Typical_Price <= 0.065288 )
								if( Negative_Money_Flow_Sum <= 3.35686e+06 )
									ret := -0.012874
								if( Negative_Money_Flow_Sum > 3.35686e+06 )
									ret := 0.073212
							if( Typical_Price > 0.065288 )
								if( Negative_Money_Flow <= 527595 )
									ret := 0.000554
								if( Negative_Money_Flow > 527595 )
									ret := -0.072066
						if( Negative_Money_Flow > 2.30888e+06 )
							if( MFI <= 35.9248 )
								if( Negative_Money_Flow_Sum <= 7.10418e+06 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 7.10418e+06 )
									ret := -0.360000
							if( MFI > 35.9248 )
								if( Raw_Money_Flow <= 2.62678e+06 )
									ret := -0.312500
								if( Raw_Money_Flow > 2.62678e+06 )
									ret := 0.028846
					if( Positive_Money_Flow_Sum > 9.74501e+06 )
						if( Positive_Money_Flow_Sum <= 1.57058e+07 )
							if( Short_Long_Diff <= 0.000691 )
								if( Negative_Money_Flow <= 1.27041e+06 )
									ret := 0.164241
								if( Negative_Money_Flow > 1.27041e+06 )
									ret := -0.022088
							if( Short_Long_Diff > 0.000691 )
								if( Negative_Money_Flow_Sum <= 8.69707e+06 )
									ret := -0.029240
								if( Negative_Money_Flow_Sum > 8.69707e+06 )
									ret := -0.482759
						if( Positive_Money_Flow_Sum > 1.57058e+07 )
							if( Short_Long_Diff <= 0.000496 )
								if( Positive_Money_Flow_Sum <= 1.79756e+07 )
									ret := -0.069930
								if( Positive_Money_Flow_Sum > 1.79756e+07 )
									ret := 0.263345
							if( Short_Long_Diff > 0.000496 )
								if( Negative_Money_Flow <= 2.30239e+06 )
									ret := -0.223958
								if( Negative_Money_Flow > 2.30239e+06 )
									ret := 0.478261
				if( Negative_Money_Flow_Sum > 1.03095e+07 )
					if( Typical_Price <= 0.111166 )
						if( Positive_Money_Flow_Sum <= 1.78269e+08 )
							if( Raw_Money_Flow <= 6.47857e+06 )
								if( Negative_Money_Flow_Sum <= 1.77112e+07 )
									ret := 0.141290
								if( Negative_Money_Flow_Sum > 1.77112e+07 )
									ret := 0.066461
							if( Raw_Money_Flow > 6.47857e+06 )
								if( Negative_Money_Flow_Sum <= 2.28251e+07 )
									ret := -0.191011
								if( Negative_Money_Flow_Sum > 2.28251e+07 )
									ret := 0.228493
						if( Positive_Money_Flow_Sum > 1.78269e+08 )
							if( MFI_High <= -32.2517 )
								ret := 1.000000 // buy
							if( MFI_High > -32.2517 )
								if( Short_MA <= 0.105487 )
									ret := -0.888889 // sell
								if( Short_MA > 0.105487 )
									ret := 0.500000
					if( Typical_Price > 0.111166 )
						if( Money_Flow_Ratio <= 0.71209 )
							if( Positive_Money_Flow_Sum <= 8.38068e+07 )
								if( Negative_Money_Flow_Sum <= 1.89258e+08 )
									ret := -0.170970
								if( Negative_Money_Flow_Sum > 1.89258e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.38068e+07 )
								if( Short_Long_Diff <= -0.003707 )
									ret := 0.019608
								if( Short_Long_Diff > -0.003707 )
									ret := 0.925926 // buy
						if( Money_Flow_Ratio > 0.71209 )
							if( Negative_Money_Flow_Sum <= 1.13388e+08 )
								if( Positive_Money_Flow_Sum <= 1.95751e+08 )
									ret := 0.074564
								if( Positive_Money_Flow_Sum > 1.95751e+08 )
									ret := -0.783333 // sell
							if( Negative_Money_Flow_Sum > 1.13388e+08 )
								if( Short_Long_Diff <= -0.003124 )
									ret := -0.740741 // sell
								if( Short_Long_Diff > -0.003124 )
									ret := 0.420139
			if( Money_Flow_Ratio > 2.89435 )
				if( Negative_Money_Flow_Sum <= 3.67094e+06 )
					if( MFI_Low <= 70.7874 )
						if( Long_MA <= 0.059239 )
							if( Typical_Price <= 0.060348 )
								ret := 0.400000
							if( Typical_Price > 0.060348 )
								ret := 1.000000 // buy
						if( Long_MA > 0.059239 )
							if( Short_Long_Diff <= 0.001256 )
								if( Positive_Money_Flow <= 4.76115e+06 )
									ret := 0.044576
								if( Positive_Money_Flow > 4.76115e+06 )
									ret := -0.514286
							if( Short_Long_Diff > 0.001256 )
								if( Short_MA <= 0.081134 )
									ret := 0.741935 // buy
								if( Short_MA > 0.081134 )
									ret := 0.160000
					if( MFI_Low > 70.7874 )
						if( Positive_Money_Flow_Sum <= 2.35716e+07 )
							if( Positive_Money_Flow <= 1.47875e+06 )
								if( Short_Long_Diff <= 0.000275 )
									ret := 0.357143
								if( Short_Long_Diff > 0.000275 )
									ret := -0.163333
							if( Positive_Money_Flow > 1.47875e+06 )
								if( Typical_Price <= 0.13218 )
									ret := 0.117647
								if( Typical_Price > 0.13218 )
									ret := 0.692308
						if( Positive_Money_Flow_Sum > 2.35716e+07 )
							if( Typical_Price <= 0.107623 )
								if( Positive_Money_Flow <= 1.45759e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 1.45759e+06 )
									ret := -0.750000 // sell
							if( Typical_Price > 0.107623 )
								ret := 0.000000
				if( Negative_Money_Flow_Sum > 3.67094e+06 )
					if( Negative_Money_Flow <= 1.38965e+07 )
						if( Positive_Money_Flow_Sum <= 1.92424e+08 )
							if( Raw_Money_Flow <= 1.33764e+07 )
								if( Negative_Money_Flow_Sum <= 2.96513e+07 )
									ret := -0.163596
								if( Negative_Money_Flow_Sum > 2.96513e+07 )
									ret := -0.525000
							if( Raw_Money_Flow > 1.33764e+07 )
								if( Negative_Money_Flow_Sum <= 3.55995e+07 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 3.55995e+07 )
									ret := 0.600000
						if( Positive_Money_Flow_Sum > 1.92424e+08 )
							if( Typical_Price <= 0.130537 )
								if( Positive_Money_Flow_Sum <= 2.49983e+08 )
									ret := -0.461538
								if( Positive_Money_Flow_Sum > 2.49983e+08 )
									ret := 0.800000 // buy
							if( Typical_Price > 0.130537 )
								if( Raw_Money_Flow <= 4.12149e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 4.12149e+07 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow > 1.38965e+07 )
						if( Money_Flow_Ratio <= 3.22469 )
							if( Negative_Money_Flow <= 1.89298e+07 )
								ret := 0.000000
							if( Negative_Money_Flow > 1.89298e+07 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 3.22469 )
							if( Short_MA <= 0.095219 )
								if( Money_Flow_Ratio <= 3.94193 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 3.94193 )
									ret := 0.500000
							if( Short_MA > 0.095219 )
								if( Negative_Money_Flow_Sum <= 3.75458e+07 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 3.75458e+07 )
									ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TRXUSDT_30Min_e9483733(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


