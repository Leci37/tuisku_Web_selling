//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: XRPUSDT_30Min_2CM0_4534f6d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2CM0_4534f6d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_4534f6d8(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 3.99599e+07 )
		if( Typical_Price <= 0.617052 )
			if( Negative_Money_Flow <= 1.57114e+06 )
				if( Money_Flow_Ratio <= 24.6702 )
					if( MFI <= 84.8856 )
						if( Positive_Money_Flow_Sum <= 4.41552e+07 )
							if( Typical_Price <= 0.362086 )
								if( Negative_Money_Flow_Sum <= 8.55406e+06 )
									ret := 0.010249
								if( Negative_Money_Flow_Sum > 8.55406e+06 )
									ret := 0.117133
							if( Typical_Price > 0.362086 )
								if( Raw_Money_Flow <= 3.16461e+06 )
									ret := -0.019260
								if( Raw_Money_Flow > 3.16461e+06 )
									ret := 0.069367
						if( Positive_Money_Flow_Sum > 4.41552e+07 )
							if( ad_mf <= -3.0328e+06 )
								if( MFI_Low <= 43.0002 )
									ret := 0.412500
								if( MFI_Low > 43.0002 )
									ret := 0.025070
							if( ad_mf > -3.0328e+06 )
								if( ad <= 3.08798e+06 )
									ret := -0.272908
								if( ad > 3.08798e+06 )
									ret := -0.037615
					if( MFI > 84.8856 )
						if( Positive_Money_Flow_Sum <= 5.61616e+07 )
							if( Money_Flow_Ratio <= 6.99981 )
								if( ad <= 1.24701e+06 )
									ret := 0.057143
								if( ad > 1.24701e+06 )
									ret := -0.349057
							if( Money_Flow_Ratio > 6.99981 )
								if( Typical_Price <= 0.41898 )
									ret := -0.085366
								if( Typical_Price > 0.41898 )
									ret := 0.393258
						if( Positive_Money_Flow_Sum > 5.61616e+07 )
							if( Negative_Money_Flow_Sum <= 1.61651e+07 )
								if( Typical_Price <= 0.439767 )
									ret := -0.178571
								if( Typical_Price > 0.439767 )
									ret := -0.603306
							if( Negative_Money_Flow_Sum > 1.61651e+07 )
								if( Money_Flow_Ratio <= 11.4873 )
									ret := 0.166667
								if( Money_Flow_Ratio > 11.4873 )
									ret := -0.777778 // sell
				if( Money_Flow_Ratio > 24.6702 )
					if( Negative_Money_Flow_Sum <= 1.55875e+06 )
						ret := 0.250000
					if( Negative_Money_Flow_Sum > 1.55875e+06 )
						if( mf <= 0.340768 )
							ret := 1.000000 // buy
						if( mf > 0.340768 )
							ret := 0.714286 // buy
			if( Negative_Money_Flow > 1.57114e+06 )
				if( Positive_Money_Flow_Sum <= 1.18783e+08 )
					if( Negative_Money_Flow <= 7.44109e+06 )
						if( Typical_Price <= 0.359627 )
							if( ad <= 2.47798e+06 )
								if( Positive_Money_Flow_Sum <= 6.29007e+07 )
									ret := 0.202789
								if( Positive_Money_Flow_Sum > 6.29007e+07 )
									ret := -0.750000 // sell
							if( ad > 2.47798e+06 )
								if( Negative_Money_Flow_Sum <= 1.2091e+07 )
									ret := -0.442623
								if( Negative_Money_Flow_Sum > 1.2091e+07 )
									ret := 0.074906
						if( Typical_Price > 0.359627 )
							if( ad <= 4.97447e+06 )
								if( MFI <= 36.5001 )
									ret := 0.134674
								if( MFI > 36.5001 )
									ret := 0.034202
							if( ad > 4.97447e+06 )
								if( MFI_High <= -58.0158 )
									ret := -0.560000
								if( MFI_High > -58.0158 )
									ret := -0.084130
					if( Negative_Money_Flow > 7.44109e+06 )
						if( Negative_Money_Flow_Sum <= 2.41856e+07 )
							if( Negative_Money_Flow_Sum <= 2.00281e+07 )
								if( Raw_Money_Flow <= 8.35997e+06 )
									ret := 0.454545
								if( Raw_Money_Flow > 8.35997e+06 )
									ret := -0.057143
							if( Negative_Money_Flow_Sum > 2.00281e+07 )
								if( MFI_High <= -41.8941 )
									ret := 0.153846
								if( MFI_High > -41.8941 )
									ret := 0.777778 // buy
						if( Negative_Money_Flow_Sum > 2.41856e+07 )
							if( Positive_Money_Flow_Sum <= 5.47355e+07 )
								if( mf <= -0.032041 )
									ret := 0.086957
								if( mf > -0.032041 )
									ret := 0.344828
							if( Positive_Money_Flow_Sum > 5.47355e+07 )
								if( Typical_Price <= 0.415001 )
									ret := -0.615385
								if( Typical_Price > 0.415001 )
									ret := 0.127660
				if( Positive_Money_Flow_Sum > 1.18783e+08 )
					if( Positive_Money_Flow_Sum <= 2.05822e+08 )
						if( MFI_High <= -0.960599 )
							ret := 0.000000
						if( MFI_High > -0.960599 )
							if( Negative_Money_Flow <= 1.07212e+07 )
								if( Typical_Price <= 0.604509 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.604509 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow > 1.07212e+07 )
								ret := -0.333333
					if( Positive_Money_Flow_Sum > 2.05822e+08 )
						ret := 0.500000
		if( Typical_Price > 0.617052 )
			if( mf <= -0.180989 )
				if( Money_Flow_Ratio <= 0.26331 )
					if( ad_mf <= -2.81149e+06 )
						ret := -1.000000 // sell
					if( ad_mf > -2.81149e+06 )
						ret := -0.500000
				if( Money_Flow_Ratio > 0.26331 )
					if( Raw_Money_Flow <= 4.20981e+06 )
						if( MFI <= 41.2909 )
							if( Negative_Money_Flow <= 2.86269e+06 )
								if( Positive_Money_Flow <= 3.43049e+06 )
									ret := -0.069767
								if( Positive_Money_Flow > 3.43049e+06 )
									ret := 0.500000
							if( Negative_Money_Flow > 2.86269e+06 )
								if( ad_mf <= -1.47327e+06 )
									ret := -0.400000
								if( ad_mf > -1.47327e+06 )
									ret := -0.800000 // sell
						if( MFI > 41.2909 )
							if( Typical_Price <= 0.767867 )
								if( MFI_Low <= 29.6201 )
									ret := 0.863636 // buy
								if( MFI_Low > 29.6201 )
									ret := 0.187500
							if( Typical_Price > 0.767867 )
								if( MFI_High <= -14.5814 )
									ret := -0.062500
								if( MFI_High > -14.5814 )
									ret := 0.750000 // buy
					if( Raw_Money_Flow > 4.20981e+06 )
						if( MFI_Low <= 9.38353 )
							if( ad <= -5.1636e+06 )
								ret := 0.750000 // buy
							if( ad > -5.1636e+06 )
								ret := 1.000000 // buy
						if( MFI_Low > 9.38353 )
							if( ad_mf <= -4.61807e+06 )
								if( Typical_Price <= 0.758321 )
									ret := 0.142857
								if( Typical_Price > 0.758321 )
									ret := 0.928571 // buy
							if( ad_mf > -4.61807e+06 )
								if( ad <= 2.79305e+06 )
									ret := 0.052632
								if( ad > 2.79305e+06 )
									ret := 0.625000
			if( mf > -0.180989 )
				if( Negative_Money_Flow <= 6.0883e+06 )
					if( Positive_Money_Flow <= 4.82973e+06 )
						if( Negative_Money_Flow_Sum <= 3.34354e+07 )
							if( MFI_High <= -32.2851 )
								if( mf <= -0.045178 )
									ret := -0.227273
								if( mf > -0.045178 )
									ret := -0.113411
							if( MFI_High > -32.2851 )
								if( Positive_Money_Flow_Sum <= 8.76778e+07 )
									ret := -0.034678
								if( Positive_Money_Flow_Sum > 8.76778e+07 )
									ret := 0.578947
						if( Negative_Money_Flow_Sum > 3.34354e+07 )
							if( ad <= -3.01292e+06 )
								if( Negative_Money_Flow_Sum <= 3.87864e+07 )
									ret := 0.127358
								if( Negative_Money_Flow_Sum > 3.87864e+07 )
									ret := 0.644444
							if( ad > -3.01292e+06 )
								if( ad_mf <= 1.1839e+06 )
									ret := -0.109005
								if( ad_mf > 1.1839e+06 )
									ret := 0.101338
					if( Positive_Money_Flow > 4.82973e+06 )
						if( mf <= 0.341199 )
							if( MFI_High <= -10.6342 )
								if( Raw_Money_Flow <= 1.27554e+07 )
									ret := -0.120398
								if( Raw_Money_Flow > 1.27554e+07 )
									ret := 0.307018
							if( MFI_High > -10.6342 )
								if( Positive_Money_Flow_Sum <= 4.57591e+07 )
									ret := 0.073171
								if( Positive_Money_Flow_Sum > 4.57591e+07 )
									ret := -0.207123
						if( mf > 0.341199 )
							if( Negative_Money_Flow_Sum <= 2.36118e+07 )
								if( MFI_High <= 12.3477 )
									ret := 0.666667
								if( MFI_High > 12.3477 )
									ret := 0.157895
							if( Negative_Money_Flow_Sum > 2.36118e+07 )
								if( ad_mf <= 5.84025e+07 )
									ret := -0.750000 // sell
								if( ad_mf > 5.84025e+07 )
									ret := 0.375000
				if( Negative_Money_Flow > 6.0883e+06 )
					if( MFI_High <= -2.54301 )
						if( MFI_Low <= 22.4245 )
							if( Money_Flow_Ratio <= 0.507712 )
								if( Negative_Money_Flow <= 6.38576e+06 )
									ret := -0.666667
								if( Negative_Money_Flow > 6.38576e+06 )
									ret := 0.193548
							if( Money_Flow_Ratio > 0.507712 )
								if( MFI_Low <= 16.6553 )
									ret := 0.857143 // buy
								if( MFI_Low > 16.6553 )
									ret := 0.405405
						if( MFI_Low > 22.4245 )
							if( Typical_Price <= 0.618948 )
								if( Typical_Price <= 0.617847 )
									ret := -0.428571
								if( Typical_Price > 0.617847 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.618948 )
								if( ad_mf <= -291688 )
									ret := 0.039648
								if( ad_mf > -291688 )
									ret := 0.297297
					if( MFI_High > -2.54301 )
						if( Positive_Money_Flow <= 3.76811e+06 )
							if( ad <= -5.50982e+06 )
								if( mf <= 0.221076 )
									ret := -0.428571
								if( mf > 0.221076 )
									ret := -1.000000 // sell
							if( ad > -5.50982e+06 )
								if( ad <= 3.37966e+06 )
									ret := 0.058824
								if( ad > 3.37966e+06 )
									ret := -0.687500
						if( Positive_Money_Flow > 3.76811e+06 )
							ret := 1.000000 // buy
	if( Negative_Money_Flow_Sum > 3.99599e+07 )
		if( Negative_Money_Flow <= 5.49496e+06 )
			if( MFI_High <= -3.00823 )
				if( Typical_Price <= 1.41668 )
					if( Negative_Money_Flow_Sum <= 2.47926e+08 )
						if( ad <= 6.44521e+07 )
							if( ad <= -1.38258e+07 )
								if( mf <= 0.133229 )
									ret := -0.306897
								if( mf > 0.133229 )
									ret := 0.522727
							if( ad > -1.38258e+07 )
								if( ad <= -9.13713e+06 )
									ret := 0.339450
								if( ad > -9.13713e+06 )
									ret := 0.058698
						if( ad > 6.44521e+07 )
							if( Positive_Money_Flow_Sum <= 3.05125e+08 )
								if( Typical_Price <= 0.334268 )
									ret := -0.166667
								if( Typical_Price > 0.334268 )
									ret := -0.913043 // sell
							if( Positive_Money_Flow_Sum > 3.05125e+08 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.47926e+08 )
						if( Positive_Money_Flow_Sum <= 3.33102e+08 )
							if( MFI_High <= -42.6582 )
								if( Negative_Money_Flow_Sum <= 2.81785e+08 )
									ret := -0.459770
								if( Negative_Money_Flow_Sum > 2.81785e+08 )
									ret := 0.355685
							if( MFI_High > -42.6582 )
								if( Typical_Price <= 0.927021 )
									ret := 0.839080 // buy
								if( Typical_Price > 0.927021 )
									ret := 0.450292
						if( Positive_Money_Flow_Sum > 3.33102e+08 )
							if( Positive_Money_Flow_Sum <= 5.48368e+08 )
								if( mf <= 0.077057 )
									ret := -0.437956
								if( mf > 0.077057 )
									ret := 0.105263
							if( Positive_Money_Flow_Sum > 5.48368e+08 )
								if( Positive_Money_Flow_Sum <= 7.54127e+08 )
									ret := 0.676923
								if( Positive_Money_Flow_Sum > 7.54127e+08 )
									ret := -0.190476
				if( Typical_Price > 1.41668 )
					if( Negative_Money_Flow_Sum <= 7.27021e+08 )
						if( Money_Flow_Ratio <= 1.53119 )
							if( Negative_Money_Flow_Sum <= 1.17523e+08 )
								if( MFI <= 56.8747 )
									ret := 0.666667
								if( MFI > 56.8747 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.17523e+08 )
								if( Positive_Money_Flow_Sum <= 1.05843e+08 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.05843e+08 )
									ret := -0.427793
						if( Money_Flow_Ratio > 1.53119 )
							if( Negative_Money_Flow_Sum <= 3.29613e+08 )
								if( Positive_Money_Flow <= 5.13447e+07 )
									ret := 0.127389
								if( Positive_Money_Flow > 5.13447e+07 )
									ret := -0.675325
							if( Negative_Money_Flow_Sum > 3.29613e+08 )
								if( Typical_Price <= 1.78748 )
									ret := 0.870968 // buy
								if( Typical_Price > 1.78748 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 7.27021e+08 )
						if( Money_Flow_Ratio <= 0.644461 )
							if( Typical_Price <= 1.55097 )
								ret := 0.500000
							if( Typical_Price > 1.55097 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.644461 )
							if( Positive_Money_Flow_Sum <= 7.5201e+08 )
								ret := -0.600000
							if( Positive_Money_Flow_Sum > 7.5201e+08 )
								ret := 0.800000 // buy
			if( MFI_High > -3.00823 )
				if( mf <= 0.308237 )
					if( Positive_Money_Flow <= 1.18424e+08 )
						if( Positive_Money_Flow_Sum <= 1.99774e+08 )
							if( ad_mf <= 3.28099e+07 )
								if( Negative_Money_Flow_Sum <= 4.539e+07 )
									ret := -0.214286
								if( Negative_Money_Flow_Sum > 4.539e+07 )
									ret := 0.560000
							if( ad_mf > 3.28099e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.99774e+08 )
							if( Typical_Price <= 1.21956 )
								if( ad <= 7.91744e+07 )
									ret := -0.540909
								if( ad > 7.91744e+07 )
									ret := 0.800000 // buy
							if( Typical_Price > 1.21956 )
								if( Raw_Money_Flow <= 2.72849e+07 )
									ret := -0.666667
								if( Raw_Money_Flow > 2.72849e+07 )
									ret := -0.958333 // sell
					if( Positive_Money_Flow > 1.18424e+08 )
						if( Typical_Price <= 1.34114 )
							if( Negative_Money_Flow_Sum <= 9.37211e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 9.37211e+07 )
								if( ad_mf <= 1.44124e+08 )
									ret := 0.756098 // buy
								if( ad_mf > 1.44124e+08 )
									ret := -1.000000 // sell
						if( Typical_Price > 1.34114 )
							if( MFI_High <= 3.29838 )
								if( mf <= 0.26654 )
									ret := 0.250000
								if( mf > 0.26654 )
									ret := -0.833333 // sell
							if( MFI_High > 3.29838 )
								ret := -1.000000 // sell
				if( mf > 0.308237 )
					if( Negative_Money_Flow_Sum <= 1.18402e+08 )
						if( Negative_Money_Flow_Sum <= 5.41804e+07 )
							if( Positive_Money_Flow_Sum <= 2.35755e+08 )
								if( Typical_Price <= 0.588994 )
									ret := -0.375000
								if( Typical_Price > 0.588994 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.35755e+08 )
								ret := 0.600000
						if( Negative_Money_Flow_Sum > 5.41804e+07 )
							if( Raw_Money_Flow <= 1.51377e+08 )
								if( Negative_Money_Flow_Sum <= 6.15365e+07 )
									ret := 0.555556
								if( Negative_Money_Flow_Sum > 6.15365e+07 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.51377e+08 )
								ret := -0.600000
					if( Negative_Money_Flow_Sum > 1.18402e+08 )
						ret := -0.857143 // sell
		if( Negative_Money_Flow > 5.49496e+06 )
			if( Positive_Money_Flow_Sum <= 4.94009e+07 )
				if( ad_mf <= -2.88704e+07 )
					if( MFI_High <= -42.4006 )
						if( Typical_Price <= 0.627151 )
							if( ad <= -3.14243e+07 )
								if( MFI_Low <= 0.159495 )
									ret := 1.000000 // buy
								if( MFI_Low > 0.159495 )
									ret := 0.896552 // buy
							if( ad > -3.14243e+07 )
								if( ad_mf <= -3.10062e+07 )
									ret := 0.000000
								if( ad_mf > -3.10062e+07 )
									ret := 0.923077 // buy
						if( Typical_Price > 0.627151 )
							if( Negative_Money_Flow_Sum <= 9.23974e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 9.23974e+07 )
								if( Typical_Price <= 0.671929 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.671929 )
									ret := 0.571429
					if( MFI_High > -42.4006 )
						if( Negative_Money_Flow <= 1.99336e+07 )
							if( Negative_Money_Flow <= 1.73728e+07 )
								ret := 0.250000
							if( Negative_Money_Flow > 1.73728e+07 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.99336e+07 )
							ret := 0.750000 // buy
				if( ad_mf > -2.88704e+07 )
					if( Negative_Money_Flow_Sum <= 5.03891e+07 )
						if( mf <= -0.165275 )
							if( Raw_Money_Flow <= 7.34926e+06 )
								if( mf <= -0.185046 )
									ret := 0.292683
								if( mf > -0.185046 )
									ret := -0.466667
							if( Raw_Money_Flow > 7.34926e+06 )
								if( Raw_Money_Flow <= 8.37141e+06 )
									ret := -0.913043 // sell
								if( Raw_Money_Flow > 8.37141e+06 )
									ret := -0.240000
						if( mf > -0.165275 )
							if( Positive_Money_Flow_Sum <= 1.03579e+07 )
								if( Negative_Money_Flow <= 1.28095e+07 )
									ret := -0.487179
								if( Negative_Money_Flow > 1.28095e+07 )
									ret := 0.428571
							if( Positive_Money_Flow_Sum > 1.03579e+07 )
								if( Negative_Money_Flow <= 1.00638e+07 )
									ret := 0.139344
								if( Negative_Money_Flow > 1.00638e+07 )
									ret := 0.374384
					if( Negative_Money_Flow_Sum > 5.03891e+07 )
						if( Negative_Money_Flow_Sum <= 1.40869e+08 )
							if( MFI_High <= -54.3693 )
								if( Negative_Money_Flow_Sum <= 1.26801e+08 )
									ret := 0.371956
								if( Negative_Money_Flow_Sum > 1.26801e+08 )
									ret := 0.738095 // buy
							if( MFI_High > -54.3693 )
								if( mf <= -0.010936 )
									ret := 0.352292
								if( mf > -0.010936 )
									ret := 0.157821
						if( Negative_Money_Flow_Sum > 1.40869e+08 )
							if( Negative_Money_Flow <= 1.081e+07 )
								if( mf <= -0.043833 )
									ret := -0.516129
								if( mf > -0.043833 )
									ret := -0.958333 // sell
							if( Negative_Money_Flow > 1.081e+07 )
								if( Positive_Money_Flow_Sum <= 4.08015e+07 )
									ret := 0.139706
								if( Positive_Money_Flow_Sum > 4.08015e+07 )
									ret := 0.600000
			if( Positive_Money_Flow_Sum > 4.94009e+07 )
				if( Negative_Money_Flow_Sum <= 3.95802e+08 )
					if( Positive_Money_Flow_Sum <= 1.01534e+08 )
						if( mf <= -0.128014 )
							if( MFI_High <= -58.1739 )
								if( Negative_Money_Flow <= 2.50649e+07 )
									ret := 0.500000
								if( Negative_Money_Flow > 2.50649e+07 )
									ret := 0.937500 // buy
							if( MFI_High > -58.1739 )
								if( Negative_Money_Flow_Sum <= 4.28395e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.28395e+07 )
									ret := -0.232323
						if( mf > -0.128014 )
							if( MFI <= 50.1907 )
								if( ad_mf <= 2.05827e+06 )
									ret := 0.323513
								if( ad_mf > 2.05827e+06 )
									ret := 0.017065
							if( MFI > 50.1907 )
								if( Money_Flow_Ratio <= 1.18417 )
									ret := -0.066406
								if( Money_Flow_Ratio > 1.18417 )
									ret := 0.169184
					if( Positive_Money_Flow_Sum > 1.01534e+08 )
						if( ad_mf <= -1.80229e+06 )
							if( MFI <= 50.2126 )
								if( Positive_Money_Flow_Sum <= 2.09198e+08 )
									ret := 0.086651
								if( Positive_Money_Flow_Sum > 2.09198e+08 )
									ret := -0.604278
							if( MFI > 50.2126 )
								if( ad <= -6.95232e+06 )
									ret := 0.185714
								if( ad > -6.95232e+06 )
									ret := 0.001838
						if( ad_mf > -1.80229e+06 )
							if( MFI <= 73.8737 )
								if( Negative_Money_Flow_Sum <= 1.00108e+08 )
									ret := -0.176630
								if( Negative_Money_Flow_Sum > 1.00108e+08 )
									ret := 0.019048
							if( MFI > 73.8737 )
								if( Typical_Price <= 0.467017 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.467017 )
									ret := -0.623529
				if( Negative_Money_Flow_Sum > 3.95802e+08 )
					if( Positive_Money_Flow_Sum <= 1.70646e+08 )
						if( Negative_Money_Flow_Sum <= 5.44401e+08 )
							if( Negative_Money_Flow_Sum <= 4.55177e+08 )
								if( ad_mf <= -1.9447e+07 )
									ret := 0.478261
								if( ad_mf > -1.9447e+07 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 4.55177e+08 )
								if( Negative_Money_Flow <= 5.65484e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.65484e+07 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 5.44401e+08 )
							if( Positive_Money_Flow_Sum <= 1.14901e+08 )
								ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 1.14901e+08 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.70646e+08 )
						if( Typical_Price <= 1.78658 )
							if( Raw_Money_Flow <= 3.64255e+07 )
								if( mf <= 0.159227 )
									ret := 0.825000 // buy
								if( mf > 0.159227 )
									ret := 0.090909
							if( Raw_Money_Flow > 3.64255e+07 )
								if( Negative_Money_Flow <= 4.75148e+07 )
									ret := 0.084967
								if( Negative_Money_Flow > 4.75148e+07 )
									ret := 0.463768
						if( Typical_Price > 1.78658 )
							if( Negative_Money_Flow <= 6.13496e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 6.13496e+07 )
								ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XRPUSDT_30Min_4534f6d8(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


