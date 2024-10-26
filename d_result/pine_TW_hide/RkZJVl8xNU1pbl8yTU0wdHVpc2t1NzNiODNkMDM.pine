//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: FFIV_15Min_2MM0_73b83d03 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2MM0_73b83d03", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_73b83d03(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Raw_Money_Flow <= 3.47919e+06 )
		if( Short_Long_Diff <= 1.80619 )
			if( Long_MA <= 143.578 )
				if( MFI_Low <= -3.05782 )
					if( Negative_Money_Flow_Sum <= 6.54129e+07 )
						if( Negative_Money_Flow_Sum <= 3.13331e+07 )
							if( Raw_Money_Flow <= 241451 )
								if( MFI_Low <= -6.63777 )
									ret := 0.750000 // buy
								if( MFI_Low > -6.63777 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 241451 )
								if( Raw_Money_Flow <= 1.40757e+06 )
									ret := -0.170213
								if( Raw_Money_Flow > 1.40757e+06 )
									ret := 0.267606
						if( Negative_Money_Flow_Sum > 3.13331e+07 )
							if( Typical_Price <= 99.7991 )
								ret := 1.000000 // buy
							if( Typical_Price > 99.7991 )
								if( MFI_Low <= -8.62564 )
									ret := -0.437229
								if( MFI_Low > -8.62564 )
									ret := -0.191977
					if( Negative_Money_Flow_Sum > 6.54129e+07 )
						if( MFI <= 4.33972 )
							if( Short_Long_Diff <= -0.179629 )
								if( Negative_Money_Flow <= 2.21322e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 2.21322e+06 )
									ret := 0.500000
							if( Short_Long_Diff > -0.179629 )
								ret := 0.000000
						if( MFI > 4.33972 )
							if( Negative_Money_Flow_Sum <= 9.10536e+07 )
								if( Long_MA <= 140.457 )
									ret := 0.452632
								if( Long_MA > 140.457 )
									ret := -0.208333
							if( Negative_Money_Flow_Sum > 9.10536e+07 )
								if( Short_Long_Diff <= -2.62047 )
									ret := 0.818182 // buy
								if( Short_Long_Diff > -2.62047 )
									ret := -0.186275
				if( MFI_Low > -3.05782 )
					if( Positive_Money_Flow_Sum <= 2.35241e+06 )
						if( Negative_Money_Flow_Sum <= 630299 )
							if( Long_MA <= 121.956 )
								ret := -1.000000 // sell
							if( Long_MA > 121.956 )
								ret := -0.500000
						if( Negative_Money_Flow_Sum > 630299 )
							if( Typical_Price <= 139.868 )
								if( Raw_Money_Flow <= 126451 )
									ret := 0.923077 // buy
								if( Raw_Money_Flow > 126451 )
									ret := 1.000000 // buy
							if( Typical_Price > 139.868 )
								if( Short_MA <= 141.702 )
									ret := 0.333333
								if( Short_MA > 141.702 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.35241e+06 )
						if( Money_Flow_Ratio <= 3.51238 )
							if( Short_Long_Diff <= -1.6899 )
								if( Long_MA <= 108.248 )
									ret := 0.812500 // buy
								if( Long_MA > 108.248 )
									ret := -0.410448
							if( Short_Long_Diff > -1.6899 )
								if( Negative_Money_Flow_Sum <= 6.18468e+07 )
									ret := 0.074621
								if( Negative_Money_Flow_Sum > 6.18468e+07 )
									ret := 0.348703
						if( Money_Flow_Ratio > 3.51238 )
							if( Money_Flow_Ratio <= 6.01122 )
								if( Long_MA <= 139.358 )
									ret := -0.177305
								if( Long_MA > 139.358 )
									ret := 0.055556
							if( Money_Flow_Ratio > 6.01122 )
								if( Raw_Money_Flow <= 221912 )
									ret := 0.416667
								if( Raw_Money_Flow > 221912 )
									ret := 0.068474
			if( Long_MA > 143.578 )
				if( Positive_Money_Flow_Sum <= 2.99624e+06 )
					if( Negative_Money_Flow <= 3.18416e+06 )
						if( Raw_Money_Flow <= 1.2487e+06 )
							if( MFI_Low <= 1.41295 )
								if( MFI_High <= -69.1532 )
									ret := -0.170588
								if( MFI_High > -69.1532 )
									ret := -0.507042
							if( MFI_Low > 1.41295 )
								if( Typical_Price <= 167.787 )
									ret := -0.273973
								if( Typical_Price > 167.787 )
									ret := 0.223529
						if( Raw_Money_Flow > 1.2487e+06 )
							if( Negative_Money_Flow_Sum <= 1.15883e+07 )
								if( Negative_Money_Flow <= 1.26613e+06 )
									ret := -0.285714
								if( Negative_Money_Flow > 1.26613e+06 )
									ret := 0.375000
							if( Negative_Money_Flow_Sum > 1.15883e+07 )
								if( Negative_Money_Flow <= 1.43326e+06 )
									ret := 0.257143
								if( Negative_Money_Flow > 1.43326e+06 )
									ret := -0.276190
					if( Negative_Money_Flow > 3.18416e+06 )
						if( MFI_Low <= -16.3921 )
							ret := 1.000000 // buy
						if( MFI_Low > -16.3921 )
							ret := 0.500000
				if( Positive_Money_Flow_Sum > 2.99624e+06 )
					if( Short_Long_Diff <= -1.86971 )
						if( Money_Flow_Ratio <= 1.57848 )
							if( Long_MA <= 173.606 )
								if( Positive_Money_Flow_Sum <= 1.56642e+07 )
									ret := -0.062992
								if( Positive_Money_Flow_Sum > 1.56642e+07 )
									ret := -0.514851
							if( Long_MA > 173.606 )
								if( Money_Flow_Ratio <= 0.184836 )
									ret := -0.407407
								if( Money_Flow_Ratio > 0.184836 )
									ret := 0.318182
						if( Money_Flow_Ratio > 1.57848 )
							if( Money_Flow_Ratio <= 4.08654 )
								if( Negative_Money_Flow_Sum <= 1.95781e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 1.95781e+07 )
									ret := -0.850000 // sell
							if( Money_Flow_Ratio > 4.08654 )
								ret := 0.000000
					if( Short_Long_Diff > -1.86971 )
						if( Typical_Price <= 201.885 )
							if( Positive_Money_Flow <= 1.21508e+06 )
								if( Negative_Money_Flow_Sum <= 1.09821e+08 )
									ret := 0.038729
								if( Negative_Money_Flow_Sum > 1.09821e+08 )
									ret := 0.277778
							if( Positive_Money_Flow > 1.21508e+06 )
								if( Negative_Money_Flow_Sum <= 3.44224e+07 )
									ret := 0.015256
								if( Negative_Money_Flow_Sum > 3.44224e+07 )
									ret := -0.090909
						if( Typical_Price > 201.885 )
							if( Positive_Money_Flow_Sum <= 1.02737e+08 )
								if( MFI_High <= 5.4923 )
									ret := -0.022720
								if( MFI_High > 5.4923 )
									ret := -0.317073
							if( Positive_Money_Flow_Sum > 1.02737e+08 )
								if( Typical_Price <= 204.328 )
									ret := -0.862069 // sell
								if( Typical_Price > 204.328 )
									ret := -0.367347
		if( Short_Long_Diff > 1.80619 )
			if( Positive_Money_Flow_Sum <= 5.33957e+07 )
				if( MFI <= 85.9056 )
					if( Negative_Money_Flow_Sum <= 7.69207e+07 )
						if( Positive_Money_Flow_Sum <= 3.55038e+07 )
							if( Negative_Money_Flow_Sum <= 6.29755e+06 )
								if( Negative_Money_Flow <= 532997 )
									ret := -0.724138 // sell
								if( Negative_Money_Flow > 532997 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 6.29755e+06 )
								if( Raw_Money_Flow <= 52753.9 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 52753.9 )
									ret := 0.304688
						if( Positive_Money_Flow_Sum > 3.55038e+07 )
							if( Raw_Money_Flow <= 1.27667e+06 )
								if( Short_MA <= 143.774 )
									ret := 0.000000
								if( Short_MA > 143.774 )
									ret := -0.794872 // sell
							if( Raw_Money_Flow > 1.27667e+06 )
								if( Typical_Price <= 148.968 )
									ret := 0.333333
								if( Typical_Price > 148.968 )
									ret := -0.333333
					if( Negative_Money_Flow_Sum > 7.69207e+07 )
						if( Raw_Money_Flow <= 2.54361e+06 )
							if( Positive_Money_Flow_Sum <= 3.12719e+07 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 3.12719e+07 )
								ret := 0.500000
						if( Raw_Money_Flow > 2.54361e+06 )
							ret := 1.000000 // buy
				if( MFI > 85.9056 )
					if( Negative_Money_Flow_Sum <= 517190 )
						ret := -0.857143 // sell
					if( Negative_Money_Flow_Sum > 517190 )
						if( Negative_Money_Flow_Sum <= 6.26655e+06 )
							if( Typical_Price <= 141.259 )
								ret := 1.000000 // buy
							if( Typical_Price > 141.259 )
								if( Positive_Money_Flow_Sum <= 3.90242e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.90242e+07 )
									ret := 0.611111
						if( Negative_Money_Flow_Sum > 6.26655e+06 )
							ret := -0.666667
			if( Positive_Money_Flow_Sum > 5.33957e+07 )
				if( Positive_Money_Flow_Sum <= 9.70929e+07 )
					if( Short_Long_Diff <= 7.48417 )
						if( Negative_Money_Flow_Sum <= 1.80476e+07 )
							if( Positive_Money_Flow_Sum <= 8.48016e+07 )
								if( Positive_Money_Flow <= 1.14004e+06 )
									ret := 0.753846 // buy
								if( Positive_Money_Flow > 1.14004e+06 )
									ret := 0.431818
							if( Positive_Money_Flow_Sum > 8.48016e+07 )
								if( Typical_Price <= 196.235 )
									ret := 0.071429
								if( Typical_Price > 196.235 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 1.80476e+07 )
							if( Raw_Money_Flow <= 3.19089e+06 )
								if( Negative_Money_Flow <= 1.22591e+06 )
									ret := 0.899083 // buy
								if( Negative_Money_Flow > 1.22591e+06 )
									ret := 0.590909
							if( Raw_Money_Flow > 3.19089e+06 )
								ret := 0.000000
					if( Short_Long_Diff > 7.48417 )
						if( MFI_High <= -16.2592 )
							ret := 0.166667
						if( MFI_High > -16.2592 )
							if( Long_MA <= 188.778 )
								ret := -0.750000 // sell
							if( Long_MA > 188.778 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 9.70929e+07 )
					if( Negative_Money_Flow <= 6530.5 )
						if( MFI_High <= -6.24121 )
							ret := 0.500000
						if( MFI_High > -6.24121 )
							if( Long_MA <= 154.266 )
								ret := -0.400000
							if( Long_MA > 154.266 )
								if( Positive_Money_Flow_Sum <= 1.18382e+08 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 1.18382e+08 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow > 6530.5 )
						if( MFI <= 62.1002 )
							ret := -0.857143 // sell
						if( MFI > 62.1002 )
							if( Raw_Money_Flow <= 2.85284e+06 )
								if( Short_MA <= 210.118 )
									ret := 0.954545 // buy
								if( Short_MA > 210.118 )
									ret := 0.000000
							if( Raw_Money_Flow > 2.85284e+06 )
								ret := -0.666667
	if( Raw_Money_Flow > 3.47919e+06 )
		if( Positive_Money_Flow_Sum <= 1.58116e+07 )
			if( Positive_Money_Flow_Sum <= 1.01014e+07 )
				if( MFI_Low <= 27.3494 )
					if( Short_Long_Diff <= 0.000516 )
						if( Raw_Money_Flow <= 4.26329e+06 )
							if( Negative_Money_Flow <= 3.51477e+06 )
								if( Short_MA <= 184.488 )
									ret := 0.426471
								if( Short_MA > 184.488 )
									ret := -0.160000
							if( Negative_Money_Flow > 3.51477e+06 )
								if( Negative_Money_Flow_Sum <= 3.41512e+07 )
									ret := -0.361290
								if( Negative_Money_Flow_Sum > 3.41512e+07 )
									ret := 0.087302
						if( Raw_Money_Flow > 4.26329e+06 )
							if( MFI_High <= -44.1852 )
								if( Short_Long_Diff <= -1.86354 )
									ret := 0.615385
								if( Short_Long_Diff > -1.86354 )
									ret := 0.127321
							if( MFI_High > -44.1852 )
								if( Negative_Money_Flow_Sum <= 9.4538e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 9.4538e+06 )
									ret := 0.967742 // buy
					if( Short_Long_Diff > 0.000516 )
						if( Negative_Money_Flow <= 1.32556e+07 )
							if( MFI_Low <= 18.0557 )
								if( MFI <= 32.6098 )
									ret := -0.086420
								if( MFI > 32.6098 )
									ret := 0.448276
							if( MFI_Low > 18.0557 )
								if( Negative_Money_Flow <= 6.14892e+06 )
									ret := -0.027027
								if( Negative_Money_Flow > 6.14892e+06 )
									ret := -0.857143 // sell
						if( Negative_Money_Flow > 1.32556e+07 )
							if( Typical_Price <= 135.556 )
								ret := 0.714286 // buy
							if( Typical_Price > 135.556 )
								if( Negative_Money_Flow_Sum <= 2.96479e+07 )
									ret := -0.937500 // sell
								if( Negative_Money_Flow_Sum > 2.96479e+07 )
									ret := -0.364865
				if( MFI_Low > 27.3494 )
					if( Negative_Money_Flow_Sum <= 9.69447e+06 )
						if( MFI <= 65.8639 )
							if( Raw_Money_Flow <= 6.07686e+06 )
								if( Typical_Price <= 138.209 )
									ret := 0.750000 // buy
								if( Typical_Price > 138.209 )
									ret := 0.960784 // buy
							if( Raw_Money_Flow > 6.07686e+06 )
								ret := 0.250000
						if( MFI > 65.8639 )
							ret := 0.000000
					if( Negative_Money_Flow_Sum > 9.69447e+06 )
						if( Negative_Money_Flow <= 1.78686e+06 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.78686e+06 )
							ret := 0.250000
			if( Positive_Money_Flow_Sum > 1.01014e+07 )
				if( Negative_Money_Flow <= 1.31724e+07 )
					if( Negative_Money_Flow <= 1.04995e+07 )
						if( Short_Long_Diff <= 0.455541 )
							if( Positive_Money_Flow <= 4.28204e+06 )
								if( Positive_Money_Flow_Sum <= 1.40664e+07 )
									ret := 0.171968
								if( Positive_Money_Flow_Sum > 1.40664e+07 )
									ret := 0.012019
							if( Positive_Money_Flow > 4.28204e+06 )
								if( Negative_Money_Flow_Sum <= 2.2376e+07 )
									ret := 0.390671
								if( Negative_Money_Flow_Sum > 2.2376e+07 )
									ret := 0.040000
						if( Short_Long_Diff > 0.455541 )
							if( Negative_Money_Flow_Sum <= 9.83065e+06 )
								if( Typical_Price <= 157.254 )
									ret := 0.400000
								if( Typical_Price > 157.254 )
									ret := -0.181818
							if( Negative_Money_Flow_Sum > 9.83065e+06 )
								if( Money_Flow_Ratio <= 0.312588 )
									ret := 0.111111
								if( Money_Flow_Ratio > 0.312588 )
									ret := 0.649351
					if( Negative_Money_Flow > 1.04995e+07 )
						if( Short_Long_Diff <= -0.068458 )
							if( Negative_Money_Flow_Sum <= 3.04157e+07 )
								if( Positive_Money_Flow_Sum <= 1.03619e+07 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 1.03619e+07 )
									ret := -0.757143 // sell
							if( Negative_Money_Flow_Sum > 3.04157e+07 )
								if( Negative_Money_Flow_Sum <= 7.34721e+07 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 7.34721e+07 )
									ret := 1.000000 // buy
						if( Short_Long_Diff > -0.068458 )
							if( Long_MA <= 178.236 )
								if( Positive_Money_Flow_Sum <= 1.25263e+07 )
									ret := -0.150000
								if( Positive_Money_Flow_Sum > 1.25263e+07 )
									ret := 0.540000
							if( Long_MA > 178.236 )
								if( Positive_Money_Flow_Sum <= 1.43454e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.43454e+07 )
									ret := -0.857143 // sell
				if( Negative_Money_Flow > 1.31724e+07 )
					if( Negative_Money_Flow_Sum <= 4.09305e+07 )
						if( Positive_Money_Flow_Sum <= 1.15765e+07 )
							if( Raw_Money_Flow <= 1.61793e+07 )
								if( Long_MA <= 169.117 )
									ret := 0.310345
								if( Long_MA > 169.117 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 1.61793e+07 )
								if( Short_MA <= 139.52 )
									ret := -0.750000 // sell
								if( Short_MA > 139.52 )
									ret := 0.736842 // buy
						if( Positive_Money_Flow_Sum > 1.15765e+07 )
							if( Negative_Money_Flow <= 2.21968e+07 )
								if( Short_Long_Diff <= -0.890512 )
									ret := 0.000000
								if( Short_Long_Diff > -0.890512 )
									ret := 0.735000 // buy
							if( Negative_Money_Flow > 2.21968e+07 )
								ret := -0.600000
					if( Negative_Money_Flow_Sum > 4.09305e+07 )
						if( Negative_Money_Flow_Sum <= 5.08536e+07 )
							if( Short_Long_Diff <= -0.372817 )
								if( Raw_Money_Flow <= 1.72324e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.72324e+07 )
									ret := -0.500000
							if( Short_Long_Diff > -0.372817 )
								if( Negative_Money_Flow <= 1.722e+07 )
									ret := 0.842105 // buy
								if( Negative_Money_Flow > 1.722e+07 )
									ret := -0.136364
						if( Negative_Money_Flow_Sum > 5.08536e+07 )
							if( Short_Long_Diff <= -1.4118 )
								if( Negative_Money_Flow <= 2.09453e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.09453e+07 )
									ret := -0.500000
							if( Short_Long_Diff > -1.4118 )
								if( Short_Long_Diff <= -0.092011 )
									ret := 0.624161
								if( Short_Long_Diff > -0.092011 )
									ret := 0.166667
		if( Positive_Money_Flow_Sum > 1.58116e+07 )
			if( Positive_Money_Flow_Sum <= 2.09967e+08 )
				if( Positive_Money_Flow_Sum <= 1.22358e+08 )
					if( Short_Long_Diff <= -0.343139 )
						if( Negative_Money_Flow <= 6.56039e+06 )
							if( Negative_Money_Flow_Sum <= 1.12569e+07 )
								if( Long_MA <= 124.97 )
									ret := -0.250000
								if( Long_MA > 124.97 )
									ret := 0.730337 // buy
							if( Negative_Money_Flow_Sum > 1.12569e+07 )
								if( MFI_Low <= 59.0015 )
									ret := 0.081048
								if( MFI_Low > 59.0015 )
									ret := -0.542857
						if( Negative_Money_Flow > 6.56039e+06 )
							if( Negative_Money_Flow_Sum <= 3.46696e+07 )
								if( Negative_Money_Flow_Sum <= 2.3643e+07 )
									ret := 0.833333 // buy
								if( Negative_Money_Flow_Sum > 2.3643e+07 )
									ret := -0.457627
							if( Negative_Money_Flow_Sum > 3.46696e+07 )
								if( Negative_Money_Flow_Sum <= 4.22423e+07 )
									ret := 0.727273 // buy
								if( Negative_Money_Flow_Sum > 4.22423e+07 )
									ret := 0.254669
					if( Short_Long_Diff > -0.343139 )
						if( Money_Flow_Ratio <= 1.61319 )
							if( MFI_High <= -38.5851 )
								if( Money_Flow_Ratio <= 0.35014 )
									ret := -0.077253
								if( Money_Flow_Ratio > 0.35014 )
									ret := 0.122460
							if( MFI_High > -38.5851 )
								if( Raw_Money_Flow <= 5.13381e+06 )
									ret := 0.059002
								if( Raw_Money_Flow > 5.13381e+06 )
									ret := -0.083851
						if( Money_Flow_Ratio > 1.61319 )
							if( Short_Long_Diff <= -0.036013 )
								if( Negative_Money_Flow_Sum <= 1.12744e+07 )
									ret := 0.391026
								if( Negative_Money_Flow_Sum > 1.12744e+07 )
									ret := 0.136461
							if( Short_Long_Diff > -0.036013 )
								if( Negative_Money_Flow_Sum <= 2.93568e+07 )
									ret := 0.058940
								if( Negative_Money_Flow_Sum > 2.93568e+07 )
									ret := 0.383202
				if( Positive_Money_Flow_Sum > 1.22358e+08 )
					if( Negative_Money_Flow_Sum <= 2.23062e+08 )
						if( Positive_Money_Flow <= 574677 )
							if( Raw_Money_Flow <= 7.39857e+06 )
								if( Short_Long_Diff <= 2.11716 )
									ret := 0.156863
								if( Short_Long_Diff > 2.11716 )
									ret := -0.666667
							if( Raw_Money_Flow > 7.39857e+06 )
								if( Long_MA <= 137.466 )
									ret := -0.187500
								if( Long_MA > 137.466 )
									ret := -0.681818
						if( Positive_Money_Flow > 574677 )
							if( MFI <= 89.3746 )
								if( Money_Flow_Ratio <= 2.04679 )
									ret := -0.562500
								if( Money_Flow_Ratio > 2.04679 )
									ret := -0.879121 // sell
							if( MFI > 89.3746 )
								if( Money_Flow_Ratio <= 19.2761 )
									ret := 0.137931
								if( Money_Flow_Ratio > 19.2761 )
									ret := -0.818182 // sell
					if( Negative_Money_Flow_Sum > 2.23062e+08 )
						if( MFI_High <= -34.9431 )
							ret := 1.000000 // buy
						if( MFI_High > -34.9431 )
							ret := 0.750000 // buy
			if( Positive_Money_Flow_Sum > 2.09967e+08 )
				if( Long_MA <= 201.415 )
					if( MFI <= 69.6883 )
						if( Positive_Money_Flow_Sum <= 2.93725e+08 )
							if( Raw_Money_Flow <= 1.41727e+07 )
								ret := 0.600000
							if( Raw_Money_Flow > 1.41727e+07 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.93725e+08 )
							ret := 0.500000
					if( MFI > 69.6883 )
						if( Short_MA <= 189.024 )
							if( MFI <= 95.5226 )
								if( Typical_Price <= 153.099 )
									ret := 0.916667 // buy
								if( Typical_Price > 153.099 )
									ret := 0.500000
							if( MFI > 95.5226 )
								if( Short_MA <= 142.294 )
									ret := -0.285714
								if( Short_MA > 142.294 )
									ret := 0.500000
						if( Short_MA > 189.024 )
							ret := -0.750000 // sell
				if( Long_MA > 201.415 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_FFIV_15Min_73b83d03(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


